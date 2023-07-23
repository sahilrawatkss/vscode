package dsa.string.basic;

public class pangram {
    public static void main(String[] args) {
        String str="We promptly judged antique ivory buckles for the net prize";
        str=str.toLowerCase();
        int[] arr=new int[26];
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)!=' ')
            {
                arr[str.charAt(i)-97]++;
            }
        }
        int flag=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                flag=0;
                System.out.println("not pangram");
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("pangram");
        }
    }
}
