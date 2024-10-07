package Lab3;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class CycleLinkedList { 
    boolean hasCycle(Node head) {
        if (head == null) return false;  

        Node slow = head;
        Node fast = head;

        // Traverseing
        while (fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;   

            if (slow == fast) {        
                return true;
            }
        }

        return false;  
    }
    void createCycle(Node head, int position) {
        if (head == null || position < 0) return;

        Node temp = head;
        Node cycleNode = null;
        int index = 0;

        while (temp.next != null) {
            if (index == position) {
                cycleNode = temp;   
            }
            temp = temp.next;
            index++;
        }
        temp.next = cycleNode;   
    }

    public static void main(String[] args) {
        CycleLinkedList list = new CycleLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

         
        list.createCycle(head, 2);

        
        boolean cycleExists = list.hasCycle(head);
        System.out.println("Cycle exists: " + cycleExists);   
    }
}
