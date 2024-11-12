package Lecture15;

public class Implement1 {
    public static void main(String[] args) {
        Graphs g= new Graphs(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(2,3,7);
        g.addEdge(3,4,5);
        g.addEdge(5,4,1);
        g.addEdge(5,6,4);
        g.addEdge(6,7,2);
        g.addEdge(7,5,3);
        g.display();
    }
}
