package clgjava;

import java.util.Scanner;
public class DeleteElement_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p[]=new int[10];
        int d[]=new int[9];
        System.out.println("Fill the array");
        for(int i=0;i<10;i++){
            p[i]=sc.nextInt();
        }
        System.out.println("Enter a number to delete");
        int n=sc.nextInt();
        for(int i=0,k=0;i<10;i++) {
            if(p[i]!=n){
                d[k]=p[i];
                k++;
            }
        }
        for(int i=0;i<9;i++)
            System.out.print(d[i]+" ");
    }
}

