package dsa.array.medium;

import java.util.ArrayList;

public class MissRepeat {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,6};
        int find[]=new int[2];
        ArrayList<Integer> al=new ArrayList<Integer>(6);
        for(int i=0;i<arr.length;i++)
        {
            if(al.indexOf(arr[i])==-1)
            {
                al.add(arr[i]);
            }
            else
            {
                find[0]=arr[i];
            }
        }
        for(int i=1;i<=al.size()+1;i++)
        {
            if(al.indexOf(i)==-1)
            {
                find[1]=i;
            }
        }
        for(int i=0;i<2;i++)
        {
            System.out.print(find[i]+" ");
        }
    }
}
