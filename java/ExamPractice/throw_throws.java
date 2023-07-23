package ExamPractice;

public class throw_throws {
    public static void main(String[] args) {
        System.out.println("Hello");
        try
        {
            test();
        }
        catch(Exception e)
        {
            System.out.println("no exception ");
        }
    }

    static void test()
{
    try
    {
        throw new ArithmeticException("MY exception");
    }
    catch(Exception e)
    {
        System.out.println(e);
        throw e;
    }
}
}
