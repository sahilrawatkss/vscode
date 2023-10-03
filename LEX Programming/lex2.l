%{
#include<stdio.h>
%}

%%
hello|hi|namaste {printf("\ngood morning");}
[0-9]+ {printf("\n%s is a number",yytext);}

. {printf("\nNOt Valid");}
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