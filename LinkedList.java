public class LinkedList {

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
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addMiddle(String data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addFirst(data);
            return;
        }
        Node current = head;
        int count = 0;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bound.");
        } else {
            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is already empty.");
        } else {
            head = head.next;

            if (head == null) {
                tail = null;
            }
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
            current.next = null;
            tail = current;
        }
    }

    public boolean contains(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(String data) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data.equals(data)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.addFirst("Node 1");
        l1.addFirst("Node 2");
        l1.addFirst("Node 3");
        l1.addFirst("Node 4");
        l1.addFirst("Node 5");
        l1.addLast("Node 6");
        l1.addMiddle("Node 7", 5);
        l1.display();
        System.out.println(l1.contains("Added at 1"));
        System.out.println(l1.indexOf("Added at 2"));
    }
}