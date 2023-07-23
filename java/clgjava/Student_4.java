package clgjava;


class Students {
    int rollNo;
    String Name;

    public void getData(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }
    public void display() {
        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + Name);
    }
}


public class Student_4 {
    public static void main(String[] args) {
        Students s = new Students();
        s.getData( 56, "Sahil");
        s.display();
    }
}
