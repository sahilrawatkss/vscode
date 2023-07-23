package Compostion;

public class monitor {
    private int id;
    private String company;
    private dimension dim;

    public monitor(int id, String company, dimension dim) {
        this.id = id;
        this.company = company;
        this.dim = dim;
    }

    public void info()
    {
        System.out.println("monitor is of "+company);
        System.out.println("monitor id "+id);
        System.out.println(dim.getBreadth());
    }
}
