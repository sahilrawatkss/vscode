package dsa.array;

public class wavearray {
    public static void main(String[] args) {
        int[] arr=new int[]{10, 5, 6, 3, 2, 20, 100, 80};
        int n=arr.length;
        System.out.println("Array:");
        printarray(arr,n);

        System.out.println("Array in wave Form:");
        waveform(arr,n);
        printarray(arr,n);
    }
    static void waveform(int[] arr,int n)
    {

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
