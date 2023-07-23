#include <stdio.h>

int main()
{
	printf("Sahil Rawat\tMCA A\t28\n\n");
    int a;
    printf("Enter a Electricity Input: ");
    scanf("%d", &a);
    float sum;
    int b = 0;

    if (a <= 50)
        b = 1;
    else if (150 >= a && a > 50)
        b = 2;
    else if (250 >= a && a > 150)
        b = 3;
    else
        b = 5;
    switch (b)
    {
    case 1:
        sum = 0.50 * a;
        sum = sum + (sum * 0.20);
        break;
    case 2:
        sum = 0.75 * a;
        sum = sum + (sum * 0.20);
        break;
    case 3:
        sum = 1.20 * a;
        sum = sum + (sum * 0.20);
        break;

    default:
        sum = 1.50 * a;
        sum = sum + (sum * 0.20);
    }
     printf("Total Electricity Bill: %.2f", sum);
}
