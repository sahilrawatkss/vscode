package dsa.array;

import java.util.ArrayList;

public class countpairs {
    public static void main(String[] args) {
        int[] arr={1, 5, 7, 1};
        int k=6;
        int n=4;

            ArrayList<Integer> al=new ArrayList<Integer>(n);
            for(int i=0;i<arr.length;i++)
            {
                al.add(arr[i]);
            }

            int count=0;
            for(int i=0;i<al.size();i++)
            {
                int k2=k-al.get(i);
                if(al.indexOf(k2)!=-1&&al.indexOf(k2)>i) {
                    count++;
                    al.remove(i);
                    i--;
                }
            }
        System.out.println(count);
        System.out.println(al);
    }
}
