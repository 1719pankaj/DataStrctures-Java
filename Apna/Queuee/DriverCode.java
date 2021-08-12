package DataStructures.Apna.Queuee;

public class DriverCode {
    public static void main(String[] arse) {
        Queue q = new Queue();

        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.show();

        System.out.println(q.deQueue());

        q.show();

        q.enQueue(6);
        q.enQueue(7);

        q.show();

        System.out.println("Size be: " + q.getSize());

        q.enQueue(6);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());


    }
}
