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
        int num;
        scanf("%d",&num);
        int flag=0;
        for(int j=0;j<size;j++)
        {
            if(arr[j]==num)
            {
                printf("Present %d\n\n",j+1);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            printf("Not present %d\n\n",size);
        }        
    }
}