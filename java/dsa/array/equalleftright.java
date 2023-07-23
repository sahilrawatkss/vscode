package dsa.array;

import java.sql.SQLOutput;

public class equalleftright {
    public static void main(String[] args) {
        int[] A={1,3,5,2,2};
        int N=A.length;
        int sum=0;
        for(int i=1;i<N;i++)
        {
            sum=sum+A[i];
        }
        int sum2=0;
        int i=0;
        while(i<N-1)
        {
            if(sum2==sum)
            {
                System.out.println(i+1);
                break;
            }
            else
            {
                i++;
                sum2=sum2+A[i-1];
                sum=sum-A[i];
            }
        }
    }
}
