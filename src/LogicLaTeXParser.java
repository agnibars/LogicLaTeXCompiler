// Generated from LogicLaTeX.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogicLaTeXParser extends Parser {
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
	public static final int
		RULE_formula_0 = 0, RULE_formula_1 = 1, RULE_program = 2;
	public static final String[] ruleNames = {
		"formula_0", "formula_1", "program"
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

	@Override
	public String getGrammarFileName() { return "LogicLaTeX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicLaTeXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Formula_0Context extends ParserRuleContext {
		public TerminalNode Variable_sym() { return getToken(LogicLaTeXParser.Variable_sym, 0); }
		public TerminalNode L_bracket_sym() { return getToken(LogicLaTeXParser.L_bracket_sym, 0); }
		public List<Formula_0Context> formula_0() {
			return getRuleContexts(Formula_0Context.class);
		}
		public Formula_0Context formula_0(int i) {
			return getRuleContext(Formula_0Context.class,i);
		}
		public TerminalNode Operator_2arg_sym() { return getToken(LogicLaTeXParser.Operator_2arg_sym, 0); }
		public TerminalNode R_bracket_sym() { return getToken(LogicLaTeXParser.R_bracket_sym, 0); }
		public TerminalNode Operator_1arg_sym() { return getToken(LogicLaTeXParser.Operator_1arg_sym, 0); }
		public Formula_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicLaTeXListener ) ((LogicLaTeXListener)listener).enterFormula_0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicLaTeXListener ) ((LogicLaTeXListener)listener).exitFormula_0(this);
		}
	}

	public final Formula_0Context formula_0() throws RecognitionException {
		Formula_0Context _localctx = new Formula_0Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula_0);
		try {
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable_sym:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(Variable_sym);
				}
				break;
			case L_bracket_sym:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				match(L_bracket_sym);
				setState(8);
				formula_0();
				setState(9);
				match(Operator_2arg_sym);
				setState(10);
				formula_0();
				setState(11);
				match(R_bracket_sym);
				}
				break;
			case Operator_1arg_sym:
				enterOuterAlt(_localctx, 3);
				{
				setState(13);
				match(Operator_1arg_sym);
				setState(14);
				formula_0();
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

	public static class Formula_1Context extends ParserRuleContext {
		public TerminalNode L_bracket_sym() { return getToken(LogicLaTeXParser.L_bracket_sym, 0); }
		public List<TerminalNode> Variable_sym() { return getTokens(LogicLaTeXParser.Variable_sym); }
		public TerminalNode Variable_sym(int i) {
			return getToken(LogicLaTeXParser.Variable_sym, i);
		}
		public TerminalNode Equals_sym() { return getToken(LogicLaTeXParser.Equals_sym, 0); }
		public TerminalNode R_bracket_sym() { return getToken(LogicLaTeXParser.R_bracket_sym, 0); }
		public TerminalNode Predicate_sym() { return getToken(LogicLaTeXParser.Predicate_sym, 0); }
		public List<TerminalNode> Comma_sym() { return getTokens(LogicLaTeXParser.Comma_sym); }
		public TerminalNode Comma_sym(int i) {
			return getToken(LogicLaTeXParser.Comma_sym, i);
		}
		public List<Formula_1Context> formula_1() {
			return getRuleContexts(Formula_1Context.class);
		}
		public Formula_1Context formula_1(int i) {
			return getRuleContext(Formula_1Context.class,i);
		}
		public TerminalNode Operator_2arg_sym() { return getToken(LogicLaTeXParser.Operator_2arg_sym, 0); }
		public TerminalNode Operator_1arg_sym() { return getToken(LogicLaTeXParser.Operator_1arg_sym, 0); }
		public TerminalNode Quantifier_sym() { return getToken(LogicLaTeXParser.Quantifier_sym, 0); }
		public Formula_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicLaTeXListener ) ((LogicLaTeXListener)listener).enterFormula_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicLaTeXListener ) ((LogicLaTeXListener)listener).exitFormula_1(this);
		}
	}

	public final Formula_1Context formula_1() throws RecognitionException {
		Formula_1Context _localctx = new Formula_1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_formula_1);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(L_bracket_sym);
				setState(18);
				match(Variable_sym);
				setState(19);
				match(Equals_sym);
				setState(20);
				match(Variable_sym);
				setState(21);
				match(R_bracket_sym);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(Predicate_sym);
				setState(23);
				match(L_bracket_sym);
				setState(24);
				match(Variable_sym);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma_sym) {
					{
					{
					setState(25);
					match(Comma_sym);
					setState(26);
					match(Variable_sym);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(R_bracket_sym);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(L_bracket_sym);
				setState(34);
				formula_1();
				setState(35);
				match(Operator_2arg_sym);
				setState(36);
				formula_1();
				setState(37);
				match(R_bracket_sym);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(Operator_1arg_sym);
				setState(40);
				formula_1();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(Quantifier_sym);
				setState(42);
				match(Variable_sym);
				setState(43);
				formula_1();
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode Begin_document_sym() { return getToken(LogicLaTeXParser.Begin_document_sym, 0); }
		public TerminalNode End_document_sym() { return getToken(LogicLaTeXParser.End_document_sym, 0); }
		public TerminalNode EOF() { return getToken(LogicLaTeXParser.EOF, 0); }
		public Formula_0Context formula_0() {
			return getRuleContext(Formula_0Context.class,0);
		}
		public Formula_1Context formula_1() {
			return getRuleContext(Formula_1Context.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicLaTeXListener ) ((LogicLaTeXListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicLaTeXListener ) ((LogicLaTeXListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Begin_document_sym);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(47);
				formula_0();
				}
				break;
			case 2:
				{
				setState(48);
				formula_1();
				}
				break;
			}
			setState(51);
			match(End_document_sym);
			setState(52);
			match(EOF);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\349\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\22\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\5\4\64\n\4\3\4\3"+
		"\4\3\4\3\4\2\2\5\2\4\6\2\2\2=\2\21\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\22"+
		"\7\23\2\2\t\n\7\30\2\2\n\13\5\2\2\2\13\f\7\r\2\2\f\r\5\2\2\2\r\16\7\31"+
		"\2\2\16\22\3\2\2\2\17\20\7\t\2\2\20\22\5\2\2\2\21\b\3\2\2\2\21\t\3\2\2"+
		"\2\21\17\3\2\2\2\22\3\3\2\2\2\23\24\7\30\2\2\24\25\7\23\2\2\25\26\7\27"+
		"\2\2\26\27\7\23\2\2\27/\7\31\2\2\30\31\7\22\2\2\31\32\7\30\2\2\32\37\7"+
		"\23\2\2\33\34\7\32\2\2\34\36\7\23\2\2\35\33\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"/\7\31\2\2#$\7\30\2\2$%\5"+
		"\4\3\2%&\7\r\2\2&\'\5\4\3\2\'(\7\31\2\2(/\3\2\2\2)*\7\t\2\2*/\5\4\3\2"+
		"+,\7\5\2\2,-\7\23\2\2-/\5\4\3\2.\23\3\2\2\2.\30\3\2\2\2.#\3\2\2\2.)\3"+
		"\2\2\2.+\3\2\2\2/\5\3\2\2\2\60\63\7\3\2\2\61\64\5\2\2\2\62\64\5\4\3\2"+
		"\63\61\3\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\66\7\4\2\2\66\67\7\2\2\3"+
		"\67\7\3\2\2\2\6\21\37.\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}