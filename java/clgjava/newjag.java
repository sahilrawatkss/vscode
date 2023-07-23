package clgjava;

import java.util.Scanner;

public class newjag {
    public static void main(String[] args) {
        int[][] arr=new int[3][];
        arr[0]=new int[5];
        arr[1]=new int[3];
        arr[2]=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]%2==0)
                    sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
