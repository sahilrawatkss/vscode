package dsa.array;

public class UandA {
    public static void main(String[] args) {
        int[] ar1=new int[]{1,2,3,4,6,7,9};
        int[] ar2=new int[]{5,6,7,8,13,15,17,21,23,56};
        int f1=0,f2=0;
        int l1=ar1.length-1;
        int l2=ar2.length-1;

        if(ar1[l1]<ar2[f2])
        {
            System.out.println("Union of arrays:  ");
            for(int i=f1;i<=l1;i++)
            {
                System.out.print(ar1[i]+" ");
            }
            for(int i=f2;i<=l2;i++)
            {
                System.out.print(ar2[i]+" ");
            }

            System.out.println("Intersection of array is:NULL");
        }
        else
        {
            System.out.println("Union of arrays:  ");
//            union(ar1,ar2,f1,l1,f2,l2);
        }
    }

//    static void union(int[] ar1,int[] ar2,int f1,int l1,int f2,int l2)
//    {
//        int mid=f1+(l1-f1)/2;
//        if(ar1[mid]==ar2[f2]||(ar1[mid]>ar2[f2]&&ar2[f2]>ar1[mid-1])
//        {
//
//        }
//    }
}
