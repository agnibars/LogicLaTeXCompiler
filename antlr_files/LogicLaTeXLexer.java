// Generated from LogicLaTeX.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicLaTeXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Begin_document_sym=1, End_document_sym=2, Quantifier_sym=3, Exists_one_sym=4, 
		Exists_sym=5, For_all_sym=6, Operator_1arg_sym=7, Neg_sym=8, Necessarily_sym=9, 
		Possibly_sym=10, Operator_2arg_sym=11, Or_sym=12, And_sym=13, Implies_sym=14, 
		Iff_sym=15, Predicate_sym=16, Variable_sym=17, Upper_letter_sym=18, Lower_letter_sym=19, 
		Digit_sym=20, Equals_sym=21, L_bracket_sym=22, R_bracket_sym=23, Comma_sym=24, 
		WhiteSpace=25, NewLine=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Begin_document_sym", "End_document_sym", "Quantifier_sym", "Exists_one_sym", 
		"Exists_sym", "For_all_sym", "Operator_1arg_sym", "Neg_sym", "Necessarily_sym", 
		"Possibly_sym", "Operator_2arg_sym", "Or_sym", "And_sym", "Implies_sym", 
		"Iff_sym", "Predicate_sym", "Variable_sym", "Upper_letter_sym", "Lower_letter_sym", 
		"Digit_sym", "Equals_sym", "L_bracket_sym", "R_bracket_sym", "Comma_sym", 
		"WhiteSpace", "NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\documentclass{article} \\begin{document} $'", "'$ \\end{document}'", 
		null, "'\\exists!'", "'\\exists'", "'\\forall'", null, "'\\neg'", "'\\Box'", 
		"'\\Diamond'", null, "'\\lor'", "'\\land'", "'\\implies'", "'\\iff'", 
		null, null, null, null, null, "'='", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Begin_document_sym", "End_document_sym", "Quantifier_sym", "Exists_one_sym", 
		"Exists_sym", "For_all_sym", "Operator_1arg_sym", "Neg_sym", "Necessarily_sym", 
		"Possibly_sym", "Operator_2arg_sym", "Or_sym", "And_sym", "Implies_sym", 
		"Iff_sym", "Predicate_sym", "Variable_sym", "Upper_letter_sym", "Lower_letter_sym", 
		"Digit_sym", "Equals_sym", "L_bracket_sym", "R_bracket_sym", "Comma_sym", 
		"WhiteSpace", "NewLine"
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


	public LogicLaTeXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogicLaTeX.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5"+
		"\4w\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0095\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\6\21\u00ce\n\21\r\21\16"+
		"\21\u00cf\3\21\3\21\5\21\u00d4\n\21\3\22\3\22\3\22\3\22\3\22\6\22\u00db"+
		"\n\22\r\22\16\22\u00dc\3\22\3\22\5\22\u00e1\n\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\5\33\u00f8\n\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\3\2\4\4\2\13\13\"\"\4\2\f\f\17\17\2"+
		"\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5b\3\2\2"+
		"\2\7v\3\2\2\2\tx\3\2\2\2\13\u0081\3\2\2\2\r\u0089\3\2\2\2\17\u0094\3\2"+
		"\2\2\21\u0096\3\2\2\2\23\u009b\3\2\2\2\25\u00a0\3\2\2\2\27\u00ad\3\2\2"+
		"\2\31\u00af\3\2\2\2\33\u00b4\3\2\2\2\35\u00ba\3\2\2\2\37\u00c3\3\2\2\2"+
		"!\u00c8\3\2\2\2#\u00d5\3\2\2\2%\u00e2\3\2\2\2\'\u00e4\3\2\2\2)\u00e6\3"+
		"\2\2\2+\u00e8\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00ee\3\2\2\2\63"+
		"\u00f0\3\2\2\2\65\u00f7\3\2\2\2\678\7^\2\289\7f\2\29:\7q\2\2:;\7e\2\2"+
		";<\7w\2\2<=\7o\2\2=>\7g\2\2>?\7p\2\2?@\7v\2\2@A\7e\2\2AB\7n\2\2BC\7c\2"+
		"\2CD\7u\2\2DE\7u\2\2EF\7}\2\2FG\7c\2\2GH\7t\2\2HI\7v\2\2IJ\7k\2\2JK\7"+
		"e\2\2KL\7n\2\2LM\7g\2\2MN\7\177\2\2NO\7\"\2\2OP\7^\2\2PQ\7d\2\2QR\7g\2"+
		"\2RS\7i\2\2ST\7k\2\2TU\7p\2\2UV\7}\2\2VW\7f\2\2WX\7q\2\2XY\7e\2\2YZ\7"+
		"w\2\2Z[\7o\2\2[\\\7g\2\2\\]\7p\2\2]^\7v\2\2^_\7\177\2\2_`\7\"\2\2`a\7"+
		"&\2\2a\4\3\2\2\2bc\7&\2\2cd\7\"\2\2de\7^\2\2ef\7g\2\2fg\7p\2\2gh\7f\2"+
		"\2hi\7}\2\2ij\7f\2\2jk\7q\2\2kl\7e\2\2lm\7w\2\2mn\7o\2\2no\7g\2\2op\7"+
		"p\2\2pq\7v\2\2qr\7\177\2\2r\6\3\2\2\2sw\5\13\6\2tw\5\t\5\2uw\5\r\7\2v"+
		"s\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\b\3\2\2\2xy\7^\2\2yz\7g\2\2z{\7z\2\2{|"+
		"\7k\2\2|}\7u\2\2}~\7v\2\2~\177\7u\2\2\177\u0080\7#\2\2\u0080\n\3\2\2\2"+
		"\u0081\u0082\7^\2\2\u0082\u0083\7g\2\2\u0083\u0084\7z\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7u\2\2\u0086\u0087\7v\2\2\u0087\u0088\7u\2\2\u0088"+
		"\f\3\2\2\2\u0089\u008a\7^\2\2\u008a\u008b\7h\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7n\2\2"+
		"\u0090\16\3\2\2\2\u0091\u0095\5\21\t\2\u0092\u0095\5\23\n\2\u0093\u0095"+
		"\5\25\13\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\20\3\2\2\2\u0096\u0097\7^\2\2\u0097\u0098\7p\2\2\u0098\u0099\7"+
		"g\2\2\u0099\u009a\7i\2\2\u009a\22\3\2\2\2\u009b\u009c\7^\2\2\u009c\u009d"+
		"\7D\2\2\u009d\u009e\7q\2\2\u009e\u009f\7z\2\2\u009f\24\3\2\2\2\u00a0\u00a1"+
		"\7^\2\2\u00a1\u00a2\7F\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7o\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2"+
		"\u00a8\26\3\2\2\2\u00a9\u00ae\5\31\r\2\u00aa\u00ae\5\33\16\2\u00ab\u00ae"+
		"\5\35\17\2\u00ac\u00ae\5\37\20\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\30\3\2\2\2\u00af\u00b0"+
		"\7^\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\32\3\2\2\2\u00b4\u00b5\7^\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7f\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7^\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7n\2\2"+
		"\u00bf\u00c0\7k\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7u\2\2\u00c2\36\3\2"+
		"\2\2\u00c3\u00c4\7^\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7"+
		"\7h\2\2\u00c7 \3\2\2\2\u00c8\u00d3\5%\23\2\u00c9\u00ca\7a\2\2\u00ca\u00cb"+
		"\7}\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5)\25\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\177\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\"\3\2\2\2\u00d5\u00e0\5\'\24\2\u00d6\u00d7\7a\2\2"+
		"\u00d7\u00d8\7}\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5)\25\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7\177\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d6\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1$\3\2\2\2\u00e2\u00e3\4C\\\2\u00e3&\3"+
		"\2\2\2\u00e4\u00e5\4c|\2\u00e5(\3\2\2\2\u00e6\u00e7\4\62;\2\u00e7*\3\2"+
		"\2\2\u00e8\u00e9\7?\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb.\3\2\2"+
		"\2\u00ec\u00ed\7+\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7.\2\2\u00ef\62\3\2"+
		"\2\2\u00f0\u00f1\t\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\32\2\2\u00f3"+
		"\64\3\2\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f8\7\f\2\2\u00f6\u00f8\t\3\2"+
		"\2\u00f7\u00f4\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\b\33\2\2\u00fa\66\3\2\2\2\13\2v\u0094\u00ad\u00cf\u00d3\u00dc\u00e0\u00f7"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}