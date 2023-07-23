package ExamPractice;

class test
{
    int roll;
    String name;
    void setData(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void getData()
    {
        System.out.println("RollNo: "+roll);
        System.out.println("Name: "+name);
    }
}
public class p1 {
    public static void main(String[] args) {
        test obj1=new test();
        test obj2=new test();
        obj1.setData(1,"Ajay");
        obj1.getData();
        obj2.setData(2,"Vijay");
        obj2.getData();
    }
}
