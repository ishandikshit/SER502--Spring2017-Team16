// Generated from Bagel.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BagelParser}.
 */
public interface BagelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BagelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull BagelParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull BagelParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#ifelse_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfelse_statement(@NotNull BagelParser.Ifelse_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#ifelse_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfelse_statement(@NotNull BagelParser.Ifelse_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#construct_statement}.
	 * @param ctx the parse tree
	 */
	void enterConstruct_statement(@NotNull BagelParser.Construct_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#construct_statement}.
	 * @param ctx the parse tree
	 */
	void exitConstruct_statement(@NotNull BagelParser.Construct_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#other_statement}.
	 * @param ctx the parse tree
	 */
	void enterOther_statement(@NotNull BagelParser.Other_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#other_statement}.
	 * @param ctx the parse tree
	 */
	void exitOther_statement(@NotNull BagelParser.Other_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(@NotNull BagelParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(@NotNull BagelParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(@NotNull BagelParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(@NotNull BagelParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_expression(@NotNull BagelParser.Complex_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#complex_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_expression(@NotNull BagelParser.Complex_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(@NotNull BagelParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(@NotNull BagelParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull BagelParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull BagelParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull BagelParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull BagelParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull BagelParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull BagelParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(@NotNull BagelParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(@NotNull BagelParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#basic_expression}.
	 * @param ctx the parse tree
	 */
	void enterBasic_expression(@NotNull BagelParser.Basic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#basic_expression}.
	 * @param ctx the parse tree
	 */
	void exitBasic_expression(@NotNull BagelParser.Basic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull BagelParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull BagelParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull BagelParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull BagelParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(@NotNull BagelParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(@NotNull BagelParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(@NotNull BagelParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(@NotNull BagelParser.Float_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull BagelParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull BagelParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull BagelParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull BagelParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(@NotNull BagelParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(@NotNull BagelParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BagelParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull BagelParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BagelParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull BagelParser.Return_statementContext ctx);
}