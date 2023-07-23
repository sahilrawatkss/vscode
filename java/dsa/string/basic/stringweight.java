package dsa.string.basic;

import java.util.Scanner;

public class stringweight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        int len=s.length();
        //array for aphabets value
        int[] arr=new int[len];
//        int[] query={6,1,3,12,5,9,10};
//        Sizeof query ask from user
        int qsize=sc.nextInt();
        int[] query=new int[qsize];
        for(int i=0;i<query.length;i++)
        {
            query[i]=sc.nextInt();
        }
        String[] s2=new String[query.length];
        int sum=0;
        if(len==1)
        {
            arr[0]=s.charAt(0)-96;
        }
        else
        {
            for (int i = 0; i < len - 1; i++) {
                sum = sum + s.charAt(i) - 96;
                arr[i] = sum;
                if (s.charAt(i) != s.charAt(i + 1)) {
                    sum = 0;
                }
            }
            if (s.charAt(len - 1) == s.charAt(len - 2))
                arr[len - 1] = sum + s.charAt(len - 1) - 96;
            else {
                arr[len - 1] = s.charAt(len - 1) - 96;
            }
        }
        int flag=0;
        for(int i=0;i< query.length;i++)
        {
            for(int j=0;j< len;j++)
            {
                if(query[i]==arr[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                s2[i]="Yes";
            }
            else
            {
                s2[i]="No";
            }
            flag=0;
        }
        for(int i=0;i< query.length;i++)
        {
            System.out.println(s2[i]);
        }
    }
}
