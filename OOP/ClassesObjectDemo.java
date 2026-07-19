package OOP;
// Create the Class ->> Blueprint for the Objects
class Car{
    // properties of the car
    int Price;
    String Model;
    String Color;
    // Behaviour of the class
    public void displayInformation()
    {
        System.out.println("The Name of Car is:"+Model);
        System.out.println("The Price of Car is:"+Price);
        System.out.println("The Color of Car is:"+Color);
    }
}
public class ClassesObjectDemo {
    public static void main(String[] args) {
        //Object is being created here for class Car
        //c1 is object for the Car class
        Car c1 = new Car();
        c1.Color="Red";
        c1.Price = 12000;
        c1.Model ="WagonR";
        c1.displayInformation();
    }
}