package dsa.array;

public class kadanealgo {
    public static void main(String[] args) {
        int[] arr={ -2, -3, 4, -1, -2, 1, 5, -3 };
        int n=arr.length;
        int maxsum=0;
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            maxsum=maxsum+arr[i];
            if(maxsum>max)
            {
                max=maxsum;
            }
            if(maxsum<=0)
            {
                maxsum=0;
            }

        }
            System.out.println(max);
    }
}
