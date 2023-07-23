package practicalprac;

public class joinInChild {
    public static void main(String[] args) {
        Jo2.x=Thread.currentThread();
        Jo2 ob=new Jo2();
        ob.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class Jo2 extends Thread
{
    static Thread x;
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
