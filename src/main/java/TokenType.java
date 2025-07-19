public enum TokenType {
    SELECT,
    FROM,
    WHERE,
    INSERT,
    INTO,
    VALUES,
    UPDATE,
    SET,
    DELETE,

    CREATE,
    TABLE,
    DROP,
    ALTER,
    ADD,
    PRIMARY,
    KEY,
    FOREIGN,

    JOIN,
    INNER,
    LEFT,
    RIGHT,
    FULL,
    ON,
    AS,

    GROUP,
    ORDER,
    BY,
    HAVING,
    DISTINCT,
    LIMIT,
    OFFSET,

    INTEGER, STRING, DOUBLE, BOOL,

    AND,
    OR,
    NOT,
    IN,
    IS,
    NULL,
    LIKE,
    BETWEEN,
    EXISTS,

    PLUS,           // +
    MINUS,          // -
    STAR,           // *
    SLASH,          // /
    PERCENT,        // %

    EQ,             // =
    NEQ,            // != or <>
    LT,             // <
    LTE,            // <=
    GT,             // >
    GTE,            // >=

    LPAREN,         // (
    RPAREN,         // )
    COMMA,          // ,
    DOT,            // .
    SEMICOLON,      // ;

    STRING_LITERAL,
    NUMERIC_LITERAL,
    IDENTIFIER,
    BOOLEAN_LITERAL,

    LINE_COMMENT, BLOCK_COMMENT,

    NULL_LITERAL,
    EOF,                // End of input



    Token() {

    }



}
