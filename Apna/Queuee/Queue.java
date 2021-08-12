package DataStructures.Apna.Queuee;

public class Queue {
    int n = 5;
    int[] queue = new int[n];
    int size = 0;
    int front = 0;
    int rear = 0;

    void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear+1)%n;
            size++;
        } else {
            System.out.println("Queue is Full");
        }
    }

    int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front+1)%n;
            size--;
        } else {
            System.out.println("Queue is Empty");
        }
        return data;
    }

    void show() {
        System.out.print("Elements are :  ");
        for(int i=0; i<size; i++) {
            System.out.print(queue[(front+i)%n] + " ");
        }
        System.out.println("\n");
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == n;
    }
}
