#include<stdio.h>
void main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
	char a;
	printf("enter a charecter: ");
	scanf("%c",&a);
	if(a>=65&&a<=97)
	{
		a+=32;
	}
	else
	{
	a-=32;
    }
	printf("output: %c",a);
}
