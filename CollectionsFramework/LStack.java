package DataStructures.CollectionsFramework;

import java.util.Stack;

public class LStack {
    public static void main(String[] leclair) {

        //Stack Last In First Out wala scene hai jo bhi element last add hua wo pahle niklega
        //Stack of books jo book last rakha wo upar hoga na
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Elephant");
        animals.push("Panther");
        animals.push("Cat");
        animals.push("Dogs");

        System.out.println("Stack: " + animals);

        //peek basically upar se dekhta hai kya para hai sabse upar
        System.out.println(animals.peek());

        //Ab kyuki stack hai jo upar hoga wahi pop bhi hoga
        //Sabse upar wala element pop
        animals.pop();

        System.out.println(animals);
    }
}
