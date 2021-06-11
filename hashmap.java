import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 150);
        hm.put("Pakistan", 20);
        hm.put("UK", 27);
        hm.put("US", 30);
        System.out.println(hm);
        hm.put("Portugal", 5);
        hm.put("China", 160);
        System.out.println(hm);
        System.out.println(hm.get("India")); //return value
        System.out.println(hm.get("Argentina"));  //return null
        
        Set<String> keys = hm.keySet(); 
        System.out.println(keys);  //returns all keys

    }
}
