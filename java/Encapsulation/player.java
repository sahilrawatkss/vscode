package Encapsulation;

public class player {
    private String name;
    private int health=100;
    private String weapon;

    public player(String name, int health, String weapon) {
        this.name = name;
        if(health>=0&&health<=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void damages(int i){
        System.out.println("player health"+this.health);
        System.out.println("damage recieved of "+i);
        this.health=this.health-i;
        System.out.println("remaining health "+this.health);
        if(this.health<=0){
            System.out.println("you knocked out");
        }
    }
}
