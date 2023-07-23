#include<stdio.h>
int fact(int n)
{
	if(n>0)
	{
		return (n* fact(n-1));
	}
	else
	{
		return 1;
	}
}
void main()
{
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	int n;
	printf("Enter the number:");
	scanf("%d",&n);
	printf("Factorial of %d = %d\n\n",n,fact(n));
}
