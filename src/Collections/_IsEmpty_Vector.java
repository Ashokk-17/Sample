package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class _IsEmpty_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add(11);
        v.add(12);

        List<String> a = Arrays.asList("A","B","C","D");
        v.addAll(a);
        System.out.println(v);
        System.out.println("The value at position 1 is "+v.get(1));
        v.set(1,"Hi");
        System.out.println("The new value setted at position 1 is "+v);

        Vector tempv = new Vector<>();
        tempv.clear();
        System.out.println("After clear "+tempv);
        System.out.println(v.size());
        System.out.println("Does the vector contains 'red' "+v.contains("red"));
        System.out.println("Is the vector is empty? "+v.isEmpty() );



    }
}
