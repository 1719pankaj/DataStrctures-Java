package DataStructures.CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LLinkListQueue {
    public static void main(String[] rossi) {

        //FIFO jo sabse pahle aaya tha wo sabse pahle niklega
        //Ticket counter pe log khare hai peeche se log agg hote hai
        //Aur samne se apna kaam kar ke nikal jaate hai
        Queue<Integer> queue = new LinkedList<>();

        //offer basically add hai ek add bol ke bhi function hai
        //problem hai agar add kiya aur add ho gaya tab true return karega sysout me
        //lekin galti se nahi hua to exception throw karega
        //offer me kuch nahi agar ho gaya to true return, nahi hua to false
        queue.offer(12);
        queue.offer(56);
        queue.offer(34);
        queue.offer(24);

        System.out.println(queue);

        //removes element and returns the removed value
        //ek remove() bhi hai leink usko kuch mila nahi to exception
        //poll izzat se null return karega
        System.out.println(queue.poll());

        System.out.println(queue);

        //if nothing next in line returns null
        //ek element() function bhi hai same kaam ke liye
        //usko agar kuch nahi mila to exception throw kar dega
        System.out.println(queue.peek());
    }
}
