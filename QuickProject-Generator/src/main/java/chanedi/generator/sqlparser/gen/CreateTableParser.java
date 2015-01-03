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
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, K_AND=24, 
		K_BETWEEN=25, K_CASCADE=26, K_CHECK=27, K_CREATE=28, K_COLUMN=29, K_COMMENT=30, 
		K_CONSTRAINT=31, K_CURRENT_DATE=32, K_CURRENT_TIME=33, K_CURRENT_TIMESTAMP=34, 
		K_DEFAULT=35, K_DELETE=36, K_DISTINCT=37, K_FOREIGN=38, K_GLOB=39, K_IN=40, 
		K_IS=41, K_ISNULL=42, K_KEY=43, K_LIKE=44, K_MATCH=45, K_NOT=46, K_NOTNULL=47, 
		K_NULL=48, K_ON=49, K_OR=50, K_PRIMARY=51, K_REFERENCES=52, K_REGEXP=53, 
		K_SET=54, K_TABLE=55, K_UNIQUE=56, IDENTIFIER=57, NUMERIC_LITERAL=58, 
		STRING_LITERAL=59, BLOB_LITERAL=60, SINGLE_LINE_COMMENT=61, MULTILINE_COMMENT=62, 
		SPACES=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'>='", "'||'", "';'", "'=='", "'<'", "'|'", 
		"'>>'", "'<<'", "'='", "'>'", "'<='", "'<>'", "'%'", "'&'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "'.'", "K_AND", "K_BETWEEN", "K_CASCADE", 
		"K_CHECK", "K_CREATE", "K_COLUMN", "K_COMMENT", "K_CONSTRAINT", "K_CURRENT_DATE", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DEFAULT", "K_DELETE", "K_DISTINCT", 
		"K_FOREIGN", "K_GLOB", "K_IN", "K_IS", "K_ISNULL", "K_KEY", "K_LIKE", 
		"K_MATCH", "K_NOT", "K_NOTNULL", "K_NULL", "K_ON", "K_OR", "K_PRIMARY", 
		"K_REFERENCES", "K_REGEXP", "K_SET", "K_TABLE", "K_UNIQUE", "IDENTIFIER", 
		"NUMERIC_LITERAL", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
		"MULTILINE_COMMENT", "SPACES"
	};
	public static final int
		RULE_sql = 0, RULE_mdl = 1, RULE_comment = 2, RULE_column_definition = 3, 
		RULE_datatype = 4, RULE_inline_constraint = 5, RULE_expr = 6, RULE_foreign_key_clause = 7, 
		RULE_comment_value = 8, RULE_table_constraint = 9, RULE_signed_number = 10, 
		RULE_literal_value = 11, RULE_name = 12, RULE_schema = 13, RULE_table_name = 14, 
		RULE_column_name = 15, RULE_any_name = 16;
	public static final String[] ruleNames = {
		"sql", "mdl", "comment", "column_definition", "datatype", "inline_constraint", 
		"expr", "foreign_key_clause", "comment_value", "table_constraint", "signed_number", 
		"literal_value", "name", "schema", "table_name", "column_name", "any_name"
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
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); mdl();
				}
				}
				setState(37); 
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public TerminalNode K_CREATE() { return getToken(CreateTableParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
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
			setState(39); match(K_CREATE);
			setState(40); match(K_TABLE);
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(41); schema();
				setState(42); match(T__0);
				}
				break;
			}
			setState(46); table_name();
			{
			setState(47); match(T__6);
			setState(48); column_definition();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49); match(T__2);
					setState(50); column_definition();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56); match(T__2);
				setState(57); table_constraint();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(T__5);
			setState(64); match(T__18);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMENT) {
				{
				{
				setState(66); comment();
				}
				}
				setState(71);
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

	public static class CommentContext extends ParserRuleContext {
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
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(K_COMMENT);
			setState(73); match(K_ON);
			setState(91);
			switch (_input.LA(1)) {
			case K_TABLE:
				{
				setState(74); match(K_TABLE);
				setState(78);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(75); schema();
					setState(76); match(T__0);
					}
					break;
				}
				setState(80); table_name();
				}
				break;
			case K_COLUMN:
				{
				setState(81); match(K_COLUMN);
				setState(85);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(82); schema();
					setState(83); match(T__0);
					}
					break;
				}
				setState(87); table_name();
				setState(88); match(T__0);
				setState(89); column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93); match(K_IS);
			setState(94); comment_value();
			setState(95); match(T__18);
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
		enterRule(_localctx, 6, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); column_name();
			setState(98); datatype();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT) | (1L << K_NOT) | (1L << K_NULL) | (1L << K_PRIMARY) | (1L << K_REFERENCES) | (1L << K_UNIQUE))) != 0)) {
				{
				{
				setState(99); inline_constraint();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(105); match(K_COMMENT);
				setState(106); comment_value();
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
		enterRule(_localctx, 8, RULE_datatype);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(109); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(114); match(T__6);
				setState(115); signed_number();
				setState(116); match(T__5);
				}
				break;
			case 2:
				{
				setState(118); match(T__6);
				setState(119); signed_number();
				setState(120); match(T__2);
				setState(121); signed_number();
				setState(122); match(T__5);
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
		enterRule(_localctx, 10, RULE_inline_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(126); match(K_CONSTRAINT);
				setState(127); name();
				}
			}

			setState(152);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				{
				setState(130); match(K_DEFAULT);
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(131); signed_number();
					}
					break;
				case 2:
					{
					setState(132); literal_value();
					}
					break;
				case 3:
					{
					setState(133); match(T__6);
					setState(134); expr(0);
					setState(135); match(T__5);
					}
					break;
				}
				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(140);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(139); match(K_NOT);
					}
				}

				setState(142); match(K_NULL);
				}
				break;
			case K_UNIQUE:
				{
				setState(143); match(K_UNIQUE);
				}
				break;
			case K_PRIMARY:
				{
				setState(144); match(K_PRIMARY);
				setState(145); match(K_KEY);
				}
				break;
			case K_REFERENCES:
				{
				setState(146); foreign_key_clause();
				}
				break;
			case K_CHECK:
				{
				setState(147); match(K_CHECK);
				setState(148); match(T__6);
				setState(149); expr(0);
				setState(150); match(T__5);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(155); literal_value();
				}
				break;
			case 2:
				{
				setState(156); name();
				setState(157); match(T__6);
				setState(170);
				switch (_input.LA(1)) {
				case T__6:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DISTINCT:
				case K_NULL:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(159);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(158); match(K_DISTINCT);
						}
					}

					setState(161); expr(0);
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(162); match(T__2);
						setState(163); expr(0);
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__4:
					{
					setState(169); match(T__4);
					}
					break;
				case T__5:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); match(T__5);
				}
				break;
			case 3:
				{
				setState(174); match(T__6);
				setState(175); expr(0);
				setState(176); match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(181); match(T__19);
						setState(182); expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(184);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__8) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(185); expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(187);
						_la = _input.LA(1);
						if ( !(_la==T__3 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(188); expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(190);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(191); expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__16) | (1L << T__11) | (1L << T__10))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(194); expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(196); match(T__12);
							}
							break;
						case 2:
							{
							setState(197); match(T__17);
							}
							break;
						case 3:
							{
							setState(198); match(T__21);
							}
							break;
						case 4:
							{
							setState(199); match(T__9);
							}
							break;
						case 5:
							{
							setState(200); match(K_IS);
							}
							break;
						case 6:
							{
							setState(201); match(K_IS);
							setState(202); match(K_NOT);
							}
							break;
						case 7:
							{
							setState(203); match(K_IN);
							}
							break;
						case 8:
							{
							setState(204); match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(205); match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(206); match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(207); match(K_REGEXP);
							}
							break;
						}
						setState(210); expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(212); match(K_AND);
						setState(213); expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(215); match(K_OR);
						setState(216); expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218); match(K_IS);
						setState(220);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(219); match(K_NOT);
							}
						}

						setState(222); expr(3);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(225);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(224); match(K_NOT);
							}
						}

						setState(227); match(K_BETWEEN);
						setState(228); expr(0);
						setState(229); match(K_AND);
						setState(230); expr(2);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(237);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(233); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(234); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(235); match(K_NOT);
							setState(236); match(K_NULL);
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
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 14, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(K_REFERENCES);
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(245); schema();
				setState(246); match(T__0);
				}
				break;
			}
			setState(250); table_name();
			setState(262);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(251); match(T__6);
				setState(252); column_name();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(253); match(T__2);
					setState(254); column_name();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260); match(T__5);
				}
			}

			setState(271);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(264); match(K_ON);
				setState(265); match(K_DELETE);
				setState(269);
				switch (_input.LA(1)) {
				case K_CASCADE:
					{
					setState(266); match(K_CASCADE);
					}
					break;
				case K_SET:
					{
					setState(267); match(K_SET);
					setState(268); match(K_NULL);
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
		enterRule(_localctx, 16, RULE_comment_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(STRING_LITERAL);
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
		enterRule(_localctx, 18, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(275); match(K_CONSTRAINT);
				setState(276); name();
				}
			}

			setState(314);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(282);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(279); match(K_PRIMARY);
					setState(280); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(281); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
				break;
			case K_CHECK:
				{
				setState(295); match(K_CHECK);
				setState(296); match(T__6);
				setState(297); expr(0);
				setState(298); match(T__5);
				}
				break;
			case K_FOREIGN:
				{
				setState(300); match(K_FOREIGN);
				setState(301); match(K_KEY);
				setState(302); match(T__6);
				setState(303); column_name();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(304); match(T__2);
					setState(305); column_name();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311); match(T__5);
				setState(312); foreign_key_clause();
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
		enterRule(_localctx, 20, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__1) {
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(319); match(NUMERIC_LITERAL);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(CreateTableParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(CreateTableParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(CreateTableParser.K_CURRENT_TIME, 0); }
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
		enterRule(_localctx, 22, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_NULL) | (1L << NUMERIC_LITERAL) | (1L << STRING_LITERAL) | (1L << BLOB_LITERAL))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); any_name();
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
		enterRule(_localctx, 26, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325); any_name();
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
		enterRule(_localctx, 28, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); any_name();
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
		enterRule(_localctx, 30, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); any_name();
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
		enterRule(_localctx, 32, RULE_any_name);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); match(STRING_LITERAL);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(333); match(T__6);
				setState(334); any_name();
				setState(335); match(T__5);
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
		case 6: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3"+
		"\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\3\5\5\5n\n\5\3\6\6\6q\n\6\r\6\16"+
		"\6r\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\5\7\u0083"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\7\5\7\u008f\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00a2\n\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\5\b\u00ad"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00df\n\b\3\b\3\b\3\b\5\b\u00e4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00f0\n\b\7\b\u00f2\n\b\f\b\16\b\u00f5\13\b\3\t\3\t\3\t\3"+
		"\t\5\t\u00fb\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u0102\n\t\f\t\16\t\u0105\13\t"+
		"\3\t\3\t\5\t\u0109\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0110\n\t\5\t\u0112\n\t"+
		"\3\n\3\n\3\13\3\13\5\13\u0118\n\13\3\13\3\13\3\13\5\13\u011d\n\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0123\n\13\f\13\16\13\u0126\13\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0135\n\13\f\13"+
		"\16\13\u0138\13\13\3\13\3\13\3\13\5\13\u013d\n\13\3\f\5\f\u0140\n\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0154\n\22\3\22\2\3\16\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\7\5\2\3\3\21\21\25\25\4\2\26\26\30\30\4\2\n\f\22"+
		"\22\5\2\5\5\t\t\16\17\5\2\"$\62\62<>\u0187\2%\3\2\2\2\4)\3\2\2\2\6J\3"+
		"\2\2\2\bc\3\2\2\2\np\3\2\2\2\f\u0082\3\2\2\2\16\u00b4\3\2\2\2\20\u00f6"+
		"\3\2\2\2\22\u0113\3\2\2\2\24\u0117\3\2\2\2\26\u013f\3\2\2\2\30\u0143\3"+
		"\2\2\2\32\u0145\3\2\2\2\34\u0147\3\2\2\2\36\u0149\3\2\2\2 \u014b\3\2\2"+
		"\2\"\u0153\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2(\3\3\2\2\2)*\7\36\2\2*.\79\2\2+,\5\34\17\2,-\7\31\2\2-/\3\2\2\2.+\3"+
		"\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\5\36\20\2\61\62\7\23\2\2\62\67\5\b"+
		"\5\2\63\64\7\27\2\2\64\66\5\b\5\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28>\3\2\2\29\67\3\2\2\2:;\7\27\2\2;=\5\24\13\2<:\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\24\2\2BC\7\7"+
		"\2\2CG\3\2\2\2DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3"+
		"\2\2\2IG\3\2\2\2JK\7 \2\2K]\7\63\2\2LP\79\2\2MN\5\34\17\2NO\7\31\2\2O"+
		"Q\3\2\2\2PM\3\2\2\2PQ\3\2\2\2QR\3\2\2\2R^\5\36\20\2SW\7\37\2\2TU\5\34"+
		"\17\2UV\7\31\2\2VX\3\2\2\2WT\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\36\20\2Z"+
		"[\7\31\2\2[\\\5 \21\2\\^\3\2\2\2]L\3\2\2\2]S\3\2\2\2^_\3\2\2\2_`\7+\2"+
		"\2`a\5\22\n\2ab\7\7\2\2b\7\3\2\2\2cd\5 \21\2dh\5\n\6\2eg\5\f\7\2fe\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2im\3\2\2\2jh\3\2\2\2kl\7 \2\2ln\5\22"+
		"\n\2mk\3\2\2\2mn\3\2\2\2n\t\3\2\2\2oq\5\32\16\2po\3\2\2\2qr\3\2\2\2rp"+
		"\3\2\2\2rs\3\2\2\2s~\3\2\2\2tu\7\23\2\2uv\5\26\f\2vw\7\24\2\2w\177\3\2"+
		"\2\2xy\7\23\2\2yz\5\26\f\2z{\7\27\2\2{|\5\26\f\2|}\7\24\2\2}\177\3\2\2"+
		"\2~t\3\2\2\2~x\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080\u0081\7!\2\2"+
		"\u0081\u0083\5\32\16\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u009a"+
		"\3\2\2\2\u0084\u008b\7%\2\2\u0085\u008c\5\26\f\2\u0086\u008c\5\30\r\2"+
		"\u0087\u0088\7\23\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\24\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2"+
		"\2\2\u008c\u009b\3\2\2\2\u008d\u008f\7\60\2\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009b\7\62\2\2\u0091\u009b\7"+
		":\2\2\u0092\u0093\7\65\2\2\u0093\u009b\7-\2\2\u0094\u009b\5\20\t\2\u0095"+
		"\u0096\7\35\2\2\u0096\u0097\7\23\2\2\u0097\u0098\5\16\b\2\u0098\u0099"+
		"\7\24\2\2\u0099\u009b\3\2\2\2\u009a\u0084\3\2\2\2\u009a\u008e\3\2\2\2"+
		"\u009a\u0091\3\2\2\2\u009a\u0092\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095"+
		"\3\2\2\2\u009b\r\3\2\2\2\u009c\u009d\b\b\1\2\u009d\u00b5\5\30\r\2\u009e"+
		"\u009f\5\32\16\2\u009f\u00ac\7\23\2\2\u00a0\u00a2\7\'\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a8\5\16\b\2"+
		"\u00a4\u00a5\7\27\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ad\7\25\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\24\2\2\u00af"+
		"\u00b5\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5\16\b\2\u00b2\u00b3\7"+
		"\24\2\2\u00b3\u00b5\3\2\2\2\u00b4\u009c\3\2\2\2\u00b4\u009e\3\2\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b5\u00f3\3\2\2\2\u00b6\u00b7\f\17\2\2\u00b7\u00b8\7"+
		"\6\2\2\u00b8\u00f2\5\16\b\20\u00b9\u00ba\f\16\2\2\u00ba\u00bb\t\2\2\2"+
		"\u00bb\u00f2\5\16\b\17\u00bc\u00bd\f\r\2\2\u00bd\u00be\t\3\2\2\u00be\u00f2"+
		"\5\16\b\16\u00bf\u00c0\f\f\2\2\u00c0\u00c1\t\4\2\2\u00c1\u00f2\5\16\b"+
		"\r\u00c2\u00c3\f\13\2\2\u00c3\u00c4\t\5\2\2\u00c4\u00f2\5\16\b\f\u00c5"+
		"\u00d2\f\n\2\2\u00c6\u00d3\7\r\2\2\u00c7\u00d3\7\b\2\2\u00c8\u00d3\7\4"+
		"\2\2\u00c9\u00d3\7\20\2\2\u00ca\u00d3\7+\2\2\u00cb\u00cc\7+\2\2\u00cc"+
		"\u00d3\7\60\2\2\u00cd\u00d3\7*\2\2\u00ce\u00d3\7.\2\2\u00cf\u00d3\7)\2"+
		"\2\u00d0\u00d3\7/\2\2\u00d1\u00d3\7\67\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00c7"+
		"\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00cb\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00cf\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00f2\5\16\b\13\u00d5\u00d6\f\t\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00f2"+
		"\5\16\b\n\u00d8\u00d9\f\b\2\2\u00d9\u00da\7\64\2\2\u00da\u00f2\5\16\b"+
		"\t\u00db\u00dc\f\4\2\2\u00dc\u00de\7+\2\2\u00dd\u00df\7\60\2\2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00f2\5\16\b\5"+
		"\u00e1\u00e3\f\3\2\2\u00e2\u00e4\7\60\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\5\16\b\2"+
		"\u00e7\u00e8\7\32\2\2\u00e8\u00e9\5\16\b\4\u00e9\u00f2\3\2\2\2\u00ea\u00ef"+
		"\f\5\2\2\u00eb\u00f0\7,\2\2\u00ec\u00f0\7\61\2\2\u00ed\u00ee\7\60\2\2"+
		"\u00ee\u00f0\7\62\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00b6\3\2\2\2\u00f1\u00b9\3\2\2\2\u00f1"+
		"\u00bc\3\2\2\2\u00f1\u00bf\3\2\2\2\u00f1\u00c2\3\2\2\2\u00f1\u00c5\3\2"+
		"\2\2\u00f1\u00d5\3\2\2\2\u00f1\u00d8\3\2\2\2\u00f1\u00db\3\2\2\2\u00f1"+
		"\u00e1\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\17\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa"+
		"\7\66\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\7\31\2\2\u00f9\u00fb\3\2\2"+
		"\2\u00fa\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0108"+
		"\5\36\20\2\u00fd\u00fe\7\23\2\2\u00fe\u0103\5 \21\2\u00ff\u0100\7\27\2"+
		"\2\u0100\u0102\5 \21\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\7\24\2\2\u0107\u0109\3\2\2\2\u0108\u00fd\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u0111\3\2\2\2\u010a\u010b\7\63\2\2\u010b\u010f\7&\2\2\u010c"+
		"\u0110\7\34\2\2\u010d\u010e\78\2\2\u010e\u0110\7\62\2\2\u010f\u010c\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010a\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\21\3\2\2\2\u0113\u0114\7=\2\2\u0114\23\3\2\2\2\u0115"+
		"\u0116\7!\2\2\u0116\u0118\5\32\16\2\u0117\u0115\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u013c\3\2\2\2\u0119\u011a\7\65\2\2\u011a\u011d\7-\2\2\u011b"+
		"\u011d\7:\2\2\u011c\u0119\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u011f\7\23\2\2\u011f\u0124\5 \21\2\u0120\u0121\7\27\2\2\u0121"+
		"\u0123\5 \21\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\7\24\2\2\u0128\u013d\3\2\2\2\u0129\u012a\7\35\2\2\u012a\u012b\7"+
		"\23\2\2\u012b\u012c\5\16\b\2\u012c\u012d\7\24\2\2\u012d\u013d\3\2\2\2"+
		"\u012e\u012f\7(\2\2\u012f\u0130\7-\2\2\u0130\u0131\7\23\2\2\u0131\u0136"+
		"\5 \21\2\u0132\u0133\7\27\2\2\u0133\u0135\5 \21\2\u0134\u0132\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\24\2\2\u013a\u013b\5\20\t\2"+
		"\u013b\u013d\3\2\2\2\u013c\u011c\3\2\2\2\u013c\u0129\3\2\2\2\u013c\u012e"+
		"\3\2\2\2\u013d\25\3\2\2\2\u013e\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7<\2\2\u0142\27\3\2\2\2"+
		"\u0143\u0144\t\6\2\2\u0144\31\3\2\2\2\u0145\u0146\5\"\22\2\u0146\33\3"+
		"\2\2\2\u0147\u0148\5\"\22\2\u0148\35\3\2\2\2\u0149\u014a\5\"\22\2\u014a"+
		"\37\3\2\2\2\u014b\u014c\5\"\22\2\u014c!\3\2\2\2\u014d\u0154\7;\2\2\u014e"+
		"\u0154\7=\2\2\u014f\u0150\7\23\2\2\u0150\u0151\5\"\22\2\u0151\u0152\7"+
		"\24\2\2\u0152\u0154\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u014e\3\2\2\2\u0153"+
		"\u014f\3\2\2\2\u0154#\3\2\2\2(\'.\67>GPW]hmr~\u0082\u008b\u008e\u009a"+
		"\u00a1\u00a8\u00ac\u00b4\u00d2\u00de\u00e3\u00ef\u00f1\u00f3\u00fa\u0103"+
		"\u0108\u010f\u0111\u0117\u011c\u0124\u0136\u013c\u013f\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}