grammar CreateTable;
sql
 : K_CREATE K_TABLE ( schema '.' )? table_name
   ( '(' column_definition ( ',' column_definition )* ( ',' table_constraint )* ')' ( K_WITHOUT IDENTIFIER )?
   )
 ;
//sql:(mdl tableComment? columnComment*)+;
//mdl:'create'  'table' ID  '('  col+  primmarykey ');' ;
//tableComment: 'comment on table' ID 'is' COMMENT ';';
//columnComment: 'comment on column' ID '.' column 'is' COMMENT ';';
//col: column colType DEFAULT? NOTNULL? ',';
//colType: stringType | dateType | doubleType | intType | booleanType  ;
//primmarykey : 'constraint' ID 'primary key (ID)';
//column : (ID|'"'ID'"');


// colType
/*
stringType : 'VARCHAR2' RANGE;
dateType : 'TIMESTAMP' | 'DATE';
doubleType : 'NUMERIC' '(' NUMBER ',' NUMBER ')';
intType : 'NUMERIC' (RANGE | '(' NUMBER ',''0)');
booleanType : 'CHAR(1)';


RANGE : '(' NUMBER ')';
COMMENT : '\'' STUFF '\'';

NOTNULL : 'not null';
DEFAULT : 'default \'' STUFF '\'';
NUMBER : [0-9]+;
ID : [a-zA-Z_]+;
WS : [ \t\r\n]+ -> skip;
fragment STUFF: ~[ \t\r\n']+;*/

column_definition
 : column datatype? column_constraint*
 ;

datatype
 : name+ ( '(' signed_number ')'
         | '(' signed_number ',' signed_number ')' )?
 ;

column_constraint
  : ( K_CONSTRAINT name )?
    ( K_PRIMARY K_KEY ( K_ASC | K_DESC )? conflict_clause K_AUTOINCREMENT?
    | K_NOT? K_NULL conflict_clause
    | K_UNIQUE conflict_clause
    | K_CHECK '(' expr ')'
    | K_DEFAULT (signed_number | literal_value | '(' expr ')')
    | K_COLLATE collation_name
    | foreign_key_clause
    )
  ;

schema : any_name;
table_name : any_name;
column : any_name;

any_name
 : IDENTIFIER
// | keyword
// | STRING_LITERAL
// | '(' any_name ')'
 ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';

K_CREATE : C R E A T E;
K_TABLE : T A B L E;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;
MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;
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
