package OOP;
class Person
{
    String name;
    int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void displayInformation()
    {
        System.out.println("Name of person is: "+name);
        System.out.println("Age of the person is: "+age);
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Person P = new Person("Saurabh",24);
        Person P1 = new Person("Yash",20);
        P.displayInformation();
        P1.displayInformation();
    }
}