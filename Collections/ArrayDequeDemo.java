package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque <Integer> Ad1 = new ArrayDeque<>();
        ArrayList <Integer> Al = new ArrayList<>(List.of(7,3,2,4,2));
        Ad1.offerLast(10);
        Ad1.offerLast(20);
        Ad1.offerLast(30);
        Ad1.offerLast(40);
        System.out.println(Ad1);  // Output : [10, 20, 30, 40]

        Ad1.offerFirst(1);
        Ad1.offerFirst(2);
        Ad1.offerFirst(3);
        Ad1.offerFirst(4);

        System.out.println(Ad1);  // Output : [4, 3, 2, 1, 10, 20, 30, 40]

        System.out.println(Ad1.contains(21));  // Output: false
        Ad1.addAll(Al);
        System.out.println(Ad1);  //Output: [4, 3, 2, 1, 10, 20, 30, 40, 7, 3, 2, 4, 2]
    }
}