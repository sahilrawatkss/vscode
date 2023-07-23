package dsa.array.medium;

import java.util.Arrays;

public class towerheight {
    public static void main(String[] args) {
        int  arr[]={5,7,10,12,17};
        int k=5;
        int n=arr.length;
        System.out.println(getMinDiff(arr,n,5));
    }
    static int getMinDiff(int[] arr,int n,int k)
    {
        Arrays.sort(arr);
        int diff=arr[n-1]-arr[0];
        int min=0;
        int max=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
                continue;
            max=Math.max(arr[n-1]-k,arr[i-1]+k);
            min=Math.min(arr[0]+k,arr[i]-k);

            diff=Math.min(diff,max-min);
        }
        return diff;
    }
}
