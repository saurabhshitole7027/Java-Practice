package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] num = {677,352,123,543,632};
        int largest = num[0];
        for(int x:num)
        {
            if(x>=largest)
            {
                largest = x;
            }
        }
        System.out.println("Largest Element in Array is: "+ largest);
    }
}