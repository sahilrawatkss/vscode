%{
#include<stdio.h>
%}

%%
[0-9]+ { printf("Number: %s\n", yytext); }

.
%%

int yywrap(){}

int main() 
{
printf("Enter the string:\n");
yylex();
return 0;
}