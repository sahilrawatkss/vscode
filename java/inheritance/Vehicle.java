package inheritance;

public class Vehicle {
   public int Speed;
    public int Headlights;
    public int Backlights;
    public String type;

    public Vehicle(int speed, int headlights, int backlights, String type) {
        Speed = speed;
        Headlights = headlights;
        Backlights = backlights;
        this.type = type;
    }

    public void Location()
    {
        System.out.println("vehicle heading to x area");
    }

    public int getSpeed() {
        return Speed;
    }

    public int getHeadlights() {
        return Headlights;
    }

    public int getBacklights() {
        return Backlights;
    }

    public String getType() {
        return type;
    }
}
