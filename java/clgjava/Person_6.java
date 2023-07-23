package clgjava;

class Person {
    protected String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Employee extends Person {
    private double annualSalary;
    private int yearOfJoining;
    private long mobileNumber;
    public Employee(String name, double annualSalary, int yearOfJoining, long
            mobileNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearOfJoining = yearOfJoining;
        this.mobileNumber = mobileNumber;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public int getYearOfJoining() {
        return yearOfJoining;
    }
    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }
    public long getMobileNumber() {

        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
public class Person_6{
    public static void main(String[] args) {
        Employee e = new Employee("Rajan", 60000.00, 2019,964769795);
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        System.out.println("Year of Joining: " + e.getYearOfJoining());
        System.out.println("Mobile Number: " + e.getMobileNumber());
    }
}
