package dsa.algorithm.sorting;

import java.util.ArrayList;

public class pivot {
    public static void main(String[] args) {
        int arr[]={4,5,3,7,2};
        int n=arr.length;
        int p=arr[0];
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ArrayList<Integer> ar2=new ArrayList<Integer>();

        for(int i=1;i<n;i++)
        {
            if(arr[i]>p)
            {
                ar2.add(arr[i]);
            }
            if(arr[i]<p)
            {
                ar1.add(arr[i]);
            }
        }
        ar1.add(p);
        for(int i=0;i<ar2.size();i++)
        {
            ar1.add(ar2.get(i));
        }
        for(int i=0;i<ar1.size();i++)
        {
            System.out.print(ar1.get(i)+" ");
        }
    }
}
