package BasicPrograms;

class animal1{
    void sound(){
        System.out.println("This is animal");
    }
}
class dog1 extends animal1{
    void sound(){
        System.out.println("barking");
    }
    void guard(){
        System.out.println("This will guard my house");
    }
}
public class _CTypecasting_Downcasting {
    public static void main(String[] args) {
        animal1 a1=new dog1();
        dog1 d = (dog1) a1;
        d.sound();
        d.guard();
    }
}
