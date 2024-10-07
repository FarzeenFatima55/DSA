package Lab4;

public class StackLL {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private class Stack {
        private Node top;

        public Stack() {
            this.top = null;
        }

        public void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
            System.out.println("Inserting " + x);
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println("Removing " + top.data);
            top = top.next;
        }
    }

    public static void main(String[] args) {
        StackLL stackLL = new StackLL();
        Stack stack = stackLL.new Stack(); // Create an instance of the inner Stack class

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
}
