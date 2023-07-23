package polymorphism;

class car{
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "car->engine";
    }
    public String accelerate(){
        return "car->accelerate";
    }
    public String brake()
    {
        return "car-> barke";
    }
}

class Bugati extends car{

    public Bugati(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "bugati->startEngine";
    }

    @Override
    public String accelerate() {
        return "bugati->accelerate";
    }

    @Override
    public String brake() {
        return "bugati->brake";
    }
}

class Ford extends car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "ford->startEngine";
    }

    @Override
    public String accelerate() {
        return "ford->accelerate";
    }

    @Override
    public String brake() {
        return "ford->brake";
    }
}

class BMW extends car{

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "BMW->startEngine";
    }

    @Override
    public String accelerate() {
        return "BMW->accelerate";
    }

    @Override
    public String brake() {
        return "BMW->brake";
    }
}

public class Main2 {
    public static void main(String[] args) {
        car Car=new car(6,"new car");
        System.out.println(Car.accelerate());
        System.out.println(Car.brake());
        System.out.println(Car.startEngine());

        Bugati bugati=new Bugati(6,"bugati car");
        System.out.println(bugati.accelerate());
        System.out.println(bugati.brake());
        System.out.println(bugati.startEngine());

        Ford ford=new Ford(6,"Ford car");
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());

        BMW bmw=new BMW(6,"BMW CAR");
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
        System.out.println(bmw.startEngine());

    }
}
