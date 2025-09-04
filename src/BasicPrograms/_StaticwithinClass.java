package BasicPrograms;

public class _StaticwithinClass {
    static int j=100;
    static int add(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(_StaticwithinClass.j);
        System.out.println(_StaticwithinClass.add());
    }
}
