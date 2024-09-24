package Lecture05;
//Ques 42
public class RWH {
    class Solution {
        public int trap(int[] height) {
            int totalWater=0;
            int[] nger= NGER(height);
            int[] ngel= NGEL(height);
            for(int i=0;i<height.length;i++){
                int currentLevel=0;
                int currentWater=0;
                currentLevel= Math.min(nger[i], ngel[i]);
                currentWater= currentLevel- height[i];
                if(currentWater>0) totalWater+=currentWater;
            }
            return totalWater;
        }
         int[] NGEL(int[] arr){
            int maxElement= 0;
            int[] nger= new int[arr.length];
            for(int i=0;i<arr.length;i++){
                nger[i]= maxElement;
                maxElement= Math.max(arr[i], maxElement);
            }
            return nger;
        }
        int[] NGER(int[] arr){
            int maxElement= 0;
            int[] nger= new int[arr.length];
            for(int i=arr.length-1;i>=0;i--){
                nger[i]= maxElement;
                maxElement= Math.max(arr[i], maxElement);
            }
            return nger;
        }
    }
    public static void main(String[] args) {
        
    }
}
