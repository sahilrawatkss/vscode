package dsa.array;

import java.util.Scanner;

public class smallsubarray {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,0,19};
        System.out.println("Enter the value :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=arr.length;
        subarray(arr,n,a);

    }
    static void subarray(int[] arr,int n,int a)
    {
        int index=0;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
                index=i;
            }
        }

        int j=index;
         while(max<=a)
         {
             if(index==0&&j==n-1)
                 break;


             if(max<=a&&index!=0)
             {
                 index--;
                 max=max+arr[index];


             }
             if(max<=a&&j!=n-1)
             {
                 j++;
                 max=max+arr[j];
             }
         }

        System.out.println(index+" "+j);

        if(max<=a)
            System.out.println("no Array possible");

        else
        {
            System.out.print("{ ");
            for (int k = index; k <=j;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.print("}");
        }
    }
}
