
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TokenTest {
    @Test
    public void initalizationTestInteger() {
        Token token = new Token(TokenType.INTEGER, 9);

        assert(token.getType() == TokenType.INTEGER);
        assert(token.hasInteger());
        assert(token.getInteger() == 9);
    }

    @Test
    public void initalizationTestDouble() {
        Token token = new Token(TokenType.DOUBLE, 9.1);

        assert(token.getType() == TokenType.DOUBLE);
        assert(token.hasDouble());
        assert(token.getDouble() == 9.1);
    }

    @Test
    public void initalizationTestString() {
        Token token = new Token(TokenType.STRING, "Movies");

        assert(token.getType() == TokenType.STRING);
        assert(token.hasString());
        assert(token.getString().equals("Movies"));
    }

    @Test
    public void initalizationTestBoolean() {
        Token token = new Token(TokenType.BOOL, true);

        assert(token.getType() == TokenType.BOOL);
        assert(token.hasBoolean());
        assert(token.getBoolean() == true);
    }
}
