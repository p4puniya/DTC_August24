package Lecture14;

public class BST {
    class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public BST(int[] arr){
        root= CreateBST(arr, 0, arr.length-1);
    }

    private Node CreateBST(int[] arr, int low, int high){
        if(low>high) return null;
        int mid= (low+high)/2;
        Node nn= new Node();
        nn.val= arr[mid];
        nn.left= CreateBST(arr, low, mid-1);
        nn.right= CreateBST(arr, mid+1, high);
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

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        BST bst= new BST(arr);
        bst.Display();
    }
}
