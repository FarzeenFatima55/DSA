public class LinkedList2 {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    
    public static int size;

    Node head;
    void addToBack(int data){
        Node node = new Node(data);
        size++;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null)
            n = n.next;
            n.next = node;
        }
    }
    void printList() { 
        Node node = head; 
        while (node.next != null){ 
            System.out.print(node.data + " ");
            node = node.next; 
        } 
        System.out.print(node.data + "--> "); 
    } 
    void addMiddle(int index,int data) 
    {   size++;
        Node node =new Node(data); 
        
        Node n=head; 
        for(int i=1;i<index-1;i++) 
        { 
            n=n.next; 
        } 
        node.next=n.next; 
        n.next=node; 
    } 
    void removeFromFront() {
        
        if(head==null){
        System.out.println("no any element is present");
        }

       head=head.next; 
       size--;
 
    } 
    void removeFromBack() 
    { 
        if(size==0){
            System.out.println("Linked list is empty");
        }
        Node n=head; 
        while(n.next.next!=null) 
            n=n.next; 
        n.next=null; 
    }

    void removeAt(int index) 
    { 
    if (index==1) {
        removeFromFront(); 
    } 
    else {
        Node n=head; 
        Node temp=null;  
        for(int i=1;i<index-1;i++) 
        { 
            n=n.next; 
        } 
        temp=n.next; 
        n.next=temp.next; }
    
    }

    boolean isEmpty(){ 
       if(head==null){
       return true;
       }
       else 
       return false;    
}
}
       

