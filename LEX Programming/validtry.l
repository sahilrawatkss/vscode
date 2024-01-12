%{
#include<stdio.h>
%} 

%%
a{2,} {printf("Valid\n");}
.* {printf("Invalid");}
%%
  
int yywrap(void){}
  
int main()
{   
    yylex();
    return 0;
}