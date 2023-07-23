package dsa.array;

public class checkrotation {
    public static void main(String[] args) {
        int[] arr=new int[]{5 ,1 ,2 ,3 ,4};
        int n=arr.length;
        System.out.println("Array:");
        printArray(arr,n);

        System.out.println("Rotation Count:"+ myCount(arr,0,n-1));
//       System.out.println("Rotation count:"+count(arr,0,n-1));
    }

//    static int count(int[] arr,int f,int l)
//    {
//        int mid=(f+l)/2;
//        if(arr[0]<arr[arr.length-1])
//            return 0;
//        if(arr[mid]<arr[mid-1])
//            return mid;
//        if(arr[f]>arr[mid])
//            return count(arr,f,mid-1);
//        return count(arr,mid+1,l);
//    }

    static void printArray(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static int myCount(int[] arr,int l,int h)
    {
        int mid;
        if(arr[0]<arr[arr.length-1])
            return 0;
        int flag=1;
        while(flag==1&&l<=h)
        {
            mid=(l+h)/2;
            if(arr[mid]<arr[mid-1])
            {
                return mid;
            }
            else if(arr[l]>arr[mid])
                h=mid-1;
            else if(arr[mid]>arr[h])
                l=mid+1;
        }
        return 0;
    }
}
