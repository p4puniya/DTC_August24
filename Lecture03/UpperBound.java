package Lecture03;

public class UpperBound {
    static int upperBound(int[] arr, int num){
        int low= 0, high= arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==num){
                ans= mid+1;
                low= mid+1;
            }
            else if(arr[mid]<num)
                low= mid+1;
            else{
                high= mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {1,1,4,4,4,4};
        System.out.println(upperBound(arr, 1));
    }
}
