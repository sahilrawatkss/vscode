package dsa.algorithm.sorting;

public class InsertionDesc {
    public static void main(String[] args) {
        int arr[]={12, -1,11, 13, 5, 6,0};
        int n=arr.length;
        for(int i=n-1;i>0;i--)
        {
            int j=i;
            while(j<n&&arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}