public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Unit Testing");
        Calc c = new Calc();
        int num1 = 10;
        int num2 = 5;
        int actualResult = c.Divide(num1,num2);
        int expectedResult = 2;

        if(actualResult==expectedResult)
        {
            System.out.println("Test Case Passes");
        }else{
            System.out.println("Test Case Failed");
        }
    }
}