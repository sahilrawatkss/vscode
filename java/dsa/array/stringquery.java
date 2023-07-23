package dsa.array;

import java.util.Scanner;

public class stringquery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stringsize=sc.nextInt();

        String[] str=new String[stringsize];
        for(int i=0;i<stringsize;i++)
        {
            str[i]=sc.next();
        }

        int querysize=sc.nextInt();
        String[] query=new String[querysize];
        for(int i=0;i<querysize;i++)
        {
            query[i]=sc.next();
        }

        for(int i=0;i<querysize;i++)
        {
            int count=0;
            for(int j=0;j<stringsize;j++)
            {
                if(query[i].compareTo(str[j])==0)
                    count++;
            }
            System.out.print(count+" ");
        }
    }
}
