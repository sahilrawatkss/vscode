package ExamPractice;

public class RunnableThread {
    public static void main(String[] args) {
        for(int i=0;i<7;i++)
        {
            Thread obj = new Thread(new test2());
            obj.start();
        }
    }
}

class test2 implements Runnable
{
    public void run()
    {
        System.out.println("Hello  "+Thread.currentThread().getName());
    }
}
