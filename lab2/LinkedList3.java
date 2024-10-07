package lab2;
public class LinkedList3 implements List {
    private Node head;
    private int size;

    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList3() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void add(Object item) {
        add(size+1,item);
    }

    @Override
    public void add(int index, Object item) {
        if (index < 1 || index > size + 1) {
            System.out.println("index out of range");
        }

        Node newNode = new Node(item);
        if (index == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++; 
    }

    @Override
    public void remove(int index) {
        if (index < 1 || index > size) {
            System.out.println("");
        }

        if (index == 1) {  
            head = head.next;
        } else {
            Node current = head;
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            Node nodeToRemove = current.next;
            current.next = nodeToRemove.next;
            nodeToRemove.next = null;  
        }
        size--;  
    }   

    @Override
    public void remove(Object item) {
        if (head != null && head.data.equals(item)) {  
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data.equals(item)) {
                Node nodeToRemove = current.next;
                current.next = nodeToRemove.next;
                nodeToRemove.next = null;  
                size--;
                return;
            }
            current = current.next;
        }
    }
 
    @Override
    public List duplicate() {
        LinkedList3 duplicateList = new LinkedList3();
        Node current = head;
        while (current != null) {
            duplicateList.add(current.data);
            current = current.next;
        }
        return duplicateList;
    }

    @Override
   
    public List duplicateReversed() {
        LinkedList3 duplicateList = new LinkedList3();
        Node current = head;
        while (current != null) {
            duplicateList.add(1, current.data);
            current = current.next;
        }
        return duplicateList;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ size: " + size + " - ");
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(", ");
            current = current.next;
        }
        if (size > 0) {
            sb.delete(sb.length() - 2, sb.length());  // Remove trailing comma and space
        }
        sb.append(" ]");
        return sb.toString();
    }

    


    
}

