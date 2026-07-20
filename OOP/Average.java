package OOP;

public class Average {
    int a,b,c;
    public Average(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateAverage()
    {
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        Average a = new Average(1,20,30);
        System.out.println("The Average of three numbers is : "+ a.calculateAverage());
    }
}
