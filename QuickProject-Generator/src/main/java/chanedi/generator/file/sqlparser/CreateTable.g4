grammar CreateTable;
sql:mdl+;
mdl
 : K_CREATE K_TABLE ( schema '.' )? table_name
   ( '(' column_definition ( ',' column_definition )* ( ',' table_constraint )* ')'
   (K_ENGINE '=' K_INNODB)? (K_DEFAULT)? (K_CHARSET '=' K_UTF8)? (K_COMMENT '=' comment_value)? ';'
   )  (comment_oracle|comment_mysql)*;
comment_oracle
 : K_COMMENT K_ON
   ( K_TABLE ( schema '.' )? table_name
   | K_COLUMN ( schema '.' )? table_name '.' column_name
   ) K_IS comment_value ';';
comment_mysql
 : K_ALTER
   ( K_TABLE ( schema '.' )? table_name
   | K_COLUMN ( schema '.' )? table_name '.' column_name
   ) K_COMMENT comment_value ';';

column_definition : column_name datatype inline_constraint* (K_COMMENT comment_value)?;
datatype : name+ ( '(' signed_number ')' | '(' signed_number ',' signed_number ')' )?;
inline_constraint
 : ( K_CONSTRAINT name )?
   ( K_DEFAULT (signed_number | literal_value | '(' expr ')')
   | K_NOT? K_NULL | K_UNIQUE | K_PRIMARY K_KEY | foreign_key_clause
   | K_CHECK '(' expr ')' | K_AUTO_INCREMENT
   );
expr
 : literal_value
// | BIND_PARAMETER
// | ( ( database_name '.' )? table_name '.' )? column_name
// | unary_operator expr
 | expr '||' expr | expr ( '*' | '/' | '%' ) expr | expr ( '+' | '-' ) expr | expr ( '<<' | '>>' | '&' | '|' ) expr | expr ( '<' | '<=' | '>' | '>=' ) expr
 | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr
 | expr K_AND expr | expr K_OR expr | name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')' | '(' expr ')'
// | K_CAST '(' expr K_AS type_name ')'
// | expr K_COLLATE collation_name
// | expr K_NOT? ( K_LIKE | K_GLOB | K_REGEXP | K_MATCH ) expr ( K_ESCAPE expr )?
 | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL ) | expr K_IS K_NOT? expr | expr K_NOT? K_BETWEEN expr K_AND expr
// | expr K_NOT? K_IN ( '(' ( select_stmt | expr ( ',' expr )* )? ')' | ( database_name '.' )? table_name )
// | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')'
// | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END
// | raise_function
 ;
foreign_key_clause : K_REFERENCES ( schema '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )? ( K_ON K_DELETE (K_CASCADE | K_SET K_NULL) )?;
comment_value : STRING_LITERAL;
table_constraint
 : ( K_CONSTRAINT name )?
   ( ( K_PRIMARY K_KEY | K_UNIQUE ) '(' column_name ( ',' column_name )* ')'
   | K_CHECK '(' expr ')'
   | K_FOREIGN K_KEY '(' column_name ( ',' column_name )* ')' foreign_key_clause
   );

signed_number : ( '+' | '-' )? NUMERIC_LITERAL;
literal_value : NUMERIC_LITERAL | STRING_LITERAL | BLOB_LITERAL | K_NULL | K_CURRENT_TIME | K_CURRENT_DATE | K_CURRENT_TIMESTAMP | K_TRUE | K_FALSE;

name : any_name;
schema : any_name;
table_name : any_name;
column_name : any_name;

any_name
 : IDENTIFIER
// | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;

K_AUTO_INCREMENT : A U T O '_' I N C R E M E N T;
K_ALTER : A L T E R;
K_AND : A N D;
K_BETWEEN : B E T W E E N;
K_CASCADE : C A S C A D E;
K_CHECK : C H E C K;
K_CHARSET : C H A R S E T;
K_CREATE : C R E A T E;
K_COLUMN : C O L U M N;
K_COMMENT : C O M M E N T;
K_CONSTRAINT : C O N S T R A I N T;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DEFAULT : D E F A U L T;
K_DELETE : D E L E T E;
K_DISTINCT : D I S T I N C T;
K_ENGINE : E N G I N E;
K_FALSE : F A L S E;
K_FOREIGN : F O R E I G N;
K_GLOB : G L O B;
K_IN : I N;
K_INNODB : I N N O D B;
K_IS : I S;
K_ISNULL : I S N U L L;
K_KEY : K E Y;
K_LIKE : L I K E;
K_MATCH : M A T C H;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_ON : O N;
K_OR : O R;
K_PRIMARY : P R I M A R Y;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_SET : S E T;
K_TABLE : T A B L E;
K_TRUE : T R U E;
K_UNIQUE : U N I Q U E;
K_UTF8 : U T F '8';

IDENTIFIER : '"' (~'"' | '""')* '"' | '`' (~'`' | '``')* '`' | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]*
 ;

NUMERIC_LITERAL : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )? | '.' DIGIT+ ( E [-+]? DIGIT+ )?;
STRING_LITERAL : '\'' ( ~'\'' | '\'\'' )* '\'';
BLOB_LITERAL : X STRING_LITERAL;

SINGLE_LINE_COMMENT : '--' ~[\r\n]* -> channel(HIDDEN);
MULTILINE_COMMENT : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN);
SPACES : [ \u000B\t\r\n] -> channel(HIDDEN);

fragment DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
