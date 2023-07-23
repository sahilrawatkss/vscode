package dsa.array;

public class zeroOneDiffMax {
    public static void main(String[] args) {
        String str="11000010001";
        char[] s=str.toCharArray();
        int diff=0;
        int zero=0;
        int one=0;
        int maxdiff=-1;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='0')
                zero++;
            else
                one++;

            diff=zero-one;
            if(diff>maxdiff)
                maxdiff=diff;
            if(diff<=0)
            {
                diff=0;
                zero=0;
                one=0;
            }
        }
        System.out.println(maxdiff);
    }
}
