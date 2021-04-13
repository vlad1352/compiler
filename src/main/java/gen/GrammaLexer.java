package gen;
// Generated from D:/Antlr/src/main/java\Gramma.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, PT=19, NUM=20, TYPE=21, MULT=22, DIV=23, PLUS=24, MINUS=25, 
		LOGIC=26, COMPARE=27, UNARY_OPERATOR=28, MAIN_FUNCTION_ID=29, NAME=30, 
		Whitespace=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "PT", "NUM", "TYPE", "MULT", "DIV", "PLUS", "MINUS", "LOGIC", 
			"COMPARE", "UNARY_OPERATOR", "MAIN_FUNCTION_ID", "NAME", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'^'", "'!'", "','", "'{'", "'}'", "'()'", 
			"'return'", "'if'", "'else'", "'while'", "'for'", "';'", "'break'", "'continue'", 
			"'print'", "'.'", null, null, "'*'", "'/'", "'+'", "'-'", null, null, 
			null, "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "PT", "NUM", "TYPE", "MULT", 
			"DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", "MAIN_FUNCTION_ID", 
			"NAME", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GrammaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramma.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\6\25\u0088\n\25\r\25\16\25\u0089"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0098"+
		"\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33"+
		"\u00a6\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00b1\n"+
		"\34\3\35\3\35\3\35\3\35\5\35\u00b7\n\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\6\37\u00bf\n\37\r\37\16\37\u00c0\3\37\7\37\u00c4\n\37\f\37\16\37\u00c7"+
		"\13\37\6\37\u00c9\n\37\r\37\16\37\u00ca\3 \6 \u00ce\n \r \16 \u00cf\3"+
		" \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!\3\2\7\3\2\62;\4\2>>@@\3\2c|\3\2C\\\5\2\13\f\17\17\"\""+
		"\2\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2"+
		"\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2"+
		"\25T\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33c\3\2\2\2\35i\3\2\2\2\37m\3\2\2"+
		"\2!o\3\2\2\2#u\3\2\2\2%~\3\2\2\2\'\u0084\3\2\2\2)\u0087\3\2\2\2+\u0097"+
		"\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61\u009d\3\2\2\2\63\u009f\3\2\2"+
		"\2\65\u00a5\3\2\2\2\67\u00b0\3\2\2\29\u00b6\3\2\2\2;\u00b8\3\2\2\2=\u00c8"+
		"\3\2\2\2?\u00cd\3\2\2\2AB\7?\2\2B\4\3\2\2\2CD\7*\2\2D\6\3\2\2\2EF\7+\2"+
		"\2F\b\3\2\2\2GH\7`\2\2H\n\3\2\2\2IJ\7#\2\2J\f\3\2\2\2KL\7.\2\2L\16\3\2"+
		"\2\2MN\7}\2\2N\20\3\2\2\2OP\7\177\2\2P\22\3\2\2\2QR\7*\2\2RS\7+\2\2S\24"+
		"\3\2\2\2TU\7t\2\2UV\7g\2\2VW\7v\2\2WX\7w\2\2XY\7t\2\2YZ\7p\2\2Z\26\3\2"+
		"\2\2[\\\7k\2\2\\]\7h\2\2]\30\3\2\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2"+
		"\2b\32\3\2\2\2cd\7y\2\2de\7j\2\2ef\7k\2\2fg\7n\2\2gh\7g\2\2h\34\3\2\2"+
		"\2ij\7h\2\2jk\7q\2\2kl\7t\2\2l\36\3\2\2\2mn\7=\2\2n \3\2\2\2op\7d\2\2"+
		"pq\7t\2\2qr\7g\2\2rs\7c\2\2st\7m\2\2t\"\3\2\2\2uv\7e\2\2vw\7q\2\2wx\7"+
		"p\2\2xy\7v\2\2yz\7k\2\2z{\7p\2\2{|\7w\2\2|}\7g\2\2}$\3\2\2\2~\177\7r\2"+
		"\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7v\2\2\u0083&\3\2\2\2\u0084\u0085\7\60\2\2\u0085(\3\2\2\2\u0086\u0088"+
		"\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a*\3\2\2\2\u008b\u008c\7K\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7g\2\2\u008f\u0090\7i\2\2\u0090\u0091\7g\2\2"+
		"\u0091\u0098\7t\2\2\u0092\u0093\7H\2\2\u0093\u0094\7n\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7c\2\2\u0096\u0098\7v\2\2\u0097\u008b\3\2\2\2\u0097"+
		"\u0092\3\2\2\2\u0098,\3\2\2\2\u0099\u009a\7,\2\2\u009a.\3\2\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\60\3\2\2\2\u009d\u009e\7-\2\2\u009e\62\3\2\2\2\u009f"+
		"\u00a0\7/\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\u00a6\7(\2\2\u00a3"+
		"\u00a4\7~\2\2\u00a4\u00a6\7~\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\66\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8\u00b1\7?\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa\u00b1\7?\2\2\u00ab\u00b1\t\3\2\2\u00ac\u00ad\7@\2\2\u00ad"+
		"\u00b1\7?\2\2\u00ae\u00af\7>\2\2\u00af\u00b1\7?\2\2\u00b0\u00a7\3\2\2"+
		"\2\u00b0\u00a9\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b18\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b7\7/\2\2\u00b4\u00b5"+
		"\7-\2\2\u00b5\u00b7\7-\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		":\3\2\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc<\3\2\2\2\u00bd\u00bf\t\4\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\3\2"+
		"\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00be\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb>\3\2\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\b \2\2\u00d2@\3\2\2\2\f\2\u0089\u0097\u00a5\u00b0"+
		"\u00b6\u00c0\u00c5\u00ca\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}