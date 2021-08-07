package DataStructures.CollectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;


public class LArrayList {
    public static void main(String[] perez) {

        System.out.println("====================================================================");
        System.out.println("Array List of Strings");
        System.out.println("====================================================================");
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Rakesh");
        studentNames.add("jhatu");
        studentNames.add("lalu");
        studentNames.add("kalu");
        studentNames.add(0, "chodu");
        System.out.println(studentNames);
        System.out.println(studentNames.get(1));
        studentNames.remove(3);
        studentNames.remove("kalu");
        System.out.println(studentNames);
        studentNames.set(2, "hii");
        System.out.println(studentNames);

        System.out.println("====================================================================");
        System.out.println("Array List of Integers");
        System.out.println("====================================================================");
        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(100);
        intList.add(90);
        intList.add(80);
        intList.add(70);
        intList.add(60);
        intList.add(50);
        intList.add(40);
        intList.add(30);
        intList.add(20);

        System.out.println(intList);
        //Removing an element by value, but value is in int
        //So, to make sure it goes in as value and not index, we use valueOf
        intList.remove(Integer.valueOf(20));
        System.out.println(intList);

        //Gareebo wala for loop
        for (int i=0; i<intList.size(); i++) {
            System.out.println("The element is " + intList.get(i));
        }

        //Enhanced for loop
        for(Integer element: intList) {
            System.out.println("For each element is " + element);
        }

        //Iterator
        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator " + it.next());
        }

    }

}
