// Generated from E:/Chanedi/IdeaProjects/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/sqlparser\CreateTable.g4 by ANTLR 4.x
package chanedi.generator.sqlparser.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTableParser}.
 */
public interface CreateTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull CreateTableParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull CreateTableParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_constraint(@NotNull CreateTableParser.Inline_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_constraint(@NotNull CreateTableParser.Inline_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull CreateTableParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull CreateTableParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#comment_value}.
	 * @param ctx the parse tree
	 */
	void enterComment_value(@NotNull CreateTableParser.Comment_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#comment_value}.
	 * @param ctx the parse tree
	 */
	void exitComment_value(@NotNull CreateTableParser.Comment_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull CreateTableParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull CreateTableParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull CreateTableParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull CreateTableParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(@NotNull CreateTableParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(@NotNull CreateTableParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(@NotNull CreateTableParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(@NotNull CreateTableParser.Column_definitionContext ctx);
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
	 * Enter a parse tree produced by {@link CreateTableParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull CreateTableParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull CreateTableParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull CreateTableParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull CreateTableParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull CreateTableParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull CreateTableParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull CreateTableParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull CreateTableParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(@NotNull CreateTableParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(@NotNull CreateTableParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CreateTableParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull CreateTableParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTableParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull CreateTableParser.CommentContext ctx);
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