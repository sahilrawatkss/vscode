package dsa.string.basic;

public class marssos {
    public static void main(String[] args) {
        String str="soslolsolsos";
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i+=3)
        {
               if(str.charAt(i)!='S')
                   count++;
               if(str.charAt(i+1)!='O')
                   count++;
               if(str.charAt(i+2)!='S')
                   count++;
        }
        System.out.println(count);
    }
}
