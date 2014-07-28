// Generated from E:/IDEA/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/parser\CreateTable.g4 by ANTLR 4.x
package chanedi.generator.parser.gen;
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
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, RANGE=21, COMMENT=22, NOTNULL=23, 
		DEFAULT=24, NUMBER=25, ID=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'comment on column'", "'is'", "'TIMESTAMP'", "'.'", "')'", 
		"','", "'CHAR(1)'", "'NUMERIC'", "');'", "'('", "'create'", "'constraint'", 
		"';'", "'primary key (ID)'", "'comment on table'", "'table'", "'0)'", 
		"'DATE'", "'\"'", "'VARCHAR2'", "RANGE", "COMMENT", "'not null'", "DEFAULT", 
		"NUMBER", "ID", "WS"
	};
	public static final int
		RULE_sql = 0, RULE_mdl = 1, RULE_tableComment = 2, RULE_columnComment = 3, 
		RULE_col = 4, RULE_colType = 5, RULE_primmarykey = 6, RULE_column = 7, 
		RULE_stringType = 8, RULE_dateType = 9, RULE_doubleType = 10, RULE_intType = 11, 
		RULE_booleanType = 12;
	public static final String[] ruleNames = {
		"sql", "mdl", "tableComment", "columnComment", "col", "colType", "primmarykey", 
		"column", "stringType", "dateType", "doubleType", "intType", "booleanType"
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
		public ColumnCommentContext columnComment(int i) {
			return getRuleContext(ColumnCommentContext.class,i);
		}
		public List<MdlContext> mdl() {
			return getRuleContexts(MdlContext.class);
		}
		public TableCommentContext tableComment(int i) {
			return getRuleContext(TableCommentContext.class,i);
		}
		public List<ColumnCommentContext> columnComment() {
			return getRuleContexts(ColumnCommentContext.class);
		}
		public List<TableCommentContext> tableComment() {
			return getRuleContexts(TableCommentContext.class);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26); mdl();
				setState(28);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(27); tableComment();
					}
				}

				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(30); columnComment();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public PrimmarykeyContext primmarykey() {
			return getRuleContext(PrimmarykeyContext.class,0);
		}
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
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
			setState(40); match(T__9);
			setState(41); match(T__4);
			setState(42); match(ID);
			setState(43); match(T__10);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); col();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==ID );
			setState(49); primmarykey();
			setState(50); match(T__11);
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

	public static class TableCommentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public TerminalNode COMMENT() { return getToken(CreateTableParser.COMMENT, 0); }
		public TableCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterTableComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitTableComment(this);
		}
	}

	public final TableCommentContext tableComment() throws RecognitionException {
		TableCommentContext _localctx = new TableCommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tableComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(T__5);
			setState(53); match(ID);
			setState(54); match(T__18);
			setState(55); match(COMMENT);
			setState(56); match(T__7);
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

	public static class ColumnCommentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public TerminalNode COMMENT() { return getToken(CreateTableParser.COMMENT, 0); }
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColumnCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumnComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumnComment(this);
		}
	}

	public final ColumnCommentContext columnComment() throws RecognitionException {
		ColumnCommentContext _localctx = new ColumnCommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(T__19);
			setState(59); match(ID);
			setState(60); match(T__16);
			setState(61); column();
			setState(62); match(T__18);
			setState(63); match(COMMENT);
			setState(64); match(T__7);
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

	public static class ColContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(CreateTableParser.DEFAULT, 0); }
		public TerminalNode NOTNULL() { return getToken(CreateTableParser.NOTNULL, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); column();
			setState(67); colType();
			setState(69);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(68); match(DEFAULT);
				}
			}

			setState(72);
			_la = _input.LA(1);
			if (_la==NOTNULL) {
				{
				setState(71); match(NOTNULL);
				}
			}

			setState(74); match(T__14);
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

	public static class ColTypeContext extends ParserRuleContext {
		public DateTypeContext dateType() {
			return getRuleContext(DateTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public IntTypeContext intType() {
			return getRuleContext(IntTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public DoubleTypeContext doubleType() {
			return getRuleContext(DoubleTypeContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColType(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_colType);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); stringType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); dateType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); doubleType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); intType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80); booleanType();
				}
				break;
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

	public static class PrimmarykeyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public PrimmarykeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primmarykey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterPrimmarykey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitPrimmarykey(this);
		}
	}

	public final PrimmarykeyContext primmarykey() throws RecognitionException {
		PrimmarykeyContext _localctx = new PrimmarykeyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primmarykey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(T__8);
			setState(84); match(ID);
			setState(85); match(T__6);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CreateTableParser.ID, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(87); match(ID);
				}
				break;
			case T__1:
				{
				setState(88); match(T__1);
				setState(89); match(ID);
				setState(90); match(T__1);
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

	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(CreateTableParser.RANGE, 0); }
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitStringType(this);
		}
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(T__0);
			setState(94); match(RANGE);
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

	public static class DateTypeContext extends ParserRuleContext {
		public DateTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDateType(this);
		}
	}

	public final DateTypeContext dateType() throws RecognitionException {
		DateTypeContext _localctx = new DateTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dateType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__2) ) {
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

	public static class DoubleTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(CreateTableParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CreateTableParser.NUMBER); }
		public DoubleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitDoubleType(this);
		}
	}

	public final DoubleTypeContext doubleType() throws RecognitionException {
		DoubleTypeContext _localctx = new DoubleTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doubleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(T__12);
			setState(99); match(T__10);
			setState(100); match(NUMBER);
			setState(101); match(T__14);
			setState(102); match(NUMBER);
			setState(103); match(T__15);
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

	public static class IntTypeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(CreateTableParser.RANGE, 0); }
		public TerminalNode NUMBER() { return getToken(CreateTableParser.NUMBER, 0); }
		public IntTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitIntType(this);
		}
	}

	public final IntTypeContext intType() throws RecognitionException {
		IntTypeContext _localctx = new IntTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(T__12);
			setState(111);
			switch (_input.LA(1)) {
			case RANGE:
				{
				setState(106); match(RANGE);
				}
				break;
			case T__10:
				{
				setState(107); match(T__10);
				setState(108); match(NUMBER);
				setState(109); match(T__14);
				setState(110); match(T__3);
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

	public static class BooleanTypeContext extends ParserRuleContext {
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableListener ) ((CreateTableListener)listener).exitBooleanType(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__13);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\5\2\37\n\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\6\3\60\n\3\r\3\16\3\61\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\5\6H\n\6\3\6\5\6K\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n\r\3\16\3\16\3\16\2\2"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\4\2\5\5\24\24t\2&\3\2\2\2\4*"+
		"\3\2\2\2\6\66\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2\20"+
		"]\3\2\2\2\22_\3\2\2\2\24b\3\2\2\2\26d\3\2\2\2\30k\3\2\2\2\32s\3\2\2\2"+
		"\34\36\5\4\3\2\35\37\5\6\4\2\36\35\3\2\2\2\36\37\3\2\2\2\37#\3\2\2\2 "+
		"\"\5\b\5\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2&\34\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*+\7\r\2\2+,\7"+
		"\22\2\2,-\7\34\2\2-/\7\f\2\2.\60\5\n\6\2/.\3\2\2\2\60\61\3\2\2\2\61/\3"+
		"\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\5\16\b\2\64\65\7\13\2\2\65\5"+
		"\3\2\2\2\66\67\7\21\2\2\678\7\34\2\289\7\4\2\29:\7\30\2\2:;\7\17\2\2;"+
		"\7\3\2\2\2<=\7\3\2\2=>\7\34\2\2>?\7\6\2\2?@\5\20\t\2@A\7\4\2\2AB\7\30"+
		"\2\2BC\7\17\2\2C\t\3\2\2\2DE\5\20\t\2EG\5\f\7\2FH\7\32\2\2GF\3\2\2\2G"+
		"H\3\2\2\2HJ\3\2\2\2IK\7\31\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\b\2\2"+
		"M\13\3\2\2\2NT\5\22\n\2OT\5\24\13\2PT\5\26\f\2QT\5\30\r\2RT\5\32\16\2"+
		"SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UV\7\16\2"+
		"\2VW\7\34\2\2WX\7\20\2\2X\17\3\2\2\2Y^\7\34\2\2Z[\7\25\2\2[\\\7\34\2\2"+
		"\\^\7\25\2\2]Y\3\2\2\2]Z\3\2\2\2^\21\3\2\2\2_`\7\26\2\2`a\7\27\2\2a\23"+
		"\3\2\2\2bc\t\2\2\2c\25\3\2\2\2de\7\n\2\2ef\7\f\2\2fg\7\33\2\2gh\7\b\2"+
		"\2hi\7\33\2\2ij\7\7\2\2j\27\3\2\2\2kq\7\n\2\2lr\7\27\2\2mn\7\f\2\2no\7"+
		"\33\2\2op\7\b\2\2pr\7\23\2\2ql\3\2\2\2qm\3\2\2\2r\31\3\2\2\2st\7\t\2\2"+
		"t\33\3\2\2\2\13\36#(\61GJS]q";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}