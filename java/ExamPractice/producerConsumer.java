package ExamPractice;

public class producerConsumer {
    public static void main(String[] args) throws Exception {
        Solution obj=new Solution();
        obj.start();
        synchronized (obj)
        {
            System.out.println("main ");
            obj.wait();
            System.out.println("value of f: "+obj.f);
        }
    }
}
class Solution extends Thread
{
    int f=1;
    public void run()
    {
        synchronized (this)
        {
            try
            {
                int i=5;
                while(i>1)
                {
                    f*=i;
                    i--;
                    if(i==2)
                        notify();
                }

            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
