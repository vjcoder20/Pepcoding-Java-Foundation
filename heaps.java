import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class heaps {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //print in increasing sorted order
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //print in decreasing sorted order
        int[] ranks = {22,99,3,11,88,4,1};
        for(int val:ranks)
        pq.add(val);
        while(pq.size()>0){
    System.out.println(pq.peek());
    pq.remove();
        }
    }
}
