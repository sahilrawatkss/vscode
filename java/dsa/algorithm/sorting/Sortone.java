package dsa.algorithm.sorting;

public class Sortone {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,0};
        int n=arr.length;
        int val=arr[n-1];

        for(int j=n-2;j>=0;j--)
        {
            if(val<arr[j])
            {
                arr[j+1]=arr[j];
            }
            if(val>arr[j])
            {
                arr[j+1]=val;
                break;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            if(j==0)
            {
                arr[j]=val;
                break;
            }

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
