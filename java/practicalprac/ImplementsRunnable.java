package practicalprac;

public class ImplementsRunnable {
    public static void main(String[] args) {
        Thread obj=new Thread(new Cls());
        obj.start();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class Cls implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
