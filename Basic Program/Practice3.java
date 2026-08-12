class Calculator
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    @Override
    public String toString()
    {
        return "toString method of Calculator class";
    }
}
public class Practice3 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(11.21,54.12));
        System.out.println(c.add(12,43,43));
        System.out.println(c.toString());
    }
}