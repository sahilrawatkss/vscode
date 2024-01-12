%{
#include <stdio.h>
%}

%%

[-+*/%^=()0-9]+ {
    printf("%s is a valid mathematical expression\n", yytext);
}

. {
    printf("Invalid mathematical expression: %s\n", yytext);
}

%%

int main() {
    yylex();
    return 0;
}

int yywrap(){}