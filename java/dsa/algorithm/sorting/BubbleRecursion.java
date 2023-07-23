package dsa.algorithm.sorting;

public class BubbleRecursion {
    public static void main(String[] args) {
       int[] arr={6, 3, 0, 5};
       sort(arr,arr.length);
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
    static void sort(int[] arr,int n)
    {
        int swap=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swap=1;
            }
        }
        if(swap==1)
        {
            sort(arr,n);
        }
    }
}
