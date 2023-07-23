package dsa.array;

public class segregate0_1 {
    public static void main(String[] args) {
        int[] arr={1};
        int n=arr.length;
        segregating(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void segregating(int[] arr,int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                arr[j]=0;
                j++;
            }
        }
        for(int i=j;i<n;i++)
        {
            arr[i]=1;
        }
        return;
    }
}
