package dsa.array;

import java.util.ArrayList;

public class haspair {
    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, 10, 8};

        int x=16;
        ArrayList<Integer> al=new ArrayList<Integer>(6);
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
        for(int i=0;i<al.size();i++)
        {
            int k2=x-al.get(i);
            if(al.indexOf(k2)!=-1&&al.indexOf(k2)!=i)
            {
                System.out.println("True");
                break;
            }
        }
//SEcond method
//        int sum=0;
//        int i=0;
//        int j=n-1;
//        Arrays.sort(arr);
//        while(i<j)
//        {
//            sum=arr[i]+arr[j];
//            if(sum==x)
//            {
//                System.out.println("true");
//            }
//            if(sum>x)
//            {
//                j--;
//            }
//            else
//            {
//                i++;
//            }
//        }
//        System.out.println("False");
    }
}
