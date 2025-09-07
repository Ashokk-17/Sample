package OOPsConcepts;

public class _MethodOverloading_Static {

    static void send(int a){
        System.out.println(a);
    }
    static void send(String b){
        System.out.println(b);
    }
    static void send(int x, String y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        send(1);
        send("Hello");
        send("images");
        send(10,"video");
    }
}
