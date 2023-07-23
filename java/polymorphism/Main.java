package polymorphism;

class movie {
    private String name;

    public movie(String name){
        this.name=name;
    }

    public String plot(){
        return "no plot here";
    }

    public String getName(){
        return name;
    }
}

class ironman extends movie{
    public ironman(){
        super("ironman");
    }

    public  String plot(){
        return "tony stark creates iron man";
    }
}

class avenger extends movie{
    public avenger(){
        super("avenger");
    }

    public String plot(){
        return "all superheroes create a team";
    }
}

class mazerunner extends movie{
    public mazerunner(){
        super("mazerunner");
    }
    public String plot(){
        return "escaping a maze";
    }
}

class endgame extends movie{
    public endgame(){
        super("endgame");
    }

    public String plot(){
        return "tony died while protecting universe";
    }
}


public class Main{
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            movie mov=randommovie();
            System.out.println("movie: "+i + ":"+mov.getName()+"\n Plot:"+ mov.plot()+"\n");
        }
    }


    public static movie randommovie() {
        int random = (int) (Math.random() * 4) + 1;

        System.out.println("random number is: " + random);
        switch (random){
            case 1:
                return new ironman();
            case 2:
                return new avenger();
            case 3:
                return new mazerunner();
            case 4:
                return new endgame();

        }
        return null;
    }
}