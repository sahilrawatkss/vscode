package dsa.string.basic;

public class longestName {
    public static void main(String[] args) {
        String[] str={ "Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks" };
        int lengthindex=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()>str[lengthindex].length())
            {
                lengthindex=i;
            }
        }
        System.out.println(str[lengthindex]);
    }
}
