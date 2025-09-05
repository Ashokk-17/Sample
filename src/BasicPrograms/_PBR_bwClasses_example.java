package BasicPrograms;

class mysore{
    void tickets(){
        System.out.println("Successfully booked");
    }
}

class passenger1{
    static void book(mysore m1){
        m1.tickets();
 }
}

class passenger2{
    static void book(mysore m2){
        m2.tickets();
}
}


public class _PBR_bwClasses_example {
    public static void main(String[] args) {
        mysore m = new mysore();
        passenger1.book(m);
        passenger2.book(m);
    }
}
