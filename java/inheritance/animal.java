package inheritance;

public class animal {
    public int legs;
    public int eyes;
    public int brain;
    public int colour;


    public animal(int legs, int eyes, int brain, int colour) {
        this.legs = legs;
        this.eyes = eyes;
        this.brain = brain;
        this.colour = colour;
    }

    public void chew(){
        System.out.println("animal chew()");
        System.out.println(colour);

    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public int getBrain() {
        return brain;
    }

    public int getColour() {
        return colour;
    }
}
