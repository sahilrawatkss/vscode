%{
#include <stdio.h>
%}

%%

(0[1-9]|1[0-2])\/(0[1-9]|[12][0-9]|3[01])\/[0-9]{4} {
    printf("%s is a valid date\n", yytext);
}

. {
    printf("Invalid date: %s\n", yytext);
}

%%

int main() {
    yylex();
    return 0;
}

int yywrap(){}