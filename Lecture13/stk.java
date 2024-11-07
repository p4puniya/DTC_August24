package Lecture13;
import java.util.Stack;
public class stk {
    
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void NGE(int[] arr){
        Stack<Integer> stk= new Stack<>();
        int[] ans= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!stk.empty() && arr[i]> arr[stk.peek()])
                ans[stk.pop()]= arr[i];
            stk.push(i);
        }

        while(!stk.empty())
            ans[stk.pop()]=-1;
        
        display(ans);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        //check empty
        System.out.println(stk.empty());
        //add an element to the stack
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);
        System.out.println(stk);
        stk.pop();
        stk.pop();
        System.out.println(stk);
        System.out.print(stk.search(0));
    }//155
}
