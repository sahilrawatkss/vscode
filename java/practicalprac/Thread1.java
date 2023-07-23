package practicalprac;
import java.lang.*;
public class Thread1 extends Thread
{
    public void run()
    {
        for (int i=0; i<3 ; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }
    public static void main(String[]args)
    {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        // this will call run() method
        t1.start();
        t2.start();
        for (int i=0; i<3; i++)
        {
            // Control passes to child thread
            t1.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }
}
