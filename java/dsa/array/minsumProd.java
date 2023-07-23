package dsa.array;

public class minsumProd {
    public static void main(String[] args) {
      int a[] = {1, 2, -3};
        int b[]  = {-2, 3, -5};
      int n=a.length;
      int ind=0;
      int k=5;
      int min=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
          int z=a[i]-k*2;
          int x=a[i]+k*2;

          if(z*b[i]<min)
          {
              min=z*b[i];
              ind=i;
          }
          if(x*b[i]<min)
          {
              min=x*b[i];
              ind=i;
          }
          if(z*b[i]==min||x*b[i]==min)
          {
              if(b[i]>b[ind])
              {
                  ind=i;
              }
          }
      }
      a[ind]=min/b[ind];
      min=0;
      for(int i=0;i<n;i++)
      {
          min=min+a[i]*b[i];
      }
        System.out.println(min);
    }
}
