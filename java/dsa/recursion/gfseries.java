package dsa.recursion;


public class gfseries {
    public static void main(String[] args) {
        int n=6;
        gfSeries(n);
    }
    static void gfSeries(int N){
        if(N==2)
        {
            System.out.print("0 1 ");
            return;
        }
        if(N==1)
            System.out.print("0 ");
        if(N>2)
        {
            gfSeries(N-1);
            System.out.print((term(N-2)*term(N-2))-term(N-1)+" ");
        }
    }
    static int term(int n)
    {
        if(n==2)
            return 1;
        if(n==1)
            return 0;
        return (term(n-2)*term(n-2)-term(n-1));
    }
}
