%{
#include<stdio.h>
int i = 0;
%} 
%%
[a-zA-Z]* {printf("%d",yyleng);} 
.
%%
  
int yywrap(void){}
  
int main()
{   
    yylex();
    return 0;
}