grammar Chunks;

//chunksList: '\n'? chunk ('\n' chunk)* EOF;
chunksList: First Second;
//chunksList: '\n'* chunk  EOF;

//chunk: placeholderLiteral '\n' MultiLineString*;
//chunk: placeholderLiteral '\n' Code;
//chunk: '\n' placeholderLiteral NEWLINE Code;
chunk:  placeholderLiteral MultiLineString+;
First: 'a';
Second: 'ad';

placeholderLiteral: PlaceholderString;

//Code: ~[8]+ ;
//Code: .*? '#-';
Code:
    ([ a-zA-Z0-9_=;()]*
//    (~'\n'
//      | '['
//      | ']'
//    )+
    '\n'*
    )


;


//ChunkBody:

PlaceholderString
  : '#-' StringContentDQ*? '-#'
  ;

WHITESPACE
//  : ('\t' | ' ' | NEWLINE)+   -> skip
  :  [ \t\r\u000C]+ -> skip
  ;

NEWLINE
  : '\n'
  | '\r'
  | '\r\n'
  ;

fragment
StringContentDQ
  : ~('\\' | '"' | '\n' | '\r')
  | '\\' ~('\n' | '\r')
  ;
fragment
StringContentTDQ
  : ~('\\' | '"' /*| '$'*/)
  | '"' ~'"' | '""' ~'"'
  //| stringInterpolation
  ;

fragment StringContentTSQ
  : ~('\\' | '\'' /*| '$'*/)
  | '\'' ~'\'' | '\'\'' ~'\''
  //| stringInterpolation
  ;

MultiLineString
  : '"""' StringContentTDQ* '"""'
  | '\'\'\'' StringContentTSQ* '\'\'\''
  | 'r"""' (~'"' | '"' ~'"' | '""' ~'"')* '"""'
  | 'r\'\'\'' (~'\'' | '\'' ~'\'' | '\'\'' ~'\'')* '\'\'\''
  ;

fragment
StringContentSQ
  : ~('\\' | '\'' /*| '$'*/ | '\n' | '\r')
  | '\\' ~('\n' | '\r')
  //| stringInterpolation
  ;

stringLiteral: (MultiLineString | SingleLineString)+;

SingleLineString
  : '"' StringContentDQ* '"'
  | '\'' StringContentSQ* '\''
  | 'r\'' (~('\'' | '\n' | '\r'))* '\''
  | 'r"' (~('"' | '\n' | '\r'))* '"'
  ;