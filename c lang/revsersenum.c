#include<stdio.h>
void main()
{
	int num,mod,reverse=0;
	printf("enter the number");
	scanf("%d",&num);
	while(num>0)
	{
		mod=num%10;
		reverse=reverse*10+mod;
		num=num/10;
	}
	printf("\n reverse of digits is %d",reverse);
}
