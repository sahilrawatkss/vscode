package ExamPractice;

public class multithreading {


    public static void main(String[] args) {
        for(int i=0;i<7;i++)
        {
            test1 obj = new test1();
            obj.start();
        }
    }
}

class test1 extends Thread
{
    public void run()
    {
        System.out.println("Hello  "+Thread.currentThread().getName());

    }

}
