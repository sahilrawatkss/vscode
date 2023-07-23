package dsa.array;

public class altNum {
    public static void main(String[] args) {
        int arr[]={9, 4, -2, -1, 5 ,0 ,-5, -3, 2};
        int n=arr.length;
        rearrange(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void rearrange(int arr[],int n)
    {
        int neg=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i] < 0)
            {
                neg++;
            }
        }
        if(neg==0||neg==n)
            return;
        int a=0;
        int b=n-1;
        int[] xarr=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                xarr[a++]=arr[i];
            }
            else
            {
                xarr[b--]=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(xarr[i]+" ");
        }
        System.out.println("");
        int len=0;
        int i=0;
        int j=0;
        int k=n-1;
        while(len<n)
        {
            if(j<=b) {
                arr[i++] = xarr[j++];
                len++;
            }
            if(k>b) {
                arr[i++] = xarr[k--];
                len++;
            }
        }

    }
}
