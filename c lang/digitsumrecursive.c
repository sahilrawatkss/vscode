#include<stdio.h>
int sum(int n)
{
	if(n>0)
	{
		int a=n%10;
		return a+ sum(n/10);
	}
	else
	{
		return 0;
	}
}
void main()
{
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	int n;
	printf("Enter the number:");
	scanf("%d",&n);
	printf("sum of digits:%d",sum(n));
}
