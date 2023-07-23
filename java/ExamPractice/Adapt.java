package ExamPractice;

interface interf
{
    public void m1();
    public void m2();
    public void m3();
    public void m4();
}
class Adapters implements interf
{
    @Override
    public void m1() {}
    @Override
    public void m2() {}
    @Override
    public void m3() {}
    @Override
    public void m4() {}
}
public class Adapt extends Adapters{
    @Override
    public void m1() {
        System.out.println("Hello method m1 from adapter class");
    }
    public static void main(String[] args) {
     Adapt obj=new Adapt();
     obj.m1();
    }
}