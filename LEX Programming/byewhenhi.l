%{
#include<stdio.h>
%}

%%
"hi" {printf("bye");}

. {printf("Wrong Input");}
%%

int yywrap(){}

int main()
{
printf("Enter the string:\n");
yylex();
return 0;
}