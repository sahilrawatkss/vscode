%{
#include<stdio.h>
int i = 0;
%} 
%%
"+"|"-"|"*"|"/" {printf("Operator: %s\n",yytext);}
.

%%
  
int yywrap(void){}
  
int main()
{   
    yylex();
    return 0;
}