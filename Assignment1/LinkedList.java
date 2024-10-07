package Assignment1;

public class LinkedList {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
public int findNthFromEnd(int n) {
        if (head == null) {
            return 0;
        }

        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n > size || n <= 0) {
            return -1;
        }

        int positionToFind = size - n;
        Node target = head;
        for (int i = 0; i < positionToFind; i++) {
            target = target.next;
        }

        return target.data;
    }

    public void Reverse(){
        Node prev = null;
        Node curr =tail =head;
        Node Next;
    
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }

    void removeDuplicates() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }
        Node temp = head;
        while (temp != null) {
            Node current = temp;
            while (current.next != null) {
                if (temp.data == current.next.data) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            temp = temp.next;
        }
    }

    public void sort() {
        Node current = head;
        while (current != null) {
            Node index = current.next;
            Node min = current;

            while (index != null) {
                if (index.data < min.data) {
                    min = index;
                }
                index = index.next;
            }
 
            int temp = current.data;
            current.data = min.data;
            min.data = temp;

            current = current.next;
        }
    }
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
   