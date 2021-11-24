package java_collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();// data tidak berurut
//          Queue<String> queue = new PriorityQueue<>();//data bakal berurut
        Queue<String> queue = new LinkedList<>();

//        for (int i = 0; i < 20; i++) {
//            queue.add(String.valueOf(i));
//        }
        queue.add("Elisa");
        queue.add("Septiani");
        queue.add("Lubis");

        queue.offer("Julia");
        queue.offer("Ningsih");
        System.out.println(queue.size());
        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }
        System.out.println(queue.size());
    }

}
