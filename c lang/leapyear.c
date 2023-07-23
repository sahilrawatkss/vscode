#include <stdio.h>

int main()
{
	printf("Sahil Rawat \t MCA A \t 28\n\n");
    int year;
    printf("Enter any year: ");
    scanf("%d", &year);

    (year%4==0 && year%100!=0) ? printf("LEAP YEAR") : printf("COMMON YEAR");

    return 0;
}
