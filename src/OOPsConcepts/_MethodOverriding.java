package OOPsConcepts;

class whatsapp_old{
    void display(){
        System.out.println("The storage is 512KB ");
    }
}

class whatsapp_new extends whatsapp_old{
    void display(){
        System.out.println("The storage is upgraded to 1024KB ");
    }
}
public class _MethodOverriding {
    public static void main(String[] args) {
        whatsapp_new w = new whatsapp_new();
        w.display();
    }
}
