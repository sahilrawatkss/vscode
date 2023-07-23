package clgjava;

class CyclicSum
{
    public static void main(String[] args)
    {
        int sum=0;
        int i=5;
        int num=12345;
        System.out.println("Number: 12345");
        while(num>0)
        {
            sum=sum+i*(num%10);
            num=num/10;
            i--;
        }
        System.out.println("Sum: "+sum);
    }
}

