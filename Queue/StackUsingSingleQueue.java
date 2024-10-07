package Queue;
import java.util.LinkedList;
import java.util.Queue;

class StackUsingSingleQueue {

    Queue<Integer> queue = new LinkedList<>();

    // Push operation
    public void push(int data) {
        int size = queue.size();
        
        // Add the new element to the queue
        queue.add(data);
        
        // Rotate the elements in the queue to simulate stack behavior
        for (int i = 0; i < size; i++) {
            int x = queue.remove();
            queue.add(x);
        }
    }

    // Pop operation (removes and returns the top element)
    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.remove();
    }

    // Peek operation (returns the top element without removing it)
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Stack size
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue stack = new StackUsingSingleQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}
