package clgjava;
import java.util.Scanner;
public class SearchArray_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p[]=new int[10];
        System.out.println("Fill the array");
        for(int i=0;i<10;i++){
            p[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<10;i++){
            if(p[i]==n){ count++; break; }
        }
        if(count>=1) System.out.println("Number is present");
        else System.out.println("Number is not present");
    }
}

