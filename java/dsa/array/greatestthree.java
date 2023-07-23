package dsa.array;

public class greatestthree {
    public static void main(String[] args) {
        int[] arr=new int[]{100,40,3,45,67,8,1,12};
        int first,second,third;
        first=second=third=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                third=second;
                second=first;
                first=arr[i];
            }
            else if (arr[i]>second)
            {
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third)
            {
                third=arr[i];
            }
        }

        System.out.println("Greatest three numbers are "+first+" "+second+" "+third);
    }
}
