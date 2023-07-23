package dsa.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str="abcba";
        if(checkPalin(str,0,str.length()-1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
    static boolean checkPalin(String str,int f,int l)
    {
        if(f>=l)
        {
            return true;
        }

        return (str.charAt(f)==str.charAt(l)&&checkPalin(str,f+1,l-1));
    }
}
