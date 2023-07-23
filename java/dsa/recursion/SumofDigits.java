package dsa.recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int num=9987;
        System.out.println(sumNum(num,0));
    }
    static int sumNum(int num,int sum)
    {
        if(num<=0)
        {
            return sum;
        }
        sum=sum+num%10;
       return sumNum(num/10,sum);
    }
}
