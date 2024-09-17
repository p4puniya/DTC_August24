package Lecture02;
import java.util.Scanner;
public class arrays {

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        // int a=10;
        // int[] arr= new int[5];
        // arr[0]=5;
        // arr[1]=10;
        // arr[2]=15;
        // boolean[] nums= new boolean[10];
        // char[] s= new char[3];
        // s[0]='a';
        // s[1]='b';
        // // System.out.println(arr);
        // //display
        // // for(int i=0;i<nums.length;i++){
        // //     System.out.print(nums[i]+" ");
        // // }
        // //1. Create a table for n.
        // int n=5;
        // int[] table= new int[10];
        // for(int i=0; i<table.length;i++){
        //     table[i]= n*(i+1);  
        // }
        // display(table);
        // //2. Search m in this table.
        // int m= 40;
        // for(int i=0;i<table.length;i++){
        //     if(table[i]==m)
        //     System.out.println(i);
        // }
        //3. if found print it's index.

        Scanner scan= new Scanner(System.in);
        String n;
        n= scan.nextLine();
        System.out.println(n);
    }
}
