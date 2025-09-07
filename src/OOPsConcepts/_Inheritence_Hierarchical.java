package OOPsConcepts;

class uploadphotos2{
    int X=10;
    void disp(){
        System.out.println("Whatsapp photos upload");
    }
}

class uploadvideos2 extends uploadphotos2{
    void display(){
        System.out.println("upload photos and videos");
    }
}

class uploadattachments2 extends uploadphotos2{
    void displayattach(){
        System.out.println("upload photos and videos and attachments");
    }
}


public class _Inheritence_Hierarchical {
    public static void main(String[] args) {
        uploadattachments2 UA2= new uploadattachments2();
        UA2.displayattach();
        UA2.disp();
        System.out.println(UA2.X);
        uploadvideos2 UV2= new uploadvideos2();
        UV2.display();
        UV2.disp();
        System.out.println(UV2.X);
    }
}
