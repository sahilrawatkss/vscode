package dsa.array;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        //int arr[][]={{-9,-9,-9,1,1,1},{0,-9,0,4,3,2},{-9,-9,-9,1,2,3},{0,0,8,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
        //int arr[]={-9,-9,-9,1,1,1,0,-9,0,4,3,2,-9,-9,-9,1,2,3,0,0,8,6,6,0,0,0,0,-2,0,0,0,0,1,2,4,0};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int high=arr[0]+arr[1]+arr[2]+arr[7]+arr[12]+arr[13]+arr[14];
        for(int i=0;i<22;i++)
        {
                sum=sum+arr[i]+arr[i+1]+arr[i+2]+arr[i+7]+arr[i+12]+arr[i+13]+arr[i+14];
            if(i%3==0&&even(i))
            {
                i=i+2;
            }
            System.out.println(sum);
            high=Math.max(high,sum);
            sum=0;
        }
        System.out.println(high);
    }
    static boolean even(int i)
    {
        i=i/3;
        if(i%2==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
