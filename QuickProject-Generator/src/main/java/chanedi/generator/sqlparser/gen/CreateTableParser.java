// Generated from F:/IDEA/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/sqlparser\CreateTable.g4 by ANTLR 4.4.1-dev
package chanedi.generator.sqlparser.gen;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, K_AUTO_INCREMENT=24, 
		K_ALTER=25, K_AND=26, K_BETWEEN=27, K_CASCADE=28, K_CHECK=29, K_CREATE=30, 
		K_COLUMN=31, K_COMMENT=32, K_CONSTRAINT=33, K_CURRENT_DATE=34, K_CURRENT_TIME=35, 
		K_CURRENT_TIMESTAMP=36, K_DEFAULT=37, K_DELETE=38, K_DISTINCT=39, K_ENGINE=40, 
		K_FALSE=41, K_FOREIGN=42, K_GLOB=43, K_IN=44, K_INNODB=45, K_IS=46, K_ISNULL=47, 
		K_KEY=48, K_LIKE=49, K_MATCH=50, K_NOT=51, K_NOTNULL=52, K_NULL=53, K_ON=54, 
		K_OR=55, K_PRIMARY=56, K_REFERENCES=57, K_REGEXP=58, K_SET=59, K_TABLE=60, 
		K_TRUE=61, K_UNIQUE=62, IDENTIFIER=63, NUMERIC_LITERAL=64, STRING_LITERAL=65, 
		BLOB_LITERAL=66, SINGLE_LINE_COMMENT=67, MULTILINE_COMMENT=68, SPACES=69;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'>='", "'||'", "';'", "'=='", "'<'", "'|'", 
		"'>>'", "'<<'", "'='", "'>'", "'<='", "'<>'", "'%'", "'&'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "'.'", "K_AUTO_INCREMENT", "K_ALTER", "K_AND", 
		"K_BETWEEN", "K_CASCADE", "K_CHECK", "K_CREATE", "K_COLUMN", "K_COMMENT", 
		"K_CONSTRAINT", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_DEFAULT", "K_DELETE", "K_DISTINCT", "K_ENGINE", "K_FALSE", "K_FOREIGN", 
		"K_GLOB", "K_IN", "K_INNODB", "K_IS", "K_ISNULL", "K_KEY", "K_LIKE", "K_MATCH", 
		"K_NOT", "K_NOTNULL", "K_NULL", "K_ON", "K_OR", "K_PRIMARY", "K_REFERENCES", 
		"K_REGEXP", "K_SET", "K_TABLE", "K_TRUE", "K_UNIQUE", "IDENTIFIER", "NUMERIC_LITERAL", 
		"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"SPACES"
	};
	public static final int
		RULE_sql = 0, RULE_mdl = 1, RULE_comment_oracle = 2, RULE_comment_mysql = 3, 
		RULE_column_definition = 4, RULE_datatype = 5, RULE_inline_constraint = 6, 
		RULE_expr = 7, RULE_foreign_key_clause = 8, RULE_comment_value = 9, RULE_table_constraint = 10, 
		RULE_signed_number = 11, RULE_literal_value = 12, RULE_name = 13, RULE_schema = 14, 
		RULE_table_name = 15, RULE_column_name = 16, RULE_any_name = 17;
	public static final String[] ruleNames = {
		"sql", "mdl", "comment_oracle", "comment_mysql", "column_definition", 
		"datatype", "inline_constraint", "expr", "foreign_key_clause", "comment_value", 
		"table_constraint", "signed_number", "literal_value", "name", "schema", 
		"table_name", "column_name", "any_name"
	};

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CreateTableParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SqlContext extends ParserRuleContext {
		public MdlContext mdl(int i) {
			return getRuleContext(MdlContext.class,i);
		}
		public List<MdlContext> mdl() {
			return getRuleContexts(MdlContext.class);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitSql(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); mdl();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_CREATE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MdlContext extends ParserRuleContext {
		public List<Comment_oracleContext> comment_oracle() {
			return getRuleContexts(Comment_oracleContext.class);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public TerminalNode K_INNODB() { return getToken(CreateTableParser.K_INNODB, 0); }
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Comment_oracleContext comment_oracle(int i) {
			return getRuleContext(Comment_oracleContext.class,i);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public List<Comment_mysqlContext> comment_mysql() {
			return getRuleContexts(Comment_mysqlContext.class);
		}
		public TerminalNode K_ENGINE() { return getToken(CreateTableParser.K_ENGINE, 0); }
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public TerminalNode K_CREATE() { return getToken(CreateTableParser.K_CREATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Comment_mysqlContext comment_mysql(int i) {
			return getRuleContext(Comment_mysqlContext.class,i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public MdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterMdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitMdl(this);
		}
	}

	public final MdlContext mdl() throws RecognitionException {
		MdlContext _localctx = new MdlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mdl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(K_CREATE);
			setState(42); match(K_TABLE);
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43); schema();
				setState(44); match(T__0);
				}
				break;
			}
			setState(48); table_name();
			{
			setState(49); match(T__6);
			setState(50); column_definition();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51); match(T__2);
					setState(52); column_definition();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(58); match(T__2);
				setState(59); table_constraint();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(T__5);
			setState(69);
			_la = _input.LA(1);
			if (_la==K_ENGINE) {
				{
				setState(66); match(K_ENGINE);
				setState(67); match(T__12);
				setState(68); match(K_INNODB);
				}
			}

			setState(71); match(T__18);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ALTER || _la==K_COMMENT) {
				{
				setState(75);
				switch (_input.LA(1)) {
				case K_COMMENT:
					{
					setState(73); comment_oracle();
					}
					break;
				case K_ALTER:
					{
					setState(74); comment_mysql();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_oracleContext extends ParserRuleContext {
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public TerminalNode K_IS() { return getToken(CreateTableParser.K_IS, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(CreateTableParser.K_ON, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(CreateTableParser.K_COLUMN, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public Comment_oracleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_oracle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment_oracle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment_oracle(this);
		}
	}

	public final Comment_oracleContext comment_oracle() throws RecognitionException {
		Comment_oracleContext _localctx = new Comment_oracleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment_oracle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(K_COMMENT);
			setState(81); match(K_ON);
			setState(99);
			switch (_input.LA(1)) {
			case K_TABLE:
				{
				setState(82); match(K_TABLE);
				setState(86);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(83); schema();
					setState(84); match(T__0);
					}
					break;
				}
				setState(88); table_name();
				}
				break;
			case K_COLUMN:
				{
				setState(89); match(K_COLUMN);
				setState(93);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(90); schema();
					setState(91); match(T__0);
					}
					break;
				}
				setState(95); table_name();
				setState(96); match(T__0);
				setState(97); column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(101); match(K_IS);
			setState(102); comment_value();
			setState(103); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_mysqlContext extends ParserRuleContext {
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_ALTER() { return getToken(CreateTableParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(CreateTableParser.K_COLUMN, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public Comment_mysqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_mysql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment_mysql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment_mysql(this);
		}
	}

	public final Comment_mysqlContext comment_mysql() throws RecognitionException {
		Comment_mysqlContext _localctx = new Comment_mysqlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment_mysql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(K_ALTER);
			setState(123);
			switch (_input.LA(1)) {
			case K_TABLE:
				{
				setState(106); match(K_TABLE);
				setState(110);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(107); schema();
					setState(108); match(T__0);
					}
					break;
				}
				setState(112); table_name();
				}
				break;
			case K_COLUMN:
				{
				setState(113); match(K_COLUMN);
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(114); schema();
					setState(115); match(T__0);
					}
					break;
				}
				setState(119); table_name();
				setState(120); match(T__0);
				setState(121); column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125); match(K_COMMENT);
			setState(126); comment_value();
			setState(127); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Inline_constraintContext inline_constraint(int i) {
			return getRuleContext(Inline_constraintContext.class,i);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<Inline_constraintContext> inline_constraint() {
			return getRuleContexts(Inline_constraintContext.class);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); column_name();
			setState(130); datatype();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_AUTO_INCREMENT) | (1L << K_CHECK) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT) | (1L << K_NOT) | (1L << K_NULL) | (1L << K_PRIMARY) | (1L << K_REFERENCES) | (1L << K_UNIQUE))) != 0)) {
				{
				{
				setState(131); inline_constraint();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(137); match(K_COMMENT);
				setState(138); comment_value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datatype);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(141); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(146); match(T__6);
				setState(147); signed_number();
				setState(148); match(T__5);
				}
				break;
			case 2:
				{
				setState(150); match(T__6);
				setState(151); signed_number();
				setState(152); match(T__2);
				setState(153); signed_number();
				setState(154); match(T__5);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_constraintContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(CreateTableParser.K_DEFAULT, 0); }
		public TerminalNode K_PRIMARY() { return getToken(CreateTableParser.K_PRIMARY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTO_INCREMENT() { return getToken(CreateTableParser.K_AUTO_INCREMENT, 0); }
		public TerminalNode K_CHECK() { return getToken(CreateTableParser.K_CHECK, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(CreateTableParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(CreateTableParser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CreateTableParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CreateTableParser.K_NOT, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Inline_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterInline_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitInline_constraint(this);
		}
	}

	public final Inline_constraintContext inline_constraint() throws RecognitionException {
		Inline_constraintContext _localctx = new Inline_constraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inline_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(158); match(K_CONSTRAINT);
				setState(159); name();
				}
			}

			setState(185);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				{
				setState(162); match(K_DEFAULT);
				setState(169);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(163); signed_number();
					}
					break;
				case 2:
					{
					setState(164); literal_value();
					}
					break;
				case 3:
					{
					setState(165); match(T__6);
					setState(166); expr(0);
					setState(167); match(T__5);
					}
					break;
				}
				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(172);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(171); match(K_NOT);
					}
				}

				setState(174); match(K_NULL);
				}
				break;
			case K_UNIQUE:
				{
				setState(175); match(K_UNIQUE);
				}
				break;
			case K_PRIMARY:
				{
				setState(176); match(K_PRIMARY);
				setState(177); match(K_KEY);
				}
				break;
			case K_REFERENCES:
				{
				setState(178); foreign_key_clause();
				}
				break;
			case K_CHECK:
				{
				setState(179); match(K_CHECK);
				setState(180); match(T__6);
				setState(181); expr(0);
				setState(182); match(T__5);
				}
				break;
			case K_AUTO_INCREMENT:
				{
				setState(184); match(K_AUTO_INCREMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode K_REGEXP() { return getToken(CreateTableParser.K_REGEXP, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIKE() { return getToken(CreateTableParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(CreateTableParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(CreateTableParser.K_MATCH, 0); }
		public TerminalNode K_IS() { return getToken(CreateTableParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(CreateTableParser.K_ISNULL, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_DISTINCT() { return getToken(CreateTableParser.K_DISTINCT, 0); }
		public TerminalNode K_IN() { return getToken(CreateTableParser.K_IN, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode K_AND() { return getToken(CreateTableParser.K_AND, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CreateTableParser.K_NOT, 0); }
		public TerminalNode K_OR() { return getToken(CreateTableParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(CreateTableParser.K_BETWEEN, 0); }
		public TerminalNode K_NOTNULL() { return getToken(CreateTableParser.K_NOTNULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(188); literal_value();
				}
				break;
			case 2:
				{
				setState(189); name();
				setState(190); match(T__6);
				setState(203);
				switch (_input.LA(1)) {
				case T__6:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_FALSE:
				case K_NULL:
				case K_TRUE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(192);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(191); match(K_DISTINCT);
						}
					}

					setState(194); expr(0);
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(195); match(T__2);
						setState(196); expr(0);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__4:
					{
					setState(202); match(T__4);
					}
					break;
				case T__5:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205); match(T__5);
				}
				break;
			case 3:
				{
				setState(207); match(T__6);
				setState(208); expr(0);
				setState(209); match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(214); match(T__19);
						setState(215); expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(217);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__8) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(218); expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(220);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(221); expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(223);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(224); expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__16) | (1L << T__11) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(227); expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(241);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(229); match(T__12);
							}
							break;
						case 2:
							{
							setState(230); match(T__17);
							}
							break;
						case 3:
							{
							setState(231); match(T__21);
							}
							break;
						case 4:
							{
							setState(232); match(T__9);
							}
							break;
						case 5:
							{
							setState(233); match(K_IS);
							}
							break;
						case 6:
							{
							setState(234); match(K_IS);
							setState(235); match(K_NOT);
							}
							break;
						case 7:
							{
							setState(236); match(K_IN);
							}
							break;
						case 8:
							{
							setState(237); match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(238); match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(239); match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(240); match(K_REGEXP);
							}
							break;
						}
						setState(243); expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(245); match(K_AND);
						setState(246); expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(248); match(K_OR);
						setState(249); expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251); match(K_IS);
						setState(253);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(252); match(K_NOT);
							}
						}

						setState(255); expr(3);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(258);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(257); match(K_NOT);
							}
						}

						setState(260); match(K_BETWEEN);
						setState(261); expr(0);
						setState(262); match(K_AND);
						setState(263); expr(2);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(270);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(266); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(267); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(268); match(K_NOT);
							setState(269); match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(CreateTableParser.K_ON, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REFERENCES() { return getToken(CreateTableParser.K_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_CASCADE() { return getToken(CreateTableParser.K_CASCADE, 0); }
		public TerminalNode K_SET() { return getToken(CreateTableParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode K_DELETE() { return getToken(CreateTableParser.K_DELETE, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitForeign_key_clause(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(K_REFERENCES);
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(278); schema();
				setState(279); match(T__0);
				}
				break;
			}
			setState(283); table_name();
			setState(295);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(284); match(T__6);
				setState(285); column_name();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(286); match(T__2);
					setState(287); column_name();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293); match(T__5);
				}
			}

			setState(304);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(297); match(K_ON);
				setState(298); match(K_DELETE);
				setState(302);
				switch (_input.LA(1)) {
				case K_CASCADE:
					{
					setState(299); match(K_CASCADE);
					}
					break;
				case K_SET:
					{
					setState(300); match(K_SET);
					setState(301); match(K_NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
		public Comment_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment_value(this);
		}
	}

	public final Comment_valueContext comment_value() throws RecognitionException {
		Comment_valueContext _localctx = new Comment_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comment_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(CreateTableParser.K_FOREIGN, 0); }
		public TerminalNode K_CHECK() { return getToken(CreateTableParser.K_CHECK, 0); }
		public TerminalNode K_UNIQUE() { return getToken(CreateTableParser.K_UNIQUE, 0); }
		public TerminalNode K_KEY() { return getToken(CreateTableParser.K_KEY, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CreateTableParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(CreateTableParser.K_PRIMARY, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(308); match(K_CONSTRAINT);
				setState(309); name();
				}
			}

			setState(347);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(315);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(312); match(K_PRIMARY);
					setState(313); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(314); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317); match(T__6);
				setState(318); column_name();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(319); match(T__2);
					setState(320); column_name();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326); match(T__5);
				}
				break;
			case K_CHECK:
				{
				setState(328); match(K_CHECK);
				setState(329); match(T__6);
				setState(330); expr(0);
				setState(331); match(T__5);
				}
				break;
			case K_FOREIGN:
				{
				setState(333); match(K_FOREIGN);
				setState(334); match(K_KEY);
				setState(335); match(T__6);
				setState(336); column_name();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(337); match(T__2);
					setState(338); column_name();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344); match(T__5);
				setState(345); foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(CreateTableParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__1) {
				{
				setState(349);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(352); match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode K_CURRENT_DATE() { return getToken(CreateTableParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_FALSE() { return getToken(CreateTableParser.K_FALSE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(CreateTableParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(CreateTableParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(CreateTableParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_TRUE() { return getToken(CreateTableParser.K_TRUE, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(CreateTableParser.BLOB_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (K_CURRENT_DATE - 34)) | (1L << (K_CURRENT_TIME - 34)) | (1L << (K_CURRENT_TIMESTAMP - 34)) | (1L << (K_FALSE - 34)) | (1L << (K_NULL - 34)) | (1L << (K_TRUE - 34)) | (1L << (NUMERIC_LITERAL - 34)) | (1L << (STRING_LITERAL - 34)) | (1L << (BLOB_LITERAL - 34)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitSchema(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362); any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CreateTableParser.IDENTIFIER, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_any_name);
		try {
			setState(370);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(364); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(365); match(STRING_LITERAL);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(366); match(T__6);
				setState(367); any_name();
				setState(368); match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		case 4: return precpred(_ctx, 9);
		case 5: return precpred(_ctx, 8);
		case 6: return precpred(_ctx, 7);
		case 7: return precpred(_ctx, 6);
		case 8: return precpred(_ctx, 2);
		case 9: return precpred(_ctx, 1);
		case 10: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3"+
		"\3\3\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\3\4"+
		"\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\6\3\6\5\6\u008e\n\6\3\7\6\7\u0091"+
		"\n\7\r\7\16\7\u0092\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009f"+
		"\n\7\3\b\3\b\5\b\u00a3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ac\n\b\3"+
		"\b\5\b\u00af\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bc"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16"+
		"\t\u00cb\13\t\3\t\5\t\u00ce\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d6\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f4\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0100\n\t\3\t\3\t\3\t\5\t\u0105\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0111\n\t\7\t\u0113\n\t\f\t\16"+
		"\t\u0116\13\t\3\n\3\n\3\n\3\n\5\n\u011c\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u0123"+
		"\n\n\f\n\16\n\u0126\13\n\3\n\3\n\5\n\u012a\n\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0131\n\n\5\n\u0133\n\n\3\13\3\13\3\f\3\f\5\f\u0139\n\f\3\f\3\f\3\f\5"+
		"\f\u013e\n\f\3\f\3\f\3\f\3\f\7\f\u0144\n\f\f\f\16\f\u0147\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0156\n\f\f\f\16\f\u0159"+
		"\13\f\3\f\3\f\3\f\5\f\u015e\n\f\3\r\5\r\u0161\n\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0175\n\23\3\23\2\3\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$\2\7\5\2\3\3\21\21\25\25\4\2\26\26\30\30\4\2\n\f\22\22\5\2\5\5\t\t"+
		"\16\17\7\2$&++\67\67??BD\u01ad\2\'\3\2\2\2\4+\3\2\2\2\6R\3\2\2\2\bk\3"+
		"\2\2\2\n\u0083\3\2\2\2\f\u0090\3\2\2\2\16\u00a2\3\2\2\2\20\u00d5\3\2\2"+
		"\2\22\u0117\3\2\2\2\24\u0134\3\2\2\2\26\u0138\3\2\2\2\30\u0160\3\2\2\2"+
		"\32\u0164\3\2\2\2\34\u0166\3\2\2\2\36\u0168\3\2\2\2 \u016a\3\2\2\2\"\u016c"+
		"\3\2\2\2$\u0174\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\3\3\2\2\2+,\7 \2\2,\60\7>\2\2-.\5\36\20\2./\7\31\2\2/\61\3\2\2"+
		"\2\60-\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\5 \21\2\63\64\7\23\2"+
		"\2\649\5\n\6\2\65\66\7\27\2\2\668\5\n\6\2\67\65\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:@\3\2\2\2;9\3\2\2\2<=\7\27\2\2=?\5\26\f\2><\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CG\7\24\2\2DE\7*\2\2"+
		"EF\7\r\2\2FH\7/\2\2GD\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\7\2\2JO\3\2\2\2"+
		"KN\5\6\4\2LN\5\b\5\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2"+
		"P\5\3\2\2\2QO\3\2\2\2RS\7\"\2\2Se\78\2\2TX\7>\2\2UV\5\36\20\2VW\7\31\2"+
		"\2WY\3\2\2\2XU\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Zf\5 \21\2[_\7!\2\2\\]\5\36"+
		"\20\2]^\7\31\2\2^`\3\2\2\2_\\\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5 \21\2bc"+
		"\7\31\2\2cd\5\"\22\2df\3\2\2\2eT\3\2\2\2e[\3\2\2\2fg\3\2\2\2gh\7\60\2"+
		"\2hi\5\24\13\2ij\7\7\2\2j\7\3\2\2\2k}\7\33\2\2lp\7>\2\2mn\5\36\20\2no"+
		"\7\31\2\2oq\3\2\2\2pm\3\2\2\2pq\3\2\2\2qr\3\2\2\2r~\5 \21\2sw\7!\2\2t"+
		"u\5\36\20\2uv\7\31\2\2vx\3\2\2\2wt\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5 \21"+
		"\2z{\7\31\2\2{|\5\"\22\2|~\3\2\2\2}l\3\2\2\2}s\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\"\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7\7\2\2\u0082\t\3\2\2"+
		"\2\u0083\u0084\5\"\22\2\u0084\u0088\5\f\7\2\u0085\u0087\5\16\b\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008d\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\"\2\2\u008c"+
		"\u008e\5\24\13\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\13\3\2"+
		"\2\2\u008f\u0091\5\34\17\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009e\3\2\2\2\u0094\u0095\7\23"+
		"\2\2\u0095\u0096\5\30\r\2\u0096\u0097\7\24\2\2\u0097\u009f\3\2\2\2\u0098"+
		"\u0099\7\23\2\2\u0099\u009a\5\30\r\2\u009a\u009b\7\27\2\2\u009b\u009c"+
		"\5\30\r\2\u009c\u009d\7\24\2\2\u009d\u009f\3\2\2\2\u009e\u0094\3\2\2\2"+
		"\u009e\u0098\3\2\2\2\u009e\u009f\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1\7"+
		"#\2\2\u00a1\u00a3\5\34\17\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00bb\3\2\2\2\u00a4\u00ab\7\'\2\2\u00a5\u00ac\5\30\r\2\u00a6\u00ac\5"+
		"\32\16\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\24\2"+
		"\2\u00aa\u00ac\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ab\u00a7"+
		"\3\2\2\2\u00ac\u00bc\3\2\2\2\u00ad\u00af\7\65\2\2\u00ae\u00ad\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00bc\7\67\2\2\u00b1\u00bc"+
		"\7@\2\2\u00b2\u00b3\7:\2\2\u00b3\u00bc\7\62\2\2\u00b4\u00bc\5\22\n\2\u00b5"+
		"\u00b6\7\37\2\2\u00b6\u00b7\7\23\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9"+
		"\7\24\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bc\7\32\2\2\u00bb\u00a4\3\2\2\2"+
		"\u00bb\u00ae\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b4"+
		"\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\17\3\2\2\2\u00bd"+
		"\u00be\b\t\1\2\u00be\u00d6\5\32\16\2\u00bf\u00c0\5\34\17\2\u00c0\u00cd"+
		"\7\23\2\2\u00c1\u00c3\7)\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c9\5\20\t\2\u00c5\u00c6\7\27\2\2\u00c6\u00c8\5"+
		"\20\t\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\7\25"+
		"\2\2\u00cd\u00c2\3\2\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\7\24\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d2\7"+
		"\23\2\2\u00d2\u00d3\5\20\t\2\u00d3\u00d4\7\24\2\2\u00d4\u00d6\3\2\2\2"+
		"\u00d5\u00bd\3\2\2\2\u00d5\u00bf\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\u0114"+
		"\3\2\2\2\u00d7\u00d8\f\17\2\2\u00d8\u00d9\7\6\2\2\u00d9\u0113\5\20\t\20"+
		"\u00da\u00db\f\16\2\2\u00db\u00dc\t\2\2\2\u00dc\u0113\5\20\t\17\u00dd"+
		"\u00de\f\r\2\2\u00de\u00df\t\3\2\2\u00df\u0113\5\20\t\16\u00e0\u00e1\f"+
		"\f\2\2\u00e1\u00e2\t\4\2\2\u00e2\u0113\5\20\t\r\u00e3\u00e4\f\13\2\2\u00e4"+
		"\u00e5\t\5\2\2\u00e5\u0113\5\20\t\f\u00e6\u00f3\f\n\2\2\u00e7\u00f4\7"+
		"\r\2\2\u00e8\u00f4\7\b\2\2\u00e9\u00f4\7\4\2\2\u00ea\u00f4\7\20\2\2\u00eb"+
		"\u00f4\7\60\2\2\u00ec\u00ed\7\60\2\2\u00ed\u00f4\7\65\2\2\u00ee\u00f4"+
		"\7.\2\2\u00ef\u00f4\7\63\2\2\u00f0\u00f4\7-\2\2\u00f1\u00f4\7\64\2\2\u00f2"+
		"\u00f4\7<\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00e9\3\2"+
		"\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0113\5\20\t\13\u00f6"+
		"\u00f7\f\t\2\2\u00f7\u00f8\7\34\2\2\u00f8\u0113\5\20\t\n\u00f9\u00fa\f"+
		"\b\2\2\u00fa\u00fb\79\2\2\u00fb\u0113\5\20\t\t\u00fc\u00fd\f\4\2\2\u00fd"+
		"\u00ff\7\60\2\2\u00fe\u0100\7\65\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0113\5\20\t\5\u0102\u0104\f\3\2\2\u0103"+
		"\u0105\7\65\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0107\7\35\2\2\u0107\u0108\5\20\t\2\u0108\u0109\7\34\2\2"+
		"\u0109\u010a\5\20\t\4\u010a\u0113\3\2\2\2\u010b\u0110\f\5\2\2\u010c\u0111"+
		"\7\61\2\2\u010d\u0111\7\66\2\2\u010e\u010f\7\65\2\2\u010f\u0111\7\67\2"+
		"\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u00d7\3\2\2\2\u0112\u00da\3\2\2\2\u0112\u00dd\3\2\2\2\u0112"+
		"\u00e0\3\2\2\2\u0112\u00e3\3\2\2\2\u0112\u00e6\3\2\2\2\u0112\u00f6\3\2"+
		"\2\2\u0112\u00f9\3\2\2\2\u0112\u00fc\3\2\2\2\u0112\u0102\3\2\2\2\u0112"+
		"\u010b\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\21\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011b\7;\2\2\u0118\u0119"+
		"\5\36\20\2\u0119\u011a\7\31\2\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0129\5 \21\2\u011e\u011f"+
		"\7\23\2\2\u011f\u0124\5\"\22\2\u0120\u0121\7\27\2\2\u0121\u0123\5\"\22"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\24\2\2"+
		"\u0128\u012a\3\2\2\2\u0129\u011e\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0132"+
		"\3\2\2\2\u012b\u012c\78\2\2\u012c\u0130\7(\2\2\u012d\u0131\7\36\2\2\u012e"+
		"\u012f\7=\2\2\u012f\u0131\7\67\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u012b\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\23\3\2\2\2\u0134\u0135\7C\2\2\u0135\25\3\2\2\2\u0136\u0137\7#\2\2\u0137"+
		"\u0139\5\34\17\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u015d\3"+
		"\2\2\2\u013a\u013b\7:\2\2\u013b\u013e\7\62\2\2\u013c\u013e\7@\2\2\u013d"+
		"\u013a\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\23"+
		"\2\2\u0140\u0145\5\"\22\2\u0141\u0142\7\27\2\2\u0142\u0144\5\"\22\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\24\2\2\u0149"+
		"\u015e\3\2\2\2\u014a\u014b\7\37\2\2\u014b\u014c\7\23\2\2\u014c\u014d\5"+
		"\20\t\2\u014d\u014e\7\24\2\2\u014e\u015e\3\2\2\2\u014f\u0150\7,\2\2\u0150"+
		"\u0151\7\62\2\2\u0151\u0152\7\23\2\2\u0152\u0157\5\"\22\2\u0153\u0154"+
		"\7\27\2\2\u0154\u0156\5\"\22\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015b\7\24\2\2\u015b\u015c\5\22\n\2\u015c\u015e\3\2\2\2"+
		"\u015d\u013d\3\2\2\2\u015d\u014a\3\2\2\2\u015d\u014f\3\2\2\2\u015e\27"+
		"\3\2\2\2\u015f\u0161\t\3\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7B\2\2\u0163\31\3\2\2\2\u0164\u0165\t\6\2\2"+
		"\u0165\33\3\2\2\2\u0166\u0167\5$\23\2\u0167\35\3\2\2\2\u0168\u0169\5$"+
		"\23\2\u0169\37\3\2\2\2\u016a\u016b\5$\23\2\u016b!\3\2\2\2\u016c\u016d"+
		"\5$\23\2\u016d#\3\2\2\2\u016e\u0175\7A\2\2\u016f\u0175\7C\2\2\u0170\u0171"+
		"\7\23\2\2\u0171\u0172\5$\23\2\u0172\u0173\7\24\2\2\u0173\u0175\3\2\2\2"+
		"\u0174\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0175%\3"+
		"\2\2\2-)\609@GMOX_epw}\u0088\u008d\u0092\u009e\u00a2\u00ab\u00ae\u00bb"+
		"\u00c2\u00c9\u00cd\u00d5\u00f3\u00ff\u0104\u0110\u0112\u0114\u011b\u0124"+
		"\u0129\u0130\u0132\u0138\u013d\u0145\u0157\u015d\u0160\u0174";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}