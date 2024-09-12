package Lecture04;

public class PreComputation {
//We can precompute some data that we know,
//we might need later.
public static void main(String[] args) {
    int[] arr= {1,2,1,2,1,2};
    System.out.println(countOcc(arr, 3));
}
static int countOcc(int[] arr, int k){
    //Brute Force:
    // int count=0;
    // for(int i=0; i<arr.length;i++){
    //     int tempSum=0;
    //     for(int j=i; j<arr.length;j++){
    //         tempSum+=arr[j];
    //         if(tempSum==k)
    //             count++;
    //     }
    // }
    // return count;
    
    //Pre Computations
    int[] preSum= new int[arr.length];
    preSum[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        preSum[i]=preSum[i-1]+arr[i];
    }
    int count=0;
//Generating all subarrays
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int subarraySum;
            if(i==0)
                subarraySum= preSum[j];
            else 
                subarraySum= preSum[j]- preSum[i-1];
            if(subarraySum==k)
            count++;
        }
    }
    return count;
}
//1. Count SubArrays with sum equal to k.[PreSum]
//2. Next Greatest Element

//3. Next Smallest Element

}
