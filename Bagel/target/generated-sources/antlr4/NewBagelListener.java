import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NewBagelListener extends BagelBaseListener {
	int flag = 0;

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
		
		icStack.push("DECLARE " + ctx.DATATYPE().getText() + " " + ctx.identifier().getText());
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
		
		if (flag == 0) {
			for (int i = 0; i < ctx.term().size(); i++) {
				if (ctx.term().get(i).identifier() != null)
					icStack.push("GET " + ctx.term().get(i).identifier().getText());
				if (ctx.term().get(i).integer_literal() != null)
					icStack.push("STORE " + ctx.term().get(i).integer_literal().getText());

			}
			if (ctx.operator() != null)
				icStack.push("OPERATOR " + ctx.operator().getText());
		}
		
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

		
		icStack.push("COMPARE " + ctx.COMPARISON_KEYWORDS().getText());

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
		icStack.push("CONDITIONNOTTRUE JUMP LABELELSE");
		icStack.push("SCOPEBEGIN");
		super.exitCondition(ctx);
	}

	@Override
	public void enterReturn_statement(BagelParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		flag = 1;
		super.enterReturn_statement(ctx);
	}

	@Override
	public void exitReturn_statement(BagelParser.Return_statementContext ctx) {
		// TODO Auto-generated method stub
		flag = 0;
		
		String q = "";
		if (!(ctx.QUOTE().isEmpty()))
			q = "\"";
		icStack.push("PRINT " + q + ctx.complex_expression().getText() + q);
		super.exitReturn_statement(ctx);
	}

	@Override
	public void enterWhile_loop(BagelParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		icStack.push("WHILESCOPEBEGIN");
		super.enterWhile_loop(ctx);
	}

	@Override
	public void exitWhile_loop(BagelParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		
		icStack.push("JUMPBACK WHILESCOPEBEGIN");
		icStack.push("SCOPEEND");
		icStack.push("LABELELSE");
		super.exitWhile_loop(ctx);
	}

	@Override
	public void enterIf_statement(BagelParser.If_statementContext ctx) {
		// TODO Auto-generated method stub

		super.enterIf_statement(ctx);
	}

	
	@Override
	public void exitIf_statement(BagelParser.If_statementContext ctx) {
		// TODO Auto-generated method stub
		icStack.push("IFSCOPEEND");
		icStack.push("JUMP ELSESCOPEEND");
		
		super.exitIf_statement(ctx);
	}

	@Override
	public void enterElse_statement(BagelParser.Else_statementContext ctx) {
		// TODO Auto-generated method stub
		icStack.push("LABELELSE");
		icStack.push("ELSESCOPEBEGIN");
		super.enterElse_statement(ctx);
	}

	@Override
	public void exitElse_statement(BagelParser.Else_statementContext ctx) {
		// TODO Auto-generated method stub
		icStack.push("ELSESCOPEEND");
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
		
		icStack.push("PUSH " + ctx.term().identifier().getText());
		
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
		
	}

	@Override
	public void exitProgram(BagelParser.ProgramContext ctx) {
		

		try {
			String currDIr = System.getProperty("user.dir");
			String fileName = currDIr + "/Samples/IntermediateCode/IntermediateCode.bgi";
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			ArrayList<String> a = new ArrayList<>();
			while (!(icStack.isEmpty())) {
				// System.out.println("Stack pop : "+icStack.pop());
				a.add(icStack.pop());
			}
			for (int i = a.size() - 1; i >= 0; i--) {
				pw.println(a.get(i));
			}
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
