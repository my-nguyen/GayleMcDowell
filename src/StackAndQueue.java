public class StackAndQueue {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    class Queue {
        Node head;
        Node tail;

        public boolean isEmpty() {
            return head == null;
        }
        public int peek() {
            return head.data;
        }
        public void add(int data) {
            Node node = new Node(data);
            if (tail != null) {
                tail.next = node;
            }
            tail = node;
            if (head == null) {
                head = node;
            }
        }
        public int remove() {
            int data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }
    }

    class Stack {
        Node top;

        public boolean isEmpty() {
            return top == null;
        }
        public int peek() {
            return top.data;
        }
        public void push(int data) {
            Node node = new Node(data);
            top.next = top;
            top = node;
        }
        public int pop() {
            int data = top.data;
            top = top.next;
            return data;
        }
    }
}
