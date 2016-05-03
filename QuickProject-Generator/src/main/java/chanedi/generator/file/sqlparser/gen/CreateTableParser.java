// Generated from F:/IDEA/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/sqlparser\CreateTable.g4 by ANTLR 4.5
package chanedi.generator.file.sqlparser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, K_AUTO_INCREMENT=24, 
		K_ALTER=25, K_AND=26, K_BETWEEN=27, K_CASCADE=28, K_CHECK=29, K_CHARSET=30, 
		K_CREATE=31, K_COLUMN=32, K_COMMENT=33, K_CONSTRAINT=34, K_CURRENT_DATE=35, 
		K_CURRENT_TIME=36, K_CURRENT_TIMESTAMP=37, K_DEFAULT=38, K_DELETE=39, 
		K_DISTINCT=40, K_ENGINE=41, K_FALSE=42, K_FOREIGN=43, K_GLOB=44, K_IN=45, 
		K_INNODB=46, K_IS=47, K_ISNULL=48, K_KEY=49, K_LIKE=50, K_MATCH=51, K_NOT=52, 
		K_NOTNULL=53, K_NULL=54, K_ON=55, K_OR=56, K_PRIMARY=57, K_REFERENCES=58, 
		K_REGEXP=59, K_SET=60, K_TABLE=61, K_TRUE=62, K_UNIQUE=63, K_UTF8=64, 
		IDENTIFIER=65, NUMERIC_LITERAL=66, STRING_LITERAL=67, BLOB_LITERAL=68, 
		SINGLE_LINE_COMMENT=69, MULTILINE_COMMENT=70, SPACES=71;
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

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "','", "')'", "'='", "';'", "'||'", "'*'", "'/'", 
		"'%'", "'+'", "'-'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"K_AUTO_INCREMENT", "K_ALTER", "K_AND", "K_BETWEEN", "K_CASCADE", "K_CHECK", 
		"K_CHARSET", "K_CREATE", "K_COLUMN", "K_COMMENT", "K_CONSTRAINT", "K_CURRENT_DATE", 
		"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DEFAULT", "K_DELETE", "K_DISTINCT", 
		"K_ENGINE", "K_FALSE", "K_FOREIGN", "K_GLOB", "K_IN", "K_INNODB", "K_IS", 
		"K_ISNULL", "K_KEY", "K_LIKE", "K_MATCH", "K_NOT", "K_NOTNULL", "K_NULL", 
		"K_ON", "K_OR", "K_PRIMARY", "K_REFERENCES", "K_REGEXP", "K_SET", "K_TABLE", 
		"K_TRUE", "K_UNIQUE", "K_UTF8", "IDENTIFIER", "NUMERIC_LITERAL", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); 
				mdl();
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
		public TerminalNode K_CREATE() { return getToken(CreateTableParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public List<Comment_oracleContext> comment_oracle() {
			return getRuleContexts(Comment_oracleContext.class);
		}
		public Comment_oracleContext comment_oracle(int i) {
			return getRuleContext(Comment_oracleContext.class,i);
		}
		public List<Comment_mysqlContext> comment_mysql() {
			return getRuleContexts(Comment_mysqlContext.class);
		}
		public Comment_mysqlContext comment_mysql(int i) {
			return getRuleContext(Comment_mysqlContext.class,i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_ENGINE() { return getToken(CreateTableParser.K_ENGINE, 0); }
		public TerminalNode K_INNODB() { return getToken(CreateTableParser.K_INNODB, 0); }
		public TerminalNode K_DEFAULT() { return getToken(CreateTableParser.K_DEFAULT, 0); }
		public TerminalNode K_CHARSET() { return getToken(CreateTableParser.K_CHARSET, 0); }
		public TerminalNode K_UTF8() { return getToken(CreateTableParser.K_UTF8, 0); }
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
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
			setState(41); 
			match(K_CREATE);
			setState(42); 
			match(K_TABLE);
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43); 
				schema();
				setState(44); 
				match(T__0);
				}
				break;
			}
			setState(48); 
			table_name();
			{
			setState(49); 
			match(T__1);
			setState(50); 
			column_definition();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51); 
					match(T__2);
					setState(52); 
					column_definition();
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
				setState(58); 
				match(T__2);
				setState(59); 
				table_constraint();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); 
			match(T__3);
			setState(69);
			_la = _input.LA(1);
			if (_la==K_ENGINE) {
				{
				setState(66); 
				match(K_ENGINE);
				setState(67); 
				match(T__4);
				setState(68); 
				match(K_INNODB);
				}
			}

			setState(72);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				setState(71); 
				match(K_DEFAULT);
				}
			}

			setState(77);
			_la = _input.LA(1);
			if (_la==K_CHARSET) {
				{
				setState(74); 
				match(K_CHARSET);
				setState(75); 
				match(T__4);
				setState(76); 
				match(K_UTF8);
				}
			}

			setState(82);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(79); 
				match(K_COMMENT);
				setState(80); 
				match(T__4);
				setState(81); 
				comment_value();
				}
			}

			setState(84); 
			match(T__5);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ALTER || _la==K_COMMENT) {
				{
				setState(88);
				switch (_input.LA(1)) {
				case K_COMMENT:
					{
					setState(86); 
					comment_oracle();
					}
					break;
				case K_ALTER:
					{
					setState(87); 
					comment_mysql();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Comment_oracleContext extends ParserRuleContext {
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public TerminalNode K_ON() { return getToken(CreateTableParser.K_ON, 0); }
		public TerminalNode K_IS() { return getToken(CreateTableParser.K_IS, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(CreateTableParser.K_COLUMN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
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
			setState(93); 
			match(K_COMMENT);
			setState(94); 
			match(K_ON);
			setState(112);
			switch (_input.LA(1)) {
			case K_TABLE:
				{
				setState(95); 
				match(K_TABLE);
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(96); 
					schema();
					setState(97); 
					match(T__0);
					}
					break;
				}
				setState(101); 
				table_name();
				}
				break;
			case K_COLUMN:
				{
				setState(102); 
				match(K_COLUMN);
				setState(106);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(103); 
					schema();
					setState(104); 
					match(T__0);
					}
					break;
				}
				setState(108); 
				table_name();
				setState(109); 
				match(T__0);
				setState(110); 
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114); 
			match(K_IS);
			setState(115); 
			comment_value();
			setState(116); 
			match(T__5);
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
		public TerminalNode K_ALTER() { return getToken(CreateTableParser.K_ALTER, 0); }
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(CreateTableParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(CreateTableParser.K_COLUMN, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
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
			setState(118); 
			match(K_ALTER);
			setState(136);
			switch (_input.LA(1)) {
			case K_TABLE:
				{
				setState(119); 
				match(K_TABLE);
				setState(123);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(120); 
					schema();
					setState(121); 
					match(T__0);
					}
					break;
				}
				setState(125); 
				table_name();
				}
				break;
			case K_COLUMN:
				{
				setState(126); 
				match(K_COLUMN);
				setState(130);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(127); 
					schema();
					setState(128); 
					match(T__0);
					}
					break;
				}
				setState(132); 
				table_name();
				setState(133); 
				match(T__0);
				setState(134); 
				column_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138); 
			match(K_COMMENT);
			setState(139); 
			comment_value();
			setState(140); 
			match(T__5);
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
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<Inline_constraintContext> inline_constraint() {
			return getRuleContexts(Inline_constraintContext.class);
		}
		public Inline_constraintContext inline_constraint(int i) {
			return getRuleContext(Inline_constraintContext.class,i);
		}
		public TerminalNode K_COMMENT() { return getToken(CreateTableParser.K_COMMENT, 0); }
		public Comment_valueContext comment_value() {
			return getRuleContext(Comment_valueContext.class,0);
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
			setState(142); 
			column_name();
			setState(143); 
			datatype();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_AUTO_INCREMENT) | (1L << K_CHECK) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT) | (1L << K_NOT) | (1L << K_NULL) | (1L << K_PRIMARY) | (1L << K_REFERENCES) | (1L << K_UNIQUE))) != 0)) {
				{
				{
				setState(144); 
				inline_constraint();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(150); 
				match(K_COMMENT);
				setState(151); 
				comment_value();
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
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
			setState(155); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(154); 
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(159); 
				match(T__1);
				setState(160); 
				signed_number();
				setState(161); 
				match(T__3);
				}
				break;
			case 2:
				{
				setState(163); 
				match(T__1);
				setState(164); 
				signed_number();
				setState(165); 
				match(T__2);
				setState(166); 
				signed_number();
				setState(167); 
				match(T__3);
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
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(CreateTableParser.K_UNIQUE, 0); }
		public TerminalNode K_PRIMARY() { return getToken(CreateTableParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(CreateTableParser.K_KEY, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(CreateTableParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AUTO_INCREMENT() { return getToken(CreateTableParser.K_AUTO_INCREMENT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(CreateTableParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(CreateTableParser.K_NOT, 0); }
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
			setState(173);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(171); 
				match(K_CONSTRAINT);
				setState(172); 
				name();
				}
			}

			setState(198);
			switch (_input.LA(1)) {
			case K_DEFAULT:
				{
				setState(175); 
				match(K_DEFAULT);
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(176); 
					signed_number();
					}
					break;
				case 2:
					{
					setState(177); 
					literal_value();
					}
					break;
				case 3:
					{
					setState(178); 
					match(T__1);
					setState(179); 
					expr(0);
					setState(180); 
					match(T__3);
					}
					break;
				}
				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(185);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(184); 
					match(K_NOT);
					}
				}

				setState(187); 
				match(K_NULL);
				}
				break;
			case K_UNIQUE:
				{
				setState(188); 
				match(K_UNIQUE);
				}
				break;
			case K_PRIMARY:
				{
				setState(189); 
				match(K_PRIMARY);
				setState(190); 
				match(K_KEY);
				}
				break;
			case K_REFERENCES:
				{
				setState(191); 
				foreign_key_clause();
				}
				break;
			case K_CHECK:
				{
				setState(192); 
				match(K_CHECK);
				setState(193); 
				match(T__1);
				setState(194); 
				expr(0);
				setState(195); 
				match(T__3);
				}
				break;
			case K_AUTO_INCREMENT:
				{
				setState(197); 
				match(K_AUTO_INCREMENT);
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
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(CreateTableParser.K_DISTINCT, 0); }
		public TerminalNode K_IS() { return getToken(CreateTableParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(CreateTableParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(CreateTableParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(CreateTableParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(CreateTableParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(CreateTableParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(CreateTableParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(CreateTableParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(CreateTableParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(CreateTableParser.K_BETWEEN, 0); }
		public TerminalNode K_ISNULL() { return getToken(CreateTableParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(CreateTableParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
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
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(201); 
				literal_value();
				}
				break;
			case 2:
				{
				setState(202); 
				name();
				setState(203); 
				match(T__1);
				setState(216);
				switch (_input.LA(1)) {
				case T__1:
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
					setState(205);
					_la = _input.LA(1);
					if (_la==K_DISTINCT) {
						{
						setState(204); 
						match(K_DISTINCT);
						}
					}

					setState(207); 
					expr(0);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(208); 
						match(T__2);
						setState(209); 
						expr(0);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__7:
					{
					setState(215); 
					match(T__7);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				match(T__3);
				}
				break;
			case 3:
				{
				setState(220); 
				match(T__1);
				setState(221); 
				expr(0);
				setState(222); 
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(227); 
						match(T__6);
						setState(228); 
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(230);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(231); 
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(233);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(234); 
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(236);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(237); 
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(239);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(240); 
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(254);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(242); 
							match(T__4);
							}
							break;
						case 2:
							{
							setState(243); 
							match(T__20);
							}
							break;
						case 3:
							{
							setState(244); 
							match(T__21);
							}
							break;
						case 4:
							{
							setState(245); 
							match(T__22);
							}
							break;
						case 5:
							{
							setState(246); 
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(247); 
							match(K_IS);
							setState(248); 
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(249); 
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(250); 
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(251); 
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(252); 
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(253); 
							match(K_REGEXP);
							}
							break;
						}
						setState(256); 
						expr(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(258); 
						match(K_AND);
						setState(259); 
						expr(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(261); 
						match(K_OR);
						setState(262); 
						expr(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(264); 
						match(K_IS);
						setState(266);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(265); 
							match(K_NOT);
							}
						}

						setState(268); 
						expr(3);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(271);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(270); 
							match(K_NOT);
							}
						}

						setState(273); 
						match(K_BETWEEN);
						setState(274); 
						expr(0);
						setState(275); 
						match(K_AND);
						setState(276); 
						expr(2);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(283);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(279); 
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(280); 
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(281); 
							match(K_NOT);
							setState(282); 
							match(K_NULL);
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
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode K_REFERENCES() { return getToken(CreateTableParser.K_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(CreateTableParser.K_ON, 0); }
		public TerminalNode K_DELETE() { return getToken(CreateTableParser.K_DELETE, 0); }
		public TerminalNode K_CASCADE() { return getToken(CreateTableParser.K_CASCADE, 0); }
		public TerminalNode K_SET() { return getToken(CreateTableParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(CreateTableParser.K_NULL, 0); }
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
			setState(290); 
			match(K_REFERENCES);
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(291); 
				schema();
				setState(292); 
				match(T__0);
				}
				break;
			}
			setState(296); 
			table_name();
			setState(308);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(297); 
				match(T__1);
				setState(298); 
				column_name();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(299); 
					match(T__2);
					setState(300); 
					column_name();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306); 
				match(T__3);
				}
			}

			setState(317);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(310); 
				match(K_ON);
				setState(311); 
				match(K_DELETE);
				setState(315);
				switch (_input.LA(1)) {
				case K_CASCADE:
					{
					setState(312); 
					match(K_CASCADE);
					}
					break;
				case K_SET:
					{
					setState(313); 
					match(K_SET);
					setState(314); 
					match(K_NULL);
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
			setState(319); 
			match(STRING_LITERAL);
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
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_CHECK() { return getToken(CreateTableParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(CreateTableParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(CreateTableParser.K_KEY, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(CreateTableParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(CreateTableParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(CreateTableParser.K_UNIQUE, 0); }
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
			setState(323);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(321); 
				match(K_CONSTRAINT);
				setState(322); 
				name();
				}
			}

			setState(360);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(328);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(325); 
					match(K_PRIMARY);
					setState(326); 
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(327); 
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(330); 
				match(T__1);
				setState(331); 
				column_name();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(332); 
					match(T__2);
					setState(333); 
					column_name();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339); 
				match(T__3);
				}
				break;
			case K_CHECK:
				{
				setState(341); 
				match(K_CHECK);
				setState(342); 
				match(T__1);
				setState(343); 
				expr(0);
				setState(344); 
				match(T__3);
				}
				break;
			case K_FOREIGN:
				{
				setState(346); 
				match(K_FOREIGN);
				setState(347); 
				match(K_KEY);
				setState(348); 
				match(T__1);
				setState(349); 
				column_name();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(350); 
					match(T__2);
					setState(351); 
					column_name();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357); 
				match(T__3);
				setState(358); 
				foreign_key_clause();
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
			setState(363);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(362);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(365); 
			match(NUMERIC_LITERAL);
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
		public TerminalNode K_CURRENT_TIME() { return getToken(CreateTableParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(CreateTableParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(CreateTableParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_TRUE() { return getToken(CreateTableParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(CreateTableParser.K_FALSE, 0); }
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
			setState(367);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (K_CURRENT_DATE - 35)) | (1L << (K_CURRENT_TIME - 35)) | (1L << (K_CURRENT_TIMESTAMP - 35)) | (1L << (K_FALSE - 35)) | (1L << (K_NULL - 35)) | (1L << (K_TRUE - 35)) | (1L << (NUMERIC_LITERAL - 35)) | (1L << (STRING_LITERAL - 35)) | (1L << (BLOB_LITERAL - 35)))) != 0)) ) {
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
			setState(369); 
			any_name();
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
			setState(371); 
			any_name();
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
			setState(373); 
			any_name();
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
			setState(375); 
			any_name();
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
		public TerminalNode IDENTIFIER() { return getToken(CreateTableParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
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
			setState(383);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(377); 
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(378); 
				match(STRING_LITERAL);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(379); 
				match(T__1);
				setState(380); 
				any_name();
				setState(381); 
				match(T__3);
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
		case 7: 
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 13);
		case 1: 
			return precpred(_ctx, 12);
		case 2: 
			return precpred(_ctx, 11);
		case 3: 
			return precpred(_ctx, 10);
		case 4: 
			return precpred(_ctx, 9);
		case 5: 
			return precpred(_ctx, 8);
		case 6: 
			return precpred(_ctx, 7);
		case 7: 
			return precpred(_ctx, 6);
		case 8: 
			return precpred(_ctx, 2);
		case 9: 
			return precpred(_ctx, 1);
		case 10: 
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3"+
		"\3\3\3\3\3\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\3\3\3\3\5\3P\n\3\3\3\3\3\3"+
		"\3\5\3U\n\3\3\3\3\3\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\4\3\4\3\4\3\4\5\4s\n\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u0085\n\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\5\6\u009b\n\6\3\7\6\7\u009e\n"+
		"\7\r\7\16\7\u009f\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n"+
		"\7\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b9\n\b\3\b"+
		"\5\b\u00bc\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c9\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t\u00d0\n\t\3\t\3\t\3\t\7\t\u00d5\n\t\f\t\16"+
		"\t\u00d8\13\t\3\t\5\t\u00db\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e3\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0101\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u010d\n\t\3\t\3\t\3\t\5\t\u0112\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u011e\n\t\7\t\u0120\n\t\f\t\16"+
		"\t\u0123\13\t\3\n\3\n\3\n\3\n\5\n\u0129\n\n\3\n\3\n\3\n\3\n\3\n\7\n\u0130"+
		"\n\n\f\n\16\n\u0133\13\n\3\n\3\n\5\n\u0137\n\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u013e\n\n\5\n\u0140\n\n\3\13\3\13\3\f\3\f\5\f\u0146\n\f\3\f\3\f\3\f\5"+
		"\f\u014b\n\f\3\f\3\f\3\f\3\f\7\f\u0151\n\f\f\f\16\f\u0154\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0163\n\f\f\f\16\f\u0166"+
		"\13\f\3\f\3\f\3\f\5\f\u016b\n\f\3\r\5\r\u016e\n\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0182\n\23\3\23\2\3\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$\2\7\3\2\n\f\3\2\r\16\3\2\17\22\3\2\23\26\7\2%\',,88@@DF\u01bd\2\'"+
		"\3\2\2\2\4+\3\2\2\2\6_\3\2\2\2\bx\3\2\2\2\n\u0090\3\2\2\2\f\u009d\3\2"+
		"\2\2\16\u00af\3\2\2\2\20\u00e2\3\2\2\2\22\u0124\3\2\2\2\24\u0141\3\2\2"+
		"\2\26\u0145\3\2\2\2\30\u016d\3\2\2\2\32\u0171\3\2\2\2\34\u0173\3\2\2\2"+
		"\36\u0175\3\2\2\2 \u0177\3\2\2\2\"\u0179\3\2\2\2$\u0181\3\2\2\2&(\5\4"+
		"\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\7!\2\2,\60"+
		"\7?\2\2-.\5\36\20\2./\7\3\2\2/\61\3\2\2\2\60-\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\5 \21\2\63\64\7\4\2\2\649\5\n\6\2\65\66\7\5\2\2\668"+
		"\5\n\6\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:@\3\2\2\2;9\3\2"+
		"\2\2<=\7\5\2\2=?\5\26\f\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2B@\3\2\2\2CG\7\6\2\2DE\7+\2\2EF\7\7\2\2FH\7\60\2\2GD\3\2\2\2GH\3"+
		"\2\2\2HJ\3\2\2\2IK\7(\2\2JI\3\2\2\2JK\3\2\2\2KO\3\2\2\2LM\7 \2\2MN\7\7"+
		"\2\2NP\7B\2\2OL\3\2\2\2OP\3\2\2\2PT\3\2\2\2QR\7#\2\2RS\7\7\2\2SU\5\24"+
		"\13\2TQ\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\b\2\2W\\\3\2\2\2X[\5\6\4\2Y[\5"+
		"\b\5\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\5\3\2\2\2"+
		"^\\\3\2\2\2_`\7#\2\2`r\79\2\2ae\7?\2\2bc\5\36\20\2cd\7\3\2\2df\3\2\2\2"+
		"eb\3\2\2\2ef\3\2\2\2fg\3\2\2\2gs\5 \21\2hl\7\"\2\2ij\5\36\20\2jk\7\3\2"+
		"\2km\3\2\2\2li\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\5 \21\2op\7\3\2\2pq\5\"\22"+
		"\2qs\3\2\2\2ra\3\2\2\2rh\3\2\2\2st\3\2\2\2tu\7\61\2\2uv\5\24\13\2vw\7"+
		"\b\2\2w\7\3\2\2\2x\u008a\7\33\2\2y}\7?\2\2z{\5\36\20\2{|\7\3\2\2|~\3\2"+
		"\2\2}z\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u008b\5 \21\2\u0080\u0084\7"+
		"\"\2\2\u0081\u0082\5\36\20\2\u0082\u0083\7\3\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5 "+
		"\21\2\u0087\u0088\7\3\2\2\u0088\u0089\5\"\22\2\u0089\u008b\3\2\2\2\u008a"+
		"y\3\2\2\2\u008a\u0080\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7#\2\2\u008d"+
		"\u008e\5\24\13\2\u008e\u008f\7\b\2\2\u008f\t\3\2\2\2\u0090\u0091\5\"\22"+
		"\2\u0091\u0095\5\f\7\2\u0092\u0094\5\16\b\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009b\5\24\13\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\13\3\2\2\2\u009c\u009e\5\34\17"+
		"\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00ab\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\5\30\r\2"+
		"\u00a3\u00a4\7\6\2\2\u00a4\u00ac\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7"+
		"\5\30\r\2\u00a7\u00a8\7\5\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\7\6\2\2"+
		"\u00aa\u00ac\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae\u00b0\5\34\17\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00c8\3\2\2\2\u00b1\u00b8\7("+
		"\2\2\u00b2\u00b9\5\30\r\2\u00b3\u00b9\5\32\16\2\u00b4\u00b5\7\4\2\2\u00b5"+
		"\u00b6\5\20\t\2\u00b6\u00b7\7\6\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3"+
		"\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00c9\3\2\2\2\u00ba"+
		"\u00bc\7\66\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00c9\78\2\2\u00be\u00c9\7A\2\2\u00bf\u00c0\7;\2\2\u00c0"+
		"\u00c9\7\63\2\2\u00c1\u00c9\5\22\n\2\u00c2\u00c3\7\37\2\2\u00c3\u00c4"+
		"\7\4\2\2\u00c4\u00c5\5\20\t\2\u00c5\u00c6\7\6\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c9\7\32\2\2\u00c8\u00b1\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c8\u00be"+
		"\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\17\3\2\2\2\u00ca\u00cb\b\t\1\2\u00cb\u00e3\5\32\16"+
		"\2\u00cc\u00cd\5\34\17\2\u00cd\u00da\7\4\2\2\u00ce\u00d0\7*\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d6\5\20"+
		"\t\2\u00d2\u00d3\7\5\2\2\u00d3\u00d5\5\20\t\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00db\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\n\2\2\u00da\u00cf\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\6"+
		"\2\2\u00dd\u00e3\3\2\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\5\20\t\2\u00e0"+
		"\u00e1\7\6\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00ca\3\2\2\2\u00e2\u00cc\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e3\u0121\3\2\2\2\u00e4\u00e5\f\17\2\2\u00e5"+
		"\u00e6\7\t\2\2\u00e6\u0120\5\20\t\20\u00e7\u00e8\f\16\2\2\u00e8\u00e9"+
		"\t\2\2\2\u00e9\u0120\5\20\t\17\u00ea\u00eb\f\r\2\2\u00eb\u00ec\t\3\2\2"+
		"\u00ec\u0120\5\20\t\16\u00ed\u00ee\f\f\2\2\u00ee\u00ef\t\4\2\2\u00ef\u0120"+
		"\5\20\t\r\u00f0\u00f1\f\13\2\2\u00f1\u00f2\t\5\2\2\u00f2\u0120\5\20\t"+
		"\f\u00f3\u0100\f\n\2\2\u00f4\u0101\7\7\2\2\u00f5\u0101\7\27\2\2\u00f6"+
		"\u0101\7\30\2\2\u00f7\u0101\7\31\2\2\u00f8\u0101\7\61\2\2\u00f9\u00fa"+
		"\7\61\2\2\u00fa\u0101\7\66\2\2\u00fb\u0101\7/\2\2\u00fc\u0101\7\64\2\2"+
		"\u00fd\u0101\7.\2\2\u00fe\u0101\7\65\2\2\u00ff\u0101\7=\2\2\u0100\u00f4"+
		"\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0100"+
		"\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2"+
		"\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0120\5\20\t\13\u0103\u0104\f\t\2\2\u0104\u0105\7"+
		"\34\2\2\u0105\u0120\5\20\t\n\u0106\u0107\f\b\2\2\u0107\u0108\7:\2\2\u0108"+
		"\u0120\5\20\t\t\u0109\u010a\f\4\2\2\u010a\u010c\7\61\2\2\u010b\u010d\7"+
		"\66\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0120\5\20\t\5\u010f\u0111\f\3\2\2\u0110\u0112\7\66\2\2\u0111\u0110\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\35\2\2\u0114"+
		"\u0115\5\20\t\2\u0115\u0116\7\34\2\2\u0116\u0117\5\20\t\4\u0117\u0120"+
		"\3\2\2\2\u0118\u011d\f\5\2\2\u0119\u011e\7\62\2\2\u011a\u011e\7\67\2\2"+
		"\u011b\u011c\7\66\2\2\u011c\u011e\78\2\2\u011d\u0119\3\2\2\2\u011d\u011a"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u00e4\3\2\2\2\u011f"+
		"\u00e7\3\2\2\2\u011f\u00ea\3\2\2\2\u011f\u00ed\3\2\2\2\u011f\u00f0\3\2"+
		"\2\2\u011f\u00f3\3\2\2\2\u011f\u0103\3\2\2\2\u011f\u0106\3\2\2\2\u011f"+
		"\u0109\3\2\2\2\u011f\u010f\3\2\2\2\u011f\u0118\3\2\2\2\u0120\u0123\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\21\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0124\u0128\7<\2\2\u0125\u0126\5\36\20\2\u0126\u0127\7\3\2\2"+
		"\u0127\u0129\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0136\5 \21\2\u012b\u012c\7\4\2\2\u012c\u0131\5\"\22\2"+
		"\u012d\u012e\7\5\2\2\u012e\u0130\5\"\22\2\u012f\u012d\3\2\2\2\u0130\u0133"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0135\7\6\2\2\u0135\u0137\3\2\2\2\u0136\u012b\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u013f\3\2\2\2\u0138\u0139\79\2\2\u0139"+
		"\u013d\7)\2\2\u013a\u013e\7\36\2\2\u013b\u013c\7>\2\2\u013c\u013e\78\2"+
		"\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0138"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\23\3\2\2\2\u0141\u0142\7E\2\2\u0142"+
		"\25\3\2\2\2\u0143\u0144\7$\2\2\u0144\u0146\5\34\17\2\u0145\u0143\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146\u016a\3\2\2\2\u0147\u0148\7;\2\2\u0148\u014b"+
		"\7\63\2\2\u0149\u014b\7A\2\2\u014a\u0147\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\7\4\2\2\u014d\u0152\5\"\22\2\u014e\u014f\7"+
		"\5\2\2\u014f\u0151\5\"\22\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0156\7\6\2\2\u0156\u016b\3\2\2\2\u0157\u0158\7\37\2\2\u0158"+
		"\u0159\7\4\2\2\u0159\u015a\5\20\t\2\u015a\u015b\7\6\2\2\u015b\u016b\3"+
		"\2\2\2\u015c\u015d\7-\2\2\u015d\u015e\7\63\2\2\u015e\u015f\7\4\2\2\u015f"+
		"\u0164\5\"\22\2\u0160\u0161\7\5\2\2\u0161\u0163\5\"\22\2\u0162\u0160\3"+
		"\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\6\2\2\u0168\u0169\5\22"+
		"\n\2\u0169\u016b\3\2\2\2\u016a\u014a\3\2\2\2\u016a\u0157\3\2\2\2\u016a"+
		"\u015c\3\2\2\2\u016b\27\3\2\2\2\u016c\u016e\t\3\2\2\u016d\u016c\3\2\2"+
		"\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7D\2\2\u0170\31"+
		"\3\2\2\2\u0171\u0172\t\6\2\2\u0172\33\3\2\2\2\u0173\u0174\5$\23\2\u0174"+
		"\35\3\2\2\2\u0175\u0176\5$\23\2\u0176\37\3\2\2\2\u0177\u0178\5$\23\2\u0178"+
		"!\3\2\2\2\u0179\u017a\5$\23\2\u017a#\3\2\2\2\u017b\u0182\7C\2\2\u017c"+
		"\u0182\7E\2\2\u017d\u017e\7\4\2\2\u017e\u017f\5$\23\2\u017f\u0180\7\6"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u017c\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0182%\3\2\2\2\60)\609@GJOTZ\\elr}\u0084\u008a\u0095\u009a"+
		"\u009f\u00ab\u00af\u00b8\u00bb\u00c8\u00cf\u00d6\u00da\u00e2\u0100\u010c"+
		"\u0111\u011d\u011f\u0121\u0128\u0131\u0136\u013d\u013f\u0145\u014a\u0152"+
		"\u0164\u016a\u016d\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}