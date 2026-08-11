/*
Problem Statement:
Create a Vehicle -> Car hierarchy where Car's constructor calls super() and adds its own fields; print full details via one constructor call.
 */
class Vehicle
{
    String vehicleType;
    public Vehicle()
    {
        vehicleType ="Car";
    }
    public Vehicle(String type)
    {
        this.vehicleType = type;
        System.out.println("The Type of the Vehicle is: "+ vehicleType);
    }
}
class Car extends Vehicle
{
    String carName;

    public Car(String name)
    {
        super();
        this.carName = name;
        System.out.println("The vehicle type is: "+ vehicleType);
        System.out.println("The name of the Car is: "+carName);
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Car c = new Car("BMW");
    }
}