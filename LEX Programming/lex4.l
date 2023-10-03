%{
#include<stdio.h>
%}

%%
[a-zA-Z] {printf("\n%s is a alphabet",yytext);}
.
%%

int main()
{
printf("Enter the string\n");
yylex();
return 0;
}

int yywrap(){};