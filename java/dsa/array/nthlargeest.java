package dsa.array;

import java.util.Collections;
import java.util.PriorityQueue;

public class nthlargeest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int[] arr={3,2,1,5,6,4};
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int k=4;
        while(k>1)
        {
            pq.poll();
            k--;
        }
        System.out.println("Kth element:"+pq.peek());
    }
}
