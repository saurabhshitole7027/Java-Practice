package Collections;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> Ar = new ArrayList<>();
        ArrayList<Integer> Ar2 = new ArrayList<>(List.of(10,20,40,50,90));
        // Use the Add() method of the ArrayList
        Ar.add(21); // This will add the 21 in the first index of the Ar
        Ar.add(0,12);  // This will add the 12 at Index 0 and shift the 21 to 1st index.
        System.out.println(Ar);  // Here I print the arraylist. output will be [12,21]
        Ar.addAll(Ar2);  // This will add the Ar2 at the Ar
        System.out.println(Ar); // Output : [12, 21, 10, 20, 40, 50, 90]
        Ar.addAll(1,Ar2);  // This will add the list Ar2 at the index 1 of the list Ar.
        System.out.println(Ar);  // Output : [12, 10, 20, 40, 50, 90, 21, 10, 20, 40, 50, 90]

        Ar.retainAll(Ar2);  // This will remove all element except the Ar2 List.
        System.out.println(Ar);  // Output: [10, 20, 40, 50, 90, 10, 20, 40, 50, 90]

        System.out.println(Ar.get(5));  // This will print element at index 5  OutPut: 10

        System.out.println(Ar.remove(3));  // remove() method will remove rhe element at index 3  Output : 50
        System.out.println(Ar);  //Output : [10, 20, 40, 90, 10, 20, 40, 50, 90]
        Ar.set(1,23);  // This will set the index 1 element 23

        System.out.println(Ar); //Output : [10, 23, 40, 90, 10, 20, 40, 50, 90]

        Collections.reverse(Ar);  // reverse() method will reverse the Arraylist
        System.out.println(Ar);  //Output: [90, 50, 40, 20, 10, 90, 40, 23, 10]
        System.out.println("Print list With For each loop");
        for(Integer x: Ar)
        {
            System.out.println(x);
        }
        System.out.println("Print list With classic for loop");
        for(int i=0;i<Ar.size();i++)
        {
            System.out.println(Ar.get(i));
        }

        ListIterator <Integer> it = Ar.listIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}