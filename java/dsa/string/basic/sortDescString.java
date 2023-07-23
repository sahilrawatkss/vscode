package dsa.string.basic;

public class sortDescString {
    public static void main(String[] args) {
        String str="geeks";
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-97]++;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            while(arr[i]!=0) {
                sb.append((char) (i + 97));
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
