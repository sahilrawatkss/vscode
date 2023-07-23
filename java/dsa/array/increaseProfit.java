package dsa.array;

public class increaseProfit {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};

        int minindex=arr.length-2;
        int maxindex=arr.length-1;
        int min=arr[minindex];
        int max=arr[maxindex];
        int diff=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<max&&i<maxindex)
            {
                min=arr[i];
                minindex=i;
                System.out.println("min:"+min);
            }
            if(arr[i]>max)
            {
                max=arr[i];
                maxindex=i;
                System.out.println("max"+max);
            }
            if(minindex<maxindex)
            {
                System.out.println("Diff"+diff);
                if(diff<max-min)
                    diff=max-min;
            }

        }

        if(min>max)
        {
            System.out.println("Not Buying");
        }
        else
        {
            System.out.println("Profit:"+diff);
        }
    }
}
