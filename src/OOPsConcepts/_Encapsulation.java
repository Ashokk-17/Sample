package OOPsConcepts;

class demo {
    private int x=10;
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
}
public class _Encapsulation {
    public static void main(String[] args) {
        demo demo = new demo();
        int a= demo.getx();
        System.out.println("The first value is " +a);
        demo.setx(88);
        System.out.println("After encapsulation"+demo.getx());
    }
}
