grammar Hello;

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

ADDITION_OPERATOR : '+';
SUBTRACTION_OPERATOR : '-';
MULTIPLICATION_OPERATOR : '*';
DIVISION_OPERATOR : '/';

character : (LETTER | DIGIT | SYMBOL);
//SYMBOL: ;


identifier : (LETTER) (LETTER | DIGIT)*;  //CHANGE NEEDED

COMPARISON_KEYWORDS : ('Equals' | 'GreaterThan' | 'LessThan' | 'LessThanEqual' | 'GreaterThanEqual' | 'NotEqual') ;

ASSIGNMENT_KEYWORD : 'is' ;

WHITESPACE : (' ' | '\t' | '\r' | '\n' | '\f') ;

IF_KEYWORD : 'if' ;
THEN_KEYWORD : 'then' ;
ELSE_KEYWORD : 'else' ;
ELSEIF_KEYWORD : 'elif' ;
PRINT_KEYWORD : 'print' ;

OPEN_BRACE : '{' ;
CLOSE_BRACE : '}' ;

OPEN_BRACKET : '(' ;
CLOSE_BRACKET : ')' ;

//Future Work
//FUNCTION_KEYWORD : 'Function' ;

LOGICAL_KEYWORDS : ('AND' | 'OR' | 'NOT') ;

BOOLEAN_KEYWORDS : ('true' | 'false') ;

DATATYPE : ('Integer' | 'Float' | 'Boolean') ;

integer_literal : (('+'|'-')? DIGIT+) ; 		//3

float_literal : (('+'|'-')? DIGIT'.'DIGIT+);		//+6.0

operator : (ADDITION_OPERATOR | SUBTRACTION_OPERATOR | MULTIPLICATION_OPERATOR | DIVISION_OPERATOR);		//+, -, /, *

declaration_statement : DATATYPE ' ' identifier ; 		//Integer a

term : integer_literal | float_literal | identifier ;	//3, 3.0, a

basic_expression : term ((' ')?operator(' ')? term)* ;	//3+4

relational_expression : basic_expression (' 'COMPARISON_KEYWORDS ' ' basic_expression)? ;	//3 GreaterThan b

complex_expression : relational_expression (' 'LOGICAL_KEYWORDS ' ' relational_expression)* ; //3 LessThan 5 AND 10 GreaterThan 5

condition : complex_expression ; //3 LessThan 5 AND 10 GreaterThan 5

return_statement : PRINT_KEYWORD ' ' complex_expression ; //return a

while_loop : 'while' ' ' condition ' ' OPEN_BRACE ' ' statements ' ' CLOSE_BRACE ; //while a LessThan 5 { a is 2; }

if_statement: IF_KEYWORD ' ' condition ' ' OPEN_BRACE ' ' statements ' ' CLOSE_BRACE (' ' ELSEIF_KEYWORD ' ' OPEN_BRACE ' ' statements ' ' CLOSE_BRACE)* ; 
//if a GreaterThan b { a is 2; }

else_statement : ELSE_KEYWORD ' ' OPEN_BRACE ' ' statements ' ' CLOSE_BRACE ; //else { a is 3; }

ifelse_statement : if_statement (else_statement)? ; //if a GreaterThan b { a is 2; } elif { b is 4; }

construct_statement : (ifelse_statement | while_loop) ;	//if a GreaterThan b { while a LessThan 5 { a is 2; }; } elif { b is 4; }

assignment_statement : identifier (' ')? ASSIGNMENT_KEYWORD (' ')? complex_expression ; //a is 5

other_statement : (assignment_statement | declaration_statement | return_statement) ;

statements : (construct_statement | other_statement)* ';' ;

program : statements;	//Integer a
