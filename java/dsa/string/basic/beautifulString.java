package dsa.string.basic;

import java.util.Scanner;

public class beautifulString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String[] s=new String[num];
        for(int i=0;i<num;i++)
        {
            s[i]=sc.next();
        }
        for(int i=0;i<num;i++)
        {
            int low=0;
            int high=1;
            int k=0;
            while(k<s[i].length())
            {
                if((int)s[i].charAt(high)-(int)s[i].charAt(low)==1)
                {

                }
            }
        }
    }
}
