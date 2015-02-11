package ${config.javaPackageName}${module.name}.controller;

import chanedi.action.view.TableView;
import chanedi.service.EntityService;
import chanedi.util.JSONUtils;
import ${config.javaPackageName}${module.name}.base.controller.BaseController;
import ${config.javaPackageName}${module.name}.model.${bean.capitalizeName};
import ${config.javaPackageName}${module.name}.service.${bean.capitalizeName}Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/" + ${bean.capitalizeName}Controller.NAME)
public class ${bean.capitalizeName}Controller {

    public static final String NAME = "${bean.name}";

    @Resource
    private ${bean.capitalizeName}Service ${bean.name}Service;

    private BaseController baseController = new BaseController() {
        @Override
        public String getIndexTilesName() {
            return NAME;
        }

        @Override
        public EntityService getEntityService() {
            return ${bean.name}Service;
        }

        @Override
        public Class<?> getEntityClass() {
            return ${bean.capitalizeName}.class;
        }
    };

    @RequestMapping
    public String index(Model model) {
        return baseController.index();
    }

    @RequestMapping(produces = "application/json")
    @ResponseBody
    public TableView list(HttpServletRequest request) {
        return baseController.list(request);
    }

    @RequestMapping(value = "/checkNotExist", produces = "application/json")
    @ResponseBody
    public Boolean checkNotExist(@RequestParam(required = false) Integer id, @RequestParam String prop, @RequestParam String value) {
        return baseController.checkNotExist(id, prop, value);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Boolean save(HttpServletRequest request) {
        baseController.save(request);
        return true;
    }

}