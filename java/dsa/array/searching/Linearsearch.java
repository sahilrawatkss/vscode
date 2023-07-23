package dsa.array.searching;

public class Linearsearch {

    static int ar2[]=new int[]{10,8,6,4,2};

    public static void main(String[] args) {
//        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,0};
//        int x=7;
//        int y=11;
//        int s=search(arr,x);
//        if(s==-1)
//            System.out.println("element "+x+" not present in array");
//        else
//            System.out.println("element "+x+" present in array at index "+s);

        int a=linearsearch(ar2,ar2.length,11);
        if(a==-1)
            System.out.println("not found");
        else {
            System.out.println("found at index :"+a);
        }
    }



//    static int search(int arr[],int x){
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i]==x)
//                return i;
//        }
//        return -1;
//    }

//    linear search through recursion
    static int linearsearch(int arr[],int size,int x){
        if(size==0)
            return -1;
        else if(arr[size-1]==x)
            return size-1;
        else
            return linearsearch(arr,size-1,x);
    }
}
