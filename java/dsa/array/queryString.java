package dsa.array;

import java.util.Arrays;

public class queryString {
    public static void main(String[] args) {
        char[][] qu={{'1','2','d'},{'2','1','3','1'}};
        String s="abab";
        char arr[] = s.toCharArray();
        int n=4;
        int q=2;
        for(int i=0;i<q;i++)
        {
            if(qu[i].length==3)
            {
                int ind=qu[i][1]-'0';
                arr[ind]=qu[i][2];
            }
            else
            {
                int f=qu[i][1]-'0';
                int l=qu[i][2]-'0';
                char[] ch=new char[l];
                int k=0;
                for(int j=f;j<=l;j++)
                {
                    ch[k]=arr[j];
                    k++;
                }
                Arrays.sort(ch);
                int ind=qu[i][3]-'0';
                System.out.println(ch[ch.length-ind]);
            }
        }
    }
}
