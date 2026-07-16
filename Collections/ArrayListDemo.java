package Collections;

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> Ar = new ArrayList<>();
        ArrayList<Integer> Ar2 = new ArrayList<>();
        Ar2.add(1);
        Ar2.add(8);
        Ar.add(10);
        Ar.add(20);
        Ar.add(30);
        Ar.add(40);
        Ar.add(50);
        Ar.addLast(5);
        System.out.println(Ar.getLast());
        System.out.println(Ar);
        Ar.addAll(2,Ar2);
        System.out.println(Ar);
        System.out.println(Arrays.toString(Ar2.toArray()));

    }
}