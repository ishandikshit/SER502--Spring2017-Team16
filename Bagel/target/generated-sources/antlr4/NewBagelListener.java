import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
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
		
		super.enterCharacter(ctx);
	}

	@Override
	public void exitCharacter(BagelParser.CharacterContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitCharacter(ctx);
	}

	@Override
	public void enterIdentifier(BagelParser.IdentifierContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterIdentifier(ctx);
	}

	@Override
	public void exitIdentifier(BagelParser.IdentifierContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.LETTER().get(0).getText());
		icStack.push(ctx.LETTER().get(0).getText());
		super.exitIdentifier(ctx);
	}

	@Override
	public void enterInteger_literal(BagelParser.Integer_literalContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterInteger_literal(ctx);
	}

	@Override
	public void exitInteger_literal(BagelParser.Integer_literalContext ctx) {
		// TODO Auto-generated method stub
		super.exitInteger_literal(ctx);
	}

	@Override
	public void enterFloat_literal(BagelParser.Float_literalContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterFloat_literal(ctx);
	}

	@Override
	public void exitFloat_literal(BagelParser.Float_literalContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitFloat_literal(ctx);
	}

	@Override
	public void enterOperator(BagelParser.OperatorContext ctx) {
		// TODO Auto-generated method stub
		
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
		
		super.enterTerm(ctx);
	}

	@Override
	public void exitTerm(BagelParser.TermContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitTerm(ctx);
	}

	@Override
	public void enterBasic_expression(BagelParser.Basic_expressionContext ctx) {
		// TODO Auto-generated method stub
		
			super.enterBasic_expression(ctx);
		}
	

	@Override
	public void exitBasic_expression(BagelParser.Basic_expressionContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Basic Expression Started");
		System.out.println("Term : "+ctx.term().get(0).getText());
		icStack.push(ctx.term().get(0).getText());
		if (ctx.operator() != null)
		{
			System.out.println("Operator : "+ctx.operator().getText());
			icStack.push(ctx.operator().getText());
			System.out.println("Term : "+ctx.term().get(1).getText());
			icStack.push(ctx.term().get(1).getText());
		}	
		System.out.println("Basic Expression Ends");
		super.exitBasic_expression(ctx);
	}

	@Override
	public void enterRelational_expression(BagelParser.Relational_expressionContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterRelational_expression(ctx);
	}

	@Override
	public void exitRelational_expression(BagelParser.Relational_expressionContext ctx) {
		// TODO Auto-generated method stub
		
		System.out.println("Comparison Keyword : " +ctx.COMPARISON_KEYWORDS().getText());
		icStack.push(ctx.COMPARISON_KEYWORDS().getText());
		
		super.exitRelational_expression(ctx);
	}

	@Override
	public void enterComplex_expression(BagelParser.Complex_expressionContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterComplex_expression(ctx);
	}

	@Override
	public void exitComplex_expression(BagelParser.Complex_expressionContext ctx) {
		// TODO Auto-generated method stub
		
		if (ctx.LOGICAL_KEYWORDS() !=null)
		{
		System.out.println("Logical Keyword : " +ctx.LOGICAL_KEYWORDS().getText());
		icStack.push(ctx.LOGICAL_KEYWORDS().getText());
		}
		super.exitComplex_expression(ctx);
	}

	@Override
	public void enterCondition(BagelParser.ConditionContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterCondition(ctx);
	}

	@Override
	public void exitCondition(BagelParser.ConditionContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitCondition(ctx);
	}

	@Override
	public void enterReturn_statement(BagelParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterReturn_statement(ctx);
	}

	@Override
	public void exitReturn_statement(BagelParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.PRINT_KEYWORD().getText());
		icStack.push(ctx.PRINT_KEYWORD().getText());
		super.exitReturn_statement(ctx);
	}

	@Override
	public void enterWhile_loop(BagelParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterWhile_loop(ctx);
	}

	@Override
	public void exitWhile_loop(BagelParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("WHILE KEYWORD" +ctx.WHILE_KEYWORD().getText());
		icStack.push(ctx.WHILE_KEYWORD().getText());
		System.out.println("OPEN BRACE" +ctx.OPEN_BRACE().getText());
		icStack.push(ctx.OPEN_BRACE().getText());
		System.out.println("CLOSE BRACE" +ctx.CLOSE_BRACE().getText());
		icStack.push(ctx.CLOSE_BRACE().getText());
		super.exitWhile_loop(ctx);
	}

	@Override
	public void enterIf_statement(BagelParser.If_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterIf_statement(ctx);
	}
	//IF_KEYWORD (' ')? condition (' ')? OPEN_BRACE (' ')? statements (' ')? CLOSE_BRACE ((' ')? ELSEIF_KEYWORD (' ')? OPEN_BRACE (' ')? statements (' ')? CLOSE_BRACE)?
	@Override
	public void exitIf_statement(BagelParser.If_statementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("IF KEYWORD" +ctx.IF_KEYWORD().getText());
		icStack.push(ctx.IF_KEYWORD().getText());
		System.out.println("OPEN BRACE" +ctx.OPEN_BRACE().get(0).getText());
		icStack.push(ctx.OPEN_BRACE().get(0).getText());
		System.out.println("CLOSE BRACE" +ctx.CLOSE_BRACE().get(0).getText());
		icStack.push(ctx.CLOSE_BRACE().get(0).getText());
		if (ctx.ELSEIF_KEYWORD() !=null)
		{
			System.out.println("ELSEIF KEYWORD" +ctx.ELSEIF_KEYWORD().getText());
			icStack.push(ctx.ELSEIF_KEYWORD().getText());
			System.out.println("OPEN BRACE" +ctx.OPEN_BRACE().get(1).getText());
			icStack.push(ctx.OPEN_BRACE().get(1).getText());
			System.out.println("CLOSE BRACE" +ctx.CLOSE_BRACE().get(1).getText());
			icStack.push(ctx.CLOSE_BRACE().get(1).getText());
			
		}
		super.exitIf_statement(ctx);
	}

	@Override
	public void enterElse_statement(BagelParser.Else_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterElse_statement(ctx);
	}

	@Override
	public void exitElse_statement(BagelParser.Else_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitElse_statement(ctx);
	}

	@Override
	public void enterIfelse_statement(BagelParser.Ifelse_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterIfelse_statement(ctx);
	}

	@Override
	public void exitIfelse_statement(BagelParser.Ifelse_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitIfelse_statement(ctx);
	}

	@Override
	public void enterConstruct_statement(BagelParser.Construct_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterConstruct_statement(ctx);
	}

	@Override
	public void exitConstruct_statement(BagelParser.Construct_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitConstruct_statement(ctx);
	}

	@Override
	public void enterAssignment_statement(BagelParser.Assignment_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterAssignment_statement(ctx);
	}

	@Override
	public void exitAssignment_statement(BagelParser.Assignment_statementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("ASSIGNMENT OPERATOR : " +ctx.ASSIGNMENT_KEYWORD().getText());
		icStack.push(ctx.ASSIGNMENT_KEYWORD().getText());
		super.exitAssignment_statement(ctx);
	}

	@Override
	public void enterOther_statement(BagelParser.Other_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterOther_statement(ctx);
	}

	@Override
	public void exitOther_statement(BagelParser.Other_statementContext ctx) {
		// TODO Auto-generated method stub
		
		super.exitOther_statement(ctx);
	}

	@Override
	public void enterStatements(BagelParser.StatementsContext ctx) {
		// TODO Auto-generated method stub
		
		super.enterStatements(ctx);
	}

	@Override
	public void exitStatements(BagelParser.StatementsContext ctx) {
		// TODO Auto-generated method stub
		
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
