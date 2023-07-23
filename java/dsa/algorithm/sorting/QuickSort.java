package dsa.algorithm.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={30,80,10,90,40,50,70};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static int partition(int[] arr,int low,int high)
    {
        int p=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<p)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
