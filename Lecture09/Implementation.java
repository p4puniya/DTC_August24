package Lecture09;

public class Implementation {
    public static void main(String[] args) {
        // WrapperClasses obj= new WrapperClasses();
        // System.out.println(obj.arr.length);

        // int n = Integer.MAX_VALUE;
        // Integer m= 10;
        // System.out.println(n + " "+ m);

        //String Interning
        // String s1 = "Laptop";
        // String s2 = "Laptop";
        // s2= "pen";

        // //Autoboxing & Unboxing

        // int n = 10;
        // Integer m = n;//AutoBoxing
        // int o= m; //Unboxing
        // System.out.println(m);

        Integer a1 = 83;
        Integer a2 = 66;
        Integer a3 = 66;        
        Integer a4 = -129;
        Integer a5 = -129;
        System.out.println(a4.equals(a5));
    }
}
