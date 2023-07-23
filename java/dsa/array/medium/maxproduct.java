package dsa.array.medium;

public class maxproduct {
    public static void main(String[] args) {
        int[] arr={3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28};
        int n=arr.length;
        long maxvalue=findMax(arr,n);
        System.out.println("Max product :"+maxvalue);
    }
    static long findMax(int[] arr,int n)
    {
        long max=arr[0];
        long prod=1;
        for(int i=0;i<n;i++)
        {
            prod=prod*arr[i];
            max=Math.max(prod,max);
            if(prod==0)
            {
                prod=1;
            }
        }
        prod=1;
        for(int i=n-1;i>=0;i--)
        {

            prod=prod*arr[i];
            max=Math.max(prod,max);
            if(prod==0)
            {
                prod=1;
            }
        }
        return max;
    }
}
