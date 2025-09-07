package OOPsConcepts;

class whatsapp_old1{
    void groups(){
        System.out.println("1st version supports 10 groups");
    }
}

class whatsapp_new1 extends whatsapp_old1{
    void groups(){
        System.out.println("2nd version supports 20 groups");
        super.groups();
    }
}
public class _Super_Keyword {
    public static void main(String[] args) {
        whatsapp_new1 wn = new whatsapp_new1();
        wn.groups();
    }
}
