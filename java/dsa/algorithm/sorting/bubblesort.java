package dsa.algorithm.sorting;

public class bubblesort {
    public static void main(String[] args) {
        int arr[]={6, 3, 0, 5};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int opt=1;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    opt=0;
                }
            }
            if(opt==1)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
