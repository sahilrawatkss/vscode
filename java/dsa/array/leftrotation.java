package dsa.array;

import java.util.Scanner;

public class leftrotation {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int rotate;
        System.out.println("Array: ");
        System.out.println("");
        printarray(arr,0,arr.length);
        System.out.println("");
        System.out.println("Enter the number of rotation:");
        Scanner sc=new Scanner(System.in);
        rotate=sc.nextInt();
        rotate=rotate % arr.length;
        rotate=arr.length-1-rotate;
        System.out.println("Array after left Rotation");
        System.out.println("");
        reversearray(arr,0,arr.length-1);
        reversearray(arr,0,rotate);
        reversearray(arr,rotate,arr.length-1);
        printarray(arr,0,arr.length);

    }

    static void reversearray(int[] arr,int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void printarray(int[] arr,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
