package dsa.string.basic;

public class firstRepeat {
    public static void main(String[] args) {
        String S="GEEKS FOR GEEKS";
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[26];
        for(int i=0;i<S.length();i++)
        {
            arr[S.charAt(i)-97]++;
        }
        for(int i=0;i<S.length();i++)
        {
            arr[S.charAt(i)-97]++;
            if(arr[S.charAt(i)]==3)
            {
                System.out.println(S.charAt(i));
                break;
            }
        }
    }
}
