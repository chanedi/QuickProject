// Generated from E:/IDEA/BaoSheng/BaoShengMES-Core/src/main/java/cc/oit/bsmes/generator/parser\CreateTable.g4 by ANTLR 4.x
package chanedi.generator.parser;

import chanedi.generator.model.Bean;
import chanedi.generator.model.Property;
import chanedi.generator.model.ColumnType;
import chanedi.generator.parser.gen.CreateTableBaseListener;
import chanedi.generator.parser.gen.CreateTableParser;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link chanedi.generator.parser.gen.CreateTableListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CreateTableListenerImpl extends CreateTableBaseListener {

    @Getter
    private List<Bean> tables = new ArrayList<Bean>();
    private Bean currentTable;
    private ColumnType columnType;

    @Override
    public void enterStringType(@NotNull CreateTableParser.StringTypeContext ctx) {
        columnType = ColumnType.STRING;
    }

    @Override
    public void exitCol(@NotNull CreateTableParser.ColContext ctx) {
        Property column = new Property();
        column.setColumnType(columnType);
        column.setColumnName(ctx.column().ID().getText());
        currentTable.addColumn(column);
    }

    @Override
    public void enterBooleanType(@NotNull CreateTableParser.BooleanTypeContext ctx) {
        columnType = ColumnType.BOOLEAN;
    }

    @Override
    public void enterDoubleType(@NotNull CreateTableParser.DoubleTypeContext ctx) {
        columnType = ColumnType.DOUBLE;
    }

    @Override
    public void enterIntType(@NotNull CreateTableParser.IntTypeContext ctx) {
        columnType = ColumnType.INT;
    }

    @Override
    public void enterDateType(@NotNull CreateTableParser.DateTypeContext ctx) {
        columnType = ColumnType.DATE;
    }

    @Override
    public void enterColumnComment(@NotNull CreateTableParser.ColumnCommentContext ctx) {
        String column = ctx.column().ID().getText();
        String comment = ctx.COMMENT().getText().replaceAll("'","");
        currentTable.getColumn(column).setComment(comment);
    }

    @Override
    public void enterTableComment(@NotNull CreateTableParser.TableCommentContext ctx) {
        String comment = ctx.COMMENT().getText().replaceAll("'","");
        currentTable.setComment(comment);
    }

    @Override
    public void enterMdl(@NotNull CreateTableParser.MdlContext ctx) {
        currentTable = new Bean();
        currentTable.setTableName(ctx.ID().getText());
        tables.add(currentTable);
    }

}