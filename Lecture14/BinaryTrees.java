package Lecture14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTrees{
    class Node{
        int val;
        Node left;
        Node right;
    }

    Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTrees(){
        root = CreateTree();
    }

    private Node CreateTree(){
        System.out.println("Value: ");
        int item= sc.nextInt();
        Node nn = new Node();
        nn.val= item;
        System.out.println("Has Left?");
        boolean hlc= sc.nextBoolean();

        if(hlc)
            nn.left= CreateTree();
        System.out.println("Has Right?");
        boolean hrc= sc.nextBoolean();
        if(hrc)
            nn.right= CreateTree();
        
        return nn;
    }

    public void Display(){
        Display(root);
    }

    private void Display(Node nn){
        if(nn==null) return ;
        String s= "<--"+ nn.val+"-->";
        if(nn.left!=null)
            s= nn.left.val + s;
        else
            s= "Null"+ s;

        if(nn.right!= null)
            s+= nn.right.val;
        else
            s+= "Null";

        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public int findMax(){
        return findMax(root);
    }

    private int findMax(Node nn){
        if(nn==null) return 0;
        int lmax= findMax(nn.left);
        int rmax= findMax(nn.right);

        return Math.max(nn.val, Math.max(lmax,rmax));
    }

    //Create a func. Find(int) : Returns true or false
    public boolean find(Node nn, int num){
        if(nn== null) return false;
        if(nn.val== num) return true;

        boolean left= find(nn.left, num);
        boolean right= find(nn.right, num);

        return(left||right);
    }

    public int height(Node root){
        if(root==null) return 0;

        int leftH= height(root.left);
        int rightH= height(root.right);

        return Math.max(leftH, rightH)+1;
    }

    
    public void inOrder(Node nn){
        if(nn== null) return;

        inOrder(nn.left);
        System.out.print(nn.val+" ");
        inOrder(nn.right);
    }
// Create Pre and Post order Traversal yourself
    
    public void levelOrderTraversal(){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv= q.remove();
            System.out.print(rv.val+" ");
            if(rv.left!=null)
                q.add(rv.left);
            if(rv.right!=null)
                q.add(rv.right);
        }
        System.out.println();
    }

}