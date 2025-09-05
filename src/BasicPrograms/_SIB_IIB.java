package BasicPrograms;



public class _SIB_IIB {

    static{                                          //SIB
        System.out.println("First static will get executed");
    }
    {                                                //IIB
        System.out.println("After SIB, IIB wil be executed whenever an object is created");
    }
    void _SIB_IIB(){
        System.out.println("This is constructor which runs after IIB");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");
        _SIB_IIB d1 = new _SIB_IIB();
        _SIB_IIB d2 = new _SIB_IIB();
    }


}
/*






 */
class Demo {

    // Static Initialization Block (SIB)
    static {
        System.out.println("SIB: Runs once when class loads");
    }

    // Instance Initialization Block (IIB)
    {
        System.out.println("IIB: Runs before every constructor");
    }

    // Constructor
    Demo() {
        System.out.println("Constructor: Runs after IIB");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");

        // Create first object
        Demo d1 = new Demo();

        // Create second object
        Demo d2 = new Demo();
    }
}