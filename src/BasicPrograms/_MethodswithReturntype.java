package BasicPrograms;

public class _MethodswithReturntype {

    static double areaofcircle(){
        final double pi=3.142;
        int r=10;
        double res = pi*r*r;
        return res;
    }

    public static void main(String[] args) {
        double value= areaofcircle();
        System.out.println("The area of a circle is "+value);
    }

}

