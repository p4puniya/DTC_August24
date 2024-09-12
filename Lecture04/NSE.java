package Lecture04;

public class NSE {
    static void display(int[] arr){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
    static int[] createNSER(int[] arr){
        int[] NSER= new int[arr.length];
        int minElement= Integer.MAX_VALUE;
        for(int i=arr.length-1; i>=0;i--){
            NSER[i]= minElement;
            if(arr[i]<minElement)
                minElement=arr[i];
        }
        return NSER;
    }
    //HW: CREATE NSEL
    public static void main(String[] args) {
        int[] arr= {1,5,7,5,8,4,6};
        // int[] NGER= createNGER(arr);
        int[] NSER= createNSER(arr);
        display(NSER);
    }
}
