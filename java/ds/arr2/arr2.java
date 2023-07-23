package ds.arr2;

import java.util.Scanner;

public class arr2 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        int a=sc.nextInt();
        int temp=0;
        int[] arr=new int[a];
        int[] arr2=new int[a];
        System.out.println("enter the array");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(arr[j]==i)
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
        }

        for(int i=0;i<a;i++)
        {
            if(arr[i]!=i)
            {
                arr[i]=-1;
            }
        }

        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+"   ");
        }
    }
}