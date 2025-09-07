package OOPsConcepts;

class uploadphotos1{
    int X=10;
    void disp(){
        System.out.println("Whatsapp photos upload");
    }
}
class uploadvideos1 extends uploadphotos1{
    void display(){
        System.out.println("upload photos and videos");
    }
}
class uploadattachments extends uploadvideos1{
    void displayattach(){
        System.out.println("upload photos and videos and attachments");
    }
}

public class _Inheritence_Multilevel {
    public static void main(String[] args) {
        uploadattachments UA = new uploadattachments();
        UA.displayattach();
        UA.display();
        UA.disp();
        System.out.println(UA.X);
    }
}
