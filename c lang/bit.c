#include<stdio.h>
void main()
{
	int num;
	printf("enter the decimal value: ");
	scanf("%d",&num);
	char str=num|0;
	printf("%s",str);
}
