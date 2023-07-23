package dsa.algorithm.sorting;

public class InsertionRecu {
    public static void main(String[] args) {
        int arr[]={12,11,13,5,6};
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            sort(arr,i);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static  void sort(int arr[],int j)
    {
        if(j>0&&arr[j-1]>arr[j])
        {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            sort(arr,j-1);
        }
    }
}
