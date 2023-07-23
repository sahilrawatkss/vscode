#include<stdio.h>
void main()
{
	int n,max,min;
	printf("enter the size of array: ");
	scanf("%d",&n);
	int arr[n];
	printf("enter values: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	max=arr[0];
	min=arr[0];
	for(int i=0;i<n;i++)
	{
		if(max<arr[i])
		max=arr[i];
		
		if(min>arr[i])
		min=arr[i];
	}
	
	printf("maximum element: %d\nminimum element: %d",max,min);
}
