package DataStructures.CollectionsFramework;

import java.util.ArrayDeque;

public class LArrayDeque {
    public static void main(String[] bottas) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        //Last me add karega normal deque behaviour
        adq.offer(23);
        //First me laga dega
        adq.offerFirst(12);
        //same as offer() no idea why this exists
        adq.offerLast(45);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);
    }
}
