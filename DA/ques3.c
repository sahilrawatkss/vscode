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
        int lindex=0,rindex=0;
        int left=1,right=size-1;
        int mid=0;
        if(arr[0]==num)
        {
            lindex=0;
        }
        else
        {
            while(left<=right)
            {
                mid=left+(right-left)/2;
                if(arr[mid]==num&&arr[mid-1]!=num)
                {
                    lindex=mid;
                    break;
                }
                else if(arr[mid]>=num)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }
        left=0;right=size-2;
        if(arr[size-1]==num)
        {
            rindex=size-1;
        }
        else
        {
            while(left<=right)
            {
                mid=left+(right-left)/2;
                if(arr[mid]==num&&arr[mid+1]!=num)
                {
                    rindex=mid;
                    break;
                }
                else if(arr[mid]>num)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }
        if(arr[mid]!=num)
        {
            printf("Key not Present\n");
        }
        else
        {
            printf("%d - %d\n",num,rindex-lindex+1);
        }     
    }
}
