package inheritance;

public class Jaguar extends Car{
    public int doors;
    public int mirrors;
    public String feature;

    public Jaguar(int doors, int mirrors, String feature) {
        super(1, 1, "jaguary");
        this.doors = doors;
        this.mirrors = mirrors;
        this.feature = feature;
    }
    public void raiting()
    {
        System.out.println("awesome");
        System.out.println("jaguar:"+feature+"\n"  +type +"\n" +Speed);
    }
}
