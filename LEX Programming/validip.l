%{
#include <stdio.h>
%}

%%

[0-9]+ {
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