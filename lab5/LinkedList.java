package lab5;

public class LinkedList {
   

    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void AddtoFront(int data){
        Node newnode = new Node( data);
        
        if(head==null){
            head = newnode;
            return;

        }
         newnode.next = head;
         head = newnode;

    }
    public void Reverse(){
        Node prev = null;
        Node curr =head;
        Node Next = null;
    
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
       
}
public void printList() {
    Node curr = head;
    while (curr != null) {
        System.out.print(curr.data+ " -> ");
        curr= curr.next;
    }
    System.out.println("null");
}
 
public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.AddtoFront(1);
    ll.AddtoFront(2);
    ll.AddtoFront(3);
    ll.AddtoFront(4);
    ll.AddtoFront(5);
    System.out.println("Original List");
    ll.printList();
    System.out.println("Reverse List");
    ll.Reverse();
    ll.printList();
}
}
