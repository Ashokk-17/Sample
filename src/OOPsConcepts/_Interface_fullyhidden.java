package OOPsConcepts;

interface ground{
    void game1();
    void game2();
}

class play implements ground{
    public void game1(){
        System.out.println("This is Kabaddi");
    }
    public void game2(){
        System.out.println("This is kho kho");
    }
}
public class _Interface_fullyhidden {
    public static void main(String[] args) {
        ground g = new play();
        g.game1();
        g.game2();
    }
}
