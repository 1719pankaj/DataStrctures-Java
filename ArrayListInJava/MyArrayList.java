package DataStructures.ArrayListInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] arse) {
        System.out.println("\n====================================================================");
        System.out.println("Undefined ArrayList");
        System.out.println("====================================================================");
        //Idhar koi sa bhi datatype dal do list me
        ArrayList undefFruits = new ArrayList();

        undefFruits.add("Apple");
        undefFruits.add(23);
        System.out.println(undefFruits);

        System.out.println("\n====================================================================");
        System.out.println("ArrayList<String>");
        System.out.println("====================================================================");
        //Yaha sirf String aayega bas
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);


        System.out.println("\n====================================================================");
        System.out.println("Custom Object ArrayList (Generics)");
        System.out.println("====================================================================");
        Pair<String, Integer> p1 = new Pair<>("Pankaj", 95);
        Pair<Boolean, String> p2 = new Pair<>(true, "Hello");

        p1.getDescription();
        p2.getDescription();

        System.out.println("\n====================================================================");
        System.out.println("List Declaration, ArrayList Constructor");
        System.out.println("====================================================================");
        List<String> listFruits = new ArrayList<>();
        List<String> listVeg = new LinkedList<>();

        listFruits.add("Raju");
        listFruits.add("faju");
        listFruits.add("kaju");

        listVeg.add("Potato");
        listVeg.add("Tomato");
        listVeg.add("Carrot");

        //Ha Arraylist me Arraylist add ho gaya koi chap hi nahi hai
        listFruits.addAll(listVeg);

        System.out.println(listFruits);
        System.out.println(listFruits.get(2));
        try {
            //IndexOutOFBound
            System.out.println(listFruits.get(90));
        } catch (Exception e) {
            e.printStackTrace();
        }

        listFruits.set(1, "Jha2");
        System.out.println(listFruits);

        List<String> toRemove = new ArrayList<>();
        toRemove.add("kaju");
        toRemove.add("Potato");
        toRemove.add("hii");

        //Remove a set from another set
        listFruits.removeAll(toRemove);
        //"hii" to mila nahi koi baat nahi
        System.out.println(listFruits);

        System.out.println("Banana hai kya? " + listFruits.contains("Banana"));
        //Objet hi return karega String nahi
        Object x[] = listFruits.toArray();

        //Je ka solution
        String[] temp = new String[listFruits.size()];

        listFruits.toArray(temp);

        for(String item: temp) {
            System.out.println(item);
        }

    }
}