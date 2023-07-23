package dsa.array.medium;

public class modifyArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        rearrange(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void rearrange(int[] arr,int n)
    {
        int i=0;
        while(i<n)
        {
            int val=arr[n-1];
            shift(arr,i,n);
            arr[i]=val;
            i=i+2;
        }
    }
    static void shift(int arr[],int i,int n)
    {
        for(int j=n-1;j>i;j--)
        {
            arr[j]=arr[j-1];
        }
    }
}
