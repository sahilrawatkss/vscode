package dsa.algorithm.sorting;

public class Countsort {
    public static void main(String[] args) {
        String arr = "edsab";
        StringBuilder sb=new StringBuilder();
        int alph[]=new int[26];
        for(int i=0;i<arr.length();i++)
        {
            alph[arr.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++)
        {
            while(alph[i]>0)
            {
                sb.append((char)(i+97));
                alph[i]--;
            }
        }
        arr=new String(sb);
        System.out.println(arr);
    }
}
