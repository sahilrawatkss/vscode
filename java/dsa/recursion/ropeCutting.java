package dsa.recursion;

public class ropeCutting {
    public static void main(String[] args) {
        System.out.println(maxPeices(108,12,9,11)-1);
    }
    static int maxPeices(int n,int a,int b,int c)
    {
        if(n==0)
            return 1;
        if(n<0)
            return -1;
        int res=Math.max(maxPeices(n-a,a,b,c),maxPeices(n-b,a,b,c));
        res=Math.max(res,maxPeices(n-c,a,b,c));

        if(res==-1)
            return -1;
        return res+1;
    }
}
