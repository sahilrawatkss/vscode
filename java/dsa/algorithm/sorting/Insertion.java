package dsa.algorithm.sorting;

public class Insertion {
    public static void main(String[] args) {
        int arr[]={12, -1,11, 13, 5, 6,0};
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0&&arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
