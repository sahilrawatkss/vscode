package dsa.array;

import java.util.ArrayList;

public class TimeTaken {
    public static void main(String[] args) {
        int arr[]={6, 6, 1, 8, 1, 1, 3, 1};
        int time[]={8, 4, 1, 5, 2, 8, 9, 3};
        int n=arr.length;
        long timetake=totalTime(n,arr,time);
        System.out.println(timetake);
    }
    public static long totalTime(int n,int arr[],int time[])
    {
        long total=-1;
        ArrayList<Integer> al=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            if(al.indexOf(arr[i])==-1)
            {
                al.add(arr[i]);
                total=total+1;
            }
            else
            {
                total=total+time[arr[i]-1];
            }
        }
        return total;
    }
}
