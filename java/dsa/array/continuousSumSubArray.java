package dsa.array;

public class continuousSumSubArray {
    public static void main(String[] args) {
       //int[] arr={135 ,101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162 ,92, 196, 143, 28, 37, 192, 5, 103 ,154 ,93, 183, 22, 117 ,119, 96, 48, 127, 172, 139 ,70 ,113, 68, 100, 36, 95, 104 ,12 ,123 ,134};
        int[] arr={1,2,3,7,5};
//        int[] arr={1,1,1,100,10};
        int n=arr.length;
        int sum=arr[0];
        int j=0;
        int result=0;
        int i=0;
        while(i<n)
        {
            if(arr[i]==result)
            {
                sum=result;
                j=i;
                i=i+1;
                break;
            }

            while(sum<result&& i<n)
            {
                sum=sum+arr[i];
                i++;
                System.out.println(j+" "+sum+" "+i);
            }

            while(sum>result&&j<=i)
            {
                sum=sum-arr[j];
                j++;
                System.out.println(j+" 2 "+sum+" "+i);
            }


            if(sum==result)
            {
                if(sum==0)
                {

                }
                System.out.println((j+1)+" "+(i));
                break;
            }
        }
        if(sum==result)
        {
            System.out.println((j+1)+"new"+(i));
        }
        if(sum!=result)
        {
            System.out.println("-1");
        }
    }
}
