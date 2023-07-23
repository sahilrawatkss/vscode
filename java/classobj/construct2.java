package classobj;

public class construct2 {
    String name;
    int number;
    int id;

    public construct2(){
        this(100,"tom",1001);
        System.out.println("first contructor called");
    }

    public construct2(int number,String name,int id){
        this.number=number;
        this.id=id;
        this.name=name;
        System.out.println("second construct called");
    }
    public void num(int n){
        this.number+=n;
    }

    public void num2(int n)
    {
        this.number-=n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
