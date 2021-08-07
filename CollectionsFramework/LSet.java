package DataStructures.CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LSet {
    public static void main(String[] marc) {

        System.out.println("====================================================================");
        System.out.println("Hash Set");
        System.out.println("====================================================================");
        //Set me element repeat nahi hota ye hai jeevan ka satya.
        Set<Integer> set = new HashSet<>();

        //Add kahi bhi kar le bachwa ye hoga wahi jo isko hona hai
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        set.add(65);

        //Order ka lag gaya hai kuch hi kahi bhi hai
        //Bas ek baat certain hai ek element 2 bar definately nahi aayega
        System.out.println(set);

        //Koi valueOf nahi, idhar index ka chakkar hi nahi hai😂😂
        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(21)+" "+set.contains(100));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set.isEmpty()+" "+set);

        System.out.println("====================================================================");
        System.out.println("Linked Hash Set");
        System.out.println("====================================================================");
        //Set me element repeat nahi hota ye hai jeevan ka satya.
        //Lekin Linked Hash Set me order change nahi hota jaise likhega waise aayega
        Set<Integer> Lset = new LinkedHashSet<>();

        Lset.add(32);
        Lset.add(2);
        Lset.add(54);
        Lset.add(21);
        Lset.add(65);

        Lset.add(65);

        //Order ekdum jaise tha intact hai
        //Bas ek baat certain hai ek element 2 bar definately nahi aayega
        System.out.println(Lset);

        //Koi valueOf nahi, idhar index shayad ho sakta hai
        //Upar to definitely nahi tha lekni idhar ka pata nahi
        Lset.remove(54);

        System.out.println(Lset);

        System.out.println(Lset.contains(21)+" "+Lset.contains(100));

        System.out.println(Lset.isEmpty());

        System.out.println(Lset.size());

        Lset.clear();
        System.out.println(Lset.isEmpty()+" "+Lset);

        System.out.println("====================================================================");
        System.out.println("Tree Set");
        System.out.println("====================================================================");

        //Jo bhi likho binary tree form me store hoga
        //Ab ye tumhara matha ka dard nahi hai
        //Bas itna samajh lo ye sort ho jayega autometakli
        Set<Integer> TreeSet = new TreeSet<>();

        //Add kahi bhi kar le bachwa store hoga ye sorted hi
        TreeSet.add(32);
        TreeSet.add(2);
        TreeSet.add(54);
        TreeSet.add(21);
        TreeSet.add(65);

        TreeSet.add(65);

        //Order disorder hona hai kyuki sort ho jayega
        //Bas ek baat certain hai ek element 2 bar definately nahi aayega
        System.out.println(TreeSet);

        //Koi valueOf nahi, idhar index shayad ho sakta hai
        //Upar to definitely nahi tha lekni idhar ka pata nahi
        TreeSet.remove(54);

        System.out.println(TreeSet);

        System.out.println(TreeSet.contains(21)+" "+TreeSet.contains(100));

        System.out.println(TreeSet.isEmpty());

        System.out.println(TreeSet.size());

        TreeSet.clear();
        System.out.println(TreeSet.isEmpty()+" "+TreeSet);
    }
}
