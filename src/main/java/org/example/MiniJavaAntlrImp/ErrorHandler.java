package org.example.MiniJavaAntlrImp;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class ErrorHandler {
    private boolean hasErrors = false;

    public void error(Token token, String message) {
        int line = token.getLine();
        int charPosition = token.getCharPositionInLine();
        System.err.printf("Error at line %d:%d - %s\n", line, charPosition, message);
        hasErrors = true;
    }

    public void error(ParserRuleContext ctx, String message) {
        error(ctx.getStart(), message);
    }

    public boolean hasErrors() {
        return hasErrors;
    }
}