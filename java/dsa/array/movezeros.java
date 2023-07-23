package dsa.array;

public class movezeros {
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,0,1,1,2,2,15,0,1,0,7,0,8,0,13};
        int j=0,k=0;
        int l=arr.length;
        System.out.println("Array:  ");
        printarray(arr,l);
        System.out.println("");

        for(int i=0;i<l;i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j;i<l;i++)
        {
            arr[i]=0;
        }
        System.out.println("New Array:  ");
        printarray(arr,l);
    }

    static void printarray(int[] arr,int l)
    {
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
