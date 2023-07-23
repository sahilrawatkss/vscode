package dsa.string.basic;

import java.sql.SQLOutput;

public class fakeVowels {
    public static void main(String[] args) {
     String a = "plkaitw";
     int count=0;
     for(int i=0;i<a.length();i++)
     {
         if(!isVowels(a.charAt(i)))
         {
             count++;
         }
     }
     if(count%2==0)
     {
         System.out.println("She!");
     }
     else {
         System.out.println("He!");
     }
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
