package Arrays;

import java.util.Scanner;

public class Minarray {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    int count;
    System.out.println("enter the  size of array \r");
    count= sc.nextInt();
    int arr[]=readInteger(count);
        System.out.println("minimum value is : "+minArray(arr));
    }

    private static int[] readInteger(int count){
        int[]array=new int[count];

        System.out.println("enter "+count +" values \r");
        for(int i=0;i<array.length;i++){
            System.out.println("enter the number :");
            array[i]=sc.nextInt();
        }
        return array;
    }

    private static int minArray(int[] arr){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(mini>arr[i])
            {
                mini=arr[i];
            }
        }
        return mini;
    }
}
