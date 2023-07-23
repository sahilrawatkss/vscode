package dsa.array;

import java.util.Scanner;

public class insertvalues {
    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number to be Inserted");
        int num= sc.nextInt();

        insert(arr,num,arr.length);
        System.out.println("");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void insert(int[] arr,int num,int length)
    {
        int i;
        for(i=length-2;(i>=0&&arr[i]>num);i--)
        {
            arr[i+1]=arr[i];
        }
        arr[i+1]=num;
    }
}
