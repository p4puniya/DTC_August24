package Lecture04;

public class Kadane {
    //Ques 53: On leetcode
    //1. Brute Force: Generate All subarrays
    //Generate Subarrays
    //Calc the sum
    //Compare it.
    static int findMaxSum(int[] arr){
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                int tempSum=0;
                //Subarrays
                for(int k=i;k<=j;k++)
                    tempSum+= arr[k];
                maxSum= Math.max(maxSum, tempSum);

            }
        }
        return maxSum;
    }
    //2. Can we use only 2 loops?
    static int findMaxSum2(int[] arr){
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            int tempSum=0;
            for(int j=i; j<arr.length;j++){
                tempSum+= arr[j];
                //Subarrays
                
                maxSum= Math.max(maxSum, tempSum);

            }
        }
        return maxSum;
    }
    //3. Kadane's Algorithm

    static void generateSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                //Subarrays
                for(int k=i;k<=j;k++)
                    System.out.print(arr[k]+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        // int[] arr= {2,-3,5,-1,4};
        // System.out.println(findMaxSum2(arr));
    }
    // Logic -> Code Kadane's Algo
    // Solve it on Leetcode as well
    // arr: [-1] -> change in case wrong ans
    // Dry Run the code for 3 loop max sum
    // Dry Run and Explain the logic for 2 Loops Max Sum
    // Kadane's algo dry run
    // 3:05 -> 3:35
}
