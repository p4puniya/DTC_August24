package Lecture12;

public class Implementation {
    public static void main(String[] args) {
        //OOPS
        // OOPS o1= new OOPS();
        // o1.num1++;
        // OOPS o2= new OOPS();
        // System.out.println(o1.num1);
        // System.out.println(o2.num1);
        // System.out.println(o1.add(3));
        // OOPS khyati= new OOPS();
        // khyati.setDefaultUsername();
        // khyati.setUsername("khyati@27");
        // System.out.println(khyati.getUsername(true));
    
        //LinkedList

        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.display();
        ll.addLast(5);
        ll.display();
        ll.addAtIndex(3, 2);
        ll.display();

        System.out.println(
            ll.getFirst()+" "+ll.getIndex(3)+" "+ll.getLast()
            );

        System.out.println(ll.size());
    }
}
