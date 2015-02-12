package chanedi.action;

import chanedi.action.view.ComparisonTranslator;
import chanedi.action.view.DefaultTableView;
import chanedi.action.view.TableView;
import chanedi.action.view.UpdateResult;
import chanedi.bean.editor.TimeEditor;
import chanedi.dao.complexQuery.CustomQueryParam;
import chanedi.dao.complexQuery.QueryParamBuilder;
import chanedi.dao.complexQuery.Sort;
import chanedi.model.Entity;
import chanedi.service.EntityService;
import chanedi.util.ReflectUtils;
import chanedi.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.ServletRequestParameterPropertyValues;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chanedi on 2014/12/22.
 */
public abstract class EntityController {

    public abstract String getIndexTilesName();

    public abstract EntityService getEntityService();

    public abstract Class<?> getEntityClass();

    public Class<?> getTableViewClass() {
        return DefaultTableView.class;
    }

    public String getQueryFilterPrefix() {
        return "filter";
    }

    public String getQueryFilterFieldName() {
        return "[field]";
    }

    public String getQueryFilterValueName() {
        return "[data][value]";
    }

    public String getQueryFilterTypeName() {
        return "[data][type]";
    }

    public String getQueryFilterComparisonName() {
        return "[data][comparison]";
    }

    public String index() {
        return getIndexTilesName();
    }

    public TableView list(HttpServletRequest request) {
        EntityService entityService = getEntityService();

        QueryParamBuilder builder = QueryParamBuilder.newBuilder();

        // 设置findParams属性
        buildQueryParams(builder, request);
        // 根据filter设置findParams属性
        buildFilterQueryParams(builder, request);
        // 自定义的参数
        buildCustomQueryParam(builder, request);

        // 查询
        List<CustomQueryParam> queryParams = builder.build();
        Integer start = parseStart(request);
        Integer limit = parseLimit(request);
        List<?> list = entityService.query(queryParams, parseSort(request), start, limit);
        TableView tableView = null;
        try {
            tableView = (TableView) getTableViewClass().newInstance();
        } catch (Exception e) {
            tableView = new DefaultTableView();
        }
        tableView.setRows(list);
        tableView.setTotal(entityService.countQuery(queryParams));
        return tableView;
    }

    private void buildQueryParams(QueryParamBuilder builder, HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Class<?> modelClass = getEntityClass();
        PropertyDescriptor[] propDescriptors = ReflectUtils.getBeanGetters(modelClass);
        for (PropertyDescriptor propDescriptor : propDescriptors) {
            String propName = propDescriptor.getName();
            String[] values = parameterMap.get(propName);
            if (values == null || values.length == 0) { // 不存在的key
                continue;
            }

            String value = values[0];
            if (StringUtils.isEmpty(value.toString())) { // 空值
                continue;
            }
//            builder.addWithValueQueryParam(propName, "LIKE", "%" + value + "%");
            try {
                if (propDescriptor.getPropertyType().isEnum()) {
                    builder.addWithValueQueryParam(propName, "=", value);
                } else if (propDescriptor.getPropertyType() == Boolean.class) {
                    builder.addWithValueQueryParam(propName, "=", new Boolean(value));
                } else {
                    builder.addWithValueQueryParam(propName, "LIKE", "%" + URLDecoder.decode(value, "utf-8") + "%");
                }
            } catch (UnsupportedEncodingException e) {
            }
        }
    }

    /**
     * 适用于前端框架自动生成的过滤条件。
     * <p>前端发送数据示例：
     * <pre>
     * [{"field":"visible","data":{"type":"boolean","value":true}},
     * {"field":"company","data":{"type":"string","value":"e"}},
     * {"field":"price","data":{"type":"numeric","comparison":"lt","value":34}},
     * {"field":"price","data":{"type":"numeric","comparison":"gt","value":3}},
     * {"field":"size","data":{"type":"list","value":["medium","extra large"]}}]</pre>
     * </p>
     */
    private void buildFilterQueryParams(QueryParamBuilder builder, HttpServletRequest request) {
        for (int i = 0; ; i++) {
            String prefix = getQueryFilterPrefix() + "[" + i + "]";
            String field = request.getParameter(prefix + getQueryFilterFieldName());
            if (field == null) {
                break;
            }

            Object value = request.getParameter(prefix + getQueryFilterValueName());
            if (value == null) { // "list".equals(type)
                buildListQueryParam(builder, request, prefix);
                continue;
            }

            if (StringUtils.isEmpty(value.toString())) {
                continue;
            }
            String type = request.getParameter(prefix + getQueryFilterTypeName());
            if ("custom".equals(type)) {
                buildCustomFilterQueryParam(builder, request, prefix);
                continue;
            }
            String comparison = request.getParameter(prefix + getQueryFilterComparisonName());
            if ("string".equals(type)) {
                builder.addWithValueQueryParam(field, "LIKE", "%" + value + "%");
//            } else if ("boolean".equals(type)) {
            } else if (comparison != null) {
                if ("date".equals(type)) {
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    try {
                        value = df.parse(value.toString());
                    } catch (ParseException e) {
                        df = new SimpleDateFormat("yyyy-MM-dd");
                        try {
                            value = df.parse(value.toString());
                        } catch (ParseException e1) {
                            throw new RuntimeException("日期格式不正确");
                        }
                    }
                }
                builder.addWithValueQueryParam(field, ComparisonTranslator.translate(comparison), value);
            } else {
                builder.addWithValueQueryParam(field, "=", value);
            }
        }
    }

    protected Integer parseStart(HttpServletRequest request) {
        String start = request.getParameter("start");
        if (StringUtils.isEmpty(start)) {
            return null;
        }
        return Integer.valueOf(start);
    }

    protected Integer parseLimit(HttpServletRequest request) {
        String limit = request.getParameter("limit");
        if (StringUtils.isEmpty(limit)) {
            return null;
        }
        return Integer.valueOf(limit);
    }

    protected List<Sort> parseSort(HttpServletRequest request) {
        String sort = request.getParameter("sort");
        if (StringUtils.isEmpty(sort)) {
            return null;
        }
        return JSONArray.parseArray(sort, Sort.class);
    }

    /**
     * value有多个值时应重写
     * @param builder
     * @param request
     * @param prefix
     */
    protected void buildListQueryParam(QueryParamBuilder builder, HttpServletRequest request, String prefix) {
        String field = request.getParameter(prefix + getQueryFilterFieldName());
        String[] values = request.getParameterValues(prefix + getQueryFilterValueName() + "[]");
        if (values == null) {
            return;
        }
        for (String s : values) {
            builder.addWithValueQueryParam(field, "=", s);
        }
    }

    /**
     * 自定义的查询条件。适用于不规则的参数。
     *<p>
     *  例如：
     * <pre>
     *  protected void buildCustomQueryParam(QueryParamBuilder builder, HttpServletRequest request) {
     *      String hasUserHead = request.getParameter("hasHead");
     *      if (StringUtils.isNotEmpty(hasHead)) {
     *          if (new Boolean(hasUserHead)) {
     *              builder.addNoValueQueryParam("headPath", "is not null");
     *          } else {
     *              builder.addNoValueQueryParam("headPath", "is null");
     *          }
     *      }
     *  }
     * </pre></p>
     */
    protected void buildCustomQueryParam(QueryParamBuilder builder, HttpServletRequest request) {
        // template
    }

    /**
     * 适用于前端框架自动生成的过滤条件，type应为custom。
     * <p>前端发送数据示例：<pre>
     * [{"field":"visible","data":{"type":"custom","value":true}},
     * {"field":"size","data":{"type":"custom","value":["medium","extra large"]}}]</pre></p>
     */
    protected void buildCustomFilterQueryParam(QueryParamBuilder builder, HttpServletRequest request, String prefix) {
        // template
    }

    public UpdateResult save(HttpServletRequest request) {
        EntityService<Entity> entityService = getEntityService();
        UpdateResult updateResult = new UpdateResult();

        Entity object = parseModel(request);
        if (object.getId() == null) {
            entityService.insert(object);
        } else {
            entityService.update(object);
        }
        updateResult.addResult(object);

        return updateResult;
    }

    public UpdateResult update(HttpServletRequest request) {
        EntityService<Entity> entityService = getEntityService();
        UpdateResult updateResult = new UpdateResult();

        Entity object = parseModel(request);
        entityService.update(object);
        updateResult.addResult(object);

        return updateResult;
    }

    public UpdateResult delete(String id) {
        EntityService<Entity> entityService = getEntityService();
        UpdateResult updateResult = new UpdateResult();

        entityService.deleteById(id);

        return updateResult;
    }

    public Entity parseModel(HttpServletRequest request) {
        Object o = null;
        try {
            o = getEntityClass().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("无法创建类的实例：" + getEntityClass());
        }
        DataBinder dataBinder = new DataBinder(o);
        dataBinder.registerCustomEditor(Time.class, new TimeEditor());
        MutablePropertyValues mpvs = new ServletRequestParameterPropertyValues(request);
        dataBinder.bind(mpvs);

        return (Entity) o;
    }

    /**
     * for ext
     */
    public UpdateResult save(String jsonText)  {
        EntityService<Entity> entityService = getEntityService();
        UpdateResult updateResult = new UpdateResult();

        if (jsonText.startsWith("[")) {
            List<Entity> objects = parseModels(jsonText);
            entityService.insert(objects);
            updateResult.addResult(objects);
        } else {
            Entity object = parseModel(jsonText);
            entityService.insert(object);
            updateResult.addResult(object);
        }

        return updateResult;
    }

    /**
     * for ext
     */
    public UpdateResult update(String jsonText)  {
        EntityService<Entity> entityService = getEntityService();
        UpdateResult updateResult = new UpdateResult();

        if (jsonText.startsWith("[")) {
            List<Entity> objects = parseModels(jsonText);
            entityService.update(objects);
            updateResult.addResult(objects);
        } else {
            Entity object = parseModel(jsonText);
            entityService.update(object);
            updateResult.addResult(object);
        }

        return updateResult;
    }

    /**
     * for ext
     */
    public UpdateResult delete(String id, String jsonText) {
        EntityService<Entity> entityService = getEntityService();
        UpdateResult updateResult = new UpdateResult();

        if (jsonText.startsWith("[")) {
            // 删除多条记录
            JSONArray jsonArray = JSON.parseArray(jsonText);
            List<String> list = new ArrayList<String>();
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                list.add((String) jsonObject.get("id"));
            }
            entityService.deleteById(list);
        } else {
            entityService.deleteById(id);
        }

        return updateResult;
    }

    public boolean checkNotExist(Object id, String prop, Object value) {
        QueryParamBuilder builder = QueryParamBuilder.newBuilder();
        builder.addWithValueQueryParam(prop, "=", value);
        if (id != null) {
            builder.addWithValueQueryParam("id", "<>", id);
        }
        return getEntityService().countQuery(builder.build()) == 0;
    }

    private List<Entity> parseModels(String jsonText) {
        return (List<Entity>) JSON.parseArray(jsonText, getEntityClass());
    }

    private Entity parseModel(String jsonText)  {
        return (Entity) JSON.parseObject(jsonText, getEntityClass());
    }

}
