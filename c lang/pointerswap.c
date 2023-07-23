#include <stdio.h>
void swap(int *p,int *q)
{
	int temp=*p;
	*p=*q;
	*q=temp;
}
void main()
{
	printf("Sahil Rawat\t MCA A \t 28\n\n");
 int a,b;
 printf("Enter a number: ");
 scanf("%d", &a);
 printf("Enter another number: ");
 scanf("%d", &b);
 swap(&a,&b);
 printf("Values after swap are num1:%d and num2:%d\n\n",a,b);
}
