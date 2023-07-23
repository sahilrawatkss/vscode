package ds.arr2;

import java.util.Scanner;

public class arr2newpractice {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]>=n) {
                arr[i]=0;
            }
                int x = arr[i];
                while (arr[x] != -1 && arr[x] != i&&arr[x]>=i) {
                    int y = arr[x];
                    arr[x] = x;
                    x = y;
                }
                arr[x]=x;
                if(arr[i] != i) {
                    arr[i] = -1;
                }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
