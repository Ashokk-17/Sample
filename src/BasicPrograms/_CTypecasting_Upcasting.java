package BasicPrograms;

class animal {
    void sound(){
        System.out.println("This is animal");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("barking");
    }
    void guard(){
        System.out.println("Dog guards the house");
    }
}
public class _CTypecasting_Upcasting {
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
        //a.guard(); since sub caste is up casted to superclass
    }
}
