#include<stdio.h>
void main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
	int a,b;
	printf("Enter the Number: ");
	scanf("%d",&a);
	int c=a;
	if(a==0)
	{
		printf("%d not a power of 2",a);
	}
	while(a>1)
	{
		b=a%2;

		if(b!=0)
		{
			printf("%d is not a power of 2",c);
			break;
		}
		a/=2;
	}
	if(b==0)
	{
		printf("%d is a power of 2",c);
	}
}
