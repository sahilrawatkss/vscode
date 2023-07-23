#include <stdio.h>

void main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
    int a, b, c, n;
    printf("Enter the number of terms: ");
    scanf("%d",&n);
    a = 0;
    b = 1;
    c = 0;

    printf("Fibonacci series: \n");

    for(int i=1; i<=n; i++)
    {
        printf("%d, ", c);

        a = b;     
        b = c;     
        c = a + b; 
    }
}
