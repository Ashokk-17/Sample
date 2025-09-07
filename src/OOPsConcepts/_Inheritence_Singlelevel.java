package OOPsConcepts;

class uploadphotos{
    int X=10;
    void disp(){
        System.out.println("Whatsapp photos upload");
    }
}
class uploadvideos extends uploadphotos{
    void display(){
        System.out.println("upload photos and videos");
    }
}


public class _Inheritence_Singlelevel {
    public static void main(String[] args) {
        uploadvideos uv = new uploadvideos();
        uv.display();
        uv.disp();
        System.out.println(uv.X);
    }
}
