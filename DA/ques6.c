#include<stdio.h>
void main()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        int size;
        scanf("%d",&size);
        int arr[size];
        for(int j=0;j<size;j++)
        {
            scanf("%d",&arr[j]);
        }
        int comp=0;
        for(int j=0;j<size;j++)
        {
            int ind=j;
            for(int k=j+1;k<size;k++)
            {
                if(arr[ind]>arr[k])
                {
                    ind=k;
                }
                comp++;
            }
            int temp=arr[j];
            arr[j]=arr[ind];
            arr[ind]=temp;
        }
        for(int j=0;j<size;j++)
        {
            printf("%d ",arr[j]);
        }
        printf("\ncomparisons= %d",comp);
        printf("\nswaps= %d\n",size-1);
    }
}
