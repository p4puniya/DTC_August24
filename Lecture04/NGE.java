package Lecture04;

public class NGE {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
    static int[] createNGER(int[] arr){
        int[] NGER= new int[arr.length];
        int maxElement= -1;
        for(int i=arr.length-1; i>=0;i--){
            NGER[i]= maxElement;
            if(arr[i]>maxElement)
                maxElement=arr[i];
        }
        return NGER;
    }
    //HW: CREATE NGEL
    public static void main(String[] args) {
        int[] arr= {1,5,7,5,8,4,6,2};
        int[] NGER= createNGER(arr);
        display(NGER);
    }
}
