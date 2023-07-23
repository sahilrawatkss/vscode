#include <stdio.h>
int main()
{
		printf("Sahil Rawat\tMCA A\t28\n\n");
 int a;
 printf("Enter a number: ");
 scanf("%d", &a);
 int b=a;
 int count = 0;
 for (a; a > 0; a /= 10)
 {
 count++;
 }
 printf("Number of digits in %d : %d",b, count);
}
