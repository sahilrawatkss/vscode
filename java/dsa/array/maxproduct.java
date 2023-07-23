package dsa.array;

public class maxproduct {
    public static void main(String[] args) {
        int[] arr={0,-2,0};
        int minindex=0;
        int maxindex=0;
        int newmin=0;
        int newmax=0;
        int prod=1;
        int max=arr[0];
        int ind1=-1;
        int ind1p=1;
        int ind2=-1;
        int ind2p=1;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            minindex = i;
            int k = 0;
            while (i < arr.length) {
                if (arr[i] == 0) {
                    i++;
                    if(count==0)
                    {
                        prod=0;
                    }
                    break;
                }

                if (ind1 == -1) {
                    ind1p = ind1p * arr[i];
                }
                if (arr[i] < 0 && ind1 == -1) {
                    ind1 = i;
                }
                if (arr[i] < 0) {
                    ind2 = i;
                    k++;
                }
                prod = prod * arr[i];
                i++;
                count++;
            }
            i--;
            if (prod > 0)
                maxindex = i;
            if (k > 2 && prod < 0) {
                for (int x = ind2; x <= i; x++) {
                    if(arr[x]!=0)
                        ind2p = ind2p * arr[x];
                }
                if (prod / ind1p >= prod / ind2p) {
                    prod = prod / ind1p;
                    minindex = ind1 + 1;
                    maxindex = i;
                } else if (prod / ind1p < prod / ind2p) {
                    prod = prod / ind2p;
                    maxindex = ind2 - 1;
                }
            }
            if(k==1)
            {
                if(count>1)
                {
                    for (int x = ind2; x <= i; x++) {
                        if(arr[x]!=0)
                            ind2p = ind2p * arr[x];
                    }
                    if(ind1p>ind2p)
                    {
                        prod=prod/ind1p;
                        maxindex=i;
                        minindex=ind2+1;
                    }
                    else {
                        prod=prod/ind2p;
                        maxindex=ind1-1;
                    }
                }
            }

            System.out.println(prod);
                if(prod>max)
                {
                    max=prod;
                    newmin=minindex;
                    newmax=maxindex;
                }
                if (arr[i] > max)
                {
                    newmin = i;
                    newmax = i;
                    max = arr[i];
                }
            ind1=-1;
            ind2=-1;
            ind1p=1;
            ind2p=1;
            prod=1;
            count=0;
        }
        System.out.println(max);
        System.out.println(newmin);
        for(int i=newmin;i<=newmax;i++)
        {
            System.out.print(i+" ");
        }
    }
}
