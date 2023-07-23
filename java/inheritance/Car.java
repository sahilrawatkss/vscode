package inheritance;

public class Car extends Vehicle{
    int Steering;
    int colour;
    String brand;

    public Car(int steering, int colour, String brand) {
        super(150, 4, 3, "car");
        Steering = steering;
        this.colour = colour;
        this.brand = brand;
    }
    public void  carLocation(){
        System.out.println("vehicle in x mark area");
    }
}
