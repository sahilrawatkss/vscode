package dsa.string.basic;

public class reverseunique {
    public static void main(String[] args) {
        String s="GEEKS FOR GEEKS";
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[26];
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                arr[s.charAt(i)-65]++;
                if(arr[s.charAt(i)-65]==1)
                {
                    sb.append(s.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
