package OOPsConcepts;

public class _MethodOverload_Mainmethod {
    public static void main(String a) {
        System.out.println(a);
    }

    public static void main(int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        main(10);
        main("Ashok");
    }

}
