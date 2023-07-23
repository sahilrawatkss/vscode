package clgjava;

import java.util.Scanner;
public class Area_2
{
    public static void main(String[] args)
    {
        Area ob = new Area();
        Scanner op=new Scanner(System.in);
        System.out.println("Enter the length of Square");
        ob.calculateArea(op.nextFloat());

        System.out.println("Enter the length and breadth of Rectangle");
        ob.calculateArea (op.nextFloat(),op.nextFloat());
        System.out.println("Enter the radius of Circle");
        ob.calculateArea(op.nextDouble());
    }
}
class Area
{
    void calculateArea(float x)
    {
        System.out.println("The area of the square is "+ x*x+" sq units");
    }
    void calculateArea(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units");
    }
    void calculateArea(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}

