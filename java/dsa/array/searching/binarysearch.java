package dsa.array.searching;

public class binarysearch {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int x=10;
        int y=rec(arr,x,0,arr.length-1);
        if(y==-1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element "+x+" present in array at index: "+y);
    }
//    static int rec(int arr[],int x,int min,int max){
//        int y=(min+max-1)/2;
//        if(x<=arr[y]){
//             max=y;
//        }
//        else{
//            min=y+1;
//        }
//        if(x==arr[y])
//            return y;
//        else if (min==max)
//            return -1;
//        else
//            return rec(arr,x,min,max);
//    }


        static int rec(int arr[],int x,int min,int max){
            if(min<=max){
                int mid=(min+max)/2;//best case to use: mid=min+(max-min)/2
                if(x<=arr[mid]){
                    max=mid-1;
                }
                else{
                    min=mid+1;
                }
                if(x==arr[mid]){
                    return mid;
                }
                return rec(arr,x,min,max);

            }
            return -1;
        }
}
