%{
#include<stdio.h>
%}

%%
hello|hi|namaste {printf("\ngood morning");}
[0-9]+ {printf("\n%s is a number",yytext);}
[ \t\n]+ {};
. {printf("\nNo");}
%%

int main()
{
printf("Enter the string");
yylex();
return 0;
}

int yywrap()
{
}