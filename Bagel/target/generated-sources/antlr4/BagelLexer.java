// Generated from Bagel.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BagelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, DIGIT=5, LETTER=6, SYMBOL=7, ADDITION_OPERATOR=8, 
		SUBTRACTION_OPERATOR=9, MULTIPLICATION_OPERATOR=10, DIVISION_OPERATOR=11, 
		COMPARISON_KEYWORDS=12, ASSIGNMENT_KEYWORD=13, WHITESPACE=14, IF_KEYWORD=15, 
		THEN_KEYWORD=16, ELSE_KEYWORD=17, ELSEIF_KEYWORD=18, PRINT_KEYWORD=19, 
		WHILE_KEYWORD=20, OPEN_BRACE=21, CLOSE_BRACE=22, OPEN_BRACKET=23, CLOSE_BRACKET=24, 
		LOGICAL_KEYWORDS=25, BOOLEAN_KEYWORDS=26, DATATYPE=27;
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
		"T__3", "T__2", "T__1", "T__0", "DIGIT", "LETTER", "SYMBOL", "ADDITION_OPERATOR", 
		"SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", 
		"COMPARISON_KEYWORDS", "ASSIGNMENT_KEYWORD", "WHITESPACE", "IF_KEYWORD", 
		"THEN_KEYWORD", "ELSE_KEYWORD", "ELSEIF_KEYWORD", "PRINT_KEYWORD", "WHILE_KEYWORD", 
		"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "LOGICAL_KEYWORDS", 
		"BOOLEAN_KEYWORDS", "DATATYPE"
	};


	public BagelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bagel.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00e8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0092\n\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00c7\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00d2\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00e7"+
		"\n\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\35\3\2\6\4\2C\\c|\5\2>>]]__\7\2..\60\60==aa~~\5\2\13\f\16\17\"\"\u00f3"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3"+
		"\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21K\3"+
		"\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3"+
		"\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009b\3\2\2\2#\u00a0\3\2\2\2"+
		"%\u00a5\3\2\2\2\'\u00aa\3\2\2\2)\u00b0\3\2\2\2+\u00b6\3\2\2\2-\u00b8\3"+
		"\2\2\2/\u00ba\3\2\2\2\61\u00bc\3\2\2\2\63\u00c6\3\2\2\2\65\u00d1\3\2\2"+
		"\2\67\u00e6\3\2\2\29:\7\"\2\2:\4\3\2\2\2;<\7\f\2\2<\6\3\2\2\2=>\7=\2\2"+
		">\b\3\2\2\2?@\7\60\2\2@\n\3\2\2\2AB\4\62;\2B\f\3\2\2\2CD\t\2\2\2D\16\3"+
		"\2\2\2EJ\t\3\2\2FG\7@\2\2GJ\7?\2\2HJ\t\4\2\2IE\3\2\2\2IF\3\2\2\2IH\3\2"+
		"\2\2J\20\3\2\2\2KL\7-\2\2L\22\3\2\2\2MN\7/\2\2N\24\3\2\2\2OP\7,\2\2P\26"+
		"\3\2\2\2QR\7\61\2\2R\30\3\2\2\2ST\7G\2\2TU\7s\2\2UV\7w\2\2VW\7c\2\2WX"+
		"\7n\2\2X\u0092\7u\2\2YZ\7I\2\2Z[\7t\2\2[\\\7g\2\2\\]\7c\2\2]^\7v\2\2^"+
		"_\7g\2\2_`\7t\2\2`a\7V\2\2ab\7j\2\2bc\7c\2\2c\u0092\7p\2\2de\7N\2\2ef"+
		"\7g\2\2fg\7u\2\2gh\7u\2\2hi\7V\2\2ij\7j\2\2jk\7c\2\2k\u0092\7p\2\2lm\7"+
		"N\2\2mn\7g\2\2no\7u\2\2op\7u\2\2pq\7V\2\2qr\7j\2\2rs\7c\2\2st\7p\2\2t"+
		"u\7G\2\2uv\7s\2\2vw\7w\2\2wx\7c\2\2x\u0092\7n\2\2yz\7I\2\2z{\7t\2\2{|"+
		"\7g\2\2|}\7c\2\2}~\7v\2\2~\177\7g\2\2\177\u0080\7t\2\2\u0080\u0081\7V"+
		"\2\2\u0081\u0082\7j\2\2\u0082\u0083\7c\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7G\2\2\u0085\u0086\7s\2\2\u0086\u0087\7w\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0092\7n\2\2\u0089\u008a\7P\2\2\u008a\u008b\7q\2\2\u008b\u008c\7v\2\2"+
		"\u008c\u008d\7G\2\2\u008d\u008e\7s\2\2\u008e\u008f\7w\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0092\7n\2\2\u0091S\3\2\2\2\u0091Y\3\2\2\2\u0091d\3\2\2"+
		"\2\u0091l\3\2\2\2\u0091y\3\2\2\2\u0091\u0089\3\2\2\2\u0092\32\3\2\2\2"+
		"\u0093\u0094\7k\2\2\u0094\u0095\7u\2\2\u0095\34\3\2\2\2\u0096\u0097\t"+
		"\5\2\2\u0097\36\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a \3"+
		"\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7p\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7h\2\2\u00a9&\3\2\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7v\2\2\u00af(\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2"+
		"\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5*\3\2"+
		"\2\2\u00b6\u00b7\7}\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9.\3"+
		"\2\2\2\u00ba\u00bb\7*\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd\62"+
		"\3\2\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c7\7F\2\2\u00c1"+
		"\u00c2\7Q\2\2\u00c2\u00c7\7T\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7Q\2\2"+
		"\u00c5\u00c7\7V\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c3"+
		"\3\2\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7w\2\2\u00cb\u00d2\7g\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2"+
		"\u00ce\u00cf\7n\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d2\7g\2\2\u00d1\u00c8"+
		"\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7K\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7i\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9\u00e7\7t\2\2\u00da\u00db\7H\2\2\u00db\u00dc"+
		"\7n\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7c\2\2\u00de\u00e7\7v\2\2\u00df"+
		"\u00e0\7D\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7n\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e7\7p\2\2\u00e6\u00d3"+
		"\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00df\3\2\2\2\u00e78\3\2\2\2\b\2I\u0091"+
		"\u00c6\u00d1\u00e6\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}