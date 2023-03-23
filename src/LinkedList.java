public class LinkedList {
    private class Node {
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void prepend(int data) {
        Node tmp = new Node(data);
        tmp.next = head;
        head = tmp;
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            } else {
                current = current.next;
            }
        }
    }
}
