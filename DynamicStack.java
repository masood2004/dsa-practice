public class DynamicStack {

    public Node top;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow, Stack is already empty.");

        }
        String value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        System.out.println("Stack (top to bottom):");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String args[]) {
        DynamicStack ds = new DynamicStack();

        ds.push("Stack 1");
        ds.push("Stack 2");
        ds.push("Stack 3");
        ds.push("Stack 4");
        ds.push("Stack 5");

        ds.display();
    }
}
