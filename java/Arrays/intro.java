package Arrays;

import java.util.Scanner;

public class intro {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        intro obj=new intro();

        int[] arry = arrays(5);
        for (int i = 0; i < arry.length; i++) {
            System.out.println("value at "+i+" is "+arry[i]);
        }
        System.out.println("avg is :"+obj.avg(arry));
    }

        public static int[] arrays(int number){
            System.out.println("enter "+number +" values \r" );
            int[] arr=new int[number];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            return arr;
        }

        public static double avg(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (double) sum/(double) arr.length;
        }
    }
