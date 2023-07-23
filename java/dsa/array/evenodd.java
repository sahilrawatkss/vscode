package dsa.array;

public class evenodd {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,4,7,6,9,10};
        int n=arr.length;
        rearrange(arr,n);
        printarray(arr,n);
    }
    static void rearrange(int[] arr,int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }

    static void printarray(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
