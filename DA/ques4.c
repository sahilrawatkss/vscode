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
        int flag=0;
        for(int j=0;j<size-2;j++)
        {
            for(int k=j+1;k<size-1;k++)
            {
                int sum=arr[j]+arr[k];
                int left=k+1,right=size-1;
                while(left<=right)
                {
                    int mid=left+(right-left)/2;
                    if(arr[mid]==sum)
                    {
                        printf("%d, %d, %d\n",j+1,k+1,mid+1);
                        flag=1;
                        break;
                    }
                    else if(arr[mid]<sum)
                    {
                        left=mid+1;
                    }
                    else
                    {
                        right=mid-1;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==1)
                break;
        }
        if(flag==0)
            printf("No Sequence Found\n");        
    }
}
