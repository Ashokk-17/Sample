package OOPsConcepts;

interface car{
    void engine();
}
class speed implements car{
    private String enginecapacity = "2L";
    public void engine(){
        System.out.println("The car engine capacity is "+ enginecapacity);
    }
}
public class _Interface_partiallyhidden {
    public static void main(String[] args) {
        car c = new speed();
        c.engine();
    }
}
