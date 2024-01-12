%{
#include<stdio.h>
%}

%%
\"[^"]*\" {printf("String: %s\n",yytext); }

.
%%

int yywrap() {}

int main()
{
printf("Enter String:\n");
yylex();
return 0;
}