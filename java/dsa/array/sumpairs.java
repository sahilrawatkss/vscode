package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class sumpairs {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,7};
        int[] arr2={5,6,3,4,8};
        pair[] carr=new pair[arr.length];
        int x=9;
        int y=0;
        int ind=0;
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<arr.length;i++)
        {
            y=x-arr[i];
            if(arr[i]<x)
            {
                if(y>=arr2[0]&&y<=arr2[arr2.length-1]) {
                    int val = findValue(arr2, y);
                    if(val!=-1)
                    {
                        carr[ind]=new pair(arr[i],arr2[val]);
                        ind++;
                    }
                }
            }
        }
        for(int i=0;i<ind;i++)
        {
            System.out.println(carr[i].first+" "+carr[i].second);
        }
    }
    static int findValue(int[] arr,int y)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==y)
            {
                return mid;
            }
            if(arr[mid]>y)
            {
                high=mid-1;
            }
            if(arr[mid]<y)
            {
                low=mid+1;
            }
        }
        return -1;
    }
}
