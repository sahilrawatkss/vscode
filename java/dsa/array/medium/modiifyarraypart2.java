package dsa.array.medium;

public class modiifyarraypart2 {
    public static void main(String[] args) {
        long arr[]={1,2,3,4,5,6,7,8,9,10};
        rearrange(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static void rearrange(long[] arr,int n)
    {
        long val=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=val;
        reversearr(arr,1,n);
        int i=3;
        while(i<n-1)
        {
            reversearr(arr,i,n);
            i=i+1;
        }
    }
    static void reversearr(long[] arr,int i,int n)
    {
        for(int x=i,y=n-1;x<y;x++,y--)
        {
            long val=arr[x];
            arr[x]=arr[y];
            arr[y]=val;
        }
    }
}
