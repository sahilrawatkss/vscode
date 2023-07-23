package dsa.array;

import java.math.BigInteger;

class demo{
    int id;
    String name;
    demo(int id,String name){
        this.id=id;
        this.name=name;//this here for values of demo class
    }

}
public class arr1 {
    public static void main(String[] args) {

//    int arr[]=new int[5];
//    array of class type
//        demo clsarr[]=new demo[5];
//        clsarr[0]=new demo(1,"ajay");
//        clsarr[1]=new demo(2,"jay");
//        clsarr[2]=new demo(3,"shyam");
//
//
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(clsarr[i].id+"  "+clsarr[i].name);
//        }

//        passing array to method
        int ar[]=new int[]{1,2,3,4,5};
        sum(ar);
    }

    static void sum(int[] ar){
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        String s="31415926535897932384626433832795";
        BigInteger bg=new BigInteger(s);
        System.out.println(bg);
    }
}
