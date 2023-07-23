package dsa.array;

public class miniincrment {
    public static void main(String[] args) {
        int[] arr={4,7,19,16};
        int n=arr.length;
        System.out.println("output: "+increment(arr,n));
    }
    static int increment(int[] arr,int n)
    {
        int inc=0;
        int flag=1;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if((arr[0]-arr[i])%3!=0)
                flag=0;
            if(max<arr[i])
                max=arr[i];
        }
        if (flag==0)
            return -1;
        for(int i=0;i<n;i++)
        {
            inc=inc+(max-arr[i])/3;
        }
        return inc;
    }
}
