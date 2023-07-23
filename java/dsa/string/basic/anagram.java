package dsa.string.basic;

public class anagram {
    public static void main(String[] args) {
        String S="geeekksogeeks";
        int arr[]=new int[26];
        for(int i=0;i<S.length();i++)
        {
            arr[S.charAt(i)-97]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        if(count<2)
        {
            System.out.println("Anagram is Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}
