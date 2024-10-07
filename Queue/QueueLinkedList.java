package Queue;

public class QueueLinkedList {
    public static class Node {
        String name;
        Node  next;

        Node(String name) {

            this.next = null;
            this.name = name;
        }
    }

    static class Queue{
        static Node  head = null;
        static Node  tail = null;

        public static boolean isEmpty(){
            return head == null && tail ==null;
        }

        public static void add (String name){
            Node newnode = new Node(name);

            if(head==null){
                head=tail=newnode;
                return;
               }
               tail.next = newnode;
               tail = newnode;
        }

        public static String Remove(){
            if(isEmpty()){
                System.out.println("empty queue");
            }
            String front = head.name;
            if(tail==head){
                tail=head=null;
            }
            else {
                head = head.next;
            }
            return front;


    }
    public static String peek(){
        if(isEmpty()){
            System.out.println("empty queue");
           
        }
        return head.name;
    }
    
}
public static void main(String[] args) {
    Queue qu = new Queue();
        qu.add("mini"); //first in first out
        qu.add("Tiny");
        qu.add("small");

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.Remove();
        }
}
}
