public class DoublyLinkedList {

    Node head, tail = null;

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addMiddle(String data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bound");
        } else {
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("[End]");
        System.out.println();
    }

    public void deleteFirst() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is already empty.");
        } else if (head.next == null) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            tail.prev = null;
            current.next = null;
            tail = current;
        }
    }

    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst("Node 1");
        dll.addFirst("Node 2");
        dll.addFirst("Node 3");
        dll.addLast("Node 4");
        dll.addMiddle("Node 5", 2);
        dll.deleteFirst();
        dll.deleteLast();
        dll.display();
    }
}
