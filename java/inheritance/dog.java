package inheritance;

public class dog extends animal{
    int teeth;
    String breed;

    public dog(int teeth,String breed,int eyes,int legs,int brain,int colour) {
        super(legs, eyes, brain, colour);
        this.teeth = teeth;
        this.breed=breed;
    }
    public void dogname(){

        System.out.println("doggy name");
    }

    public void chew(){
        System.out.println("dog chewing");
        super.chew();
    }

}
