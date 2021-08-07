package DataStructures.Apna.LinkedListt;

public class DriverCode {
    public static void main(String[] arse) {

        LinkedList ll = new LinkedList();

        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.addToStart(16);

        ll.addAt(2, 36);

        ll.remove(15);

        ll.print();

        System.out.println(ll.size());

        ll.addAt(0, 69);

        ll.print();

        System.out.println(ll.size());

        ll.removeAt(0);

        ll.print();

    }
}
