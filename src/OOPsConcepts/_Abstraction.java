package OOPsConcepts;

interface bikes{
    void sound();
}
class Rx implements bikes{
    public void sound(){
        System.out.println("Rx makes sound like trooooo");
    }
}
class Duke implements bikes{
    public void sound(){
        System.out.println("Duke make sound like kroooo");
    }
}
class Hayabusa implements bikes{
    public void sound(){
        System.out.println("Hayabusa makes sound like bhoom");
    }
}
class stimulator_bike{
    static void ansim(bikes b){
        b.sound();
    }
}
public class _Abstraction {
    public static void main(String[] args) {
        Rx r = new Rx();
        stimulator_bike.ansim(r);
        Duke d = new Duke();
        stimulator_bike.ansim(d);
        Hayabusa h = new Hayabusa();
        stimulator_bike.ansim(h);
    }
}
