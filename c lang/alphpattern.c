#include<stdio.h>
void main()
{
	char count='A';
	for(int i=1;i<8;i++)
	{
		for(int j=1;j<8;j++)
		{
			if(i<5){
			if(j>=5-i&&j<=3+i)
			{
				printf("%c",count);
			}
			else
			{
				printf(" ");
			}
		}
		else
		{
			if(j<=11-i&&j>=i-3)
			{
				printf("%c",count);
			}
			else
			{
				printf(" ");
			}
		}
		}
		count++;
		printf("\n");
	}
}
