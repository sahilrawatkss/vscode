package dsa.array;

public class rightleftgreat {
    public static void main(String[] args) {
        int A[] = {11, 9, 12};
        System.out.println(findElement(A,A.length));
    }
    static int findElement(int arr[], int n){
        int i=n-1;
        while(i>0&&arr[i]>arr[i-1])
        {
            i--;
        }
        if(i==0)
            return -1;
        int x=i-1;
        while(x>=0&&i<n)
        {
            if(arr[i]<arr[x])
            {
                i++;
            }
            else
            {
                x--;
            }
        }
        if(i==n-1)
            return -1;
        return arr[i];
    }
}
