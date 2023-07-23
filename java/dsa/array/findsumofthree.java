package dsa.array;

import java.util.Arrays;

public class findsumofthree {
    public static void main(String[] args) {
        int[] arr=new int[]{12, 3, 4, 1, 6, 9};
        Arrays.sort(arr);
        int n=arr.length;
        System.out.println(output(arr,n));
    }

    static int output(int[] arr,int n)
    {
        int i,j,k;
        for(i=0;i<n;i++)
        {
            j=i+1;
            k=n-1;
            while(j<k)
            {
                if(arr[i]+arr[j]+arr[k]==25)
                {
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    return 1;
                }
                else if(arr[i]+arr[j]+arr[k]<24)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return 0;
    }
}
