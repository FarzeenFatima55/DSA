package Lab4;

import java.util.Stack;

public class QueueStack {

    static class Queue {
        private Stack<Integer> s1; 
        private Stack<Integer> s2; 
       
        public Queue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public boolean isEmpty() { 
            return s1.isEmpty();
        }

       
        public void enqueue(int data) {
            
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        public int peek() { 
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }

        public static void main(String[] args) {
            int[] keys = {1, 2, 3, 4, 5};
            Queue q = new Queue();
 
            for (int key : keys) {
                q.enqueue(key);
            }

            System.out.println(q.dequeue()); // prints 1
            System.out.println(q.dequeue()); // prints 2
            System.out.println(q.dequeue()); // prints 3
            System.out.println(q.dequeue()); // prints 4
            System.out.println(q.peek());    // prints 5
        }
    }
}
