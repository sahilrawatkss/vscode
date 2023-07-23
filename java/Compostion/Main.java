package Compostion;

public class Main {
    public static void main(String[] args) {
        monitor mon=new monitor(12010,"LG",new dimension(30,20,2));
        cpu Cpu=new cpu(2020,"zebronics",new motherboard(8,12221));
        pc thepc=new pc(Cpu,mon);
        thepc.powerup();

        thepc.cpustart();
    }
}
