package DataStructures.CollectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LPriorityQueue {
    public static void main(String[] verstrappen) {

        System.out.println("====================================================================");
        System.out.println("Priority Queue");
        System.out.println("====================================================================");
        //FIFO jo sabse pahle aaya tha wo sabse pahle niklega
        //Ticket counter pe log khare hai peeche se log agg hote hai
        //Aur samne se apna kaam kar ke nikal jaate hai
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.offer(12);
        pQueue.offer(56);
        pQueue.offer(24);
        pQueue.offer(34);

        //Idhar Min-Heap naam ka kuch automatic ho raha hai
        //Basically jo smallest element hai wo first me aa jayega
        //Aur wo hi priority element hai
        System.out.println(pQueue);
        //priority element ko karega pop
        pQueue.poll();
        //Ab firese ek bar smallest element samne aa jayega jo bhi hoga rinse and repeat
        System.out.println(pQueue);

        System.out.println(pQueue.peek());


        System.out.println("====================================================================");
        System.out.println("Priority Queue reverseOrder");
        System.out.println("====================================================================");
        //Iska Constructor me Comparator laga ke pura priority hi change kar diya system ka
        PriorityQueue<Integer> pQueueM = new PriorityQueue<>(Comparator.reverseOrder());
        pQueueM.offer(12);
        pQueueM.offer(56);
        pQueueM.offer(24);
        pQueueM.offer(34);

        //Idhar Max-Heap naam ka kuch automatic ho raha hai
        //Basically jo biggest element hai wo first me aa jayega
        //Aur wo hi priority element hai
        System.out.println(pQueueM);
        //priority element ko karega pop
        pQueueM.poll();
        //Ab firese ek bar biggest element samne aa jayega jo bhi hoga rinse and repeat
        System.out.println(pQueueM);

        System.out.println(pQueueM.peek());
    }
}
