public enum TokenType {

    // Keywords - Data Manipulation
    SELECT, FROM, WHERE, INSERT, INTO, VALUES, UPDATE, SET, DELETE,

    // Keywords - Data Definition
    CREATE, TABLE, DROP, ALTER, ADD, PRIMARY, KEY, FOREIGN,

    // Keywords - Joins
    JOIN, INNER, LEFT, RIGHT, FULL, ON, AS,

    // Keywords - Grouping and Sorting
    GROUP, ORDER, BY, HAVING, DISTINCT, LIMIT, OFFSET,

    // Data Types
    INTEGER, STRING, DOUBLE, BOOL,

    // Logical Operators
    AND, OR, NOT, IN, IS, NULL, LIKE, BETWEEN, EXISTS,

    // Arithmetic Operators
    PLUS, MINUS, STAR, SLASH, PERCENT,     // + - * / %

    // Comparison Operators
    EQ, NEQ, LT, LTE, GT, GTE,             // = != <> < <= > >=

    // Symbols
    LPAREN, RPAREN, COMMA, DOT, SEMICOLON, // ( ) , . ;

    // Literals
    STRING_LITERAL, NUMERIC_LITERAL, IDENTIFIER, BOOLEAN_LITERAL, NULL_LITERAL,

    // Comments
    LINE_COMMENT, BLOCK_COMMENT,

    // Special
    EOF
}
