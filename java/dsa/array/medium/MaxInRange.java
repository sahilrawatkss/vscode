package dsa.array.medium;

public class MaxInRange {
    public static void main(String[] args) {
        int a[]={1,2,5,15,0,0,0};
        int b[]={5,8,7,18,1,2,3};

        int freq[]=new int[100];
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            freq[a[i]]++;
            freq[b[i]+1]--;
        }

        int value=-1;
        int max=-1;
        int count=0;
        for(int i=0;i<100;i++)
        {
            count=count+freq[i];
            if(count>max)
            {
                value=i;
                max=count;
            }
        }
        System.out.println(value);
    }
}
