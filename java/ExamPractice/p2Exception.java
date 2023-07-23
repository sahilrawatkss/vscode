package ExamPractice;

public class p2Exception {
    public static void main(String[] args) {
        try {
            System.out.println("5+9=" + (5 + 9));
            System.out.println("1/0="+(1/0));
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("1/0 can not be defined run time exception");
        }
        finally {
            System.out.println("7+9: "+(7+9));
        }
    }
}
