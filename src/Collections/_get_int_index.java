package Collections;

import java.util.ArrayList;

public class _get_int_index {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("Hii");
        l.add(true);
        l.add(12.01);
        System.out.println(l);
        System.out.println("The size of array list is "+l.size());
        System.out.println("The location at index 2 is "+l.get(3));
    }
}
