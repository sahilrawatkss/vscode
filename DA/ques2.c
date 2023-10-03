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
        int left=0,right=size-1;
        int count=0;
        while(left<=right)
        {
            count++;
            int mid=left+(right-left)/2;
            if(arr[mid]==num)
            {
                printf("Present %d\n\n",count);
                flag=1;
                break;
            }
            else if(arr[mid]<num)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        if(flag==0)
        {
            printf("Not present %d\n\n",count);
        }       
    }
}
