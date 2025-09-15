package Collections;

import java.util.ArrayList;

public class _contains_Object_obj {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("Hii");
        l.add(true);
        l.add(12.01);
        System.out.println(l);
        System.out.println(l.contains(18));
        if(l.contains(10)) {
            System.out.println("Element is present");
        }
            else {
            System.out.println("Element is not present");

        }

    }
}
