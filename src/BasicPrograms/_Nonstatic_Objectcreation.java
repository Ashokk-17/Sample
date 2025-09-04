package BasicPrograms;

public class _Nonstatic_Objectcreation {

    int x=10;
    int display(){
        System.out.println("This is non static or object creating");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new _Nonstatic_Objectcreation().x);
        System.out.println(new _Nonstatic_Objectcreation().display());


    }
}
