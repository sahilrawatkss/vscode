package Arrays;

import java.util.Scanner;

public class Reverse {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int count;
        System.out.println("enter the size of array: ");
        count=sc.nextInt();
        int[] arr=getArray(count);
        prints(arr);
        int[] revarray=reverse(arr);
        prints(revarray);
    }

    private static void prints(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print("array["+i+"]: "+array[i]+"  ");
        }
        System.out.println("\r");
    }

    private static int[] getArray(int count){
        int array[]=new int[count];
        for(int i=0;i<array.length;i++){
            System.out.println("enter number: ");
            array[i]=sc.nextInt();
        }
        return array;
    }

    private static int[] reverse(int[] array){
        int i=0,j= array.length-1;
        int temp;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }
}
