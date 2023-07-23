#include<stdio.h>
void main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
	int n;
	printf("Enter the  Area Quality Index Value:");
	scanf("%d",&n);
	if(n<=50&&n>0)
	printf("Air Quality:Healthy");
	else if(n<=100&&n>50)
	printf("Air Quality:Moderate");
	else if(n<=200&&n>100)
	printf("Air Quality:Unhealthy");
	else if(n<=300&&n>200)
	printf("Air Quality:VeryUnhealthy");
	else
	printf("Air Quality:Hazardous");
}
