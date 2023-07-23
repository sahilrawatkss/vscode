package practicalprac;
import java.lang.Math;
public class ques1
{
    public static void main(String[] args) throws Exception{
        child1 obj=new child1();
        obj.start();
        for(int i=100;i<1000;i++)
        {
            int num=i,arm=0;
            while(num>0)
            {
                int rem=num%10;
                arm=arm+rem*rem*rem;
                num=num/10;
            }
            if(arm==i)
            {
                System.out.println("Armstrong: "+i);
            }
        }
    }
}

class child1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            try
            {
//                Thread.sleep(300);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            if(i%2==0)
            {
                System.out.println("Even num: "+i);
            }
        }
    }
}
