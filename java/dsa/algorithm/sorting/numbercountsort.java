package dsa.algorithm.sorting;

import java.util.Scanner;

public class numbercountsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        int freq[]=new int[100];
        for(int i=0;i<num.length;i++)
        {
            freq[num[i]]++;
        }
        for(int i=0;i<100;i++)
        {
            System.out.print(freq[i]+" ");
        }
    }
}
