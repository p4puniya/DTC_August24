package Lecture07;

public class Learn_String {
    //Create a function to compare 2 strings

    public static void main(String[] args) {
        // Part 1
        // String s1= "Hello";
        // String s2= new String();
        // s2= "Hello";
        // String s3= new String("Hello");
        // String s4= "Hello";
        // String s5= new String("Hello");
        // System.out.println(s2==s4);
        // System.out.println(s2);
        // System.out.println(s3);

        //Part 2
        // String s1= new String("Hello");
        // String s2= new String("Hall");
        // s2+="2";
        // for(int i=0;i<s1.length();i++)
            // System.out.println(s1.charAt(i));
        // System.out.println(s1.substring(0,3));

        //Part 3
        // String s0= "Phone";
        // int[] i0= {65,66,67};
        // char[] c0= {'a','b','c'};
        // byte[] b0= new byte[127];

        // for(byte i=0; i<b0.length;i++)
        //     b0[i]=i;

        // String s1= new String(b0);
        // for(int i=0;i<s1.length();i++)
        // System.out.println(s1.charAt(i));

        //Part 4
        String s1= "Laptop";
        String s2= "                 Phone                  ";
        // String s3= s1.concat(s2);
        String s3= s1+s2;
        // System.out.println(s1.contains("ap"));
        // System.out.println(s1.toCharArray());
        System.out.println(s2.trim());
    }
}
