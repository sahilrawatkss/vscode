package dsa.array;

public class missingandduplicate {
    public static void main(String[] args) {
        int[] arr={1,1,2,4,3};
        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i-1]!=i)
             {
                 int temp=arr[i-1];
                 arr[i-1]=arr[temp-1];
                 arr[temp-1]=temp;

             }
        }

        for(int i=1;i<=arr.length;i++)
        {
            if(arr[i-1]!=i)
            {
                System.out.println("Repeat Element:"+arr[i-1]);
                System.out.println("Missing Element:"+i);
                break;
            }
        }
    }
}
