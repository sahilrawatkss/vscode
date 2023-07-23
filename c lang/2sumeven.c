#include <stdio.h>
int main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
 int a;
 printf("Enter a number: ");
 scanf("%d", &a);
 int sum = 0;
 for (int i = 0; i <= a; i += 2)
 {
 sum += i;
 }
 printf("sum of first %d even numbers %d", a,sum);
}
