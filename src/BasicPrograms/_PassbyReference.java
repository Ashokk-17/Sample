package BasicPrograms;

public class _PassbyReference {
    int m=23;
    static void disp(_PassbyReference a){
        System.out.println(a.m);
        System.out.println("hi this is pass by reference within class");
    }

    public static void main(String[] args) {
        _PassbyReference pr = new _PassbyReference();
        disp(pr);
    }
}
