package dsa.array;

public class findMissing {
    public static void main(String[] args) {
//        int[] arr={0, 1, 2, 3, 4, 5, 6, 7, 10};
//        int[] arr={0,1,2,3,4,5};
//        int[] arr={1,2,3,4,5};
        int[] arr={0,2,3,4,5,6,7};
        int n=arr.length;
        int missing=find(arr,arr.length);
        if(missing==-1)
            System.out.println("No number is missing");
        else
            System.out.println("Missing Number:"+missing);
    }
    static int find(int[] arr,int n)
    {
        int f=0;
        int l=n-1;
        if(arr[f]!=0)
            return 0;
        while (f<=l)
        {
            int mid=(f+l)/2;
            if (arr[mid]!=mid&&arr[mid-1]==mid-1) {
                return mid;
            }
            if (arr[mid]==mid)
            {
                f=mid+1;
            }
            else
            {
                l=mid-1;
            }
        }
        return -1;
    }
}
