// Generated from /home/lixi/index/nginx_demo_v2_20201226_by_lyuqiang/nginx_demo/grammar/NginxLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NginxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOCATION=1, LEFT_OPENING_BRACE=2, RIGTH_OPENING_BRACE=3, LOWER_STRING_WITH_UNDER_LINE=4, 
		LOWER_STRING=5, SPACE=6, STRING_WITH_OTHER=7, STRING=8, LOWER_ALPHABET=9, 
		UPPER_ALPHABET=10, ALPHABET=11, UNDER_LINE=12, NUMBER=13, SLASH=14, PLUS=15, 
		MINUS=16, DOT=17, EQUALS_SIGN=18, S1_DELIMITER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOCATION", "LEFT_OPENING_BRACE", "RIGTH_OPENING_BRACE", "LOWER_STRING_WITH_UNDER_LINE", 
			"LOWER_STRING", "SPACE", "STRING_WITH_OTHER", "STRING", "LOWER_ALPHABET", 
			"UPPER_ALPHABET", "ALPHABET", "UNDER_LINE", "NUMBER", "SLASH", "PLUS", 
			"MINUS", "DOT", "EQUALS_SIGN", "S1_DELIMITER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'location'", "'{'", "'}'", null, null, "' '", null, null, null, 
			null, null, "'_'", null, "'/'", "'+'", "'-'", "'.'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOCATION", "LEFT_OPENING_BRACE", "RIGTH_OPENING_BRACE", "LOWER_STRING_WITH_UNDER_LINE", 
			"LOWER_STRING", "SPACE", "STRING_WITH_OTHER", "STRING", "LOWER_ALPHABET", 
			"UPPER_ALPHABET", "ALPHABET", "UNDER_LINE", "NUMBER", "SLASH", "PLUS", 
			"MINUS", "DOT", "EQUALS_SIGN", "S1_DELIMITER", "WS"
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


	public NginxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NginxLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\6\5=\n\5\r\5\16\5>\3\6\6\6B\n\6\r\6\16\6"+
		"C\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\bQ\n\b\r\b\16\bR\3\t\6"+
		"\tV\n\t\r\t\16\tW\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25q\n\25\r\25"+
		"\16\25r\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\7\3\2c|\3\2C\\"+
		"\4\2C\\c|\3\2\62;\4\2\13\f\17\17\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\3+\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13A\3\2\2\2\r"+
		"E\3\2\2\2\17P\3\2\2\2\21U\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2"+
		"\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%"+
		"k\3\2\2\2\'m\3\2\2\2)p\3\2\2\2+,\7n\2\2,-\7q\2\2-.\7e\2\2./\7c\2\2/\60"+
		"\7v\2\2\60\61\7k\2\2\61\62\7q\2\2\62\63\7p\2\2\63\4\3\2\2\2\64\65\7}\2"+
		"\2\65\6\3\2\2\2\66\67\7\177\2\2\67\b\3\2\2\28<\5\13\6\29:\5\31\r\2:;\5"+
		"\13\6\2;=\3\2\2\2<9\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\n\3\2\2\2@"+
		"B\5\23\n\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\f\3\2\2\2EF\7\"\2"+
		"\2F\16\3\2\2\2GQ\5\23\n\2HQ\5\31\r\2IQ\5\33\16\2JQ\5\35\17\2KQ\5\37\20"+
		"\2LQ\5!\21\2MQ\5#\22\2NQ\5\25\13\2OQ\5%\23\2PG\3\2\2\2PH\3\2\2\2PI\3\2"+
		"\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QR\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2S\20\3\2\2\2TV\5\27\f\2UT\3\2\2\2VW\3\2\2\2WU"+
		"\3\2\2\2WX\3\2\2\2X\22\3\2\2\2YZ\t\2\2\2Z\24\3\2\2\2[\\\t\3\2\2\\\26\3"+
		"\2\2\2]^\t\4\2\2^\30\3\2\2\2_`\7a\2\2`\32\3\2\2\2ab\t\5\2\2b\34\3\2\2"+
		"\2cd\7\61\2\2d\36\3\2\2\2ef\7-\2\2f \3\2\2\2gh\7/\2\2h\"\3\2\2\2ij\7\60"+
		"\2\2j$\3\2\2\2kl\7?\2\2l&\3\2\2\2mn\7=\2\2n(\3\2\2\2oq\t\6\2\2po\3\2\2"+
		"\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\25\2\2u*\3\2\2\2\t\2>C"+
		"PRWr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}