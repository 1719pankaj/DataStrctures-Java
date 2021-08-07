package DataStructures.CollectionsFramework.SetOfCustomObjects;

import java.util.HashSet;
import java.util.Set;

public class LSetStudent {
    public static void main(String[] Raikonnen) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Pankaj", 2));
        studentSet.add(new Student("Raju", 4));
        studentSet.add(new Student("Raju", 4));
        studentSet.add(new Student("Jhatu", 3));
        studentSet.add(new Student("Kalu", 2));

        //Mer aur kalu ka roll number same hai
        //Raju ka enty hi 2 bar hai
        //Isko ghanta na samajh nahi aana chahiye
        //Normally sab hi add kar dega but kuch extra masala hai Student class me
        //Ja ke student class me padh le tab samajh aayega kya chal raha

        System.out.println(studentSet);
    }
}
