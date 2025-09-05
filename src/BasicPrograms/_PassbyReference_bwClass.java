package BasicPrograms;

class sample{
    int x= 10;
    static void hello(sample A){
        System.out.println("This is pass by reference between classes");
        System.out.println(A.x);
    }
}


public class _PassbyReference_bwClass {
    public static void main(String[] args) {
        sample s = new sample();
        sample.hello(s);
        System.out.println(new sample().x);
    }




}
