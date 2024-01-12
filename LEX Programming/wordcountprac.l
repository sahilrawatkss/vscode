%{
#include<stdio.h>
int count=0;
%}

%%
[a-zA-Z0-9]* {count++;}
\n {printf("Number Of words: %d",count); return 0;}
.
%%

int yywrap(){}

int main()
{
printf("Enter the string:\n");
yylex();
return 0;
}