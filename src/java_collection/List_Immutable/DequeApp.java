
package java_collection.List_Immutable;

import java.util.Deque;
import java.util.LinkedList;


public class DequeApp {
    
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();//Bisa FIFO(Antrian) bisa juga LIFO(Tumpukan)
        
        stack.addLast("Elisa");
        stack.addLast("Septiani");
        stack.addLast("Lubis");
        
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
    }
    
}
