package DataStructures.Apna.LinkedListt;

import javax.management.NotificationFilter;

public class LinkedList {
    Node head;

    void add(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = toAdd;
        }
    }

    void addToStart(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
        } else {
            Node temp = head;
            head = toAdd;
            toAdd.next = temp;
        }
    }

    void addAt(int position, int data) {
        if (position == 0) {
            addToStart(data);
        } else {
            Node toAdd = new Node(data);
            int count = 0;
            Node temp = head;
            Node hold;
            while (temp != null) {
                if (count == position - 1) {
                    hold = temp.next;
                    temp.next = toAdd;
                    temp.next.next = hold;
                }
                count++;
                temp = temp.next;
            }
        }
    }

    int size() {
        int size = 0;
        if (head == null) {
            return size;
        } else {
            Node temp = head;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
        }
        return size;
    }

    void print() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    void remove(int toRemove) {
        Node temp = head;
        while(temp != null) {
            if(toRemove == temp.next.data) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    void removeAt(int index) {
        Node temp = head;
        if (index == 0) {
            head = temp.next;
        } else {
            int count = 0;
            while (temp != null) {
                if (count == index - 1) {
                    temp.next = temp.next.next;
                }
                count++;
                temp = temp.next;
            }
        }
    }
}
