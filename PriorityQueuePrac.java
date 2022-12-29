//import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueuePrac {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // this queue will add elements in ascending order by default
       // PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(Collections.reverseOrder());
        // this will add elements in descending order
        pq.add(67);
        pq.add(97);
        pq.add(45);
        pq.add(12);
        pq.add(100);
        //pq.remove(12);// it can directly deletes any element from a queue
        //System.out.println(pq.poll());
        System.out.println(pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
           

    }
}
