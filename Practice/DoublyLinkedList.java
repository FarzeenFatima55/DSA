
public class DoublyLinkedList {
    Node head;

    
    public class Node {
        String name;
        Node prev, next;
        Node (String name)
        {
        this.prev = null;
        this.next = null;
        this.name = name;
        }
       } 

       public void insertAtBeginning(String name)
       { 
           Node newNode = new Node(name);
        
            if(head==null){
                 head=newNode;
            }
            head.prev = newNode;
            newNode.next = head;
            head = newNode;

        }
        public void insertAtBeginning(String data , Node head) {
            Node newNode = new Node(name);
            if (head == null) {
                head=newNode;
                return;  // if node is null, do nothing
            }
            newnode.next = head;  // Set the next of the new node to the current head
            head = newnode;  
            return;     // Make the new node the head
        }

      public void insertAtEnd(String name)
     {
    Node newNode = new Node(name);
        
    if(head==null){
         head=newNode;
    }
    Node temp = head;
    while(temp.next!= null){
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev= temp;

    }

 }

      public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

      public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        DoublyLinkedList.Node node1 = new DoublyLinkedList.Node("A");
        DoublyLinkedList.Node node2 = new DoublyLinkedList.Node("B");
        
        // Inserting nodes at the beginning
        list.insertAtBeginning(node1);
        list.insertAtBeginning(node2);
      }

       
}
