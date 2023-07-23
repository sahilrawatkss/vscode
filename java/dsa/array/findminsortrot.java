package dsa.array;

public class findminsortrot {
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,5,6,7,8,1,2};
        int result=findMin(arr,0,arr.length-1);

        System.out.println("index:"+result);
    }
    static int findMin(int[] arr,int f,int l)
    {
        int mid=(f+l)/2;
        if(f==l)
            return mid;
        if(arr[0]<arr[arr.length-1])
            return 0;
//        else if(arr[mid]<arr[mid-1])
//            return mid;
//        else if(arr[mid]<arr[f])
//            return findMin(arr,f,mid);
//        else
//            return findMin(arr,mid,l);
        if(f<l&&arr[mid]>arr[mid+1])
            return mid+1;
        if(f<l&&arr[mid-1]>arr[mid])
            return mid;
        if(arr[mid]<arr[f])
            return findMin(arr,f,mid-1);
        return findMin(arr,mid+1,l);
    }
}
