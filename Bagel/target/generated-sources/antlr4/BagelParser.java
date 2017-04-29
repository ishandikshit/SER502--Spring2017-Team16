// Generated from Bagel.g4 by ANTLR 4.4
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
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'\n'", "';'", "'.'", "DIGIT", "LETTER", "SYMBOL", 
		"'+'", "'-'", "'*'", "'/'", "COMPARISON_KEYWORDS", "'is'", "WHITESPACE", 
		"'if'", "'then'", "'else'", "'elif'", "'print'", "'while'", "'{'", "'}'", 
		"'('", "')'", "LOGICAL_KEYWORDS", "BOOLEAN_KEYWORDS", "DATATYPE"
	};
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

	@Override
	public String getGrammarFileName() { return "Bagel.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(BagelParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(BagelParser.LETTER, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44); match(LETTER);
			}
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45); match(LETTER);
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
		public TerminalNode DIGIT(int i) {
			return getToken(BagelParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(BagelParser.DIGIT); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(52);
			_la = _input.LA(1);
			if (_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) {
				{
				setState(51);
				_la = _input.LA(1);
				if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54); match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode DIGIT(int i) {
			return getToken(BagelParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(BagelParser.DIGIT); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(60);
			_la = _input.LA(1);
			if (_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) {
				{
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(62); match(DIGIT);
			setState(63); match(T__0);
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64); match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode DIVISION_OPERATOR() { return getToken(BagelParser.DIVISION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(BagelParser.SUBTRACTION_OPERATOR, 0); }
		public TerminalNode ADDITION_OPERATOR() { return getToken(BagelParser.ADDITION_OPERATOR, 0); }
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(BagelParser.MULTIPLICATION_OPERATOR, 0); }
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
			setState(71); match(DATATYPE);
			setState(72); match(T__3);
			setState(73); identifier();
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
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); integer_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); float_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); identifier();
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
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
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
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(81); term();
				setState(83);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(82); match(T__3);
					}
				}

				setState(85); operator();
				setState(87);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(86); match(T__3);
					}
				}

				setState(89); term();
				}
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public TerminalNode COMPARISON_KEYWORDS() { return getToken(BagelParser.COMPARISON_KEYWORDS, 0); }
		public Basic_expressionContext basic_expression(int i) {
			return getRuleContext(Basic_expressionContext.class,i);
		}
		public List<Basic_expressionContext> basic_expression() {
			return getRuleContexts(Basic_expressionContext.class);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93); basic_expression();
			setState(95);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(94); match(T__3);
				}
			}

			setState(97); match(COMPARISON_KEYWORDS);
			setState(99);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(98); match(T__3);
				}
			}

			setState(101); basic_expression();
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
		public TerminalNode LOGICAL_KEYWORDS() { return getToken(BagelParser.LOGICAL_KEYWORDS, 0); }
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
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
		int _la;
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); relational_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(104); relational_expression();
				setState(106);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(105); match(T__3);
					}
				}

				setState(108); match(LOGICAL_KEYWORDS);
				setState(110);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(109); match(T__3);
					}
				}

				setState(112); relational_expression();
				}
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
			setState(116); complex_expression();
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
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public TerminalNode PRINT_KEYWORD() { return getToken(BagelParser.PRINT_KEYWORD, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(PRINT_KEYWORD);
			setState(120);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(119); match(T__3);
				}
			}

			setState(122); complex_expression();
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
		public TerminalNode CLOSE_BRACE() { return getToken(BagelParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(BagelParser.OPEN_BRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode WHILE_KEYWORD() { return getToken(BagelParser.WHILE_KEYWORD, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124); match(WHILE_KEYWORD);
			setState(126);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(125); match(T__3);
				}
			}

			setState(128); condition();
			setState(130);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(129); match(T__3);
				}
			}

			setState(132); match(OPEN_BRACE);
			setState(134);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(133); match(T__3);
				}
			}

			setState(136); statements();
			setState(138);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(137); match(T__3);
				}
			}

			setState(140); match(CLOSE_BRACE);
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(BagelParser.CLOSE_BRACE); }
		public TerminalNode ELSEIF_KEYWORD() { return getToken(BagelParser.ELSEIF_KEYWORD, 0); }
		public List<TerminalNode> OPEN_BRACE() { return getTokens(BagelParser.OPEN_BRACE); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public TerminalNode IF_KEYWORD() { return getToken(BagelParser.IF_KEYWORD, 0); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(BagelParser.OPEN_BRACE, i);
		}
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(BagelParser.CLOSE_BRACE, i);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(142); match(IF_KEYWORD);
			setState(144);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(143); match(T__3);
				}
			}

			setState(146); condition();
			setState(148);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(147); match(T__3);
				}
			}

			setState(150); match(OPEN_BRACE);
			setState(152);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(151); match(T__3);
				}
			}

			setState(154); statements();
			setState(156);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(155); match(T__3);
				}
			}

			setState(158); match(CLOSE_BRACE);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(160);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(159); match(T__3);
					}
				}

				setState(162); match(ELSEIF_KEYWORD);
				setState(164);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(163); match(T__3);
					}
				}

				setState(166); match(OPEN_BRACE);
				setState(168);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(167); match(T__3);
					}
				}

				setState(170); statements();
				setState(172);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(171); match(T__3);
					}
				}

				setState(174); match(CLOSE_BRACE);
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACE() { return getToken(BagelParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(BagelParser.OPEN_BRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ELSE_KEYWORD() { return getToken(BagelParser.ELSE_KEYWORD, 0); }
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
			{
			setState(178); match(ELSE_KEYWORD);
			{
			setState(179); match(T__3);
			}
			setState(180); match(OPEN_BRACE);
			{
			setState(181); match(T__3);
			}
			setState(182); statements();
			{
			setState(183); match(T__3);
			}
			setState(184); match(CLOSE_BRACE);
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
			setState(186); if_statement();
			setState(188);
			_la = _input.LA(1);
			if (_la==ELSE_KEYWORD) {
				{
				setState(187); else_statement();
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
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Ifelse_statementContext ifelse_statement() {
			return getRuleContext(Ifelse_statementContext.class,0);
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
			setState(192);
			switch (_input.LA(1)) {
			case IF_KEYWORD:
				{
				setState(190); ifelse_statement();
				}
				break;
			case WHILE_KEYWORD:
				{
				setState(191); while_loop();
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Complex_expressionContext complex_expression() {
			return getRuleContext(Complex_expressionContext.class,0);
		}
		public TerminalNode ASSIGNMENT_KEYWORD() { return getToken(BagelParser.ASSIGNMENT_KEYWORD, 0); }
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
			setState(194); term();
			setState(196);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(195); match(T__3);
				}
			}

			setState(198); match(ASSIGNMENT_KEYWORD);
			setState(200);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(199); match(T__3);
				}
			}

			setState(202); complex_expression();
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Basic_expressionContext basic_expression() {
			return getRuleContext(Basic_expressionContext.class,0);
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
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(204); assignment_statement();
				}
				break;
			case 2:
				{
				setState(205); declaration_statement();
				}
				break;
			case 3:
				{
				setState(206); return_statement();
				}
				break;
			case 4:
				{
				setState(207); basic_expression();
				}
				break;
			case 5:
				{
				setState(208); term();
				}
				break;
			case 6:
				{
				setState(209); relational_expression();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<Other_statementContext> other_statement() {
			return getRuleContexts(Other_statementContext.class);
		}
		public Other_statementContext other_statement(int i) {
			return getRuleContext(Other_statementContext.class,i);
		}
		public List<Construct_statementContext> construct_statement() {
			return getRuleContexts(Construct_statementContext.class);
		}
		public Construct_statementContext construct_statement(int i) {
			return getRuleContext(Construct_statementContext.class,i);
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
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LETTER) | (1L << ADDITION_OPERATOR) | (1L << SUBTRACTION_OPERATOR) | (1L << IF_KEYWORD) | (1L << PRINT_KEYWORD) | (1L << WHILE_KEYWORD) | (1L << DATATYPE))) != 0)) {
				{
				{
				setState(214);
				switch (_input.LA(1)) {
				case IF_KEYWORD:
				case WHILE_KEYWORD:
					{
					setState(212); construct_statement();
					}
					break;
				case DIGIT:
				case LETTER:
				case ADDITION_OPERATOR:
				case SUBTRACTION_OPERATOR:
				case PRINT_KEYWORD:
				case DATATYPE:
					{
					setState(213); other_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(216); match(T__3);
					}
				}

				setState(220);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(219); match(T__2);
					}
				}

				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(T__1);
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
			setState(229); statements();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00ea\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\7\3\61\n\3\f"+
		"\3\16\3\64\13\3\3\4\5\4\67\n\4\3\4\6\4:\n\4\r\4\16\4;\3\5\5\5?\n\5\3\5"+
		"\3\5\3\5\6\5D\n\5\r\5\16\5E\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bQ\n"+
		"\b\3\t\3\t\3\t\5\tV\n\t\3\t\3\t\5\tZ\n\t\3\t\3\t\5\t^\n\t\3\n\3\n\5\n"+
		"b\n\n\3\n\3\n\5\nf\n\n\3\n\3\n\3\13\3\13\3\13\5\13m\n\13\3\13\3\13\5\13"+
		"q\n\13\3\13\3\13\5\13u\n\13\3\f\3\f\3\r\3\r\5\r{\n\r\3\r\3\r\3\16\3\16"+
		"\5\16\u0081\n\16\3\16\3\16\5\16\u0085\n\16\3\16\3\16\5\16\u0089\n\16\3"+
		"\16\3\16\5\16\u008d\n\16\3\16\3\16\3\17\3\17\5\17\u0093\n\17\3\17\3\17"+
		"\5\17\u0097\n\17\3\17\3\17\5\17\u009b\n\17\3\17\3\17\5\17\u009f\n\17\3"+
		"\17\3\17\5\17\u00a3\n\17\3\17\3\17\5\17\u00a7\n\17\3\17\3\17\5\17\u00ab"+
		"\n\17\3\17\3\17\5\17\u00af\n\17\3\17\3\17\5\17\u00b3\n\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00bf\n\21\3\22\3\22\5\22"+
		"\u00c3\n\22\3\23\3\23\5\23\u00c7\n\23\3\23\3\23\5\23\u00cb\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00d5\n\24\3\25\3\25\5\25\u00d9"+
		"\n\25\3\25\5\25\u00dc\n\25\3\25\5\25\u00df\n\25\7\25\u00e1\n\25\f\25\16"+
		"\25\u00e4\13\25\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\5\3\2\7\t\3\2\n\13\3\2\n\r\u00fe\2,\3\2\2\2\4"+
		".\3\2\2\2\6\66\3\2\2\2\b>\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16P\3\2\2\2\20"+
		"]\3\2\2\2\22_\3\2\2\2\24t\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32~\3\2\2\2"+
		"\34\u0090\3\2\2\2\36\u00b4\3\2\2\2 \u00bc\3\2\2\2\"\u00c2\3\2\2\2$\u00c4"+
		"\3\2\2\2&\u00d4\3\2\2\2(\u00e2\3\2\2\2*\u00e7\3\2\2\2,-\t\2\2\2-\3\3\2"+
		"\2\2.\62\7\b\2\2/\61\7\b\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\67\t\3\2\2\66\65\3\2\2\2\66"+
		"\67\3\2\2\2\679\3\2\2\28:\7\7\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<\7\3\2\2\2=?\t\3\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\7\2\2AC\7"+
		"\6\2\2BD\7\7\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GH"+
		"\t\4\2\2H\13\3\2\2\2IJ\7\35\2\2JK\7\3\2\2KL\5\4\3\2L\r\3\2\2\2MQ\5\6\4"+
		"\2NQ\5\b\5\2OQ\5\4\3\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\17\3\2\2\2R^\5\16"+
		"\b\2SU\5\16\b\2TV\7\3\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\5\n\6\2XZ\7"+
		"\3\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\16\b\2\\^\3\2\2\2]R\3\2\2\2"+
		"]S\3\2\2\2^\21\3\2\2\2_a\5\20\t\2`b\7\3\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2ce\7\16\2\2df\7\3\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5\20\t\2h\23"+
		"\3\2\2\2iu\5\22\n\2jl\5\22\n\2km\7\3\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"np\7\33\2\2oq\7\3\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\5\22\n\2su\3\2\2"+
		"\2ti\3\2\2\2tj\3\2\2\2u\25\3\2\2\2vw\5\24\13\2w\27\3\2\2\2xz\7\25\2\2"+
		"y{\7\3\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\5\24\13\2}\31\3\2\2\2~\u0080"+
		"\7\26\2\2\177\u0081\7\3\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\5\26\f\2\u0083\u0085\7\3\2\2\u0084\u0083\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\27\2\2\u0087"+
		"\u0089\7\3\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\5(\25\2\u008b\u008d\7\3\2\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\30\2\2\u008f\33\3\2\2"+
		"\2\u0090\u0092\7\21\2\2\u0091\u0093\7\3\2\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\5\26\f\2\u0095\u0097\7"+
		"\3\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\7\27\2\2\u0099\u009b\7\3\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\5(\25\2\u009d\u009f\7\3\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00b2\7\30"+
		"\2\2\u00a1\u00a3\7\3\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a6\7\24\2\2\u00a5\u00a7\7\3\2\2\u00a6\u00a5\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\7\27\2\2\u00a9"+
		"\u00ab\7\3\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\5(\25\2\u00ad\u00af\7\3\2\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\35\3\2\2\2\u00b4"+
		"\u00b5\7\23\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00b8\7"+
		"\3\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\7\3\2\2\u00ba\u00bb\7\30\2\2\u00bb"+
		"\37\3\2\2\2\u00bc\u00be\5\34\17\2\u00bd\u00bf\5\36\20\2\u00be\u00bd\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c3\5 \21\2\u00c1\u00c3"+
		"\5\32\16\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3#\3\2\2\2\u00c4"+
		"\u00c6\5\16\b\2\u00c5\u00c7\7\3\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\17\2\2\u00c9\u00cb\7\3\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5\24"+
		"\13\2\u00cd%\3\2\2\2\u00ce\u00d5\5$\23\2\u00cf\u00d5\5\f\7\2\u00d0\u00d5"+
		"\5\30\r\2\u00d1\u00d5\5\20\t\2\u00d2\u00d5\5\16\b\2\u00d3\u00d5\5\22\n"+
		"\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\'\3\2\2\2\u00d6"+
		"\u00d9\5\"\22\2\u00d7\u00d9\5&\24\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\7\3\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00df\7\4\2\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\5\2\2\u00e6)\3\2\2\2\u00e7\u00e8"+
		"\5(\25\2\u00e8+\3\2\2\2\'\62\66;>EPUY]aelptz\u0080\u0084\u0088\u008c\u0092"+
		"\u0096\u009a\u009e\u00a2\u00a6\u00aa\u00ae\u00b2\u00be\u00c2\u00c6\u00ca"+
		"\u00d4\u00d8\u00db\u00de\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}