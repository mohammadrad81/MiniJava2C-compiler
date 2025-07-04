// Generated from MiniJava.g4 by ANTLR 4.9.3
package org.example.MiniJavaAntlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ProgramDeclar}
	 * labeled alternative in {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDeclar(MiniJavaParser.ProgramDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainClassDeclaration}
	 * labeled alternative in {@link MiniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclar}
	 * labeled alternative in {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclar(MiniJavaParser.ClassDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClasssBodyDeclar}
	 * labeled alternative in {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasssBodyDeclar(MiniJavaParser.ClasssBodyDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDeclar}
	 * labeled alternative in {@link MiniJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclar(MiniJavaParser.ConstructorDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldDeclar}
	 * labeled alternative in {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclar(MiniJavaParser.FieldDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDeclar}
	 * labeled alternative in {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclar(MiniJavaParser.MethodDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterListDeclar}
	 * labeled alternative in {@link MiniJavaParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListDeclar(MiniJavaParser.ParameterListDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterDeclar}
	 * labeled alternative in {@link MiniJavaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclar(MiniJavaParser.ParameterDeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntArrayType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(MiniJavaParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MiniJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(MiniJavaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniJavaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(MiniJavaParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(MiniJavaParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnNothingStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnNothingStatement(MiniJavaParser.ReturnNothingStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnExpressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpressionStatement(MiniJavaParser.ReturnExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(MiniJavaParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationWithAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithAssignmentStatement(MiniJavaParser.VariableDeclarationWithAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(MiniJavaParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAssignmentStatement(MiniJavaParser.FieldAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMemberAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMemberAssignmentStatement(MiniJavaParser.ArrayMemberAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableMulDivModAddSubAssignmentStatement(MiniJavaParser.VariableMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldMulDivModAddSubAssignmentStatement(MiniJavaParser.FieldMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMemberMulDivModAddSubAssignmentStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMemberMulDivModAddSubAssignmentStatement(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MiniJavaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MiniJavaParser#varDeclar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MiniJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationAssignment}
	 * labeled alternative in {@link MiniJavaParser#varDeclarAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAssignment(MiniJavaParser.VariableDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link MiniJavaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniJavaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableMulDivModAddAssignment}
	 * labeled alternative in {@link MiniJavaParser#variableMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableMulDivModAddAssignment(MiniJavaParser.VariableMulDivModAddAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#fieldAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAssignment(MiniJavaParser.FieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#fieldMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldMulDivModAddSubAssignment(MiniJavaParser.FieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMemberAssignment}
	 * labeled alternative in {@link MiniJavaParser#arrayMemberAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMemberAssignment(MiniJavaParser.ArrayMemberAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#arrayMemberMulDivModAddSubAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitParts}
	 * labeled alternative in {@link MiniJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitParts(MiniJavaParser.ForInitPartsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartVariableDeclaration}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartVariableDeclaration(MiniJavaParser.ForInitPartVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartVariableDeclarationAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartVariableDeclarationAssignment(MiniJavaParser.ForInitPartVariableDeclarationAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartAssignment(MiniJavaParser.ForInitPartAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartVariableMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartVariableMulDivModAddSubAssignment(MiniJavaParser.ForInitPartVariableMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartFieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartFieldAssignment(MiniJavaParser.ForInitPartFieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartFieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartFieldMulDivModAddSubAssignment(MiniJavaParser.ForInitPartFieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartArrayMemberAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartArrayMemberAssignment(MiniJavaParser.ForInitPartArrayMemberAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForInitPartArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitPartExpression}
	 * labeled alternative in {@link MiniJavaParser#forInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitPartExpression(MiniJavaParser.ForInitPartExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateParts}
	 * labeled alternative in {@link MiniJavaParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateParts(MiniJavaParser.ForUpdatePartsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartAssignment(MiniJavaParser.ForUpdatePartAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartVariableMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartVariableMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartVariableMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartFieldAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartFieldAssignment(MiniJavaParser.ForUpdatePartFieldAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartFieldMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartFieldMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartFieldMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartArrayMemberAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartArrayMemberAssignment(MiniJavaParser.ForUpdatePartArrayMemberAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartArrayMemberMulDivModAddSubAssignment}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartArrayMemberMulDivModAddSubAssignment(MiniJavaParser.ForUpdatePartArrayMemberMulDivModAddSubAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdatePartExpression}
	 * labeled alternative in {@link MiniJavaParser#forUpdatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdatePartExpression(MiniJavaParser.ForUpdatePartExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecrementExpression(MiniJavaParser.FieldDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(MiniJavaParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(MiniJavaParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldIncrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldIncrementExpression(MiniJavaParser.FieldIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(MiniJavaParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(MiniJavaParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpression(MiniJavaParser.MulDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewObjectExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjectExpression(MiniJavaParser.NewObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpression(MiniJavaParser.FieldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdDecrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDecrementExpression(MiniJavaParser.IdDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(MiniJavaParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMemberExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMemberExpression(MiniJavaParser.ArrayMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(MiniJavaParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpression(MiniJavaParser.TrueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(MiniJavaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(MiniJavaParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(MiniJavaParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(MiniJavaParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdIncrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdIncrementExpression(MiniJavaParser.IdIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMemberIncrementExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMemberIncrementExpression(MiniJavaParser.ArrayMemberIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewIntArrayExpression(MiniJavaParser.NewIntArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpression(MiniJavaParser.FalseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentListDeclar}
	 * labeled alternative in {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentListDeclar(MiniJavaParser.ArgumentListDeclarContext ctx);
}