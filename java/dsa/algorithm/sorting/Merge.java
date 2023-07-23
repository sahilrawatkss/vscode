package dsa.algorithm.sorting;

public class Merge {
    public static void main(String[] args) {
        int arr[]={12,11,13,5,6,7};
        sort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int[] arr,int f,int l)
    {
        if(f<l)
        {
            int m=f+(l-f)/2;
            sort(arr,f,m);
            sort(arr,m+1,l);

            merge(arr,f,m,l);
        }
    }

    static void merge(int[] arr,int f,int m,int l)
    {
        int n1=m-f+1;
        int n2=l-m;

        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int i=0;
        int j=0;
        for(i=0;i<n1;i++)
        {
            a1[i]=arr[f+i];
        }
        for(j=0;j<n2;j++)
        {
            a2[j]=arr[m+1+j];
        }
        int k=f;
        i=0;
        j=0;
        while(i<n1&&j<n2)
        {
            if(a1[i]<=a2[j])
            {
                arr[k]=a1[i];
                i++;
            }
            else {
                arr[k]=a2[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
}
