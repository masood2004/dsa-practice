public class StaticStack {

    int[] stack;
    int size;
    int top;

    StaticStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is already empty.");
            return -1;
        }
        return stack[top--];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String args[]) {
        StaticStack ss = new StaticStack(6);
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        ss.push(6);
        ss.pop();
        ss.pop();
        ss.pop();
        ss.display();
    }
}