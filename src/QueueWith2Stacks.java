import java.util.Stack;

public class QueueWith2Stacks<T> {
    Stack<T> newTop = new Stack<>();
    Stack<T> oldTop = new Stack<>();

    public void enqueue(T value) {
        newTop.push(value);
    }

    public T peek() {
        shiftStacks();
        return oldTop.peek();
    }

    private void shiftStacks() {
        if (oldTop.isEmpty()) {
            while (!newTop.isEmpty()) {
                oldTop.push(newTop.pop());
            }
        }
    }

    public T dequeue() {
        shiftStacks();
        return oldTop.pop();
    }
}
