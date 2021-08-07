package DataStructures.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LMap {
    public static void main(String[] Tsunoda) {

        System.out.println("====================================================================");
        System.out.println("HashMap");
        System.out.println("====================================================================");
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        System.out.println(numbers);
        //Idhar same key 2 bar nahi hoga, iska matlab ye nahi ki add nahi hoga
        //Update ho jayega
        numbers.put("Two", 22);

        //Conflictance Avoidance Primitive Technique
        if(!numbers.containsKey("Two")) {
            numbers.put("Three", 33);
        }
        //Conflict Avoidance Modern Techni
        // que
        numbers.putIfAbsent("Three", 33);

        System.out.println(numbers);

        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

//                                                  👇👇 Idhar keySet bhi hota hai
//        for(Map.Entry<String, Integer> e: numbers.entrySet()) {
//            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue()+"\n");
//        }


        System.out.println("\n====================================================================");
        System.out.println("TreeMap");
        System.out.println("====================================================================");

        //All same just that everything is sorted already
        Map<String, Integer> Tnumbers = new TreeMap<>();

        Tnumbers.put("One", 1);
        Tnumbers.put("Two", 2);
        Tnumbers.put("Three", 3);

        System.out.println(Tnumbers);
        //Idhar same key 2 bar nahi hoga, iska matlab ye nahi ki add nahi hoga
        //Update ho jayega
        Tnumbers.put("Two", 22);

        //Conflictance Avoidance Primitive Technique
        if(!Tnumbers.containsKey("Two")) {
            Tnumbers.put("Three", 33);
        }
        //Conflict Avoidance Modern Techni
        // que
        Tnumbers.putIfAbsent("Three", 33);

        Tnumbers.remove("Three");
        System.out.println(Tnumbers);

        System.out.println(Tnumbers.containsValue(3));

        System.out.println(Tnumbers.isEmpty());
    }
}
