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
		K_DEFAULT=35, K_DELETE=36, K_DISTINCT=37, K_GLOB=38, K_IN=39, K_IS=40, 
		K_ISNULL=41, K_KEY=42, K_LIKE=43, K_MATCH=44, K_NOT=45, K_NOTNULL=46, 
		K_NULL=47, K_ON=48, K_OR=49, K_PRIMARY=50, K_REFERENCES=51, K_REGEXP=52, 
		K_SET=53, K_TABLE=54, K_UNIQUE=55, IDENTIFIER=56, NUMERIC_LITERAL=57, 
		STRING_LITERAL=58, BLOB_LITERAL=59, SINGLE_LINE_COMMENT=60, MULTILINE_COMMENT=61, 
		SPACES=62;
	public static final String[] tokenNames = {
		"<INVALID>", "'%'", "'&'", "')'", "'.'", "','", "'+'", "'-'", "'*'", "'('", 
		"'<>'", "'<'", "'='", "'!='", "';'", "'<='", "'<<'", "'||'", "'>'", "'/'", 
		"'=='", "'>='", "'|'", "'>>'", "K_AND", "K_BETWEEN", "K_CASCADE", "K_CHECK", 
		"K_CREATE", "K_COLUMN", "K_COMMENT", "K_CONSTRAINT", "K_CURRENT_DATE", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DEFAULT", "K_DELETE", "K_DISTINCT", 
		"K_GLOB", "K_IN", "K_IS", "K_ISNULL", "K_KEY", "K_LIKE", "K_MATCH", "K_NOT", 
		"K_NOTNULL", "K_NULL", "K_ON", "K_OR", "K_PRIMARY", "K_REFERENCES", "K_REGEXP", 
		"K_SET", "K_TABLE", "K_UNIQUE", "IDENTIFIER", "NUMERIC_LITERAL", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES"
	};
	public static final int
		RULE_sql = 0, RULE_mdl = 1, RULE_comment = 2, RULE_column_definition = 3, 
		RULE_datatype = 4, RULE_inline_constraint = 5, RULE_expr = 6, RULE_foreign_key_clause = 7, 
		RULE_comment_value = 8, RULE_signed_number = 9, RULE_literal_value = 10, 
		RULE_name = 11, RULE_schema = 12, RULE_table_name = 13, RULE_column_name = 14, 
		RULE_any_name = 15;
	public static final String[] ruleNames = {
		"sql", "mdl", "comment", "column_definition", "datatype", "inline_constraint", 
		"expr", "foreign_key_clause", "comment_value", "signed_number", "literal_value", 
		"name", "schema", "table_name", "column_name", "any_name"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); mdl();
				}
				}
				setState(35); 
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
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(K_CREATE);
			setState(38); match(K_TABLE);
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(39); schema();
				setState(40); match(T__19);
				}
				break;
			}
			setState(44); table_name();
			{
			setState(45); match(T__14);
			setState(46); column_definition();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(47); match(T__18);
				setState(48); column_definition();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_COMMENT) {
				{
				{
				setState(54); comment();
				}
				}
				setState(59);
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
			setState(60); match(K_COMMENT);
			setState(61); match(K_ON);
			setState(79);
			switch (_input.LA(1)) {
			case K_TABLE:
				{
				setState(62); match(K_TABLE);
				setState(66);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(63); schema();
					setState(64); match(T__19);
					}
					break;
				}
				setState(68); table_name();
				}
				break;
			case K_COLUMN:
				{
				setState(69); match(K_COLUMN);
				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(70); schema();
					setState(71); match(T__19);
					}
					break;
				}
				setState(75); table_name();
				setState(76); match(T__19);
				setState(77); column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81); match(K_IS);
			setState(82); comment_value();
			setState(83); match(T__9);
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
			setState(85); column_name();
			setState(86); datatype();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT) | (1L << K_NOT) | (1L << K_NULL) | (1L << K_PRIMARY) | (1L << K_REFERENCES) | (1L << K_UNIQUE))) != 0)) {
				{
				{
				setState(87); inline_constraint();
				}
				}
				setState(92);
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
			setState(94); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(93); name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(98); match(T__14);
				setState(99); signed_number();
				setState(100); match(T__20);
				}
				break;
			case 2:
				{
				setState(102); match(T__14);
				setState(103); signed_number();
				setState(104); match(T__18);
				setState(105); signed_number();
				setState(106); match(T__20);
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
			setState(112);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(110); match(K_CONSTRAINT);
				setState(111); name();
				}
			}

			setState(136);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				{
				setState(114); match(K_DEFAULT);
				setState(121);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(115); signed_number();
					}
					break;
				case 2:
					{
					setState(116); literal_value();
					}
					break;
				case 3:
					{
					setState(117); match(T__14);
					setState(118); expr(0);
					setState(119); match(T__20);
					}
					break;
				}
				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(124);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(123); match(K_NOT);
					}
				}

				setState(126); match(K_NULL);
				}
				break;
			case K_UNIQUE:
				{
				setState(127); match(K_UNIQUE);
				}
				break;
			case K_PRIMARY:
				{
				setState(128); match(K_PRIMARY);
				setState(129); match(K_KEY);
				}
				break;
			case K_REFERENCES:
				{
				setState(130); foreign_key_clause();
				}
				break;
			case K_CHECK:
				{
				setState(131); match(K_CHECK);
				setState(132); match(T__14);
				setState(133); expr(0);
				setState(134); match(T__20);
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
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(139); literal_value();
				}
				break;
			case 2:
				{
				setState(140); name();
				setState(141); match(T__14);
				setState(154);
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
					setState(143);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(142); match(K_DISTINCT);
						}
					}

					setState(145); expr(0);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__18) {
						{
						{
						setState(146); match(T__18);
						setState(147); expr(0);
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__15:
					{
					setState(153); match(T__15);
					}
					break;
				case T__20:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156); match(T__20);
				}
				break;
			case 3:
				{
				setState(158); match(T__14);
				setState(159); expr(0);
				setState(160); match(T__20);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(165); match(T__6);
						setState(166); expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(168);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__15) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(169); expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(172); expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(174);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__7) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(175); expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(177);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__8) | (1L << T__5) | (1L << T__2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(178); expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(192);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(180); match(T__11);
							}
							break;
						case 2:
							{
							setState(181); match(T__3);
							}
							break;
						case 3:
							{
							setState(182); match(T__10);
							}
							break;
						case 4:
							{
							setState(183); match(T__13);
							}
							break;
						case 5:
							{
							setState(184); match(K_IS);
							}
							break;
						case 6:
							{
							setState(185); match(K_IS);
							setState(186); match(K_NOT);
							}
							break;
						case 7:
							{
							setState(187); match(K_IN);
							}
							break;
						case 8:
							{
							setState(188); match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(189); match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(190); match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(191); match(K_REGEXP);
							}
							break;
						}
						setState(194); expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(196); match(K_AND);
						setState(197); expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199); match(K_OR);
						setState(200); expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(202); match(K_IS);
						setState(204);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(203); match(K_NOT);
							}
						}

						setState(206); expr(3);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(208); match(K_NOT);
							}
						}

						setState(211); match(K_BETWEEN);
						setState(212); expr(0);
						setState(213); match(K_AND);
						setState(214); expr(2);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(217); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(218); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(219); match(K_NOT);
							setState(220); match(K_NULL);
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
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(228); match(K_REFERENCES);
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(229); schema();
				setState(230); match(T__19);
				}
				break;
			}
			setState(234); table_name();
			setState(246);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(235); match(T__14);
				setState(236); column_name();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(237); match(T__18);
					setState(238); column_name();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244); match(T__20);
				}
			}

			setState(255);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(248); match(K_ON);
				setState(249); match(K_DELETE);
				setState(253);
				switch (_input.LA(1)) {
				case K_CASCADE:
					{
					setState(250); match(K_CASCADE);
					}
					break;
				case K_SET:
					{
					setState(251); match(K_SET);
					setState(252); match(K_NULL);
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
			setState(257); match(STRING_LITERAL);
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
		enterRule(_localctx, 18, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if (_la==T__17 || _la==T__16) {
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(262); match(NUMERIC_LITERAL);
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
		enterRule(_localctx, 20, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); any_name();
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
		enterRule(_localctx, 24, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); any_name();
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
		enterRule(_localctx, 26, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); any_name();
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
		enterRule(_localctx, 28, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); any_name();
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
		enterRule(_localctx, 30, RULE_any_name);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); match(STRING_LITERAL);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(276); match(T__14);
				setState(277); any_name();
				setState(278); match(T__20);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\3\3\7\3\64\n"+
		"\3\f\3\16\3\67\13\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4E\n\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\6\6\6a\n\6\r\6\16\6"+
		"b\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\5\7s\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\5\7\177\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b"+
		"\3\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\5\b\u009d\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00c3\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cf\n"+
		"\b\3\b\3\b\3\b\5\b\u00d4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00e0\n\b\7\b\u00e2\n\b\f\b\16\b\u00e5\13\b\3\t\3\t\3\t\3\t\5\t\u00eb"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f2\n\t\f\t\16\t\u00f5\13\t\3\t\3\t\5\t"+
		"\u00f9\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0100\n\t\5\t\u0102\n\t\3\n\3\n\3\13"+
		"\5\13\u0107\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011b\n\21\3\21\2\3\16\22\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\5\2\3\3\n\n\25\25\3\2\b\t\5\2\4"+
		"\4\22\22\30\31\6\2\r\r\21\21\24\24\27\27\5\2\"$\61\61;=\u0147\2#\3\2\2"+
		"\2\4\'\3\2\2\2\6>\3\2\2\2\bW\3\2\2\2\n`\3\2\2\2\fr\3\2\2\2\16\u00a4\3"+
		"\2\2\2\20\u00e6\3\2\2\2\22\u0103\3\2\2\2\24\u0106\3\2\2\2\26\u010a\3\2"+
		"\2\2\30\u010c\3\2\2\2\32\u010e\3\2\2\2\34\u0110\3\2\2\2\36\u0112\3\2\2"+
		"\2 \u011a\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2"+
		"&\3\3\2\2\2\'(\7\36\2\2(,\78\2\2)*\5\32\16\2*+\7\6\2\2+-\3\2\2\2,)\3\2"+
		"\2\2,-\3\2\2\2-.\3\2\2\2./\5\34\17\2/\60\7\13\2\2\60\65\5\b\5\2\61\62"+
		"\7\7\2\2\62\64\5\b\5\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<\5\3\2\2\2=;\3\2\2\2>?\7 \2\2?Q\7\62\2\2@D\78\2\2AB\5\32"+
		"\16\2BC\7\6\2\2CE\3\2\2\2DA\3\2\2\2DE\3\2\2\2EF\3\2\2\2FR\5\34\17\2GK"+
		"\7\37\2\2HI\5\32\16\2IJ\7\6\2\2JL\3\2\2\2KH\3\2\2\2KL\3\2\2\2LM\3\2\2"+
		"\2MN\5\34\17\2NO\7\6\2\2OP\5\36\20\2PR\3\2\2\2Q@\3\2\2\2QG\3\2\2\2RS\3"+
		"\2\2\2ST\7*\2\2TU\5\22\n\2UV\7\20\2\2V\7\3\2\2\2WX\5\36\20\2X\\\5\n\6"+
		"\2Y[\5\f\7\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\t\3\2\2\2^\\\3"+
		"\2\2\2_a\5\30\r\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cn\3\2\2\2de"+
		"\7\13\2\2ef\5\24\13\2fg\7\5\2\2go\3\2\2\2hi\7\13\2\2ij\5\24\13\2jk\7\7"+
		"\2\2kl\5\24\13\2lm\7\5\2\2mo\3\2\2\2nd\3\2\2\2nh\3\2\2\2no\3\2\2\2o\13"+
		"\3\2\2\2pq\7!\2\2qs\5\30\r\2rp\3\2\2\2rs\3\2\2\2s\u008a\3\2\2\2t{\7%\2"+
		"\2u|\5\24\13\2v|\5\26\f\2wx\7\13\2\2xy\5\16\b\2yz\7\5\2\2z|\3\2\2\2{u"+
		"\3\2\2\2{v\3\2\2\2{w\3\2\2\2|\u008b\3\2\2\2}\177\7/\2\2~}\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u008b\7\61\2\2\u0081\u008b\79\2\2\u0082"+
		"\u0083\7\64\2\2\u0083\u008b\7,\2\2\u0084\u008b\5\20\t\2\u0085\u0086\7"+
		"\35\2\2\u0086\u0087\7\13\2\2\u0087\u0088\5\16\b\2\u0088\u0089\7\5\2\2"+
		"\u0089\u008b\3\2\2\2\u008at\3\2\2\2\u008a~\3\2\2\2\u008a\u0081\3\2\2\2"+
		"\u008a\u0082\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0085\3\2\2\2\u008b\r\3"+
		"\2\2\2\u008c\u008d\b\b\1\2\u008d\u00a5\5\26\f\2\u008e\u008f\5\30\r\2\u008f"+
		"\u009c\7\13\2\2\u0090\u0092\7\'\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\5\16\b\2\u0094\u0095\7\7\2\2\u0095"+
		"\u0097\5\16\b\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009d\7\n\2\2\u009c\u0091\3\2\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\5\2\2\u009f\u00a5\3\2\2\2\u00a0"+
		"\u00a1\7\13\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\7\5\2\2\u00a3\u00a5\3"+
		"\2\2\2\u00a4\u008c\3\2\2\2\u00a4\u008e\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5"+
		"\u00e3\3\2\2\2\u00a6\u00a7\f\17\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00e2\5"+
		"\16\b\20\u00a9\u00aa\f\16\2\2\u00aa\u00ab\t\2\2\2\u00ab\u00e2\5\16\b\17"+
		"\u00ac\u00ad\f\r\2\2\u00ad\u00ae\t\3\2\2\u00ae\u00e2\5\16\b\16\u00af\u00b0"+
		"\f\f\2\2\u00b0\u00b1\t\4\2\2\u00b1\u00e2\5\16\b\r\u00b2\u00b3\f\13\2\2"+
		"\u00b3\u00b4\t\5\2\2\u00b4\u00e2\5\16\b\f\u00b5\u00c2\f\n\2\2\u00b6\u00c3"+
		"\7\16\2\2\u00b7\u00c3\7\26\2\2\u00b8\u00c3\7\17\2\2\u00b9\u00c3\7\f\2"+
		"\2\u00ba\u00c3\7*\2\2\u00bb\u00bc\7*\2\2\u00bc\u00c3\7/\2\2\u00bd\u00c3"+
		"\7)\2\2\u00be\u00c3\7-\2\2\u00bf\u00c3\7(\2\2\u00c0\u00c3\7.\2\2\u00c1"+
		"\u00c3\7\66\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b7\3\2\2\2\u00c2\u00b8\3"+
		"\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2"+
		"\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00e2\5\16\b\13\u00c5"+
		"\u00c6\f\t\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00e2\5\16\b\n\u00c8\u00c9\f"+
		"\b\2\2\u00c9\u00ca\7\63\2\2\u00ca\u00e2\5\16\b\t\u00cb\u00cc\f\4\2\2\u00cc"+
		"\u00ce\7*\2\2\u00cd\u00cf\7/\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00e2\5\16\b\5\u00d1\u00d3\f\3\2\2\u00d2"+
		"\u00d4\7/\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\7\33\2\2\u00d6\u00d7\5\16\b\2\u00d7\u00d8\7\32\2\2\u00d8"+
		"\u00d9\5\16\b\4\u00d9\u00e2\3\2\2\2\u00da\u00df\f\5\2\2\u00db\u00e0\7"+
		"+\2\2\u00dc\u00e0\7\60\2\2\u00dd\u00de\7/\2\2\u00de\u00e0\7\61\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00a6\3\2\2\2\u00e1\u00a9\3\2\2\2\u00e1\u00ac\3\2\2\2\u00e1"+
		"\u00af\3\2\2\2\u00e1\u00b2\3\2\2\2\u00e1\u00b5\3\2\2\2\u00e1\u00c5\3\2"+
		"\2\2\u00e1\u00c8\3\2\2\2\u00e1\u00cb\3\2\2\2\u00e1\u00d1\3\2\2\2\u00e1"+
		"\u00da\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\17\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\7\65\2\2\u00e7\u00e8"+
		"\5\32\16\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e7\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f8\5\34\17\2\u00ed\u00ee"+
		"\7\13\2\2\u00ee\u00f3\5\36\20\2\u00ef\u00f0\7\7\2\2\u00f0\u00f2\5\36\20"+
		"\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\5\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0101\3\2"+
		"\2\2\u00fa\u00fb\7\62\2\2\u00fb\u00ff\7&\2\2\u00fc\u0100\7\34\2\2\u00fd"+
		"\u00fe\7\67\2\2\u00fe\u0100\7\61\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3"+
		"\2\2\2\u0100\u0102\3\2\2\2\u0101\u00fa\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\21\3\2\2\2\u0103\u0104\7<\2\2\u0104\23\3\2\2\2\u0105\u0107\t\3\2\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7;"+
		"\2\2\u0109\25\3\2\2\2\u010a\u010b\t\6\2\2\u010b\27\3\2\2\2\u010c\u010d"+
		"\5 \21\2\u010d\31\3\2\2\2\u010e\u010f\5 \21\2\u010f\33\3\2\2\2\u0110\u0111"+
		"\5 \21\2\u0111\35\3\2\2\2\u0112\u0113\5 \21\2\u0113\37\3\2\2\2\u0114\u011b"+
		"\7:\2\2\u0115\u011b\7<\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5 \21\2\u0118"+
		"\u0119\7\5\2\2\u0119\u011b\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2"+
		"\2\2\u011a\u0116\3\2\2\2\u011b!\3\2\2\2!%,\65;DKQ\\bnr{~\u008a\u0091\u0098"+
		"\u009c\u00a4\u00c2\u00ce\u00d3\u00df\u00e1\u00e3\u00ea\u00f3\u00f8\u00ff"+
		"\u0101\u0106\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}