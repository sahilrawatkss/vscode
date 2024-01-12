%{
#include <stdio.h>
int count=0;
%}

%%

\n {
    printf("New line found\n");
    count++;
}
"end" {printf("Number of lines: %d",count); return 0;}
. {
    // Ignore other characters
}

%%

int main() {
    yylex();
    return 0;
}

int yywrap(){}