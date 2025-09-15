package Collections;

import java.util.ArrayList;

public class _remove_int_Index {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("Hii");
        l.add(true);
        l.add(12.01);
        System.out.println(l);
        l.remove(1);
        System.out.println("After removing an object at specific index, l is"+l);
    }
}
