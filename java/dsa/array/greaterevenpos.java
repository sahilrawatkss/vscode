package dsa.array;

public class greaterevenpos {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,4,7,13,56,12,8,2,4};
        int n=arr.length;
        System.out.print("Array:    ");
        printarray(arr,n);
        rearrange(arr,n);
        System.out.print("Rearranged array:   ");
        printarray(arr,n);

    }

    static void rearrange(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(i%2==0)
            {
                if(arr[i]>arr[i-1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                }
            }
            else
            {
                if(arr[i]<arr[i-1])
                {
                    int temp=arr[i-1];
                    arr[i-1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    static void printarray(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
