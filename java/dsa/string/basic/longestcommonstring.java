package dsa.string.basic;

import java.util.Scanner;

public class longestcommonstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int len=0;
        int max=0;
        int n=0,m=0;
        int flag=0;
        int flag2=0;
        while(n<s1.length())
        {
            flag2=0;
            for (int i = n; i < s1.length(); i++) {
                for (int j = m; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j))
                    {
                        flag2=1;
                        if(flag==0)
                        {
                            n=i+1;
                            flag=1;
                        }
                        m=j+1;
                        len++;
                        break;
                    }
                }
            }
            if(len>max)
            {
                max=len;
            }
            len=0;
            m=0;
            flag=0;
            if(flag2==0)
            {
                n++;
            }
        }
//
//        len=0;
//        n=0;
//        m=0;
//        flag=0;
//        flag2=0;
//        while(n<s1.length())
//        {
//            flag2=0;
//            for (int i = n; i < s2.length(); i++) {
//                for (int j = m; j < s1.length(); j++) {
//                    if (s2.charAt(i) == s1.charAt(j))
//                    {
//                        flag2=1;
//                        if(flag==0)
//                        {
//                            n=i+1;
//                            flag=1;
//                        }
//                        m=j+1;
//                        len++;
//                        break;
//                    }
//                }
//            }
//            if(len>max)
//            {
//                max=len;
//            }
//            len=0;
//            m=0;
//            flag=0;
//            if(flag2==0)
//            {
//                n++;
//            }
//        }
        System.out.println(max);
    }
}
