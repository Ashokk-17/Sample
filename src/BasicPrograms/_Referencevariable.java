package BasicPrograms;

public class _Referencevariable {
    int x=10;
    void display(){
        System.out.println("This is example program for reference variable");
    }

    public static void main(String[] args) {
        _Referencevariable R = new _Referencevariable();
        System.out.println(R.x);
        R.display();
    }

}
