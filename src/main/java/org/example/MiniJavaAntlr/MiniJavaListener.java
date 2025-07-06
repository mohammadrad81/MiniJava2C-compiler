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
	 * Enter a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableMulDivModAddSubAssignmentStatement(MiniJavaParser.VariableMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableMulDivModAddSubAssignmentStatement(MiniJavaParser.VariableMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFieldMulDivModAddSubAssignmentStatement(MiniJavaParser.FieldMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFieldMulDivModAddSubAssignmentStatement(MiniJavaParser.FieldMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayMemberMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayMemberMulDivModAddSubAssignmentStatement(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayMemberMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayMemberMulDivModAddSubAssignmentStatement(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MiniJavaParser#varDeclar}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MiniJavaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MiniJavaParser#varDeclar}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MiniJavaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationAssignment}
	 * labeled alternative in {@link MiniJavaParser#varDeclarAssign}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAssignment(MiniJavaParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationAssignment}
	 * labeled alternative in {@link MiniJavaParser#varDeclarAssign}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAssignment(MiniJavaParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link MiniJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link MiniJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableMulDivModAddAssignment}
	 * labeled alternative in {@link MiniJavaParser#variableMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 */
	void enterVariableMulDivModAddAssignment(MiniJavaParser.VariableMulDivModAddAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableMulDivModAddAssignment}
	 * labeled alternative in {@link MiniJavaParser#variableMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 */
	void exitVariableMulDivModAddAssignment(MiniJavaParser.VariableMulDivModAddAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#fieldAssign}.
	 * @param ctx the parse tree
	 */
	void enterFieldAssignment(MiniJavaParser.FieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#fieldAssign}.
	 * @param ctx the parse tree
	 */
	void exitFieldAssignment(MiniJavaParser.FieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#fieldMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 */
	void enterFieldMulDivModAddSubAssignment(MiniJavaParser.FieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#fieldMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 */
	void exitFieldMulDivModAddSubAssignment(MiniJavaParser.FieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#arrayMemberMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#arrayMemberMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitParts}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInitParts(MiniJavaParser.ForInitPartsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitParts}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInitParts(MiniJavaParser.ForInitPartsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartVariableDeclaration}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartVariableDeclaration(MiniJavaParser.ForInitPartVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartVariableDeclaration}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartVariableDeclaration(MiniJavaParser.ForInitPartVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartVariableDeclarationAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartVariableDeclarationAssignment(MiniJavaParser.ForInitPartVariableDeclarationAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartVariableDeclarationAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartVariableDeclarationAssignment(MiniJavaParser.ForInitPartVariableDeclarationAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartAssignment(MiniJavaParser.ForInitPartAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartAssignment(MiniJavaParser.ForInitPartAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartVariableMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartVariableMulDivModAddSubAssignment(MiniJavaParser.ForInitPartVariableMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartVariableMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartVariableMulDivModAddSubAssignment(MiniJavaParser.ForInitPartVariableMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartFieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartFieldAssignment(MiniJavaParser.ForInitPartFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartFieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartFieldAssignment(MiniJavaParser.ForInitPartFieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartFieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartFieldMulDivModAddSubAssignment(MiniJavaParser.ForInitPartFieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartFieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartFieldMulDivModAddSubAssignment(MiniJavaParser.ForInitPartFieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForInitPartArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForInitPartArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInitPartExpression}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void enterForInitPartExpression(MiniJavaParser.ForInitPartExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitPartExpression}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 */
	void exitForInitPartExpression(MiniJavaParser.ForInitPartExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateParts}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateParts(MiniJavaParser.ForUpdatePartsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateParts}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateParts(MiniJavaParser.ForUpdatePartsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdatePartAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void enterForUpdatePartAssignment(MiniJavaParser.ForUpdatePartAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdatePartAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void exitForUpdatePartAssignment(MiniJavaParser.ForUpdatePartAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdatePartVariableMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void enterForUpdatePartVariableMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartVariableMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdatePartVariableMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void exitForUpdatePartVariableMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartVariableMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdatePartFieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void enterForUpdatePartFieldAssignment(MiniJavaParser.ForUpdatePartFieldAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdatePartFieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void exitForUpdatePartFieldAssignment(MiniJavaParser.ForUpdatePartFieldAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdatePartFieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void enterForUpdatePartFieldMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartFieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdatePartFieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void exitForUpdatePartFieldMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartFieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdatePartArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void enterForUpdatePartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdatePartArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void exitForUpdatePartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdatePartExpression}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void enterForUpdatePartExpression(MiniJavaParser.ForUpdatePartExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdatePartExpression}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 */
	void exitForUpdatePartExpression(MiniJavaParser.ForUpdatePartExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerBinaryExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerBinaryExpression(MiniJavaParser.IntegerBinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerBinaryExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerBinaryExpression(MiniJavaParser.IntegerBinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayMemberIncrementDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayMemberIncrementDecrementExpression(MiniJavaParser.ArrayMemberIncrementDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayMemberIncrementDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayMemberIncrementDecrementExpression(MiniJavaParser.ArrayMemberIncrementDecrementExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(MiniJavaParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(MiniJavaParser.CompareExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code NullExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(MiniJavaParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(MiniJavaParser.NullExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code IdIncrementDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdIncrementDecrementExpression(MiniJavaParser.IdIncrementDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdIncrementDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdIncrementDecrementExpression(MiniJavaParser.IdIncrementDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayMemberExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayMemberExpression(MiniJavaParser.ArrayMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayMemberExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayMemberExpression(MiniJavaParser.ArrayMemberExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(MiniJavaParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(MiniJavaParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldIncrementDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldIncrementDecrementExpression(MiniJavaParser.FieldIncrementDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldIncrementDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldIncrementDecrementExpression(MiniJavaParser.FieldIncrementDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(MiniJavaParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(MiniJavaParser.IdExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(MiniJavaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(MiniJavaParser.CastExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code TrueFalseExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseExpression(MiniJavaParser.TrueFalseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueFalseExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseExpression(MiniJavaParser.TrueFalseExpressionContext ctx);
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