%{
#include<stdio.h>
int i = 0;
%} 
%%
[a-zA-Z0-9]*[A-Z][a-zA-Z0-9]* {printf("%s\n",yytext);}
.
%%
  
int yywrap(void){}
  
int main()
{   
    yylex();
    return 0;
}