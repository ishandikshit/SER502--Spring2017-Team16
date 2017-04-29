import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NewBagelListener extends BagelBaseListener {

	Stack<String> icStack;
	StringBuilder sbuild = new StringBuilder();

	public NewBagelListener() {
		icStack = new Stack<String>();
	}

	@Override
	public void enterCharacter(BagelParser.CharacterContext ctx) {
		// TODO Auto-generated method stub
		// if(ctx.DIGIT() != null)
		// icStack.push(ctx.DIGIT().getText());
		// if(ctx.LETTER()!=null)
		// icStack.push(ctx.DIGIT().getText());
		// if(ctx.SYMBOL()!=null)
		// icStack.push(ctx.DIGIT().getText());
		super.enterCharacter(ctx);
	}

	@Override
	public void exitCharacter(BagelParser.CharacterContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitCharacter(ctx);
	}

	@Override
	public void enterIdentifier(BagelParser.IdentifierContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterIdentifier(ctx);
	}

	@Override
	public void exitIdentifier(BagelParser.IdentifierContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitIdentifier(ctx);
	}

	@Override
	public void enterInteger_literal(BagelParser.Integer_literalContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterInteger_literal(ctx);
	}

	@Override
	public void exitInteger_literal(BagelParser.Integer_literalContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitInteger_literal(ctx);
	}

	@Override
	public void enterFloat_literal(BagelParser.Float_literalContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterFloat_literal(ctx);
	}

	@Override
	public void exitFloat_literal(BagelParser.Float_literalContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitFloat_literal(ctx);
	}

	@Override
	public void enterOperator(BagelParser.OperatorContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterOperator(ctx);
	}

	@Override
	public void exitOperator(BagelParser.OperatorContext ctx) {
		// TODO Auto-generated method stub
		super.exitOperator(ctx);
	}

	@Override
	public void enterDeclaration_statement(BagelParser.Declaration_statementContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclaration_statement(ctx);
	}

	@Override
	public void exitDeclaration_statement(BagelParser.Declaration_statementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Data Type : "+ctx.DATATYPE().getText());
		System.out.println("Identifier : "+ctx.identifier().getText());
		icStack.push("DECLARE START");
		icStack.push(ctx.DATATYPE().getText());
		icStack.push(ctx.identifier().getText());
		icStack.push("DECLARE START");
		super.exitDeclaration_statement(ctx);
	}

	@Override
	public void enterTerm(BagelParser.TermContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterTerm(ctx);
	}

	@Override
	public void exitTerm(BagelParser.TermContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitTerm(ctx);
	}

	@Override
	public void enterBasic_expression(BagelParser.Basic_expressionContext ctx) {
		// TODO Auto-generated method stub
		icStack.push("LOAD");
		icStack.push(ctx.getTokens(0) + "/n");
		System.out.println(ctx.term());
		if (ctx.getTokens(1) == null) {
			icStack.push("END" + "/n");
		} else {
			if (ctx.getTokens(1).toString() == "+") {
				icStack.push("ADD" + "/n");
			} else if (ctx.getTokens(1).toString() == "-") {
				icStack.push("SUBTRACT" + "/n");
			} else if (ctx.getTokens(1).toString() == "*") {
				icStack.push("MULTIPLY" + "/n");
			} else if (ctx.getTokens(1).toString() == "/") {
				icStack.push("DIVIDE" + "/n");
			}

			icStack.push("LOAD");
			icStack.push(ctx.getTokens(2) + "/n");
			icStack.push("END" + "/n");
			System.out.println(icStack.toString());
			System.out.println("Inside listener!");

			super.enterBasic_expression(ctx);
		}
	}

	@Override
	public void exitBasic_expression(BagelParser.Basic_expressionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitBasic_expression(ctx);
	}

	@Override
	public void enterRelational_expression(BagelParser.Relational_expressionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterRelational_expression(ctx);
	}

	@Override
	public void exitRelational_expression(BagelParser.Relational_expressionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitRelational_expression(ctx);
	}

	@Override
	public void enterComplex_expression(BagelParser.Complex_expressionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterComplex_expression(ctx);
	}

	@Override
	public void exitComplex_expression(BagelParser.Complex_expressionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitComplex_expression(ctx);
	}

	@Override
	public void enterCondition(BagelParser.ConditionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterCondition(ctx);
	}

	@Override
	public void exitCondition(BagelParser.ConditionContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitCondition(ctx);
	}

	@Override
	public void enterReturn_statement(BagelParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterReturn_statement(ctx);
	}

	@Override
	public void exitReturn_statement(BagelParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitReturn_statement(ctx);
	}

	@Override
	public void enterWhile_loop(BagelParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterWhile_loop(ctx);
	}

	@Override
	public void exitWhile_loop(BagelParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitWhile_loop(ctx);
	}

	@Override
	public void enterIf_statement(BagelParser.If_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterIf_statement(ctx);
	}

	@Override
	public void exitIf_statement(BagelParser.If_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitIf_statement(ctx);
	}

	@Override
	public void enterElse_statement(BagelParser.Else_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterElse_statement(ctx);
	}

	@Override
	public void exitElse_statement(BagelParser.Else_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitElse_statement(ctx);
	}

	@Override
	public void enterIfelse_statement(BagelParser.Ifelse_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterIfelse_statement(ctx);
	}

	@Override
	public void exitIfelse_statement(BagelParser.Ifelse_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitIfelse_statement(ctx);
	}

	@Override
	public void enterConstruct_statement(BagelParser.Construct_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterConstruct_statement(ctx);
	}

	@Override
	public void exitConstruct_statement(BagelParser.Construct_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitConstruct_statement(ctx);
	}

	@Override
	public void enterAssignment_statement(BagelParser.Assignment_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterAssignment_statement(ctx);
	}

	@Override
	public void exitAssignment_statement(BagelParser.Assignment_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitAssignment_statement(ctx);
	}

	@Override
	public void enterOther_statement(BagelParser.Other_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterOther_statement(ctx);
	}

	@Override
	public void exitOther_statement(BagelParser.Other_statementContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitOther_statement(ctx);
	}

	@Override
	public void enterStatements(BagelParser.StatementsContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.enterStatements(ctx);
	}

	@Override
	public void exitStatements(BagelParser.StatementsContext ctx) {
		// TODO Auto-generated method stub
		sbuild.append("1");
		super.exitStatements(ctx);
	}

	@Override
	public void enterProgram(BagelParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Inside enterProgram()");
	}

	@Override
	public void exitProgram(BagelParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Inside exitProgram()");
		System.out.println(sbuild);
		super.exitProgram(ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}

}
