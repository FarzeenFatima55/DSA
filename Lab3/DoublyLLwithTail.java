package Lab3;

public class DoublyLLwithTail {
    Node head;
    Node tail ;

    public class Node {
        String name;
        Node prev, next;
    
        
        Node(String name) {
            this.prev = null;
            this.next = null;
            this.name = name;
        }
    }
    public void insertAtBeginning(String name)

 {
    Node newnode = new Node(name);
    if(head==null){
     head=tail=newnode;
    }
           newnode.next = head;
            head.prev = newnode;
            head = newnode;

 } 

 public void insertAtEnd(String name){
    Node newnode = new Node(name);
    if(head==null){
        head=tail=newnode;
       }
       tail.next = newnode;
       newnode.prev = tail ;
       tail = newnode;

 }
 public void removeFromBeginning() {
    if (head == null)
     return;

    if (head == tail) {  
        head  = tail = null;
        
    } else {
        head = head.next;
        head.prev = null;
    }
}
public void removeFromEnd() {
    if (head == null)
     return;

    if (head == tail) {  
       head = tail = null;
        
    } else {
        tail = tail.prev;
        tail.next = null;
    }
}
public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.name + " <-> ");
        temp = temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    DoublyLLwithTail D1 = new DoublyLLwithTail();
    D1.insertAtBeginning("apple");
    D1.insertAtBeginning("Mango");
    D1.insertAtEnd("kiwi");
    System.out.println("List after insertion");
    D1.printList();
    D1.removeFromBeginning();
    D1.removeFromEnd();
    System.out.println("list after removing");
    D1.printList();
}
}

