package Lecture09;

import java.util.ArrayList;
import java.util.Collections;

public class DMA {
    public static void main(String[] args) {
        
        // ArrayList<Integer> arr = new ArrayList<>(10);
        // arr.add(10);
        // arr.add(100);
        // arr.add(10000);
        // arr.add(1000);
        // System.out.println(arr);
        // // arr.remove(2);
        // // arr.set(2, 500);
        // Collections.sort(arr);
        // System.out.println(arr);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(3);

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(1);
        a1.add(1);

        arr.add(a1);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(2);
        a2.add(2);
        
        arr.add(a2);

        System.out.println(arr);
    }
}
