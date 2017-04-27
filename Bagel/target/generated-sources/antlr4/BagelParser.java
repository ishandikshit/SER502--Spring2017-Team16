// Generated from Bagel.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BagelParser extends Parser {
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
	public static final int
		RULE_character = 0, RULE_identifier = 1, RULE_integer_literal = 2, RULE_float_literal = 3, 
		RULE_operator = 4, RULE_declaration_statement = 5, RULE_term = 6, RULE_basic_expression = 7, 
		RULE_relational_expression = 8, RULE_complex_expression = 9, RULE_condition = 10, 
		RULE_return_statement = 11, RULE_while_loop = 12, RULE_if_statement = 13, 
		RULE_else_statement = 14, RULE_ifelse_statement = 15, RULE_construct_statement = 16, 
		RULE_assignment_statement = 17, RULE_other_statement = 18, RULE_statements = 19, 
		RULE_program = 20;
	public static final String[] ruleNames = {
		"character", "identifier", "integer_literal", "float_literal", "operator", 
		"declaration_statement", "term", "basic_expression", "relational_expression", 
		"complex_expression", "condition", "return_statement", "while_loop", "if_statement", 
		"else_statement", "ifelse_statement", "construct_statement", "assignment_statement", 
		"other_statement", "statements", "program"
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

	@Override
	public String getGrammarFileName() { return "Bagel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BagelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(BagelParser.LETTER, 0); }
		public TerminalNode DIGIT() { return getToken(BagelParser.DIGIT, 0); }
		public TerminalNode SYMBOL() { return getToken(BagelParser.SYMBOL, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << SYMBOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(BagelParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(BagelParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(BagelParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(BagelParser.DIGIT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(LETTER);
			}
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					_la = _input.LA(1);
					if ( !(_la==DIGIT || _la==LETTER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class Integer_literalContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(BagelParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(BagelParser.DIGIT, i);
		}
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) {
				{
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(DIGIT);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class Float_literalContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(BagelParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(BagelParser.DIGIT, i);
		}
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitFloat_literal(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_float_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) {
				{
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(62);
			match(DIGIT);
			setState(63);
			match(T__0);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				match(DIGIT);
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPERATOR() { return getToken(BagelParser.ADDITION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(BagelParser.SUBTRACTION_OPERATOR, 0); }
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(BagelParser.MULTIPLICATION_OPERATOR, 0); }
		public TerminalNode DIVISION_OPERATOR() { return getToken(BagelParser.DIVISION_OPERATOR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_OPERATOR) | (1L << SUBTRACTION_OPERATOR) | (1L << MULTIPLICATION_OPERATOR) | (1L << DIVISION_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(BagelParser.DATATYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterDeclaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitDeclaration_statement(this);
		}
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(DATATYPE);
			setState(72);
			match(T__1);
			setState(73);
			identifier();
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

	public static class TermContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				float_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				identifier();
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

	public static class Basic_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public Basic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterBasic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitBasic_expression(this);
		}
	}

	public final Basic_expressionContext basic_expression() throws RecognitionException {
		Basic_expressionContext _localctx = new Basic_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basic_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			term();
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(81);
						match(T__1);
						}
					}

					setState(84);
					operator();
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__1) {
						{
						setState(85);
						match(T__1);
						}
					}

					setState(88);
					term();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Basic_expressionContext> basic_expression() {
			return getRuleContexts(Basic_expressionContext.class);
		}
		public Basic_expressionContext basic_expression(int i) {
			return getRuleContext(Basic_expressionContext.class,i);
		}
		public TerminalNode COMPARISON_KEYWORDS() { return getToken(BagelParser.COMPARISON_KEYWORDS, 0); }
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			basic_expression();
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(96);
				match(T__1);
				setState(97);
				match(COMPARISON_KEYWORDS);
				setState(98);
				match(T__1);
				setState(99);
				basic_expression();
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

	public static class Complex_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_KEYWORDS() { return getTokens(BagelParser.LOGICAL_KEYWORDS); }
		public TerminalNode LOGICAL_KEYWORDS(int i) {
			return getToken(BagelParser.LOGICAL_KEYWORDS, i);
		}
		public Complex_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterComplex_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitComplex_expression(this);
		}
	}

	public final Complex_expressionContext complex_expression() throws RecognitionException {
		Complex_expressionContext _localctx = new Complex_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_complex_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			relational_expression();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(T__1);
					setState(104);
					match(LOGICAL_KEYWORDS);
					setState(105);
					match(T__1);
					setState(106);
					relational_expression();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			complex_expression();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode PRINT_KEYWORD() { return getToken(BagelParser.PRINT_KEYWORD, 0); }
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PRINT_KEYWORD);
			setState(115);
			match(T__1);
			setState(116);
			complex_expression();
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

	public static class While_loopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(BagelParser.OPEN_BRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(BagelParser.CLOSE_BRACE, 0); }
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__2);
			setState(119);
			match(T__1);
			setState(120);
			condition();
			setState(121);
			match(T__1);
			setState(122);
			match(OPEN_BRACE);
			setState(123);
			match(T__1);
			setState(124);
			statements();
			setState(125);
			match(T__1);
			setState(126);
			match(CLOSE_BRACE);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(BagelParser.IF_KEYWORD, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(BagelParser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(BagelParser.OPEN_BRACE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(BagelParser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(BagelParser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> ELSEIF_KEYWORD() { return getTokens(BagelParser.ELSEIF_KEYWORD); }
		public TerminalNode ELSEIF_KEYWORD(int i) {
			return getToken(BagelParser.ELSEIF_KEYWORD, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF_KEYWORD);
			setState(129);
			match(T__1);
			setState(130);
			condition();
			setState(131);
			match(T__1);
			setState(132);
			match(OPEN_BRACE);
			setState(133);
			match(T__1);
			setState(134);
			statements();
			setState(135);
			match(T__1);
			setState(136);
			match(CLOSE_BRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(137);
				match(T__1);
				setState(138);
				match(ELSEIF_KEYWORD);
				setState(139);
				match(T__1);
				setState(140);
				match(OPEN_BRACE);
				setState(141);
				match(T__1);
				setState(142);
				statements();
				setState(143);
				match(T__1);
				setState(144);
				match(CLOSE_BRACE);
				}
				}
				setState(150);
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_KEYWORD() { return getToken(BagelParser.ELSE_KEYWORD, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(BagelParser.OPEN_BRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(BagelParser.CLOSE_BRACE, 0); }
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ELSE_KEYWORD);
			setState(152);
			match(T__1);
			setState(153);
			match(OPEN_BRACE);
			setState(154);
			match(T__1);
			setState(155);
			statements();
			setState(156);
			match(T__1);
			setState(157);
			match(CLOSE_BRACE);
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

	public static class Ifelse_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public Ifelse_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterIfelse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitIfelse_statement(this);
		}
	}

	public final Ifelse_statementContext ifelse_statement() throws RecognitionException {
		Ifelse_statementContext _localctx = new Ifelse_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifelse_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			if_statement();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(160);
				else_statement();
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

	public static class Construct_statementContext extends ParserRuleContext {
		public Ifelse_statementContext ifelse_statement() {
			return getRuleContext(Ifelse_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Construct_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterConstruct_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitConstruct_statement(this);
		}
	}

	public final Construct_statementContext construct_statement() throws RecognitionException {
		Construct_statementContext _localctx = new Construct_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_construct_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_KEYWORD:
				{
				setState(163);
				ifelse_statement();
				}
				break;
			case T__2:
				{
				setState(164);
				while_loop();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT_KEYWORD() { return getToken(BagelParser.ASSIGNMENT_KEYWORD, 0); }
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			identifier();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(168);
				match(T__1);
				}
			}

			setState(171);
			match(ASSIGNMENT_KEYWORD);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(172);
				match(T__1);
				}
			}

			setState(175);
			complex_expression();
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

	public static class Other_statementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Other_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterOther_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitOther_statement(this);
		}
	}

	public final Other_statementContext other_statement() throws RecognitionException {
		Other_statementContext _localctx = new Other_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_other_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
				{
				setState(177);
				assignment_statement();
				}
				break;
			case DATATYPE:
				{
				setState(178);
				declaration_statement();
				}
				break;
			case PRINT_KEYWORD:
				{
				setState(179);
				return_statement();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<Construct_statementContext> construct_statement() {
			return getRuleContexts(Construct_statementContext.class);
		}
		public Construct_statementContext construct_statement(int i) {
			return getRuleContext(Construct_statementContext.class,i);
		}
		public List<Other_statementContext> other_statement() {
			return getRuleContexts(Other_statementContext.class);
		}
		public Other_statementContext other_statement(int i) {
			return getRuleContext(Other_statementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << LETTER) | (1L << IF_KEYWORD) | (1L << PRINT_KEYWORD) | (1L << DATATYPE))) != 0)) {
				{
				setState(184);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case IF_KEYWORD:
					{
					setState(182);
					construct_statement();
					}
					break;
				case LETTER:
				case PRINT_KEYWORD:
				case DATATYPE:
					{
					setState(183);
					other_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(T__3);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BagelListener ) ((BagelListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			statements();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00c4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\7\3\61\n\3\f"+
		"\3\16\3\64\13\3\3\4\5\4\67\n\4\3\4\6\4:\n\4\r\4\16\4;\3\5\5\5?\n\5\3\5"+
		"\3\5\3\5\6\5D\n\5\r\5\16\5E\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bQ\n"+
		"\b\3\t\3\t\5\tU\n\t\3\t\3\t\5\tY\n\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\7\13n\n\13\f\13\16"+
		"\13q\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0095\n\17\f\17\16\17\u0098\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00a4\n\21"+
		"\3\22\3\22\5\22\u00a8\n\22\3\23\3\23\5\23\u00ac\n\23\3\23\3\23\5\23\u00b0"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u00b7\n\24\3\25\3\25\7\25\u00bb\n"+
		"\25\f\25\16\25\u00be\13\25\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\3\2\7\t\3\2\7\b\3\2\n\13\3\2\n"+
		"\r\2\u00c3\2,\3\2\2\2\4.\3\2\2\2\6\66\3\2\2\2\b>\3\2\2\2\nG\3\2\2\2\f"+
		"I\3\2\2\2\16P\3\2\2\2\20R\3\2\2\2\22a\3\2\2\2\24h\3\2\2\2\26r\3\2\2\2"+
		"\30t\3\2\2\2\32x\3\2\2\2\34\u0082\3\2\2\2\36\u0099\3\2\2\2 \u00a1\3\2"+
		"\2\2\"\u00a7\3\2\2\2$\u00a9\3\2\2\2&\u00b6\3\2\2\2(\u00bc\3\2\2\2*\u00c1"+
		"\3\2\2\2,-\t\2\2\2-\3\3\2\2\2.\62\7\b\2\2/\61\t\3\2\2\60/\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\67"+
		"\t\4\2\2\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28:\7\7\2\298\3\2\2\2:"+
		";\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=?\t\4\2\2>=\3\2\2\2>?\3\2\2\2"+
		"?@\3\2\2\2@A\7\7\2\2AC\7\3\2\2BD\7\7\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2F\t\3\2\2\2GH\t\5\2\2H\13\3\2\2\2IJ\7\34\2\2JK\7\4\2\2KL\5\4"+
		"\3\2L\r\3\2\2\2MQ\5\6\4\2NQ\5\b\5\2OQ\5\4\3\2PM\3\2\2\2PN\3\2\2\2PO\3"+
		"\2\2\2Q\17\3\2\2\2R^\5\16\b\2SU\7\4\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2"+
		"VX\5\n\6\2WY\7\4\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\16\b\2[]\3\2\2"+
		"\2\\T\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\21\3\2\2\2`^\3\2\2\2af\5"+
		"\20\t\2bc\7\4\2\2cd\7\16\2\2de\7\4\2\2eg\5\20\t\2fb\3\2\2\2fg\3\2\2\2"+
		"g\23\3\2\2\2ho\5\22\n\2ij\7\4\2\2jk\7\32\2\2kl\7\4\2\2ln\5\22\n\2mi\3"+
		"\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\25\3\2\2\2qo\3\2\2\2rs\5\24\13\2"+
		"s\27\3\2\2\2tu\7\25\2\2uv\7\4\2\2vw\5\24\13\2w\31\3\2\2\2xy\7\5\2\2yz"+
		"\7\4\2\2z{\5\26\f\2{|\7\4\2\2|}\7\26\2\2}~\7\4\2\2~\177\5(\25\2\177\u0080"+
		"\7\4\2\2\u0080\u0081\7\27\2\2\u0081\33\3\2\2\2\u0082\u0083\7\21\2\2\u0083"+
		"\u0084\7\4\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\4\2\2\u0086\u0087\7"+
		"\26\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5(\25\2\u0089\u008a\7\4\2\2\u008a"+
		"\u0096\7\27\2\2\u008b\u008c\7\4\2\2\u008c\u008d\7\24\2\2\u008d\u008e\7"+
		"\4\2\2\u008e\u008f\7\26\2\2\u008f\u0090\7\4\2\2\u0090\u0091\5(\25\2\u0091"+
		"\u0092\7\4\2\2\u0092\u0093\7\27\2\2\u0093\u0095\3\2\2\2\u0094\u008b\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\35\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\23\2\2\u009a\u009b\7\4\2"+
		"\2\u009b\u009c\7\26\2\2\u009c\u009d\7\4\2\2\u009d\u009e\5(\25\2\u009e"+
		"\u009f\7\4\2\2\u009f\u00a0\7\27\2\2\u00a0\37\3\2\2\2\u00a1\u00a3\5\34"+
		"\17\2\u00a2\u00a4\5\36\20\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"!\3\2\2\2\u00a5\u00a8\5 \21\2\u00a6\u00a8\5\32\16\2\u00a7\u00a5\3\2\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8#\3\2\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00ac"+
		"\7\4\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\7\17\2\2\u00ae\u00b0\7\4\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\24\13\2\u00b2%\3\2\2\2\u00b3"+
		"\u00b7\5$\23\2\u00b4\u00b7\5\f\7\2\u00b5\u00b7\5\30\r\2\u00b6\u00b3\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\'\3\2\2\2\u00b8\u00bb"+
		"\5\"\22\2\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0)\3\2\2\2\u00c1"+
		"\u00c2\5(\25\2\u00c2+\3\2\2\2\25\62\66;>EPTX^fo\u0096\u00a3\u00a7\u00ab"+
		"\u00af\u00b6\u00ba\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}