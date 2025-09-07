package OOPsConcepts;

public class _MethodOverloading_Nonstatic {
    void send(int a){
        System.out.println(a);
    }
    void send(String b){
        System.out.println(b);
    }
    void send(double j, String x){
        System.out.println(j+x);
    }
    public static void main(String[] args) {
        _MethodOverloading_Nonstatic MN = new _MethodOverloading_Nonstatic();
        MN.send(100);
        MN.send(12,"This is a message");
        MN.send("This is image");
    }
}
