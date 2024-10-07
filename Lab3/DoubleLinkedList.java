package Lab3;

public class DoubleLinkedList {
    public static class Node {
        String name;
        Node prev, next;

        Node(String name) {
            this.prev = null;
            this.next = null;
            this.name = name;
        }
    }

    Node head;
    public void insertAtBeginning(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void insertAtBeginning(Node node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void insertAtEnd(String name) {
        Node newnode = new Node(name);
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
    }

    public void insertAtEnd(Node node) {
        if (node == null) {
            return;
        }
        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public void insertAfterName(String name, Node node) {
        if (node == null || name == null) {
            return;
        }
        Node current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }
        if (current != null) {
            node.next = current.next;
            if (current.next != null) {
                current.next.prev = node;
            }
            current.next = node;
            node.prev = current;
        }
    }

    public void insertBeforeName(String name, Node node) {
        if (node == null || name == null) {
            return;
        }
        Node current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }

        if (current != null) {
            if (current == head) {
                node.next = head;
                head.prev = node;
                head = node;
            } else {
                node.prev = current.prev;
                node.next = current;
                if (current.prev != null) {
                    current.prev.next = node;
                }
                current.prev = node;
            }
        } else {
            System.out.println("Node with name " + name + " not found.");
        }
    }

    public void makeCircular() {
        if (head == null) {
            return; 
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp; 
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.name + " <-> ");
            temp = temp.next;
        } while (temp != null && temp != head); 
        if (temp == head) {
            System.out.println("(circular back to head)");
        } else {
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList DL = new DoubleLinkedList();
        DL.insertAtBeginning("farzeen");
        DL.insertAtBeginning("farze");
        DL.insertAtEnd("farz");
        DL.insertAtEnd("far");
        System.out.println("Before inserting before and after:");
        DL.printList();

        Node nodeAfter = new Node("insertedAfterFarz");
        DL.insertAfterName("farz", nodeAfter);

        Node nodeBefore = new Node("insertedBeforeFarze");
        DL.insertBeforeName("farz", nodeBefore);

        System.out.println("After inserting before and after:");
        DL.printList();

        DL.makeCircular();
        System.out.println("After making circular:");
        DL.printList();
    }
}
