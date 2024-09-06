package Lecture03;

public class ReverseAnArray {
    //Function to display Array
    static void display(int[] arr){
        // for(int i=0;i<arr.length;i++)
        //     System.out.print(arr[i]+" ");
        // System.out.println();
        //For Each Loop
        for(int i: arr)
            System.out.print(i+" ");
        
        System.out.println();
    }
    //Sum of Complete Array
    static int findSum(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    //Print Reverse
    static void printRev(int[] arr){
        for(int i=arr.length-1; i>=0;i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    //Reverse using temp array
    static void reverseArray(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            temp[arr.length-1-i]= arr[i];
        }
        // display(temp);
        // arr=temp;
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    //Function to swap 2 elements
    static void swapElements(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    //Reverse using Swap
    static void reverseUsingSwap(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j)
            swapElements(arr, i++, j--);
    }
    //Now do all of the above for a range[i,j]
    public static void main(String[] args) {
        int[] nums= {8,2,1,3,4,5};
        // int sum= findSum(arr);
        // printRev(arr);
        // reverseArray(nums);
        // int i=1, j=4;
        // swapElements(nums,i,j);

        reverseUsingSwap(nums);
        display(nums);
        // System.out.println(sum);
    }
}
