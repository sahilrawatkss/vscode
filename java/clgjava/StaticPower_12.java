package clgjava;
import java.util.Scanner;
public class StaticPower_12 {
    public static int pow(int n1, int n2)
    {
        int po=1;
        while(n2>=1){
            po=po*n1;
            n2--;
        }
        return po;
    }
    public static double pow(double n1,int n2){
        double po=1;
        while(n2>0.0){
            po=po*n1;
            n2--;
        }
        return po;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values:");
        int n1=sc.nextInt();
        double n2=sc.nextDouble();
        System.out.println("Enter power");
        int pow=sc.nextInt();

        System.out.println("Value n1 after power: "+ pow(n1,pow));
        System.out.println("Value n2 after power: "+ pow(n2,pow)); }
}

