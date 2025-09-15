package Collections;

import java.util.ArrayList;

public class _retainAll_Collection_c {
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
        l2.add(4);
        System.out.println("This is l1"+l1);
        System.out.println("This is l2"+l2);
        l1.retainAll(l2);
        System.out.println("After retain all l2 into l1 i.e., all unique elements are removed " +
                "& duplicate element is displayed"+l1);
    }
}
