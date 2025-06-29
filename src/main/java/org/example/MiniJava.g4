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
    | ID '=' expression ';'                                                 # AssignmentStatement
    | expression '.' ID '=' expression ';'                                  # FieldAssignmentStatement
    | expression '[' expression ']' '=' expression ';'                      # ArrayAssignmentStatement
    | expression ';'                                                        # ExpressionStatement
    | type ID ';'                                                           # VariableDeclarationStatement
    | type ID '=' expression ';'                                            # VariableDeclarationWithAssignmentStatement
    | 'System' '.' 'out' '.' 'println' '(' expression ')' ';'               # PrintStatement
    ;

forInit
    : type ID '=' expression                                                # ForInitDeclarationAndAssignment
    | ID '=' expression                                                     # ForInitAssignment
    ;

forUpdate
    : ID '=' expression                                                     # ForUpdateAssignment
    | ID '++'                                                               # ForUpdateIncrementRight
    | ID '--'                                                               # ForUpdateReductionRight
    | '++' ID                                                               # ForUpdateIncrementLeft
    | '--' ID                                                               # ForUpdateReductionLeft
    ;

expression
    : '(' expression ')'                                         # ParenExpression
    | 'new' 'int' '[' expression ']'                             # NewIntArrayExpression
    | 'new' ID '(' argumentList ')'                             # NewObjectExpression
    | expression '[' expression ']'                              # ArrayAccessExpression
    | expression '.' 'length'                                    # ArrayLengthExpression
    | expression '.' ID                                          # FieldExpression
    | expression '.' ID '(' argumentList ')'                    # MethodCallExpression
    | '!' expression                                             # NotExpression
    | '-' expression                                             # UnaryMinusExpression
    | expression op=('*'|'/'|'%') expression                     # BinaryExpression
    | expression op=('+'|'-') expression                         # BinaryExpression
    | expression op=('<'|'<='|'>'|'>='|'=='|'!=') expression     # BinaryExpression
    | expression op='&&' expression                              # BinaryExpression
    | expression op='||' expression                              # BinaryExpression
    | 'this'                                                     # ThisExpression
    | ID                                                         # IdentifierExpression
    | INTEGER                                                    # IntegerExpression
    | 'true'                                                     # BooleanExpression
    | 'false'                                                    # BooleanExpression
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