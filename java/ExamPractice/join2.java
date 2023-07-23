package ExamPractice;

public class join2 {
    public static void main(String[] args) throws Exception{
    B obj=new B();
    Thread x=Thread.currentThread();
    obj.getthread(x);
    obj.start();
    for(int i=0;i<5;i++)
    {
        System.out.println(i+" Executing "+Thread.currentThread().getName());
    }
}
}

class B extends Thread
{
    Thread x;
    void getthread(Thread x)
    {
        this.x=x;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                x.join();
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

