// Generated from E:/IDEA/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/parser\CreateTable.g4 by ANTLR 4.x
package chanedi.generator.parser.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTableParser}.
 */
public interface CreateTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(@NotNull CreateTableParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(@NotNull CreateTableParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(@NotNull CreateTableParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(@NotNull CreateTableParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull CreateTableParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull CreateTableParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#primmarykey}.
	 * @param ctx the parse tree
	 */
	void enterPrimmarykey(@NotNull CreateTableParser.PrimmarykeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#primmarykey}.
	 * @param ctx the parse tree
	 */
	void exitPrimmarykey(@NotNull CreateTableParser.PrimmarykeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#doubleType}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(@NotNull CreateTableParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#doubleType}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(@NotNull CreateTableParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(@NotNull CreateTableParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(@NotNull CreateTableParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#dateType}.
	 * @param ctx the parse tree
	 */
	void enterDateType(@NotNull CreateTableParser.DateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#dateType}.
	 * @param ctx the parse tree
	 */
	void exitDateType(@NotNull CreateTableParser.DateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#columnComment}.
	 * @param ctx the parse tree
	 */
	void enterColumnComment(@NotNull CreateTableParser.ColumnCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#columnComment}.
	 * @param ctx the parse tree
	 */
	void exitColumnComment(@NotNull CreateTableParser.ColumnCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(@NotNull CreateTableParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(@NotNull CreateTableParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void enterTableComment(@NotNull CreateTableParser.TableCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#tableComment}.
	 * @param ctx the parse tree
	 */
	void exitTableComment(@NotNull CreateTableParser.TableCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(@NotNull CreateTableParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(@NotNull CreateTableParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(@NotNull CreateTableParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(@NotNull CreateTableParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#mdl}.
	 * @param ctx the parse tree
	 */
	void enterMdl(@NotNull CreateTableParser.MdlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#mdl}.
	 * @param ctx the parse tree
	 */
	void exitMdl(@NotNull CreateTableParser.MdlContext ctx);
}