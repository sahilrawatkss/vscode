package dsa.array;

public class findPeak {
    public static void main(String[] args) {
        int[] arr=new int[]{1,15,25,45,49,79,17,12,11};
        int n=arr.length;
        int peakindex=find(arr,0,n-1);
        System.out.println("Peak Element is "+arr[peakindex]);
    }
    static int find(int[] arr,int f,int l)
    {
        if(arr[f]>arr[f+1])
            return arr[f];
        if(arr[l]>arr[l-1])
            return arr[l];
        while(f<=l)
        {
            int mid=(f+l)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
                return mid;
            else if (arr[mid]>arr[mid-1])
            {
                f=mid+1;
            }
            else
                l=mid-1;
        }
        return 0;
    }
}
