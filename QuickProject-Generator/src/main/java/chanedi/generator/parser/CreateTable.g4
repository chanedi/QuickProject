grammar CreateTable;
sql:(mdl tableComment? columnComment*)+;
mdl:'create' 'table' ID  '('  col+  primmarykey ');' ;
tableComment: 'comment on table' ID 'is' COMMENT ';';
columnComment: 'comment on column' ID '.' column 'is' COMMENT ';';
col: column colType DEFAULT? NOTNULL? ',';
colType: stringType | dateType | doubleType | intType | booleanType  ;
primmarykey : 'constraint' ID 'primary key (ID)';
column : (ID|'"'ID'"');

// colType
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
fragment STUFF: ~[ \t\r\n']+;