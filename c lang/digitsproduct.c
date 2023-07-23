#include<stdio.h>
void main()
{
	int num,mod,product=1;
	printf("enter the number");
	scanf("%d",&num);
	while(num>0)
	{
		mod=num%10;
		product=product*mod;
		num=num/10;
	}
	printf("\n product od digits is %d",product);
}
