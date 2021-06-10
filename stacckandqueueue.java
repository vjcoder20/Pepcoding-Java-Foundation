import java.util.*;
public class stacckandqueueue {
    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // System.out.println(st);
        // System.out.println(st.peek());
        // System.out.println(st);
        // System.out.println(st.pop());
        // System.out.println(st);
        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.addLast(10);
        que.addLast(20);
        que.addLast(30);
        que.addLast(40);
        System.out.println(que);
        System.out.println(que.getFirst());
        System.out.println(que);
        System.out.println(que.removeFirst());
        System.out.println(que);
        

    }
}
