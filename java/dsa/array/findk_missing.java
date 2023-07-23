package dsa.array;

public class findk_missing {
    public static void main(String[] args) {
    int[] arr=new int[]{2,3,4,6,7,10};
        System.out.println(findKthPositive(arr,4));

    }
    static int findKthPositive(int[] arr, int k)
            {
            int count = 0;
            int n = arr.length;
            int j = 0;
            int i = 1;
            while (true)
            {
                if (j < n && arr[j] == i)
                    j++;
                else
                    count++;

                if (count == k)
                    break;

                i++;
            }
            return i;
        }
    }
