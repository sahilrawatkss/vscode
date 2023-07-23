package Compostion;

public class cpu {
    private int id;
    private String manufacturer;
    private motherboard mb;

    public cpu(int id, String manufacturer, motherboard mb) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.mb = mb;
    }

    public void info()
    {
        System.out.println("cpu used");
        System.out.println("cpu of "+manufacturer);
        System.out.println("cpu id is "+id);
    }
}
