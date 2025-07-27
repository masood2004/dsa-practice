public class CircularLinkedList {

    Node head, tail = null;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addMiddle(String data, int position) {
        Node newNode = new Node(data);
        if (position == 0 || head == null) {
            addFirst(data);
            return;
        }

        Node current = head;
        int count = 0;

        while (current.next != head && count < position - 1) {
            current = current.next;
            count++;

        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;
        }

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty.");
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is already empty.");
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            tail.next = head;
        }
    }

    public boolean contains(String data) {
        Node current = head;
        do {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public int indexOf(String data) {
        Node current = head;
        int index = 0;
        do {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        } while (current != head);
        return -1;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is already empty.");
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.print("End");
        System.out.println();
    }

    public static void main(String args[]) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addFirst("Node 1");
        cll.addFirst("Node 2");
        cll.addFirst("Node 3");
        cll.addFirst("Node 4");
        cll.addLast("Node 5");
        cll.addMiddle("Added Middle", 3);
        cll.deleteFirst();
        cll.deleteLast();
        cll.display();
        System.out.println(cll.contains("Added Middle"));
        System.out.println(cll.indexOf("Added Middle"));
    }
}
