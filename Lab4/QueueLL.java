package Lab4;

public class QueueLL {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Queue {
        private Node rear = null, front = null;

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int removedData = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return removedData;
        }

        public void enqueue(int item) {
            Node newNode = new Node(item);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        public boolean isEmpty() {
            return front == null;
        }
    }

    public static void main(String[] args) {
        QueueLL queueLL = new QueueLL();
        Queue queue = queueLL.new Queue(); // Create an instance of the inner Queue class

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.printf("Front element is %d\n", queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        if (queue.isEmpty()) {
            System.out.print("Queue is empty");
        } else {
            System.out.print("Queue is not empty");
        }
    }
}
