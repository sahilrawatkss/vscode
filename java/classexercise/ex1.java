package classexercise;

public class ex1 {
    double num1,num2;
    public double firstnum(double num){
        return num;
    }
    public double secondnum(double num){
        return num;
    }
    public void getAdditionresult(){
        System.out.println("sum is :"+(firstnum(10)+secondnum(20)));
    }

    public void getSubtractionresult(){
        System.out.println("sub is :"+(firstnum(10)-secondnum(20)));
    }
    public static void main(String[] args) {
        ex1 obj=new ex1();
        obj.getAdditionresult();
        obj.getSubtractionresult();
    }
    }
