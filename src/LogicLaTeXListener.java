// Generated from LogicLaTeX.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicLaTeXParser}.
 */
public interface LogicLaTeXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicLaTeXParser#formula_0}.
	 * @param ctx the parse tree
	 */
	void enterFormula_0(LogicLaTeXParser.Formula_0Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicLaTeXParser#formula_0}.
	 * @param ctx the parse tree
	 */
	void exitFormula_0(LogicLaTeXParser.Formula_0Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicLaTeXParser#formula_1}.
	 * @param ctx the parse tree
	 */
	void enterFormula_1(LogicLaTeXParser.Formula_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link LogicLaTeXParser#formula_1}.
	 * @param ctx the parse tree
	 */
	void exitFormula_1(LogicLaTeXParser.Formula_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link LogicLaTeXParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LogicLaTeXParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicLaTeXParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LogicLaTeXParser.ProgramContext ctx);
}