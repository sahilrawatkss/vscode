package dsa.array;

import java.util.Scanner;

public class findNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            long N = sc.nextLong();
            System.out.println(findN(N));
        }
    }
    public static long findN(long N)
    {

        long ans=1;
        long num=0;
        while(num<N)
        {
            int flag=0;
            long add=1;
            long val=ans;
            while(val>0)
            {
                long mod=val%10;
                if(mod%2==0)
                {
                    flag=1;
                    break;
                }
                else
                {
                    flag=0;
                }
                add=add*10;
                val=val/10;
            }
            if(flag==0)
            {
                num++;
                if(num==N)
                    break;
                ans = ans + 2;

            }
            else
                ans=ans+add;

        }
        return ans;
    }
}
