package clgjava;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
}
public class Parameterized_5 {
    public static void main(String[] args) {
        Student st= new Student(56,"Shyam");

        String n=st.getName();
        int r=st.getRollNo();

        System.out.println("Name: " + n );
        System.out.println("Roll no.: " + r );

    }
}
