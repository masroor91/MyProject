package mas;

import java.util.*;

public class TryMe {
    public static void main(String args[]) {
        Queue<String> q = new PriorityQueue<String>();
        q.add("3");
        q.add("1");
        q.add("2");
        System.out.print(q.poll() + " ");
        System.out.print(q.peek() + " ");
        System.out.print(q.peek());
    }
}