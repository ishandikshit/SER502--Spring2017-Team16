// Generated from Bagel.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, DIGIT=5, LETTER=6, SYMBOL=7, ADDITION_OPERATOR=8, 
		SUBTRACTION_OPERATOR=9, MULTIPLICATION_OPERATOR=10, DIVISION_OPERATOR=11, 
		COMPARISON_KEYWORDS=12, ASSIGNMENT_KEYWORD=13, WHITESPACE=14, IF_KEYWORD=15, 
		THEN_KEYWORD=16, ELSE_KEYWORD=17, ELSEIF_KEYWORD=18, PRINT_KEYWORD=19, 
		OPEN_BRACE=20, CLOSE_BRACE=21, OPEN_BRACKET=22, CLOSE_BRACKET=23, LOGICAL_KEYWORDS=24, 
		BOOLEAN_KEYWORDS=25, DATATYPE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "DIGIT", "LETTER", "SYMBOL", "ADDITION_OPERATOR", 
		"SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", 
		"COMPARISON_KEYWORDS", "ASSIGNMENT_KEYWORD", "WHITESPACE", "IF_KEYWORD", 
		"THEN_KEYWORD", "ELSE_KEYWORD", "ELSEIF_KEYWORD", "PRINT_KEYWORD", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "LOGICAL_KEYWORDS", "BOOLEAN_KEYWORDS", 
		"DATATYPE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "' '", "'while'", "';'", null, null, null, "'+'", "'-'", 
		"'*'", "'/'", null, "'is'", null, "'if'", "'then'", "'else'", "'elif'", 
		"'print'", "'{'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "DIGIT", "LETTER", "SYMBOL", "ADDITION_OPERATOR", 
		"SUBTRACTION_OPERATOR", "MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", 
		"COMPARISON_KEYWORDS", "ASSIGNMENT_KEYWORD", "WHITESPACE", "IF_KEYWORD", 
		"THEN_KEYWORD", "ELSE_KEYWORD", "ELSEIF_KEYWORD", "PRINT_KEYWORD", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "LOGICAL_KEYWORDS", "BOOLEAN_KEYWORDS", 
		"DATATYPE"
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BagelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bagel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bL\n\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0094\n\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u00c3\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00ce\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00e3\n\33\2\2\34\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\6\4\2C\\c|\5\2>>]]__\7"+
		"\2..\60\60==aa~~\5\2\13\f\16\17\"\"\2\u00ef\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13C\3\2"+
		"\2\2\rE\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3"+
		"\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u0098\3\2\2\2\37\u009a\3\2"+
		"\2\2!\u009d\3\2\2\2#\u00a2\3\2\2\2%\u00a7\3\2\2\2\'\u00ac\3\2\2\2)\u00b2"+
		"\3\2\2\2+\u00b4\3\2\2\2-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00c2\3\2\2\2"+
		"\63\u00cd\3\2\2\2\65\u00e2\3\2\2\2\678\7\60\2\28\4\3\2\2\29:\7\"\2\2:"+
		"\6\3\2\2\2;<\7y\2\2<=\7j\2\2=>\7k\2\2>?\7n\2\2?@\7g\2\2@\b\3\2\2\2AB\7"+
		"=\2\2B\n\3\2\2\2CD\4\62;\2D\f\3\2\2\2EF\t\2\2\2F\16\3\2\2\2GL\t\3\2\2"+
		"HI\7@\2\2IL\7?\2\2JL\t\4\2\2KG\3\2\2\2KH\3\2\2\2KJ\3\2\2\2L\20\3\2\2\2"+
		"MN\7-\2\2N\22\3\2\2\2OP\7/\2\2P\24\3\2\2\2QR\7,\2\2R\26\3\2\2\2ST\7\61"+
		"\2\2T\30\3\2\2\2UV\7G\2\2VW\7s\2\2WX\7w\2\2XY\7c\2\2YZ\7n\2\2Z\u0094\7"+
		"u\2\2[\\\7I\2\2\\]\7t\2\2]^\7g\2\2^_\7c\2\2_`\7v\2\2`a\7g\2\2ab\7t\2\2"+
		"bc\7V\2\2cd\7j\2\2de\7c\2\2e\u0094\7p\2\2fg\7N\2\2gh\7g\2\2hi\7u\2\2i"+
		"j\7u\2\2jk\7V\2\2kl\7j\2\2lm\7c\2\2m\u0094\7p\2\2no\7N\2\2op\7g\2\2pq"+
		"\7u\2\2qr\7u\2\2rs\7V\2\2st\7j\2\2tu\7c\2\2uv\7p\2\2vw\7G\2\2wx\7s\2\2"+
		"xy\7w\2\2yz\7c\2\2z\u0094\7n\2\2{|\7I\2\2|}\7t\2\2}~\7g\2\2~\177\7c\2"+
		"\2\177\u0080\7v\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7V\2\2\u0083\u0084\7j\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7G\2\2\u0087\u0088\7s\2\2\u0088\u0089\7w\2\2\u0089\u008a\7c\2\2"+
		"\u008a\u0094\7n\2\2\u008b\u008c\7P\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7G\2\2\u008f\u0090\7s\2\2\u0090\u0091\7w\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0094\7n\2\2\u0093U\3\2\2\2\u0093[\3\2\2\2\u0093f"+
		"\3\2\2\2\u0093n\3\2\2\2\u0093{\3\2\2\2\u0093\u008b\3\2\2\2\u0094\32\3"+
		"\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7u\2\2\u0097\34\3\2\2\2\u0098\u0099"+
		"\t\5\2\2\u0099\36\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c"+
		" \3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7n\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7h\2\2\u00ab&\3\2\2\2\u00ac"+
		"\u00ad\7r\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7}\2\2\u00b3*\3\2\2\2\u00b4"+
		"\u00b5\7\177\2\2\u00b5,\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7.\3\2\2\2\u00b8"+
		"\u00b9\7+\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7P\2\2\u00bc"+
		"\u00c3\7F\2\2\u00bd\u00be\7Q\2\2\u00be\u00c3\7T\2\2\u00bf\u00c0\7P\2\2"+
		"\u00c0\u00c1\7Q\2\2\u00c1\u00c3\7V\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bd"+
		"\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7\u00ce\7g\2\2\u00c8\u00c9\7h\2\2"+
		"\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc\u00ce"+
		"\7g\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\64\3\2\2\2\u00cf"+
		"\u00d0\7K\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3\u00d4\7i\2\2\u00d4\u00d5\7g\2\2\u00d5\u00e3\7t\2\2\u00d6\u00d7"+
		"\7H\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7c\2\2\u00da"+
		"\u00e3\7v\2\2\u00db\u00dc\7D\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7q\2\2"+
		"\u00de\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e3"+
		"\7p\2\2\u00e2\u00cf\3\2\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00db\3\2\2\2\u00e3"+
		"\66\3\2\2\2\b\2K\u0093\u00c2\u00cd\u00e2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}