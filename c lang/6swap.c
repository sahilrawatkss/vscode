#include <stdio.h>
void main()
{
printf("Sahil Rawat\tMCA A\t28\n\n");
 int n,a,value=1,first,last,n2,n1;
 printf("Enter number: ");
 scanf("%d", &n);
 a=n;
 n1=n;
 for (n; n > 0; n /= 10)
 {
 if (a == n)
 {
 last = a % 10;
 n1=n1-last;
 }
 first = n % 10;
 value=value*10;
 if(n>=10)
 {
 	n2=n1%value;
 }
}
int result=(last*value/10)+n2+first;
 printf("value:%d ",result);
}
