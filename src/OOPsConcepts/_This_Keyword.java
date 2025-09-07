package OOPsConcepts;

class student1 {

    String name;
    int age;

    student1(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display (){
        System.out.println(this.name+"\t"+"is present and his age is " + this.age);
    }
}
public class _This_Keyword {
    public static void main(String[] args) {
        student1 s = new student1("Ashok", 26);
        s.display();
        student1 s1 = new student1("Ganapathi",0);
        s1.display();
    }
}
