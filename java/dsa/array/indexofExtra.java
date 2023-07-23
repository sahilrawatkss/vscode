package dsa.array;

public class indexofExtra {
    public static void main(String[] args) {
        int a[]={2,4,6,8,9,10,12};
        int b[]={2,4,6,8,10,12};
        System.out.println(findIndex(a,b,a.length));
    }
    static int findIndex(int[] a,int[] b,int n)
    {
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            if(a[i]!=b[i])
                return i;
            if(a[j]!=b[j-1])
                return j;
        }
        return -1;
    }
}
