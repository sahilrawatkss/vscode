package ds.arr2;

import java.util.Scanner;

public class arr2new {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        System.out.println("enter the value of n");
        a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<a;i++)
        {
            if(arr[i]!=-1&&arr[i]!=i)
            {
                int x=arr[i];
                while(arr[x]!=-1&&arr[x]!=x)
                {
                    int y=arr[x];
                    arr[x]=x;
                    x=y;
                }
                arr[x]=x;

                if(arr[i]!=i)
                {
                    arr[i]=-1;
                }

            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+"   ");
        }
    }
}
