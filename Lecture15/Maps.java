package Lecture15;
import java.util.HashMap;
import java.util.Map;
public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> hp= new HashMap<Integer, String>();
        //Add
        
        hp.put(7, "pqrs");
        hp.put(8, "tuv");
        hp.put(9, "wxyz");
        hp.put(2, "abc");
        hp.put(3, "def");
        hp.put(4, "ghi");
        hp.put(5, "jkl");
        hp.put(6, "mno");
        //Access a value
        System.out.println(hp.get(7));
        //remove
        System.out.println(hp.remove(8));
        //view the hashmap
        System.out.println(hp);
        //Iterating over a HashMap
        for(Map.Entry m: hp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(hp.containsKey(8));
    }
}
