package Collections;

import java.util.ArrayList;

public class _remove_Object_obj {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("Hii");
        l.add(true);
        l.add(12.01);
        System.out.println(l);
        l.remove("Hii");
        System.out.println("After removing an object, l is"+l);
    }
}
