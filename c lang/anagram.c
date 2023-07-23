#include<stdio.h>
void main()
{
	printf("Sahil Rawat\t MCA A \t 28\n\n");
 int i,j,flag=0;
 char s1[20],s2[20];
 printf("Enter first String:\n");
 scanf("%s",&s1);
 
 printf("Enter second String:\n");
 scanf("%s",&s2);
 
	if(strlen(s1)==strlen(s2))
	{
	for(i=0;i<strlen(s1);i++)
	{
		flag=0;
		for(j=0;j<strlen(s2);j++)
		{
			if(s1[i]==s2[j])
			{
				flag=1;
				s2[j]="#";
			}
		}
			if(flag==0)
			break;
	}
	if(flag==1)
	{
		printf("String is Anagram");
	}
	else{
		printf("String is not anagram");
	}
	}
	else
	{
		printf("String is not anagram");
	}
}
