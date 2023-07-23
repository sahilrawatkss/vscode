package Static;

class stat {
    public static String name;
    public void setName(String name){
        this.name=name;
    }
    public void Print()
    {
        System.out.println(name);
    }
}

public class statc1 {
    public static void main(String[] args) {
        stat obj=new stat();
        obj.setName("doggy");
        stat obj2=new stat();
        obj2.setName("billy");
        obj.Print();
        obj2.Print();
    }
}
