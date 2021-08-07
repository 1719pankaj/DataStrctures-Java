package DataStructures.LinkedListInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] arse) {
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();

        getTimeDiff(al);
        getTimeDiff(ll);
    }

    //A simple method that puts a bijjilion numbers in a List and logs how long it took
    static void getTimeDiff(List<Integer> list) {

        long start = System.currentTimeMillis();

        for(int i=0; i<100000; i++) {
            list.add(i);
//            java.util.ArrayList --> 8
//            java.util.LinkedList --> 8

//            list.add(0, i);  TODO(Run this one too)
//            java.util.ArrayList --> 2050
//            java.util.LinkedList --> 8
            //So what just happened?
            //Append to array is simple just add one to the end of things
            //But putting it at 0th location it tricky
            //Requires Shifting all the elements one step to the right and that takes time
        }

        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName() + " --> " + (end - start));
    }

}
