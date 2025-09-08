package OOPsConcepts;

class pets{
    void noise(){
        System.out.println("Pets noise");
    }
}
class dog extends pets{
    void noise(){
        System.out.println("bow bow");
    }
}
class cow extends pets{
    void noise(){
        System.out.println("ambaa ambaa");
    }
}
class duck extends pets{
    void noise(){
        System.out.println("quack quack");
    }
}
class stimulator{
    static void ansim(pets p){
        p.noise();
    }
}
public class _Polymorphism_Runtime {
    public static void main(String[] args) {
        dog d = new dog();
        cow c = new cow();
        duck k = new duck();
        stimulator.ansim(d);
        stimulator.ansim(c);
        stimulator.ansim(k);
        }
    }

/*class payment{
    void pay(){
        System.out.println("Payment type");
    }
}
class recharge extends payment{
    void pay(){
        System.out.println("recharge paid");
    }
}
class transfer extends payment{
    void pay(){
        System.out.println("transfer paid");
    }
}
class wifibill extends payment{
    void pay(){
        System.out.println("wifibill paid");
    }
}
class Phonepe{
    static void accept(payment p){
        p.pay();
    }
}
class mainclass{
    public static void main(String[] args) {
        recharge r = new recharge();
        wifibill w = new wifibill();
        transfer t = new transfer();
        Phonepe.accept(r);
        Phonepe.accept(w);
        Phonepe.accept(t);
    }
}
*/