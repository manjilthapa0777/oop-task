
public class Customstackapp {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(15);
        System.out.println("Peek: " + stack.peek());
        stack.pop();
        System.out.println("Peek after pop: " + stack.peek());
    }
}

class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
