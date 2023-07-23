package classobj;

public class construct {
    public static void main(String[] args) {
        //construct2 obj=new construct2(100,"bob",10001010);
        construct2 obj=new construct2();
        obj.num(100);
        obj.num2(1000);
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getNumber());
    }
}
