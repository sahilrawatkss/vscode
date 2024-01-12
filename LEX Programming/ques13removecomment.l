%{
#include <stdio.h>
%}

%%

"/*"[^*]+"*/" {
    // Remove multiline comments
}

"//".* {
    // Remove single-line comments
}

. {
    printf("%s", yytext);
}

%%

int main() {
    yylex();
    return 0;
}

int yywrap() {}