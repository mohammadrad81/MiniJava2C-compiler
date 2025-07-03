grammar MiniJava;

// Parser Rules
program
    : mainClass (classDeclaration)* EOF                                                # ProgramDeclar
    ;

mainClass
    : ('public')? 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' statement* '}' '}'    # MainClassDeclaration
    ;

classDeclaration
    : 'class' className=ID ('extends' superClass=ID)? '{' classBody '}'                # ClassDeclar
    ;

classBody
    : (fieldDeclaration | constructorDeclaration | methodDeclaration)*                 # ClasssBodyDeclar
    ;

constructorDeclaration
    : 'public' ID '(' parameterList ')' '{' statement* '}'                             # ConstructorDeclar
    ;

fieldDeclaration
    : type fieldName=ID ';'                                                            # FieldDeclar
    ;

methodDeclaration
    : 'public' (type | 'void') methodName=ID '(' parameterList ')' '{' statement* '}'  # MethodDeclar
    ;


parameterList
    : (parameter (',' parameter)*)?                                                    # ParameterListDeclar
    ;

parameter
    : type ID                                                                          # ParameterDeclar
    ;

type
    : 'int' '[' ']'                                                         # IntArrayType
    | 'boolean'                                                             # BooleanType
    | 'int'                                                                 # IntType
    | ID                                                                    # IdentifierType
    ;

statement
    : '{' statement* '}'                                                    # BlockStatement
    | 'if' '(' expression ')' statement ('else' statement)?                 # IfStatement
    | 'while' '(' expression ')' statement                                  # WhileStatement
    | 'do' statement 'while' '(' expression ')' ';'                         # DoWhileStatement
    | 'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement       # ForStatement
    | 'break' ';'                                                           # BreakStatement
    | 'continue' ';'                                                        # ContinueStatement
    | 'return' ';'                                                          # ReturnNothingStatement
    | 'return' expression ';'                                               # ReturnExpressionStatement
    | varDeclar ';'                                                         # VariableDeclarationStatement
    | varDeclarAssign ';'                                                   # VariableDeclarationWithAssignmentStatement
    | assign ';'                                                            # VariableAssignmentStatement
    | fieldAssign ';'                                                       # FieldAssignmentStatement
    | arrayMemberAssign ';'                                                 # ArrayMemberAssignmentStatement
    | variableMulDivModAddSubAssign ';'                                     # VariableMulDivModAddSubAssignmentStatement
    | fieldMulDivModAddSubAssign ';'                                        # FieldMulDivModAddSubAssignmentStatement
    | arrayMemberMulDivModAddSubAssign ';'                                  # ArrayMemberMulDivModAddSubAssignmentStatement
    | expression ';'                                                        # ExpressionStatement
    | 'System' '.' 'out' '.' 'println' '(' expression ')' ';'               # PrintStatement
    ;

varDeclar
    : type ID                                                               # VariableDeclaration
    ;

varDeclarAssign
    : type ID '=' expression                                                # VariableDeclarationAssignment
    ;

assign
    : ID '=' expression                                                     # Assignment
    ;

variableMulDivModAddSubAssign
    : ID op=('*' | '/' | '%' | '+' | '-')'=' expression                     # VariableMulDivModAddAssignment
    ;


fieldAssign
    : expression '.' ID '=' expression ';'                                  # FieldAssignment
    ;

fieldMulDivModAddSubAssign
    : expression '.' ID op=('*' | '/' | '%' | '+' | '-')'=' expression      # FieldMulDivModAddSubAssignment
    ;

arrayMemberAssign
    : expression '[' expression ']' '=' expression                          # ArrayMemberAssignment
    ;

arrayMemberMulDivModAddSubAssign
    : expression '[' expression ']' op=('*' | '/' | '%' | '+' | '-')'=' expression # ArrayMemberMulDivModAddSubAssignment
    ;




forInit
    : forInitPart (', ' forUpdatePart)*                                     # ForInitParts
    ;

forInitPart
    : varDeclar                                                             # ForInitPartVariableDeclaration
    | varDeclarAssign                                                       # ForInitPartVariableDeclarationAssignment
    | assign                                                                # ForInitPartAssignment
    | variableMulDivModAddSubAssign                                         # ForInitPartVariableMulDivModAddSubAssignment
    | fieldAssign                                                           # ForInitPartFieldAssignment
    | fieldMulDivModAddSubAssign                                            # ForInitPartFieldMulDivModAddSubAssignment
    | arrayMemberAssign                                                     # ForInitPartArrayMemberAssignment
    | arrayMemberMulDivModAddSubAssign                                      # ForInitPartArrayMemberMulDivModAddSubAssignment
    | expression                                                            # ForInitPartExpression
    ;

forUpdate
    : forUpdatePart (', ' forUpdatePart)*                                   # ForUpdateParts
    ;

forUpdatePart
    : assign                                                                # ForUpdatePartAssignment
    | variableMulDivModAddSubAssign                                         # ForUpdatePartVariableMulDivModAddSubAssignment
    | fieldAssign                                                           # ForUpdatePartFieldAssignment
    | fieldMulDivModAddSubAssign                                            # ForUpdatePartFieldMulDivModAddSubAssignment
    | arrayMemberAssign                                                     # ForUpdatePartArrayMemberAssignment
    | arrayMemberMulDivModAddSubAssign                                      # ForUpdatePartArrayMemberMulDivModAddSubAssignment
    | expression                                                            # ForUpdatePartExpression
    ;

expression
    : '(' expression ')'                                         # ParenExpression
    | 'new' 'int' '[' expression ']'                             # NewIntArrayExpression
    | 'new' ID '(' ')'                                           # NewObjectExpression
    | expression '[' expression ']'                              # ArrayAccessExpression
    | expression '.' 'length'                                    # ArrayLengthExpression
    | expression '.' ID                                          # FieldExpression
    | expression '.' ID '++'                                     # FieldIncrementExpression
    | expression '.' ID '--'                                     # FieldDecrementExpression
    | expression '.' ID '(' argumentList ')'                     # MethodCallExpression
    | '!' expression                                             # NotExpression
    | '-' expression                                             # MinusExpression
    | expression op=('*'|'/'|'%') expression                     # MulDivModExpression
    | expression op=('+'|'-') expression                         # AddSubExpression
    | expression op=('<'|'<='|'>'|'>='|'=='|'!=') expression     # CompareExpression
    | expression op='&&' expression                              # AndExpression
    | expression op='||' expression                              # OrExpression
    | 'this'                                                     # ThisExpression
    | ID                                                         # IdExpression
    | (ID '++' | '++' ID)                                        # IdIncrementExpression
    | (ID '--' | '--' ID)                                        # IdDecrementExpression
    | INTEGER                                                    # IntegerExpression
    | 'true'                                                     # TrueExpression
    | 'false'                                                    # FalseExpression
    ;

argumentList
    : (expression (',' expression)*)?                            # ArgumentListDeclar
    ;

// Lexer Rules
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
INTEGER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;

// Comments
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;

// Keywords and operators are handled as string literals in parser rules