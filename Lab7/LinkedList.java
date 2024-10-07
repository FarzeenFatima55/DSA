package Lab7;

public class LinkedList {
    Node head;
    class Node {
        int data;
       Node  next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insert(int data){
    Node newnode = new Node(data);
    if(head==null){
        head=newnode;
    }else{
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = newnode;
    }
    }
    public void printitr(){
        Node current = head ;
        while(current!=null){
        System.out.println(current.data+"");
            current=current.next;
        }
        System.out.println();
    }
    public void printrec(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data+"");
    
     printrec(node.next);
}
public static void main(String[] args) {
    LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        
        System.out.println("Iterative print:");
        list.printitr();   

        System.out.println("Recursive print:");
        list.printrec(list.head);
}
}
