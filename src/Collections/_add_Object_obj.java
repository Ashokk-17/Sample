package Collections;

import java.util.ArrayList;

public class _add_Object_obj {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("Hii");
        l.add(true);
        l.add(12.01);
        System.out.println(l);
        System.out.println("Adding elements again after printing");
        l.add("Hi");
        l.add(12);
        l.add(1);
        System.out.println(l);
    }
}