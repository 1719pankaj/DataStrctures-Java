package DataStructures.Apna.Stackk;

public class Stack {
    int[] stack = new int[5];
    int top = 0;

    void push(int data) {
        if (top >= 5) {
            System.out.println("Stack is full, push failed");
        } else {
            stack[top] = data;
            top++;
        }
//        System.out.println(top);
    }

    void show() {
        for(int n: stack) {
            System.out.print(n + " ");
        }
    }

    int pop() {
        int data = -1;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            data  = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    int peek() {
        return stack[top-1];
    }

    int size() {
        return top;
    }

    boolean isEmpty() {
        return top <= 0;
    }
}
