%{
#include<stdio.h>
int i = 0;
%} 
%%
^[aeiouAEIOU] {i++;}
[ ][aeiouAEIOU]([a-zA-Z0-9])* {i++;} /* Rule for counting 
                          number of words*/
.
"\n" {printf("%d\n", i); i = 0;}
%%
  
int yywrap(void){}
  
int main()
{   
    yylex();
    return 0;
}