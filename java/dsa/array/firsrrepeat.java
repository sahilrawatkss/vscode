package dsa.array;

import java.util.ArrayList;

public class firsrrepeat {
    public static void main(String[] args) {
        int[] arr={1, 5, 3, 4, 3, 5, 6};
        System.out.println("Index: "+firstRepeated(arr,arr.length));
    }
        // Function to return the position of the first repeating element.
        public static int firstRepeated(int[] arr, int n) {
            ArrayList<Integer> al=new ArrayList<Integer>(n);
            int index=n-1;
            for(int i=0;i<n;i++)
            {
                if(al.indexOf(arr[i])!=-1)
                {
                    if(al.indexOf(arr[i])<index)
                    {
                        index=al.indexOf(arr[i]);
                    }
                }
                else
                {
                    al.add(arr[i]);
                }

            }
            if(index!=n-1)
            {
                return index;
            }
            return -1;
        }
    }
