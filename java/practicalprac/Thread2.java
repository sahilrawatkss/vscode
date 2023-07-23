package practicalprac;


class sender{
    synchronized public void draw(char c)
    {
        for(int i=0;i<5;i++)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

class A extends Thread{
    sender s;
    A(sender send)
    {
        s=send;
    }
    public void run()
    {
        s.draw('*');
    }
}

class B extends Thread{
    sender s;
    B(sender send)
    {
        s=send;
    }
    public void run()
    {
        s.draw('$');
    }
}
public class Thread2 {
    public static void main(String[] args) {
        sender ob=new sender();
        A obj=new A(ob);
        B obj2=new B(ob);
        obj.start();
        obj2.start();
    }
}
