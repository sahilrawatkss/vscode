package dsa.array;

//Reverse of array using recursion
public class reverse {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        System.out.println("array:");
        printarray(arr);
        System.out.println("Reverse of array");
        reversearray(arr,0,arr.length-1);
        printarray(arr);
    }
    static void reversearray(int[] arr,int start,int end)
    {
        if(start>=end)
            return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reversearray(arr,start+1,end-1);
    }

    static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
