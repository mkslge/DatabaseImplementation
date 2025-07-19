import java.util.Optional;

public class Token {
    private TokenType type;
    private Optional<String> stringLiteralContents;
    private Optional<Integer> integerLiteralContents;
    private Optional<Double> doubleLiteralContents;
    private Optional<Boolean> booleanLiteralContents;

    public Token(TokenType type) {
        this.type = type;
    }

    public Token(TokenType type, String contents) {
        this.type = type;
        this.stringLiteralContents = Optional.of(contents);
    }

    public Token(TokenType type, int contents) {
        this.type = type;
        this.integerLiteralContents = Optional.of(contents);
    }

    public Token(TokenType type, double contents) {
        this.type = type;
        this.doubleLiteralContents = Optional.of(contents);
    }

    public Token(TokenType type, boolean contents) {
        this.type = type;
        this.booleanLiteralContents = Optional.of(contents);
    }

    public boolean hasString() {
        return stringLiteralContents.isPresent();
    }

    public boolean hasInteger() {
        return integerLiteralContents.isPresent();
    }

    public boolean hasDouble() {
        return doubleLiteralContents.isPresent();
    }

    public boolean hasBoolean() {
        return booleanLiteralContents.isPresent();
    }

    public String getString() {
        return stringLiteralContents.get();
    }

    public int getInteger() {
        return integerLiteralContents.get();
    }

    public double getDouble() {
        return doubleLiteralContents.get();
    }

    public boolean getBoolean() {
        return booleanLiteralContents.get();
    }



    public TokenType getType() {
        return this.type;
    }



}
