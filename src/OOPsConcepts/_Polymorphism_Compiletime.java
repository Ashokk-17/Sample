package OOPsConcepts;

class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    String add(String a, String b){
        return a+ " "+b;
    }
}

public class _Polymorphism_Compiletime {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println("The addition of 2 even numbers is"+ c.add(10,12));
        System.out.println("The addition of 2 decimal numbers is"+ c.add(12.5,13.2));
        System.out.println("The addition of 2 strings is"+ c.add("Ganesh","Hanuman"));
    }
}
