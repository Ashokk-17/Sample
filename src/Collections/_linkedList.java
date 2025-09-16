package Collections;

import java.util.LinkedList;

public class _linkedList {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(11);
        li.add("Hiii");
        li.add(2);
        li.add(2.22);
        li.add(13);
        li.add("hello");
        li.add(4);
        li.add(true);
        System.out.println(li);
        System.out.println("When peek() is used"+li.peek());
        System.out.println("When poll() is used"+li.poll());
        System.out.println("The linked list now looks like"+li);

    }
}
