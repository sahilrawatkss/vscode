%{
#include <stdio.h>
%}

%%
\"[^"]*\" { printf("String: %s\n", yytext); }
    /* skip whitespace and newline characters */
.            /* skip any other character */

%%
int main() {
    yylex();
    return 0;
}
int yywrap(void){}