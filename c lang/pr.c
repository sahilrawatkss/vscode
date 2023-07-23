#include<stdio.h>
int main()
{
char a[]="abcd";
char b[]="abcd";
if(*a==*b)
printf("equal %u %u",*a,&a);       
return 0;}
