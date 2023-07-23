package dsa.string.basic;

public class sandwichString {
    public static void main(String[] args) {
        String str="ababaeiousdada";

        String s=new String();

        for(int i=0;i<str.length();i++)
        {
            if(i!=0&&i!=str.length()-1&&isVowels(str.charAt(i))&&!isVowels(str.charAt(i-1))&&!isVowels(str.charAt(i+1)))
            {
                continue;
            }
            else
            {
                s=s+str.charAt(i);
            }
        }
        System.out.println(s);
    }

    static boolean isVowels(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
