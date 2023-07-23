package clgjava;

import java.util.Scanner;

public class EvenDigitSum_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 5 digit number:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            if(digit%2==0)
            {
                sum=sum+digit;
            }
            num=num/10;
        }
        System.out.println("Sum of Even Digits:"+sum);
    }
}
