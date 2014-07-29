package chanedi.generator.sqlparser.gen;// Generated from E:/IDEA/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/sqlparser\CreateTable.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CreateTableParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CreateTableVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#stringType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(@NotNull CreateTableParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(@NotNull CreateTableParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#booleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(@NotNull CreateTableParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#primmarykey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimmarykey(@NotNull CreateTableParser.PrimmarykeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#doubleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(@NotNull CreateTableParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#intType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull CreateTableParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#dateType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateType(@NotNull CreateTableParser.DateTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#columnComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnComment(@NotNull CreateTableParser.ColumnCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(@NotNull CreateTableParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#tableComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableComment(@NotNull CreateTableParser.TableCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(@NotNull CreateTableParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(@NotNull CreateTableParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateTableParser#mdl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdl(@NotNull CreateTableParser.MdlContext ctx);
}