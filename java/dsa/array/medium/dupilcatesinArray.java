//package dsa.array.medium;
//
//import java.util.ArrayList;
//
//public class dupilcatesinArray {
//    public static void main(String[] args) {
//        int arr[]={2,3,1,5,6,2,3,1,0,2};
//        ArrayList<Integer> unq=new ArrayList<Integer>();
//        ArrayList<Integer> dup=new ArrayList<Integer>();
//        ArrayList<Integer> index=new ArrayList<Integer>();
//        int flag=1;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(unq.indexOf(arr[i])==-1)
//            {
//                unq.add(arr[i]);
//            }
//            else
//            {
//                if(dup.indexOf(arr[i])==-1)
//                {
//                    dup.add(arr[i]);
//                    flag=0;
//                }
//            }
//        }
//        for(int i=0;i<dup.size();i++)
//        {
//            index.add();
//        }
//        if(flag==1)
//        {
//            System.out.println(-1);
//        }
//        else
//        {
//            System.out.println(dup);
//        }
//    }
//}
