package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
class MyCom implements Comparator<Integer> {
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2) return 1;
        else if(o1>o2) return -1;
        return 0;
    }

}
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> Pr = new PriorityQueue<>(new MyCom());
        Pr.add(32);  // In Priorityqueue the elements are inserted on the basis of the priority.
        Pr.add(21);
        Pr.add(12);
        Pr.add(43);
        Pr.add(52);
        Pr.add(9);

        System.out.println(Pr);

    }
}