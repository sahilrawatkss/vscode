package dsa.array.medium;

public class Productarraypuzzle {
    public static void main(String[] args) {
        int nums[] = {10, 3, 5, 6, 2, 0};
        int n=nums.length;
        long prod=1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            if(nums[i]!=0)
            {
                prod=prod*nums[i];
            }
        }
        if(count >1)
        {
            prod=0;
        }
        long p=prod;
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0&&count>0)
            {
                prod=0;
            }
            if(prod==0)
            {
                arr[i]=0;
            }
            else if(prod==nums[i]&&count>=1)
            {
                arr[i]=0;
            }
            else if(prod==nums[i])
            {
                arr[i]=1;
            }
            else if(nums[i]!=0&&prod!=nums[i])
            {
                arr[i]=prod/nums[i];
            }
            else
            {
                arr[i]=prod;
            }
            prod=p;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
