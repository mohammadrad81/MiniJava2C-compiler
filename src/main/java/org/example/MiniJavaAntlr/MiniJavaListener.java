// Generated from MiniJava.g4 by ANTLR 4.9.3
package org.example.MiniJavaAntlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ProgramDeclar}
	 * labeled alternative in {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramDeclar}
	 * labeled alternative in {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainClassDeclaration}
	 * labeled alternative in {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainClassDeclaration}
	 * labeled alternative in {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclar}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclar(MiniJavaParser.ClassDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclar}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclar(MiniJavaParser.ClassDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClasssBodyDeclar}
	 * labeled alternative in {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClasssBodyDeclar(MiniJavaParser.ClasssBodyDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClasssBodyDeclar}
	 * labeled alternative in {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClasssBodyDeclar(MiniJavaParser.ClasssBodyDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclar}
	 * labeled alternative in {@link MiniJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclar(MiniJavaParser.ConstructorDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclar}
	 * labeled alternative in {@link MiniJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclar(MiniJavaParser.ConstructorDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldDeclar}
	 * labeled alternative in {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclar(MiniJavaParser.FieldDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldDeclar}
	 * labeled alternative in {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclar(MiniJavaParser.FieldDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDeclar}
	 * labeled alternative in {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclar(MiniJavaParser.MethodDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDeclar}
	 * labeled alternative in {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclar(MiniJavaParser.MethodDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterListDeclar}
	 * labeled alternative in {@link MiniJavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterListDeclar(MiniJavaParser.ParameterListDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterListDeclar}
	 * labeled alternative in {@link MiniJavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterListDeclar(MiniJavaParser.ParameterListDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterDeclar}
	 * labeled alternative in {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclar(MiniJavaParser.ParameterDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterDeclar}
	 * labeled alternative in {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclar(MiniJavaParser.ParameterDeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntArrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntArrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(MiniJavaParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(MiniJavaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(MiniJavaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniJavaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniJavaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MiniJavaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MiniJavaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MiniJavaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MiniJavaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnNothingStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnNothingStatement(MiniJavaParser.ReturnNothingStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnNothingStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnNothingStatement(MiniJavaParser.ReturnNothingStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpressionStatement(MiniJavaParser.ReturnExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpressionStatement(MiniJavaParser.ReturnExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MiniJavaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MiniJavaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFieldAssignmentStatement(MiniJavaParser.FieldAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFieldAssignmentStatement(MiniJavaParser.FieldAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentStatement(MiniJavaParser.ArrayAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(MiniJavaParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(MiniJavaParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationWithAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationWithAssignmentStatement(MiniJavaParser.VariableDeclarationWithAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationWithAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationWithAssignmentStatement(MiniJavaParser.VariableDeclarationWithAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitDeclarationAndAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitDeclarationAndAssignment(MiniJavaParser.ForInitDeclarationAndAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitDeclarationAndAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitDeclarationAndAssignment(MiniJavaParser.ForInitDeclarationAndAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitAssignment(MiniJavaParser.ForInitAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitAssignment(MiniJavaParser.ForInitAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateAssignment(MiniJavaParser.ForUpdateAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateAssignment(MiniJavaParser.ForUpdateAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateIncrementRight}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateIncrementRight(MiniJavaParser.ForUpdateIncrementRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateIncrementRight}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateIncrementRight(MiniJavaParser.ForUpdateIncrementRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateReductionRight}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateReductionRight(MiniJavaParser.ForUpdateReductionRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateReductionRight}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateReductionRight(MiniJavaParser.ForUpdateReductionRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateIncrementLeft}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateIncrementLeft(MiniJavaParser.ForUpdateIncrementLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateIncrementLeft}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateIncrementLeft(MiniJavaParser.ForUpdateIncrementLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateReductionLeft}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateReductionLeft(MiniJavaParser.ForUpdateReductionLeftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateReductionLeft}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateReductionLeft(MiniJavaParser.ForUpdateReductionLeftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(MiniJavaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(MiniJavaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(MiniJavaParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(MiniJavaParser.IntegerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewObjectExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewObjectExpression(MiniJavaParser.NewObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewObjectExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewObjectExpression(MiniJavaParser.NewObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpression(MiniJavaParser.FieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpression(MiniJavaParser.FieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MiniJavaParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MiniJavaParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(MiniJavaParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(MiniJavaParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(MiniJavaParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(MiniJavaParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(MiniJavaParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(MiniJavaParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(MiniJavaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(MiniJavaParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArrayExpression(MiniJavaParser.NewIntArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArrayExpression(MiniJavaParser.NewIntArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentListDeclar}
	 * labeled alternative in {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentListDeclar(MiniJavaParser.ArgumentListDeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentListDeclar}
	 * labeled alternative in {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentListDeclar(MiniJavaParser.ArgumentListDeclarContext ctx);
}