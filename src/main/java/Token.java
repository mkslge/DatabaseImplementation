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
        return stringLiteralContents != null && stringLiteralContents.isPresent();
    }

    public boolean hasInteger() {
        return integerLiteralContents != null && integerLiteralContents.isPresent();
    }

    public boolean hasDouble() {
        return doubleLiteralContents != null &&doubleLiteralContents.isPresent();
    }

    public boolean hasBoolean() {
        return booleanLiteralContents != null && booleanLiteralContents.isPresent();
    }

    public boolean hasExtraData() {
        return hasString() || hasInteger() || hasDouble() || hasBoolean();
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;

        if(type != token.type) {
            return false;
        }

        if(!hasExtraData()) {
            return true;
        } else if(hasBoolean()) {
            return this.getBoolean() == token.getBoolean();
        } else if(hasInteger()) {
            return this.getInteger() == token.getInteger();
        } else if(hasDouble()) {
            return this.getDouble() == token.getDouble();
        } else if(hasString()) {
            return this.getString().equals(token.getString());
        }
        return false;
    }





}
