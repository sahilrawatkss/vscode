package dsa.array.searching;

public class ternarysearch {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60,70,80,90,100,110,120,130,140};//sorted array is needed
        int n=arr.length-1;
        int check=140;
        int x=ternary(arr,n,0,check);
        if(x==-1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element "+check+" present in array at index "+x);
    }
    static int ternary(int arr[],int max,int min,int check){
        if(min<=max){
            int mid1=min+(max-min)/3;
            int mid2=max-(max-min)/3;
            if(arr[mid1]==check)
                return mid1;
            if(arr[mid2]==check)
                return mid2;
            if(check<=arr[mid1])
                return ternary(arr,mid1-1,min,check);
            else if(check<=arr[mid2])
                return ternary(arr,mid2-1,mid1+1,check);
            else
                return ternary(arr,max,mid2+1,check);
        }
        return -1;
    }
}
