package DataStructures.Apna.Stackk;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    void push(int data) {
        if(size() == capacity)
            expand();
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int[] newStack = new int[(int) (capacity*1.5 +1)];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
        capacity = (int) (capacity*1.5 +1);
    }

    void show() {
        for(int n: stack) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
    }

    int pop() {
        int data = -1;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            data  = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int len = size();
        if(len <= (capacity/2)/2) {
            capacity /= 2;
            int[] newStack = new int[capacity];
            System.arraycopy(stack,0,newStack,0,len);
            stack = newStack;
        }
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
