%{
#include<stdio.h>
%}

%%
"+"|"-"|"*"|"/" {printf("Operator: %s\n",yytext);}

.
%%

int yywrap(){}

int main()
{
printf("Enter the string:\n");
yylex();
return 0;
}