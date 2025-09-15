package Collections;

import java.util.ArrayList;

public class _addAll_Int_Index_Collection_c {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        ArrayList l2 = new ArrayList();
        l2.add("Hi");
        l2.add("Hello");
        l2.add("Hey");
        l2.add("Hoi");
        l1.addAll(2,l2);
        System.out.println("After adding l2 to l1 at specific index"+l1);
        System.out.println("This is l2 only"+l2);

    }
}
