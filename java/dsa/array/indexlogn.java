package dsa.array;

public class indexlogn {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};

        int result = find(arr, 0, arr.length - 1, 3);

        if(result==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("Found at index "+result);
        }
    }

    static int find(int[] arr, int f, int l, int num) {
        if (f > l)
            return -1;
        int mid = (f + l) / 2;

        if (arr[mid] == num) {
            return mid;
        }
        if (arr[f] <= arr[mid])
        {
            if (num <= arr[mid] && num >= arr[mid])
            {
                return find(arr,f,mid-1,num );
            }
            else
            {
                return find(arr,mid+1,l,num);
            }
        }

        if(num >=arr[mid]&&num<=arr[l])
        {
            return find(arr,mid+1,l,num);
        }
        return find(arr,f,mid-1,num);
    }
}
