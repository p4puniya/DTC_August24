package Lecture05;

/**
 * RotateArray Ques 189:
 */
public class RotateArray {
    //Reverse a part of the array
    public static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    //Rotate 1 piece of the array
    public static void rotateByOne(int[] arr){
        int num= arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0] = num;
    }
    //Rotate arr k times
    public static void rotateByK(int[] arr, int k){
        for(int i=1;i<=k;i++)
            rotateByOne(arr);
    }
    //Rotate Using Indices
    public static void rotateByIndices(int[] arr, int k){
        int[] temp= new int[arr.length];
        int n= arr.length;
        k%=n;
        for(int i=0; i<n-i;i++)
            temp[i+k]= arr[i];
        for(int i=0;i<k;i++)
            temp[i]= arr[n-k+i];
        for(int i=0;i<n;i++)
            arr[i]= temp[i];
    }
    //Final Optimisation
    public static void rotateByRev(int[] arr, int k){
        reverse(arr, 0, arr.length-1-k);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        // reverse(arr, 1, 3);
        // rotateByOne(arr);
        // rotateByOne(arr);
        rotateByRev(arr, 2);
        Lecture02.arrays.display(arr);
    }
}