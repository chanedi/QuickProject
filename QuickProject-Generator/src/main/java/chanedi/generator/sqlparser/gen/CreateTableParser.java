// Generated from E:/Chanedi/IdeaProjects/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/sqlparser\CreateTable.g4 by ANTLR 4.x
package chanedi.generator.sqlparser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableParser extends Parser {
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
		"<INVALID>", "'%'", "'&'", "')'", "'.'", "','", "'+'", "'-'", "'*'", "'('", 
		"'<>'", "'<'", "'='", "'!='", "';'", "'<='", "'<<'", "'||'", "'>'", "'/'", 
		"'=='", "'>='", "'|'", "'>>'", "K_AND", "K_BETWEEN", "K_CASCADE", "K_CHECK", 
		"K_CREATE", "K_COLUMN", "K_COMMENT", "K_CONSTRAINT", "K_CURRENT_DATE", 
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
		public List<MdlContext> mdl() {
			return getRuleContexts(MdlContext.class);
		}
		public MdlContext mdl(int i) {
			return getRuleContext(MdlContext.class,i);
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
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_CREATE() { return getToken(CreateTableParser.K_CREATE, 0); }
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
				setState(42); match(T__19);
				}
				break;
			}
			setState(46); table_name();
			{
			setState(47); match(T__14);
			setState(48); column_definition();
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49); match(T__18);
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
			while (_la==T__18) {
				{
				{
				setState(56); match(T__18);
				setState(57); table_constraint();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); match(T__20);
			setState(64); match(T__9);
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
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(CreateTableParser.K_ON, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public TerminalNode K_COLUMN() { return getToken(CreateTableParser.K_COLUMN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(CreateTableParser.K_IS, 0); }
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
					setState(76); match(T__19);
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
					setState(83); match(T__19);
					}
					break;
				}
				setState(87); table_name();
				setState(88); match(T__19);
				setState(89); column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93); match(K_IS);
			setState(94); comment_value();
			setState(95); match(T__9);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Inline_constraintContext> inline_constraint() {
			return getRuleContexts(Inline_constraintContext.class);
		}
		public Inline_constraintContext inline_constraint(int i) {
			return getRuleContext(Inline_constraintContext.class,i);
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
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
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
			setState(106); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(105); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(110); match(T__14);
				setState(111); signed_number();
				setState(112); match(T__20);
				}
				break;
			case 2:
				{
				setState(114); match(T__14);
				setState(115); signed_number();
				setState(116); match(T__18);
				setState(117); signed_number();
				setState(118); match(T__20);
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
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CreateTableParser.K_NOT, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(CreateTableParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(CreateTableParser.K_UNIQUE, 0); }
		public TerminalNode K_PRIMARY() { return getToken(CreateTableParser.K_PRIMARY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(CreateTableParser.K_CHECK, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CreateTableParser.K_CONSTRAINT, 0); }
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
			setState(124);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(122); match(K_CONSTRAINT);
				setState(123); name();
				}
			}

			setState(148);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				{
				setState(126); match(K_DEFAULT);
				setState(133);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(127); signed_number();
					}
					break;
				case 2:
					{
					setState(128); literal_value();
					}
					break;
				case 3:
					{
					setState(129); match(T__14);
					setState(130); expr(0);
					setState(131); match(T__20);
					}
					break;
				}
				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(136);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(135); match(K_NOT);
					}
				}

				setState(138); match(K_NULL);
				}
				break;
			case K_UNIQUE:
				{
				setState(139); match(K_UNIQUE);
				}
				break;
			case K_PRIMARY:
				{
				setState(140); match(K_PRIMARY);
				setState(141); match(K_KEY);
				}
				break;
			case K_REFERENCES:
				{
				setState(142); foreign_key_clause();
				}
				break;
			case K_CHECK:
				{
				setState(143); match(K_CHECK);
				setState(144); match(T__14);
				setState(145); expr(0);
				setState(146); match(T__20);
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
		public TerminalNode K_BETWEEN() { return getToken(CreateTableParser.K_BETWEEN, 0); }
		public TerminalNode K_NOTNULL() { return getToken(CreateTableParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode K_ISNULL() { return getToken(CreateTableParser.K_ISNULL, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CreateTableParser.K_NOT, 0); }
		public TerminalNode K_IS() { return getToken(CreateTableParser.K_IS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_GLOB() { return getToken(CreateTableParser.K_GLOB, 0); }
		public TerminalNode K_OR() { return getToken(CreateTableParser.K_OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_AND() { return getToken(CreateTableParser.K_AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(CreateTableParser.K_DISTINCT, 0); }
		public TerminalNode K_LIKE() { return getToken(CreateTableParser.K_LIKE, 0); }
		public TerminalNode K_REGEXP() { return getToken(CreateTableParser.K_REGEXP, 0); }
		public TerminalNode K_MATCH() { return getToken(CreateTableParser.K_MATCH, 0); }
		public TerminalNode K_IN() { return getToken(CreateTableParser.K_IN, 0); }
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
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(151); literal_value();
				}
				break;
			case 2:
				{
				setState(152); name();
				setState(153); match(T__14);
				setState(166);
				switch (_input.LA(1)) {
				case T__14:
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
					setState(155);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(154); match(K_DISTINCT);
						}
					}

					setState(157); expr(0);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__18) {
						{
						{
						setState(158); match(T__18);
						setState(159); expr(0);
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__15:
					{
					setState(165); match(T__15);
					}
					break;
				case T__20:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); match(T__20);
				}
				break;
			case 3:
				{
				setState(170); match(T__14);
				setState(171); expr(0);
				setState(172); match(T__20);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(177); match(T__6);
						setState(178); expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(180);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__15) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(181); expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(183);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(184); expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(186);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__7) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(187); expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(189);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__8) | (1L << T__5) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(190); expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(204);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(192); match(T__11);
							}
							break;
						case 2:
							{
							setState(193); match(T__3);
							}
							break;
						case 3:
							{
							setState(194); match(T__10);
							}
							break;
						case 4:
							{
							setState(195); match(T__13);
							}
							break;
						case 5:
							{
							setState(196); match(K_IS);
							}
							break;
						case 6:
							{
							setState(197); match(K_IS);
							setState(198); match(K_NOT);
							}
							break;
						case 7:
							{
							setState(199); match(K_IN);
							}
							break;
						case 8:
							{
							setState(200); match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(201); match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(202); match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(203); match(K_REGEXP);
							}
							break;
						}
						setState(206); expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208); match(K_AND);
						setState(209); expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(211); match(K_OR);
						setState(212); expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214); match(K_IS);
						setState(216);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(215); match(K_NOT);
							}
						}

						setState(218); expr(3);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(220); match(K_NOT);
							}
						}

						setState(223); match(K_BETWEEN);
						setState(224); expr(0);
						setState(225); match(K_AND);
						setState(226); expr(2);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(233);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(229); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(230); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(231); match(K_NOT);
							setState(232); match(K_NULL);
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
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public TerminalNode K_CASCADE() { return getToken(CreateTableParser.K_CASCADE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_ON() { return getToken(CreateTableParser.K_ON, 0); }
		public TerminalNode K_SET() { return getToken(CreateTableParser.K_SET, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_REFERENCES() { return getToken(CreateTableParser.K_REFERENCES, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_DELETE() { return getToken(CreateTableParser.K_DELETE, 0); }
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
			setState(240); match(K_REFERENCES);
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(241); schema();
				setState(242); match(T__19);
				}
				break;
			}
			setState(246); table_name();
			setState(258);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(247); match(T__14);
				setState(248); column_name();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(249); match(T__18);
					setState(250); column_name();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256); match(T__20);
				}
			}

			setState(267);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(260); match(K_ON);
				setState(261); match(K_DELETE);
				setState(265);
				switch (_input.LA(1)) {
				case K_CASCADE:
					{
					setState(262); match(K_CASCADE);
					}
					break;
				case K_SET:
					{
					setState(263); match(K_SET);
					setState(264); match(K_NULL);
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
			setState(269); match(STRING_LITERAL);
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
		public TerminalNode K_UNIQUE() { return getToken(CreateTableParser.K_UNIQUE, 0); }
		public TerminalNode K_PRIMARY() { return getToken(CreateTableParser.K_PRIMARY, 0); }
		public TerminalNode K_FOREIGN() { return getToken(CreateTableParser.K_FOREIGN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(CreateTableParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(CreateTableParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CHECK() { return getToken(CreateTableParser.K_CHECK, 0); }
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
			setState(273);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(271); match(K_CONSTRAINT);
				setState(272); name();
				}
			}

			setState(310);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(278);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(275); match(K_PRIMARY);
					setState(276); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(277); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280); match(T__14);
				setState(281); column_name();
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(282); match(T__18);
					setState(283); column_name();
					}
					}
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(289); match(T__20);
				}
				break;
			case K_CHECK:
				{
				setState(291); match(K_CHECK);
				setState(292); match(T__14);
				setState(293); expr(0);
				setState(294); match(T__20);
				}
				break;
			case K_FOREIGN:
				{
				setState(296); match(K_FOREIGN);
				setState(297); match(K_KEY);
				setState(298); match(T__14);
				setState(299); column_name();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(300); match(T__18);
					setState(301); column_name();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307); match(T__20);
				setState(308); foreign_key_clause();
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
			setState(313);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__16) {
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(315); match(NUMERIC_LITERAL);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(CreateTableParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(CreateTableParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(CreateTableParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(CreateTableParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(CreateTableParser.K_CURRENT_TIME, 0); }
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
			setState(317);
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
			setState(319); any_name();
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
			setState(321); any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CreateTableParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
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
			setState(333);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); match(STRING_LITERAL);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(329); match(T__14);
				setState(330); any_name();
				setState(331); match(T__20);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u0152\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3\3\3"+
		"\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\3\6\6\6m\n\6\r\6\16\6n\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\5\7\177\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u0088\n\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0097\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\b\3"+
		"\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\3\b\5\b\u00a9\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00b1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00cf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00db\n\b\3\b"+
		"\3\b\3\b\5\b\u00e0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ec"+
		"\n\b\7\b\u00ee\n\b\f\b\16\b\u00f1\13\b\3\t\3\t\3\t\3\t\5\t\u00f7\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00fe\n\t\f\t\16\t\u0101\13\t\3\t\3\t\5\t\u0105"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u010c\n\t\5\t\u010e\n\t\3\n\3\n\3\13\3\13"+
		"\5\13\u0114\n\13\3\13\3\13\3\13\5\13\u0119\n\13\3\13\3\13\3\13\3\13\7"+
		"\13\u011f\n\13\f\13\16\13\u0122\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0131\n\13\f\13\16\13\u0134\13"+
		"\13\3\13\3\13\3\13\5\13\u0139\n\13\3\f\5\f\u013c\n\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0150\n\22\3\22\2\3\16\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"\2\7\5\2\3\3\n\n\25\25\3\2\b\t\5\2\4\4\22\22\30\31\6\2\r\r\21\21\24"+
		"\24\27\27\5\2\"$\62\62<>\u0182\2%\3\2\2\2\4)\3\2\2\2\6J\3\2\2\2\bc\3\2"+
		"\2\2\nl\3\2\2\2\f~\3\2\2\2\16\u00b0\3\2\2\2\20\u00f2\3\2\2\2\22\u010f"+
		"\3\2\2\2\24\u0113\3\2\2\2\26\u013b\3\2\2\2\30\u013f\3\2\2\2\32\u0141\3"+
		"\2\2\2\34\u0143\3\2\2\2\36\u0145\3\2\2\2 \u0147\3\2\2\2\"\u014f\3\2\2"+
		"\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2)*\7"+
		"\36\2\2*.\79\2\2+,\5\34\17\2,-\7\6\2\2-/\3\2\2\2.+\3\2\2\2./\3\2\2\2/"+
		"\60\3\2\2\2\60\61\5\36\20\2\61\62\7\13\2\2\62\67\5\b\5\2\63\64\7\7\2\2"+
		"\64\66\5\b\5\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28>\3"+
		"\2\2\29\67\3\2\2\2:;\7\7\2\2;=\5\24\13\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\5\2\2BC\7\20\2\2CG\3\2\2\2DF\5\6\4"+
		"\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IG\3\2\2\2JK\7 \2"+
		"\2K]\7\63\2\2LP\79\2\2MN\5\34\17\2NO\7\6\2\2OQ\3\2\2\2PM\3\2\2\2PQ\3\2"+
		"\2\2QR\3\2\2\2R^\5\36\20\2SW\7\37\2\2TU\5\34\17\2UV\7\6\2\2VX\3\2\2\2"+
		"WT\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\36\20\2Z[\7\6\2\2[\\\5 \21\2\\^\3\2"+
		"\2\2]L\3\2\2\2]S\3\2\2\2^_\3\2\2\2_`\7+\2\2`a\5\22\n\2ab\7\20\2\2b\7\3"+
		"\2\2\2cd\5 \21\2dh\5\n\6\2eg\5\f\7\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2i\t\3\2\2\2jh\3\2\2\2km\5\32\16\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2oz\3\2\2\2pq\7\13\2\2qr\5\26\f\2rs\7\5\2\2s{\3\2\2\2tu\7\13"+
		"\2\2uv\5\26\f\2vw\7\7\2\2wx\5\26\f\2xy\7\5\2\2y{\3\2\2\2zp\3\2\2\2zt\3"+
		"\2\2\2z{\3\2\2\2{\13\3\2\2\2|}\7!\2\2}\177\5\32\16\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\u0096\3\2\2\2\u0080\u0087\7%\2\2\u0081\u0088\5\26\f\2\u0082"+
		"\u0088\5\30\r\2\u0083\u0084\7\13\2\2\u0084\u0085\5\16\b\2\u0085\u0086"+
		"\7\5\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0088\u0097\3\2\2\2\u0089\u008b\7\60\2\2\u008a\u0089\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0097\7\62\2\2\u008d"+
		"\u0097\7:\2\2\u008e\u008f\7\65\2\2\u008f\u0097\7-\2\2\u0090\u0097\5\20"+
		"\t\2\u0091\u0092\7\35\2\2\u0092\u0093\7\13\2\2\u0093\u0094\5\16\b\2\u0094"+
		"\u0095\7\5\2\2\u0095\u0097\3\2\2\2\u0096\u0080\3\2\2\2\u0096\u008a\3\2"+
		"\2\2\u0096\u008d\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0097\r\3\2\2\2\u0098\u0099\b\b\1\2\u0099\u00b1\5\30\r"+
		"\2\u009a\u009b\5\32\16\2\u009b\u00a8\7\13\2\2\u009c\u009e\7\'\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\5\16"+
		"\b\2\u00a0\u00a1\7\7\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\n\2\2\u00a8\u009d\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\5"+
		"\2\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\16\b\2\u00ae"+
		"\u00af\7\5\2\2\u00af\u00b1\3\2\2\2\u00b0\u0098\3\2\2\2\u00b0\u009a\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00ef\3\2\2\2\u00b2\u00b3\f\17\2\2\u00b3"+
		"\u00b4\7\23\2\2\u00b4\u00ee\5\16\b\20\u00b5\u00b6\f\16\2\2\u00b6\u00b7"+
		"\t\2\2\2\u00b7\u00ee\5\16\b\17\u00b8\u00b9\f\r\2\2\u00b9\u00ba\t\3\2\2"+
		"\u00ba\u00ee\5\16\b\16\u00bb\u00bc\f\f\2\2\u00bc\u00bd\t\4\2\2\u00bd\u00ee"+
		"\5\16\b\r\u00be\u00bf\f\13\2\2\u00bf\u00c0\t\5\2\2\u00c0\u00ee\5\16\b"+
		"\f\u00c1\u00ce\f\n\2\2\u00c2\u00cf\7\16\2\2\u00c3\u00cf\7\26\2\2\u00c4"+
		"\u00cf\7\17\2\2\u00c5\u00cf\7\f\2\2\u00c6\u00cf\7+\2\2\u00c7\u00c8\7+"+
		"\2\2\u00c8\u00cf\7\60\2\2\u00c9\u00cf\7*\2\2\u00ca\u00cf\7.\2\2\u00cb"+
		"\u00cf\7)\2\2\u00cc\u00cf\7/\2\2\u00cd\u00cf\7\67\2\2\u00ce\u00c2\3\2"+
		"\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce"+
		"\u00c6\3\2\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2"+
		"\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ee\5\16\b\13\u00d1\u00d2\f\t\2\2\u00d2\u00d3\7"+
		"\32\2\2\u00d3\u00ee\5\16\b\n\u00d4\u00d5\f\b\2\2\u00d5\u00d6\7\64\2\2"+
		"\u00d6\u00ee\5\16\b\t\u00d7\u00d8\f\4\2\2\u00d8\u00da\7+\2\2\u00d9\u00db"+
		"\7\60\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00ee\5\16\b\5\u00dd\u00df\f\3\2\2\u00de\u00e0\7\60\2\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\33\2\2"+
		"\u00e2\u00e3\5\16\b\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\5\16\b\4\u00e5"+
		"\u00ee\3\2\2\2\u00e6\u00eb\f\5\2\2\u00e7\u00ec\7,\2\2\u00e8\u00ec\7\61"+
		"\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00ec\7\62\2\2\u00eb\u00e7\3\2\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00b2\3\2"+
		"\2\2\u00ed\u00b5\3\2\2\2\u00ed\u00b8\3\2\2\2\u00ed\u00bb\3\2\2\2\u00ed"+
		"\u00be\3\2\2\2\u00ed\u00c1\3\2\2\2\u00ed\u00d1\3\2\2\2\u00ed\u00d4\3\2"+
		"\2\2\u00ed\u00d7\3\2\2\2\u00ed\u00dd\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\17\3\2\2"+
		"\2\u00f1\u00ef\3\2\2\2\u00f2\u00f6\7\66\2\2\u00f3\u00f4\5\34\17\2\u00f4"+
		"\u00f5\7\6\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0104\5\36\20\2\u00f9\u00fa\7\13\2\2\u00fa"+
		"\u00ff\5 \21\2\u00fb\u00fc\7\7\2\2\u00fc\u00fe\5 \21\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\5\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u00f9\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010d\3\2\2\2\u0106"+
		"\u0107\7\63\2\2\u0107\u010b\7&\2\2\u0108\u010c\7\34\2\2\u0109\u010a\7"+
		"8\2\2\u010a\u010c\7\62\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u010e\3\2\2\2\u010e\21\3\2\2"+
		"\2\u010f\u0110\7=\2\2\u0110\23\3\2\2\2\u0111\u0112\7!\2\2\u0112\u0114"+
		"\5\32\16\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0138\3\2\2\2"+
		"\u0115\u0116\7\65\2\2\u0116\u0119\7-\2\2\u0117\u0119\7:\2\2\u0118\u0115"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\13\2\2"+
		"\u011b\u0120\5 \21\2\u011c\u011d\7\7\2\2\u011d\u011f\5 \21\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\5\2\2\u0124\u0139\3\2"+
		"\2\2\u0125\u0126\7\35\2\2\u0126\u0127\7\13\2\2\u0127\u0128\5\16\b\2\u0128"+
		"\u0129\7\5\2\2\u0129\u0139\3\2\2\2\u012a\u012b\7(\2\2\u012b\u012c\7-\2"+
		"\2\u012c\u012d\7\13\2\2\u012d\u0132\5 \21\2\u012e\u012f\7\7\2\2\u012f"+
		"\u0131\5 \21\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7\5\2\2\u0136\u0137\5\20\t\2\u0137\u0139\3\2\2\2\u0138\u0118\3"+
		"\2\2\2\u0138\u0125\3\2\2\2\u0138\u012a\3\2\2\2\u0139\25\3\2\2\2\u013a"+
		"\u013c\t\3\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\7<\2\2\u013e\27\3\2\2\2\u013f\u0140\t\6\2\2\u0140\31"+
		"\3\2\2\2\u0141\u0142\5\"\22\2\u0142\33\3\2\2\2\u0143\u0144\5\"\22\2\u0144"+
		"\35\3\2\2\2\u0145\u0146\5\"\22\2\u0146\37\3\2\2\2\u0147\u0148\5\"\22\2"+
		"\u0148!\3\2\2\2\u0149\u0150\7;\2\2\u014a\u0150\7=\2\2\u014b\u014c\7\13"+
		"\2\2\u014c\u014d\5\"\22\2\u014d\u014e\7\5\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2\u0150#\3\2\2\2"+
		"\'\'.\67>GPW]hnz~\u0087\u008a\u0096\u009d\u00a4\u00a8\u00b0\u00ce\u00da"+
		"\u00df\u00eb\u00ed\u00ef\u00f6\u00ff\u0104\u010b\u010d\u0113\u0118\u0120"+
		"\u0132\u0138\u013b\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}