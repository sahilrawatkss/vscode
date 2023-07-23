package dsa.array.medium;

import java.util.ArrayList;

public class maximumSubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,5,2,3,6};
        int n=arr.length;
        int k=2;
        ArrayList<Integer> al=max_of_subarrays(arr,n,k);
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

    }
    static ArrayList<Integer> max_of_subarrays(int[] arr,int n,int k)
    {
        ArrayList<Integer> al=new ArrayList<Integer>(n-2);
        for(int i=0;i<n-k+1;i++)
        {
            al.add(max(arr,i,i+k));
        }
        return al;
    }
    static int max(int[] arr,int i,int n)
    {
        int max=arr[i];
        while(i+1<=n)
        {
            max=Math.max(arr[i],max);
            i++;
        }
        return max;
    }
}
