package dsa.recursion;

public class Nto1 {
    public static void main(String[] args) {
        int a=10;
        recursive(a);
        System.out.println("");
        print1toN(a);
    }
    static void print1toN(int a)
    {
        if(a==0)
            return;
        print1toN(a-1);

        System.out.print(a+" ");
    }
    static void recursive(int a)
    {
        if(a==0)
            return;
        System.out.print(a+" ");
        recursive(a-1);
    }
}
