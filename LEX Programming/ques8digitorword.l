%{
#include <stdio.h>
%}

%%

[0-9]+ {
    printf("%s is a digit\n", yytext);
}

[a-zA-Z]+ {
    printf("%s is a word\n", yytext);
}

. {
    printf("Invalid input: %s\n", yytext);
}

%%

int main() {
    yylex();
    return 0;
}
 int yywrap() {}