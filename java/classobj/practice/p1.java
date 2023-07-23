package classobj.practice;

class p1 {
    public int adds(int num1,int num2){
        return num1+num2;
    }
}
class p2 {
    public static void main(String[] args) {
        p1 obj=new p1();
        System.out.println("sum is:"+(obj.adds(10,16)));
    }
}
