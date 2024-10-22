package Lecture12;

import Lecture02.patternPrinting;

public class LinkedList {
    class Node{
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    //Add to the start: O(1)

    public void addFirst(int item){
        Node nn= new Node();
        nn.val= item;
        if(size==0){
            head= nn;
            tail= nn;
            size++;
        }else{
            nn.next= head;
            head= nn;
            size++;
        }
    }

    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }else{ 
            Node nn= new Node();
            nn.val= item;
            tail.next= nn;
            tail= nn;
            size++;
        }        
    }

    //Function to find the address of Kth node
    public Node getNode(int k){
        Node temp= head;
        for(int i=0;i<k;i++)
            temp= temp.next;
        return temp;
    }

    //Add at a particular index: O(n)

    public void addAtIndex(int item, int k){
        if(k==0) addFirst(item);
        else if(k==size) addLast(item);
        else{
            Node nn= new Node();
            nn.val= item;
            Node k_1thNode= getNode(k-1);
            nn.next= k_1thNode.next;
            k_1thNode.next= nn;
            size++;
        }
    }

    //get first
    public int getFirst(){
        return head.val;
    }

    //get last
    public int getLast(){
        return tail.val;
    }

    //get index
    public int getIndex(int k){
        if(k==0) 
            return getFirst();
        else if(k==size-1) 
            return getLast();
        else
            return getNode(k).val;
    }

    public int removeFirst(){
        int rv= head.val;
        if(size==1){
            head=null;
            tail=null;
        }else{
            Node temp= head;
            head= head.next;
            temp.next= null;
        }
        size--;
        return rv;
    }

    public int removeLast(){
        if(size==1) return removeFirst();
        else{
            int rv= tail.val;
            tail= getNode(size-2);
            tail.next= null;
            size--;
            return rv;
        }
    }

    

    //Display
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp= temp.next;
        }
        System.out.println("NULL");
    }

    //size
    public int size(){
        return size;
    }
}
