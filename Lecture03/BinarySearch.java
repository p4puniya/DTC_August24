package Lecture03;
import java.util.Arrays;
public class BinarySearch {
    //sort an array
    static boolean bsearch(int[] arr, int target){
        int low= 0, high = arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                high = mid -1;
            }else{
                low= mid +1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,1,6,8,4,5,9,7};
        Arrays.sort(arr);
        System.out.println(bsearch(arr, 89));
    }
    //704,35
}
