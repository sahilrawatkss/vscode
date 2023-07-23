package ExamPractice;

public class join {
    public static void main(String[] args) throws Exception{
        A obj=new A();
        obj.start();
        obj.join();
        for(int i=0;i<5;i++)
        {
            System.out.println(i+" Executing "+Thread.currentThread().getName());
        }
    }
}

class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i + " Executing " + Thread.currentThread().getName());
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
