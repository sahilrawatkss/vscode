#include<stdio.h>
void main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
	double n,sum=0,x,m=1;
	printf("enter the number of terms:");
	scanf("%lf",&n);
	printf("enter the number(value of x):");
	scanf("%lf",&x);
	double r=n;
	for(int i=1;i<=n;i++)
	{
		double fact=1;
		m=m*r*x;
		r--;
		//double fact=1,a=1,y=1;
		for(int j=i;j>0;j--)
		{
			//a=a*(n-j+1);
			//y=y*x;
			fact=fact*j;
		}
		sum=sum+(m/fact);
	}
	printf("output:%.2lf",sum);
}

