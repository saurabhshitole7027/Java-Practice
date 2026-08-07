import java.util.Arrays;

public class FindMaxElementArray {
    public static void main(String[] args) {
        int arr [] = {12,42,54,67,89,33,89,32};
        int max = 0;
        int secondmax = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max) {
                secondmax = max;
                max = arr[i];
            }else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }
        System.out.println("Maximum element of the Array is: "+max);
        System.out.println("Second maximum :"+secondmax);
    }
}