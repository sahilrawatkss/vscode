package dsa.array;

public class nextPermutation {
    public static void main(String[] args) {
        int[] arr2={1,2,3,4,5};
        int[] arr={1,3,5,2,4};
        int[] arr3={5,4,3,2,1};

        int flag=1;
        System.out.print("Value:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        int flag2=1;
        while(flag2!=0) {
            int i1 = -1;
            int i2 = -1;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    i1 = i;
                    break;
                }
            }

            if (i1 == -1)
            {
                areverse(arr, 0);
                flag2=0;
            }
            else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (arr[i] > arr[i1]) {
                        i2 = i;
                        break;
                    }
                }
                swaps(arr, i1, i2);
                areverse(arr, i1 + 1);
            }
            System.out.print("\nNew Value:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    }

    static void swaps(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void areverse(int[] arr,int i)
    {
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
