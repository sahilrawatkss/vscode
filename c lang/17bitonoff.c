#include<stdio.h>
void main()
{
	printf("Sahil Rawat \t MCA A \t 28\n\n");
	printf("Enter the Number: ");
	int n,pos;
	scanf("%d",&n);
	printf("Enter the Position: ");
	scanf("%d",&pos);
	
	int p=n^(1<<(pos-1));
	printf("%d after toggling bit at %d position: %d",n,pos,p);
}
