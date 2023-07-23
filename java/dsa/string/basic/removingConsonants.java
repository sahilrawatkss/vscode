package dsa.string.basic;

public class removingConsonants {
    public static void main(String[] args) {
        String str="xaeviyyEYBmOC";
        String s=new String();

        for(int i=0;i<str.length();i++)
        {
            if(isVowels(String.valueOf(str.charAt(i))))
            {
                s=s+str.charAt(i);
            }
        }

        System.out.println(s);
    }

    static boolean isVowels(String c)
    {
        if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
