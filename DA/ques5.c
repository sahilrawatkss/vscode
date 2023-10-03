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
        for(int j=1;j<size;j++)
        {
            int val=arr[j];
            int k=j-1;
            while(k>=0&&arr[k]>val)
            {
                arr[k+1]=arr[k];
                comp++;
                k--;
            }
            arr[k+1]=val;     
        }
        for(int j=0;j<size;j++)
        {
            printf("%d ",arr[j]);
        }
        printf("\ncomparisons= %d",comp);
        printf("\nshifts= %d\n",comp+size-1);
    }
}
