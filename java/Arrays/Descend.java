package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Descend {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr=getInt(6);
        int[] sorted=descend(arr);
        printarr(sorted);
    }
    public static int[] getInt(int num){
        System.out.println("enter "+num +" values \r");
        int[] array=new int[num];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static int[] descend(int[] arr){
//        int[] sort=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            sort[i]=arr[i];}
    int[] sort= Arrays.copyOf(arr,arr.length);

        boolean flag=true;
        int temp;

        while(flag){
            flag=false;
            for(int i=0;i<sort.length-1;i++){
                if(sort[i]<sort[i+1]){
                    temp=sort[i];
                    sort[i]=sort[i+1];
                    sort[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sort;
    }

    public static void printarr(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
