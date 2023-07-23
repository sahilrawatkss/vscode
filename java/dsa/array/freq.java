package dsa.array;

public class freq {
    public static void main(String[] args) {
        int arr[]={2, 3, 2, 3, 5};
        int n=arr.length;
        int arrcpy[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if (arr[i]<n&&arr[i]>0)
            {
                arrcpy[arr[i]-1]++;
            }
        }
        arr=arrcpy;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
