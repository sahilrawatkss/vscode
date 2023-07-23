package clgjava;

public class ArgsAvg_1{
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i< args.length;i++)
        {
            int val=Integer.parseInt(args[i]);
            sum=sum+val;
        }
        System.out.println("Average: "+sum/4);
    }
}
