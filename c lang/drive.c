#include<stdio.h>
int main()
{
	printf("Sahil Rawat\t MCA A \t 28\n\n");
	int n; int d;
	 printf("Enter your car number:");
	 scanf("%d",&n);
	 
	 printf("Enter day number:");
	 scanf("%d",&d);
	 if(d>=1&&d<=7)
	 {
	 if( d%2==0 && n%2==0)
	 {
	 	printf("Allowed to drive on even day");
	 }
	 else if(d%2!=0&&n%2!=0)
	 {
	 	printf("alloed to drive on odd day");
	 }
	 
	 else{
	 	printf("Not allowed to drive today");
	 }
	}
	else
	{
		printf("enter valid day number");
	}
	
	
}
