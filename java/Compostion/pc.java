package Compostion;

public class pc {
    private cpu CPU;
    private monitor moni;

    public pc(cpu CPU, monitor moni) {
        this.CPU = CPU;
        this.moni = moni;
    }
    public void powerup()
    {
        System.out.println("pc powerup");
        CPU.info();
    }
    public void cpustart(){
        System.out.println("cpu start and monitor turning on");
        moni.info();

    }
}
