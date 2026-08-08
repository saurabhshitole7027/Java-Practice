package Arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {12,32,43,432,64,25};
        int[] arr2 = {12,32,43,432,64,21};
        System.out.println(Arrays.compare(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.hashCode(arr1));
        System.out.println(Arrays.hashCode(arr2));
        int arr3[] = Arrays.copyOf(arr1,4);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}