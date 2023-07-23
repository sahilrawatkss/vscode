package dsa.array.searching;

public class sentinallinearsearch {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,30,40,50,60,70,80,90};
        int last=arr.length-1;
        int search=80;
        srch(arr,search,last);
    }

    static void srch(int arr[],int search,int last){
        int i=0;
        int l=arr[last];
        arr[last]=search;
        while(arr[i]!=search)
            i++;
        if(i<last||l==search)
            System.out.println("Element present in array at index:"+i);
        else
            System.out.println("Element not present in array");
    }
}
