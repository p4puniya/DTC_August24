package Lecture06;

public class BS_SearchSpace {
    // Ques: 875, 1552, 2594
    static boolean check(int speed, int dist, int time){
        return (speed*time>=dist);
    }
    static int reachCollege(int dist, int high, int time){
        int low= 0;
        int ans=-1;
        while(low<=high){
            int mid= high-(high-low)/2;
            if(check(mid, dist, time)){
                ans= mid;
                high= mid-1;
            }else
                low= mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int distance = 100;
        int maxSpeed= 200;
        int time= 3;
        int high= Integer.MAX_VALUE; 
        System.out.println(high);
        int low= 1;

        // int mid= (high+low)/2;
        int mid= high-(high-low)/2;
        System.out.println(mid);
        // System.out.println(reachCollege(distance, maxSpeed, time));
    }





//1. Aggresive Cows
//2. Painter's Patition
//3. Magnetic Balls
//4. Koko Eating Bananas
//5. Read Books/Book Allocation
}
