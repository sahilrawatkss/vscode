#include<stdio.h>
int calc(int p,int q)
{
	int a=p%q;
	if(a==0)
	{
		return q;
	}
	else
	{
		hcf(p,a);
	}
}

int hcf(int m,int n)
{
	if(m>n)
	{
		calc(m,n);
	}
	else
	{
		calc(n,m);
	}
}


void main()
{
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	int m,n;
	printf("Enter number:");
	scanf("%d",&m);
	printf("Enter another number:");
	scanf("%d",&n);
	printf("H.C.F of %d and %d is %d",m,n,hcf(m,n));
}
