package OOP;
// Create the Class ->> Blueprint for the Objects
class Car{
    // properties of the car
    int Price;
    String Model;
    String Color;
    // Behaviour of the class

    public Car(int Price,String Model,String Color)
    {
        this.Price = Price;
        this.Model = Model;
        this.Color = Color;
    }
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
        Car c1 = new Car(3000000,"Mercedez S class","Pearl Black");
        c1.displayInformation();
    }
}