%{
#include<stdio.h>
int i = 0;
%} 
%%
([a-zA-Z0-9])*x[ ] {i++;} /* Rule for counting 
                          number of words*/
x$ {i++;}
.
"\n" {printf("%d\n", i); i = 0;}
%%
  
int yywrap(void){}
  
int main()
{   
    yylex();
    return 0;
}