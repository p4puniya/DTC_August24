package Lecture08;

import java.util.Arrays;

public class TwoD_Arrays {
    public static void sortByRow(int[][] arr){
        for(int i=0;i<arr.length;i++)
            Arrays.sort(arr[i]);
    }

    public static void sortByCol(int[][] arr, int col){
        Arrays.sort(arr, (a,b)->Integer.compare(a[col], b[col]));
    }

    public static void flatSort(int[][] arr){
        int rows= arr.length;
        int cols= arr[0].length;
        int[] nums= new int[rows*cols];
        //populating the array
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                nums[cols*i+j]= arr[i][j];
        
        Arrays.sort(nums);
        //populate the matrix
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                arr[i][j]=nums[cols*i+j];
        
    }

    public static  int[] linearSearch(int[][] arr, int element){
        int[] ans= new int[2];// 0-> i, 1->j
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                if(arr[i][j]==element){
                    ans[0]= i;
                    ans[1]= j;
                    return ans;
                }

        return ans;
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]arr= {
            {1,4,7,2},
            {5,9,4,6},
            {9,15,63,0}
        };
        // arr[0][3]=4;
        // int c=1;
        // for(int i=0;i<arr.length;i++)
        //     for(int j=0;j<arr[i].length;j++)
        //         arr[i][j]= (arr[0].length*i)+(j+1);
        // System.out.println(arr[0][3]);
        int nums[]= linearSearch(arr,15);
        // display(arr);
        System.out.println(nums[0]+" , "+nums[1]);
    }
}
