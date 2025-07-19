
import java.util.*;
public class Lexer {
    private String input;
    private String [] splitInput;
    private List<Token> tokenizedOutput;

    public Lexer(String input) {
        this.input = input;
        this.splitInput = input.split(" ");
        tokenizedOutput = new ArrayList<>();
        this.lex();
    }

    private void lex() {
        for(int i = 0; i < splitInput.length; i++) {
            String tokenToUpper = splitInput[i].toUpperCase();
            if(tokenToUpper.equals("SELECT")) {
                addToken(TokenType.SELECT);
            } else if(tokenToUpper.equals("FROM")) {
                addToken(TokenType.FROM);
            } else if(tokenToUpper.equals("WHERE")) {
                addToken(TokenType.WHERE);
            } else if(tokenToUpper.equals("INSERT")) {
                addToken(TokenType.INSERT);
            } else if(tokenToUpper.equals("INTO")) {
                addToken(TokenType.INTO);
            } else if(tokenToUpper.equals("VALUES")) {
                addToken(TokenType.VALUES);
            } else if(tokenToUpper.equals("UPDATE")) {
                addToken(TokenType.UPDATE);
            } else if(tokenToUpper.equals("SET")) {
                addToken(TokenType.SET);
            } else if(tokenToUpper.equals("DELETE")) {
                addToken(TokenType.DELETE);
            } else if(tokenToUpper.equals("CREATE")) {
                addToken(TokenType.CREATE);
            } else if(tokenToUpper.equals("TABLE")) {
                addToken(TokenType.TABLE);
            } else if(tokenToUpper.equals("DROP")) {
                addToken(TokenType.DROP);
            } else if(tokenToUpper.equals("ALTER")) {
                addToken(TokenType.ALTER);
            } else if(tokenToUpper.equals("ADD")) {
                addToken(TokenType.ADD);
            } else if(tokenToUpper.equals("PRIMARY")) {
                addToken(TokenType.PRIMARY);
            } else if(tokenToUpper.equals("KEY")) {
                addToken(TokenType.KEY);
            } else if(tokenToUpper.equals("FOREIGN")) {
                addToken(TokenType.FOREIGN);
            } else if(tokenToUpper.equals("JOIN")) {
                addToken(TokenType.JOIN);
            } else if(tokenToUpper.equals("INNER")) {
                addToken(TokenType.INNER);
            } else if(tokenToUpper.equals("LEFT")) {
                addToken(TokenType.LEFT);
            } else if(tokenToUpper.equals("RIGHT")) {
                addToken(TokenType.RIGHT);
            } else if(tokenToUpper.equals("FULL")) {
                addToken(TokenType.FULL);
            } else if(tokenToUpper.equals("ON")) {
                addToken(TokenType.ON);
            } else if(tokenToUpper.equals("AS")) {
                addToken(TokenType.AS);
            } else if(tokenToUpper.equals("GROUP")) {
                addToken(TokenType.GROUP);
            } else if(tokenToUpper.equals("ORDER")) {
                addToken(TokenType.ORDER);
            } else if(tokenToUpper.equals("BY")) {
                addToken(TokenType.BY);
            } else if(tokenToUpper.equals("HAVING")) {
                addToken(TokenType.HAVING);
            } else if(tokenToUpper.equals("DISTINCT")) {
                addToken(TokenType.DISTINCT);
            } else if(tokenToUpper.equals("LIMIT")) {
                addToken(TokenType.LIMIT);
            } else if(tokenToUpper.equals("OFFSET")) {
                addToken(TokenType.OFFSET);
            } else if(tokenToUpper.equals("AND")) {
                addToken(TokenType.AND);
            } else if(tokenToUpper.equals("OR")) {
                addToken(TokenType.OR);
            } else if(tokenToUpper.equals("NOT")) {
                addToken(TokenType.NOT);
            } else if(tokenToUpper.equals("IN")) {
                addToken(TokenType.IN);
            } else if(tokenToUpper.equals("IS")) {
                addToken(TokenType.IS);
            } else if(tokenToUpper.equals("NULL")) {
                addToken(TokenType.NULL);
            } else if(tokenToUpper.equals("LIKE")) {
                addToken(TokenType.LIKE);
            } else if(tokenToUpper.equals("BETWEEN")) {
                addToken(TokenType.BETWEEN);
            } else if(tokenToUpper.equals("EXISTS")) {
                addToken(TokenType.EXISTS);
            } else if(tokenToUpper.equals("+")) {
                addToken(TokenType.PLUS);
            } else if(tokenToUpper.equals("-")) {
                addToken(TokenType.MINUS);
            } else if(tokenToUpper.equals("*")) {
                addToken(TokenType.STAR);
            } else if(tokenToUpper.equals("/")) {
                addToken(TokenType.SLASH);
            } else if(tokenToUpper.equals("%")) {
                addToken(TokenType.PERCENT);
            } else if(tokenToUpper.equals("=")) {
                addToken(TokenType.EQ);
            } else if(tokenToUpper.equals("!=")) {
                addToken(TokenType.NEQ);
            } else if(tokenToUpper.equals("<")) {
                addToken(TokenType.LT);
            } else if(tokenToUpper.equals("<=")) {
                addToken(TokenType.LTE);
            } else if(tokenToUpper.equals(">")) {
                addToken(TokenType.GT);
            } else if(tokenToUpper.equals(">=")) {
                addToken(TokenType.GTE);
            } else if(tokenToUpper.equals("(")) {
                addToken(TokenType.LPAREN);
            } else if(tokenToUpper.equals(")")) {
                addToken(TokenType.RPAREN);
            } else if(tokenToUpper.equals(",")) {
                addToken(TokenType.COMMA);
            } else if(tokenToUpper.equals(".")) {
                addToken(TokenType.DOT);
            } else if(tokenToUpper.equals(";")) {
                addToken(TokenType.SEMICOLON);
            } else if(tokenToUpper.equals("STRING")) {
                addToken(TokenType.STRING);
            } else if(tokenToUpper.equals("INTEGER")) {
                addToken(TokenType.INTEGER);
            } else if(tokenToUpper.equals("DOUBLE")) {
                addToken(TokenType.DOUBLE);
            } else if(tokenToUpper.equals("BOOLEAN")) {
                addToken(TokenType.BOOL);
            } else if(tokenToUpper.equals("--,")) {
                addToken(TokenType.LINE_COMMENT);
            }
        }
    }

    private void addToken(TokenType tokenType) {
        tokenizedOutput.add(new Token(tokenType));
    }


}
