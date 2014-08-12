// Generated from E:/IDEA/BaoSheng/BaoShengMES-Core/src/main/java/cc/oit/bsmes/generator/parser\CreateTable.g4 by ANTLR 4.x
package chanedi.generator.sqlparser;

import chanedi.generator.GlobalConfig;
import chanedi.generator.model.Bean;
import chanedi.generator.model.Property;
import chanedi.generator.model.PropertyType;
import chanedi.generator.sqlparser.gen.CreateTableBaseListener;
import chanedi.generator.sqlparser.gen.CreateTableParser;
import chanedi.utils.StringUtils;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class provides an empty implementation of {@link chanedi.generator.sqlparser.gen.CreateTableListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CreateTableListenerImpl extends CreateTableBaseListener {

    @Getter
    private List<Bean> tables = new ArrayList<Bean>();
    private Bean currentBean;
    private PropertyType currentColumnType;
    private GlobalConfig globalConfig;

    public CreateTableListenerImpl(GlobalConfig globalConfig) {
        super();
        this.globalConfig = globalConfig;
    }

    @Override
    public void enterStringType(@NotNull CreateTableParser.StringTypeContext ctx) {
        currentColumnType = PropertyType.STRING;
    }

    @Override
    public void exitCol(@NotNull CreateTableParser.ColContext ctx) {
        Property column = new Property();
        column.setColumnType(currentColumnType);
        column.setColumnName(ctx.column().ID().getText());
        currentBean.addProperty(column);
    }


    @Override
    public void enterBooleanType(@NotNull CreateTableParser.BooleanTypeContext ctx) {
        currentColumnType = PropertyType.BOOLEAN;
    }

    @Override
    public void enterDoubleType(@NotNull CreateTableParser.DoubleTypeContext ctx) {
        currentColumnType = PropertyType.DOUBLE;
    }

    @Override
    public void enterIntType(@NotNull CreateTableParser.IntTypeContext ctx) {
        currentColumnType = PropertyType.INT;
    }

    @Override
    public void enterDateType(@NotNull CreateTableParser.DateTypeContext ctx) {
        currentColumnType = PropertyType.DATE;
    }

    @Override
    public void enterColumnComment(@NotNull CreateTableParser.ColumnCommentContext ctx) {
        String column = ctx.column().ID().getText();
        String comment = ctx.COMMENT().getText().replaceAll("'","");
        currentBean.getPropertyByColumnName(column).setComment(comment);
    }

    @Override
    public void enterTableComment(@NotNull CreateTableParser.TableCommentContext ctx) {
        String comment = ctx.COMMENT().getText().replaceAll("'","");
        currentBean.setComment(comment);
    }

    @Override
    public void enterMdl(@NotNull CreateTableParser.MdlContext ctx) {
        currentBean = new Bean();
        currentBean.setTableName(ctx.ID().getText());
        String beanNameRegex = globalConfig.getBeanNameRegex();
        if (beanNameRegex != null) {
            Pattern pattern = Pattern.compile(beanNameRegex);
            Matcher matcher = pattern.matcher(currentBean.getTableName());
            matcher.find();
            String group = matcher.group(matcher.groupCount());
            currentBean.setName(StringUtils.uncapitalizeCamelBySeparator(group, "_"));
        }
        tables.add(currentBean);
    }

}