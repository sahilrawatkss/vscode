#include<stdio.h>
void main()
{
	printf("Sahil Rawat\tMCA A\t28\n");
	int n;
	printf("enter the number (value of n): ");
	scanf("%d",&n);
	printf("prime numbers:\n");
	for(int i=2;i<n;i++)
	{ int count=0;
		for(int  j=1;j<=i/2;j++)
		{
			if(i%j==0)
			{
			count++;
			}
		}
		if(count<2)
		{
			printf("%d ",i);
		}
	}
}
