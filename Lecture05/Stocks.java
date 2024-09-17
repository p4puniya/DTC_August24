package Lecture05;
// 121
public class Stocks {
    public int[] NGER(int[] arr){
        int[] temp= new int[arr.length];
        int maxV=-1;

        for(int i= arr.length-1; i>=0;i--){
            temp[i]= maxV;
            maxV= Math.max(maxV, arr[i]);
        }
        return temp;
    }
    //prices=  5, 6, 8, 4, 8, 1, 2, 7, 3
    public int maxProfit(int[] prices) {
        int[] arr= NGER(prices);
        int maxP= 0;
        for(int i=0;i<prices.length;i++)
            maxP= Math.max(maxP, arr[i]-prices[i]);
        
        return maxP;
    }
}
