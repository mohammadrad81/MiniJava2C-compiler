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
    : fieldHaver=expression '.' ID '=' value=expression ';'                              # FieldAssignment
    ;

fieldMulDivModAddSubAssign
    : fieldHaver=expression '.' ID op=('*' | '/' | '%' | '+' | '-')'=' value=expression  # FieldMulDivModAddSubAssignment
    ;

arrayMemberAssign
    : array=expression '[' index=expression ']' '=' value=expression                          # ArrayMemberAssignment
    ;

arrayMemberMulDivModAddSubAssign
    : array=expression '[' index=expression ']' op=('*' | '/' | '%' | '+' | '-')'=' value=expression # ArrayMemberMulDivModAddSubAssignment
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
    | array=expression '[' index=expression ']'                              # ArrayMemberExpression
    | array=expression '[' index=expression ']' '++'                         # ArrayMemberIncrementExpression
    | array=expression '.' 'length'                                    # ArrayLengthExpression
    | fieldHaver=expression '.' ID                                          # FieldExpression
    | fieldHaver=expression '.' ID '++'                                     # FieldIncrementExpression
    | fieldHaver=expression '.' ID '--'                                     # FieldDecrementExpression
    | fieldHaver=expression '.' ID '(' argumentList ')'                     # MethodCallExpression
    | '!' expression                                             # NotExpression
    | '-' expression                                             # MinusExpression
    | leftSide=expression op=('*'|'/'|'%') rightSide=expression                     # MulDivModExpression
    | leftSide=expression op=('+'|'-') rightSide=expression                         # AddSubExpression
    | leftSide=expression op=('<'|'<='|'>'|'>='|'=='|'!=') rightSide=expression     # CompareExpression
    | leftSide=expression op='&&' rightSide=expression                              # AndExpression
    | leftSide=expression op='||' rightSide=expression                              # OrExpression
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