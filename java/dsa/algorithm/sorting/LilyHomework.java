package dsa.algorithm.sorting;

public class LilyHomework {
    public static void main(String[] args) {
        int arr[]={3,4,2,5,1};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            if(arr[min]!=arr[i])
            {
                count++;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            for(int k=0;k<n;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println("");
        }
        System.out.println(count);
    }
}

