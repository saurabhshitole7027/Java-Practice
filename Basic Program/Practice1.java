/* Problem Statement:
Design a Shape abstract class with Circle and Rectangle subclasses; override area() and print both using a single
Shape[] array (polymorphism demo).

 */

import java.awt.*;

abstract class Shape
{
    public abstract double area();
}
class Circle extends Shape
{
    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*(radius*radius);
    }
}
class Rectangle extends Shape
{
    double length,breadth;
    public Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return length*breadth;
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        Rectangle r = new Rectangle(10,20);
        Shape [] ar = {c,r};
        for(int i=0;i< ar.length;i++)
        {
            System.out.println("Area : "+ar[i].area());
        }
    }
}