package OOPsConcepts;

class uploadphotos3{
    int X=10;
    void disp(){
        System.out.println("Whatsapp photos upload");
    }
}

class uploadvideos3 extends uploadphotos3{
    void display(){
        System.out.println("upload photos and videos");
    }
}

class uploadattachments3 extends uploadphotos3{
    void displayattach(){
        System.out.println("upload photos and videos and attachments");
    }
}

class uploadstickers3 extends uploadattachments3{
    void displaystickers(){
        System.out.println("upload photos and videos and attachments and stickers");
    }
}


public class _Inheritence_Hybrid {
    public static void main(String[] args) {
        uploadstickers3 US= new uploadstickers3();
        US.displaystickers();
        US.displayattach();
        uploadvideos3 UV3= new uploadvideos3();
        UV3.display();
        UV3.disp();
        System.out.println(UV3.X);
    }
}
