package practicalprac;

public class joinInThread {
    public static void main(String[] args) throws Exception{
        Jo obj=new Jo();
        obj.start();
        obj.join();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class Jo extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}