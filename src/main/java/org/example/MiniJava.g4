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
    : ID op=('*=' | '/=' | '%=' | '+=' | '-=') expression                     # VariableMulDivModAddAssignment
    ;


fieldAssign
    : fieldHaver=expression '.' ID '=' value=expression ';'                              # FieldAssignment
    ;

fieldMulDivModAddSubAssign
    : fieldHaver=expression '.' ID op=('*=' | '/=' | '%=' | '+=' | '-=') value=expression  # FieldMulDivModAddSubAssignment
    ;

arrayMemberMulDivModAddSubAssign
    : array=expression '[' index=expression ']' op=('*=' | '/=' | '%=' | '+=' | '-=' | '=') value=expression # ArrayMemberMulDivModAddSubAssignment
    ;

forInit
    : forInitPart (', ' forInitPart)*                                     # ForInitParts
    ;

forInitPart
    : varDeclar                                                             # ForInitPartVariableDeclaration
    | varDeclarAssign                                                       # ForInitPartVariableDeclarationAssignment
    | assign                                                                # ForInitPartAssignment
    | variableMulDivModAddSubAssign                                         # ForInitPartVariableMulDivModAddSubAssignment
    | fieldAssign                                                           # ForInitPartFieldAssignment
    | fieldMulDivModAddSubAssign                                            # ForInitPartFieldMulDivModAddSubAssignment
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
    | arrayMemberMulDivModAddSubAssign                                      # ForUpdatePartArrayMemberMulDivModAddSubAssignment
    | expression                                                            # ForUpdatePartExpression
    ;

expression
    : '(' expression ')'                                         # ParenExpression // done
    | 'new' 'int' '[' expression ']'                             # NewIntArrayExpression //done
    | 'new' ID '(' ')'                                           # NewObjectExpression //done
    | array=expression '[' index=expression ']'                       # ArrayMemberExpression // done
    | array=expression '[' index=expression ']' op=('++' | '--')      # ArrayMemberIncrementDecrementExpression //done
    | op=('++' | '--') array=expression '[' index=expression ']'      # ArrayMemberIncrementDecrementExpression // done
    | fieldHaver=expression '.' ID                                    # FieldExpression //done
    | fieldHaver=expression '.' ID op=('++' | '--')                   # FieldIncrementDecrementExpression // done
    | methodHaver=expression '.' ID '(' argumentList ')'              # MethodCallExpression // done
    | '!' expression                                             # NotExpression // done
    | '-' expression                                             # MinusExpression //done
    | leftSide=expression op=('*'|'/'|'%') rightSide=expression                     # IntegerBinaryExpression // done
    | leftSide=expression op=('+'|'-') rightSide=expression                         # IntegerBinaryExpression // done
    | leftSide=expression op=('<'|'<='|'>'|'>='|'=='|'!=') rightSide=expression     # CompareExpression
    | leftSide=expression op='&&' rightSide=expression                              # BooleanExpression //done
    | leftSide=expression op='||' rightSide=expression                              # BooleanExpression //done
    | 'this'                                                     # ThisExpression // done
    | ID                                                         # IdExpression // done
    | (ID op=('++' | '--') | op=('++' | '--') ID)                # IdIncrementDecrementExpression // done
    | INTEGER                                                    # IntegerExpression //done
    | value=('true' | 'false')                                   # TrueFalseExpression //done
    | 'null'                                                     # NullExpression // done
    | '(' ID ')' expression                                      # CastExpression
    ;

argumentList
    : (expression (',' expression)*)?                            # ArgumentListDeclar // done
    ;

// Lexer Rules
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
INTEGER : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;

// Comments
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;

// Keywords and operators are handled as string literals in parser rules