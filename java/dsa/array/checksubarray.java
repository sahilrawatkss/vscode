package dsa.array;

public class checksubarray {
    public static void main(String[] args) {
        int[] arr={1,12,34,5,7,7,8,15,17,2,14,14};
        int n=arr.length;
        int[] subarr={34,5,7,7,8,15};
        int n2=subarr.length;
        int j=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(j==n2)
                break;

            if(arr[i]!=subarr[j]&&j<n2)
            {
                flag=0;
                j=0;
            }
            if(arr[i]==subarr[j]&&j<n2)
            {
                flag=1;
                j++;
            }
        }

        if(flag==1)
        {
            System.out.println("Subarray present");
        }
        else
        {
            System.out.println("Sub array not present");
        }
    }
}
