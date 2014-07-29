package chanedi.generator.sqlparser.gen;// Generated from E:/IDEA/QuickProject/QuickProject-Generator/src/main/java/chanedi/generator/sqlparser\CreateTable.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreateTableLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, RANGE=21, COMMENT=22, NOTNULL=23, 
		DEFAULT=24, NUMBER=25, ID=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "RANGE", "COMMENT", "NOTNULL", "DEFAULT", "NUMBER", 
		"ID", "WS", "STUFF"
	};


	public CreateTableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CreateTable.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00f8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u00e4\n\32\r\32\16\32"+
		"\u00e5\3\33\6\33\u00e9\n\33\r\33\16\33\u00ea\3\34\6\34\u00ee\n\34\r\34"+
		"\16\34\u00ef\3\34\3\34\3\35\6\35\u00f5\n\35\r\35\16\35\u00f6\2\2\36\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\2\3\2\6"+
		"\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\6\2\13\f\17\17\"\"))\u00fa\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3;\3\2\2\2\5M\3\2\2"+
		"\2\7P\3\2\2\2\tZ\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21h\3\2\2"+
		"\2\23p\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31|\3\2\2\2\33\u0087\3\2\2\2\35"+
		"\u0089\3\2\2\2\37\u009a\3\2\2\2!\u00ab\3\2\2\2#\u00b1\3\2\2\2%\u00b4\3"+
		"\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00c4\3\2\2\2-\u00c8\3\2\2\2/\u00cc"+
		"\3\2\2\2\61\u00d5\3\2\2\2\63\u00e3\3\2\2\2\65\u00e8\3\2\2\2\67\u00ed\3"+
		"\2\2\29\u00f4\3\2\2\2;<\7e\2\2<=\7q\2\2=>\7o\2\2>?\7o\2\2?@\7g\2\2@A\7"+
		"p\2\2AB\7v\2\2BC\7\"\2\2CD\7q\2\2DE\7p\2\2EF\7\"\2\2FG\7e\2\2GH\7q\2\2"+
		"HI\7n\2\2IJ\7w\2\2JK\7o\2\2KL\7p\2\2L\4\3\2\2\2MN\7k\2\2NO\7u\2\2O\6\3"+
		"\2\2\2PQ\7V\2\2QR\7K\2\2RS\7O\2\2ST\7G\2\2TU\7U\2\2UV\7V\2\2VW\7C\2\2"+
		"WX\7O\2\2XY\7R\2\2Y\b\3\2\2\2Z[\7\60\2\2[\n\3\2\2\2\\]\7+\2\2]\f\3\2\2"+
		"\2^_\7.\2\2_\16\3\2\2\2`a\7E\2\2ab\7J\2\2bc\7C\2\2cd\7T\2\2de\7*\2\2e"+
		"f\7\63\2\2fg\7+\2\2g\20\3\2\2\2hi\7P\2\2ij\7W\2\2jk\7O\2\2kl\7G\2\2lm"+
		"\7T\2\2mn\7K\2\2no\7E\2\2o\22\3\2\2\2pq\7+\2\2qr\7=\2\2r\24\3\2\2\2st"+
		"\7*\2\2t\26\3\2\2\2uv\7e\2\2vw\7t\2\2wx\7g\2\2xy\7c\2\2yz\7v\2\2z{\7g"+
		"\2\2{\30\3\2\2\2|}\7e\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7u\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7c\2\2\u0083\u0084\7k\2\2"+
		"\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\32\3\2\2\2\u0087\u0088\7"+
		"=\2\2\u0088\34\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7{\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7m\2\2\u0092\u0093\7g\2"+
		"\2\u0093\u0094\7{\2\2\u0094\u0095\7\"\2\2\u0095\u0096\7*\2\2\u0096\u0097"+
		"\7K\2\2\u0097\u0098\7F\2\2\u0098\u0099\7+\2\2\u0099\36\3\2\2\2\u009a\u009b"+
		"\7e\2\2\u009b\u009c\7q\2\2\u009c\u009d\7o\2\2\u009d\u009e\7o\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7\"\2"+
		"\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa \3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7c\2\2\u00ad"+
		"\u00ae\7d\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\7\62\2\2\u00b2\u00b3\7+\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7F\2\2\u00b5"+
		"\u00b6\7C\2\2\u00b6\u00b7\7V\2\2\u00b7\u00b8\7G\2\2\u00b8&\3\2\2\2\u00b9"+
		"\u00ba\7$\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7X\2\2\u00bc\u00bd\7C\2\2\u00bd"+
		"\u00be\7T\2\2\u00be\u00bf\7E\2\2\u00bf\u00c0\7J\2\2\u00c0\u00c1\7C\2\2"+
		"\u00c1\u00c2\7T\2\2\u00c2\u00c3\7\64\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7"+
		"*\2\2\u00c5\u00c6\5\63\32\2\u00c6\u00c7\7+\2\2\u00c7,\3\2\2\2\u00c8\u00c9"+
		"\7)\2\2\u00c9\u00ca\59\35\2\u00ca\u00cb\7)\2\2\u00cb.\3\2\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7\"\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7n\2\2"+
		"\u00d4\60\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7"+
		"h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7n\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00de\7)\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\59\35\2\u00e0\u00e1\7)\2\2\u00e1\62\3\2\2\2\u00e2\u00e4\t\2\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\64\3\2\2\2\u00e7\u00e9\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\66\3\2\2"+
		"\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\34\2\2"+
		"\u00f28\3\2\2\2\u00f3\u00f5\n\5\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7:\3\2\2\2\7\2\u00e5"+
		"\u00ea\u00ef\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}