package dsa.array;

public class minijump {
    public static void main(String[] args) {
        int[] arr={10, 0,0,0,0, 6, 7, 6, 8, 9};
        int j=jump(arr);
        if(j==-1)
            System.out.println("Cant reach");
        else
            System.out.println("Jump required :"+j);
    }
     static int jump(int[] arr)
     {
         int n=arr.length;
         int k=0;
         int j=0;
         int min=0;
         int flag2=0;
         int index=0;
         if(arr[0]==0)
             return -1;
         for(int i=0;i<n;i++)
         {
             if(arr[i]>arr[k]&&arr[i]>arr[j]&&i<=k)
             {
                 j=i;
                 flag2=1;
             }
             if(flag2==0)
             {
                 j=i;
             }
             if(i==k)
             {
                 if(arr[j]==0)
                     return -1;
                 k=index+arr[j];
                 flag2=0;
                 index=k;
                 min++;
             }

             if(k>=n)
                 break;
         }
         return min;
     }
}
