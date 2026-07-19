package OOP;

class SpecialForce
{
    String name;
    String ParentUnit;
    String CommandingOfficer;
    int Javans;

    public SpecialForce(String name,String parentUnit,String commandingOfficer,int javans)
    {
        this.name = name;
        this.ParentUnit = parentUnit;
        this.CommandingOfficer = commandingOfficer;
        this.Javans = javans;
    }
    public void displayInformation()
    {
        System.out.println("The name of Special force is:"+ name);
        System.out.println("The name of ParentUnit is:"+ ParentUnit);
        System.out.println("The name of CO is:"+ CommandingOfficer);
        System.out.println("The no of javans:"+ Javans);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        SpecialForce sf1 = new SpecialForce("21 PARA","Maratha Light Infantry","Saurabh Shitole",500);
        sf1.displayInformation();
    }
}