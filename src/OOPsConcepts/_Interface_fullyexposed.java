package OOPsConcepts;

interface market{
    String quantity();
    int price();
}

class flower implements market{
    public String quantity(){
       // System.out.println("The quantity is 10 kg");
        return "10kg";
    }
    public int price(){
       // System.out.println("The price is 100rs");
        return 100;
    }
}
public class _Interface_fullyexposed {
    public static void main(String[] args) {
        market m = new flower();
        System.out.println("The price is"+m.price());
        System.out.println("The quantity is"+m.quantity());
    }
}
