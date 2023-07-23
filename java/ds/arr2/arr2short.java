package ds.arr2;

import java.util.Scanner;

public class arr2short {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the values");
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;)
        {
            if(arr[i]!=-1&&arr[i]!=i&&arr[i]<n) {
                int blank = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = blank;

            }
            else {
                i++;
            }
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i]!=i)
            {
                arr[i]=-1;
            }
            System.out.print(arr[i]+"  ");
        }
    }
}
