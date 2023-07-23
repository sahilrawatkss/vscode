package practicalprac;

public class InterThreadCom {
    public static void main(String[] args) throws Exception{
        tcom obj=new tcom();
        obj.start();
        synchronized (obj)
        {
            obj.wait();
        }
        System.out.println(obj.f);
    }
}
class tcom extends Thread
{
    int f=1;
    public void run()
    {
        synchronized (this)
        {
            int n=5;
            while(n>0)
            {
                f=f*n;
                n--;
            }
            notify();
        }
    }
}