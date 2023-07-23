package ds.arr3;

import java.util.Scanner;

public class negpositive {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the size");
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("enter the values");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        checkcount(arr,a);
    }

    static void checkcount(int[] arr,int a)
    {
        int count=-1;
        for (int i=0;i<a;i++)
        {
            if(arr[i]<0&&(i&1)==1)
            {
                order(arr,i,a);
            }
        }
    }

    static void order(int[] arr,int i,int a)
    {

    }

}
