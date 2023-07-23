package dsa.array;

public class EaseArray {
    public static void main(String[] args) {
        int arr[ ] = {2, 2, 0, 4, 0, 8};
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1]&&arr[i]!=0)
            {
                arr[i]=2*arr[i];
                arr[i+1]=0;
            }
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;j<n;j++)
        {
            arr[j]=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
