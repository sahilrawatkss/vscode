package ds;

import java.sql.Array;
import java.util.Scanner;


public class arr1 {


    public static void reversearray(int[] arr,int size)
    {
        int blank=0;
        for(int i=0;i<=(size/2);i++,size--)
        {
            blank=arr[i];
            arr[i]=arr[size-1];
            arr[size-1]=blank;
        }
    }

    public static void printarray(int[] arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
     int[] arr=new int[]{11,2,33,4,5,6,23};
     printarray(arr,arr.length);
     reversearray(arr,arr.length);

     printarray(arr,arr.length);
    }
}
