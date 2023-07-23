package dsa.string.basic;
import java.lang.Math;
public class uncommoncharecters {
    public static void main(String[] args) {
        String A="helloworld";
        String B="himister";
        StringBuilder sb=new StringBuilder();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<A.length();i++)
        {
            arr1[A.charAt(i)-97]++;
        }
        for(int i=0;i<B.length();i++)
        {
            arr2[B.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++)
        {
//            if(arr1[i]!=0&&arr2[i]!=0)
//            {
//                sb.append((char)(97+i));
//            }
        }
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
