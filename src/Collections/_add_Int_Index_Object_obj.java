package Collections;

import java.util.ArrayList;

public class _add_Int_Index_Object_obj {
    public static void main(String[] args) {
        ArrayList I = new ArrayList();
        I.add(1);
        I.add(2);
        I.add(3);
        I.add(4);
        System.out.println("Before using int index"+I);
        I.add(2,5);
        System.out.println("After using int index"+I);
    }
}
