package Collections;

import java.util.ArrayList;

public class _addAll_Collection_c {
    public static void main(String[] args) {
        ArrayList I1 = new ArrayList();
        I1.add(1);
        I1.add(2);
        I1.add(3);
        I1.add(4);
        ArrayList I2 = new ArrayList();
        I2.add("Hi");
        I2.add("Hello");
        I2.add("Hey");
        I2.add("Hoi");
        I1.addAll(I2);
        System.out.println("After adding I2 to I1"+I1);
        System.out.println("This is I2 only"+I2);
    }
}
