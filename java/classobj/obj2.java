package classobj;

public class obj2 {
    private int a;
    private String my;

    public void setValues(int a,String my){
        if(a>100){
            this.a=a;
            this.my=my;
        }
        else {
            this.a=0;
            this.my="failes";
        }
    }

    public void getValues(){
        System.out.println("my :"+my);
        System.out.println("a:"+a);
    }

}
