package ExamPractice;

import java.util.Scanner;

public class Interthread {
    public static void main(String[] args) {
        sol obj=new sol();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    obj.produce();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.consumer();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
class sol
{
    synchronized void produce() throws Exception
    {
        System.out.println("Called producer");
        wait();
        System.out.println("Resumed");
    }

    synchronized void consumer() throws Exception
    {
        System.out.println("Waiting...for consumer");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        notify();
        System.out.println("calling back producer");
    }
}
