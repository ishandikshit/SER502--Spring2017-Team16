grammar Bagel;

DIGIT : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;

LETTER : ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G'
       | 'H' | 'I' | 'J' | 'K' | 'L' | 'M' | 'N'
       | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U'
       | 'V' | 'W' | 'X' | 'Y' | 'Z' | 'a' | 'b'
       | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i'
       | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p'
       | 'q' | 'r' | 's' | 't' | 'u' | 'v' | 'w'
       | 'x' | 'y' | 'z') ;


SYMBOL : ('[' | ']' | '<' | '>'
        '=' | '|' 
       | '.' | ',' | ';' |'_');

QUOTE : '"';
ADDITION_OPERATOR : '+';
SUBTRACTION_OPERATOR : '-';
MULTIPLICATION_OPERATOR : '*';
DIVISION_OPERATOR : '/';

character : (LETTER | DIGIT | SYMBOL);
//SYMBOL: ;


identifier : (LETTER) (LETTER)*;  //CHANGE NEEDED
//sentence : identifier (WHITESPACE identifier)?; //Hello World

COMPARISON_KEYWORDS : ('Equals' | 'GreaterThan' | 'LessThan' | 'LessThanEqual' | 'GreaterThanEqual' | 'NotEqual') ;

ASSIGNMENT_KEYWORD : 'is' ;

WHITESPACE : ('\\u0020' | '\t' | '\r' | '\n' | '\f') ;

IF_KEYWORD : 'if' ;
THEN_KEYWORD : 'then' ;
ELSE_KEYWORD : 'else' ;
ELSEIF_KEYWORD : 'elif' ;
PRINT_KEYWORD : 'print' ;
WHILE_KEYWORD : 'while' ;

OPEN_BRACE : '{' ;
CLOSE_BRACE : '}' ;

OPEN_BRACKET : '(' ;
CLOSE_BRACKET : ')' ;


LOGICAL_KEYWORDS : ('AND' | 'OR' | 'NOT') ;

BOOLEAN_KEYWORDS : ('true' | 'false') ;

DATATYPE : ('Integer' | 'Float' | 'Boolean') ;

integer_literal : (('+'|'-')? DIGIT+) ; 		

float_literal : (('+'|'-')? DIGIT'.'DIGIT+);		

operator : (ADDITION_OPERATOR | SUBTRACTION_OPERATOR | MULTIPLICATION_OPERATOR | DIVISION_OPERATOR);		

declaration_statement : DATATYPE ' ' identifier ; 		

term : integer_literal | float_literal | identifier | BOOLEAN_KEYWORDS ;	

basic_expression : term | (term (' ')?('\n')?operator(' ')?('\n')? term) ;	

relational_expression : (basic_expression (' ')?('\n')? COMPARISON_KEYWORDS (' ')?('\n')? basic_expression) ;	

complex_expression : basic_expression |relational_expression  ; 

condition : complex_expression ; 

return_statement : PRINT_KEYWORD (' ')? (QUOTE)? complex_expression (QUOTE)?; 

while_loop : (WHILE_KEYWORD (' ')? condition (' ')? OPEN_BRACE (' ')? statements (' ')? CLOSE_BRACE) ; 

if_statement: IF_KEYWORD (' ')?('\n')? condition (' ')?('\n')? OPEN_BRACE (' ')?('\n')? statements (' ')?('\n')? CLOSE_BRACE ((' ')?('\n')? ); 

else_statement : (ELSE_KEYWORD (' ')?('\n')? OPEN_BRACE (' ')?('\n')? statements (' ')?('\n')? CLOSE_BRACE) ; 

ifelse_statement : if_statement ((' ')?('\n')? else_statement(' ')?('\n')?)? ; 

construct_statement : (ifelse_statement | while_loop) ;	

assignment_statement : term (' ')?('\n')? ASSIGNMENT_KEYWORD (' ')?('\n')? complex_expression ; 

other_statement : (assignment_statement | declaration_statement | return_statement | basic_expression | term | relational_expression) ;

statements : ((construct_statement | other_statement) (' ')? ('\n')?)* ';' ;

program : statements;	

