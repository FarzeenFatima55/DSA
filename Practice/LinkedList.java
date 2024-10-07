public class LinkedList {
public static class Node {
    int Data;
    Node Next;
    public Node (int Data){
        this.Data=Data;
        this.Next=null;
    }
}
public static Node head ;
public static Node tail;
public static int size;

//Methods
public void addFirst(int Data){
 //step 1 create new node
 Node newNode = new Node(Data);
 size++;

    if (head==null){
       head=tail=newNode;
       return;
    }
   
     //step 2 newnode next = head
     newNode.Next = head;
     //step 3 head= newnode
     head = newNode;
}

public void addLast(int Data){
    //step 1 create new node
    Node newNode = new Node(Data);
    size++;

       if (head==null){
          head=tail=newNode;
          return;
       }
      
        //step 2 tail.next = tail
        tail.Next = newNode;
        //step 3 tail= newnode
        tail = newNode;
   }
   public void print(){
    if(head==null){
       System.out.println("list is empty");
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.Data+"->");
        temp=temp.Next;
    }
    System.out.println("null");
   }

   public void add (int idx, Object data){
    if(idx==0){
        addFirst(data);
        return;
    }
    Node newNode =new Node(data);
    size++;
    Node temp = head;
    int i=0;

    while(i<idx-1){
    temp=temp.Next;
    i++;
    }
    //i=idx-1; temp->prev
    newNode.Next = temp.Next;
    temp.Next =newNode;
   }

   public int removeFirst(){
if(size==0){
    System.out.println("Linked list is empty");
    return Integer.MIN_VALUE;
}
else if (size==1){//when head & tail same
    int val = head.Data;
    head=tail=null;
    size=0;
    return val;
}
   int val = head.Data;
   head=head.Next;
   size--;
   return val; //value will be returned which is removed
   }

public int removeLast(){
if(size==0){
    System.out.println("Linked list is empty");
    return Integer.MIN_VALUE;
}
else if (size==1){//when head & tail same
    int val = head.Data;
    head=tail=null;
    size=0;
    return val;
}
   // prev : i =size-2 second last node
   Node prev =head ;
   for(int i =0 ; i<size-2 ; i++){
    prev = prev.Next;
   }

   int val =prev.Next.Data; //tail data
   prev.Next = null;
   tail=prev;
   size--;
   return val; 
}
//search
public int itrSearch(int Key){
Node temp =head;
int i =0;

while(temp!=null){
    if(temp.Data==Key){//key found
        return i;
    }
    temp = temp.Next ; //update
    i++;
}
//key not found case
return -1;
}

//recSearch
public int Helper(Node head , int Key){//recursive function O(n)
if(head==null){
    return -1;
}
if(head.Data==Key){
    return 0;
}
int idx = Helper(head.Next, Key);
if(idx==-1){
   return -1;
}
return idx+1;
}
public int recSearch(int Key){
    return Helper(head,Key);
 }

public void Reverse(){
    Node prev = null;
    Node curr =tail =head;
    Node Next;

    while(curr != null){
        Next = curr.Next;
        curr.Next = prev;
        prev = curr;
        curr = Next;
    }
    head = prev;
}
public void DltNthFromEnd(int n){
    //calculate size of ll
    int Sz = 0 ;
    Node temp = head;
    while(temp != null){
        temp = temp.Next;
        Sz++;
    }
    if(n==Sz){
        head = head.Next;//remove first opt
        return;
    }

    int i =1;
    int iToFind = Sz-n;
    Node prev = head;
    while(i < iToFind) {
        prev = prev.Next;
        i++;
    }
    prev.Next =prev.Next.Next;
   
}
//slow fast approch for palindrome
public Node FindMid(Node head){
    Node Slow = head;
    Node Fast =head;

    while(Fast!= null && Fast.Next != null){
        Slow =Slow.Next; //move by +1
        Fast=Fast.Next.Next; //move by +2
    }
    return Slow ; //slow is  my mid
}

public boolean CheckPalindrome(){
    if(head==null || head.Next!= null){
        return true;
    }
    //step 1 find mid
    Node midNode = FindMid(head);

    // step 2 reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node Next;

    while(curr != null){
        Next = curr.Next;
        curr.Next = prev;
        prev = curr;
        curr = Next;
    }
    Node right = prev; //right half head
    Node left = head;

    //step 3 check lleft half = right half
    while(right != null){
        if (left.Data != right.Data){
        return false;
    }
    left = left.Next;
    right = right.Next;
}
return true;
}

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
       
        /*ll.addFirst(2);
       
        ll.addFirst(1);
       
        ll.addLast(4);
        
        ll.addLast(5);
       
        ll.add(2, 3);
       
        ll.print();
        System.out.println(ll.size);*/


       /*System.out.print("Remove First: ");
        ll.removeFirst();
        ll.print();
        System.out.println("Size after remove First: " + ll.size);

        System.out.print("Remove Last: ");
        ll.removeLast();
        ll.print();
        System.out.println("Size after remove last: "+ ll.size);*/

       /*  System.out.println("iterative Search index of Value");
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));*/

       /*  System.out.println("Recursive Search index of Value");
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));*/

        /*ll.Reverse();
        ll.print();*/

        /*ll.DltNthFromEnd(2);  // remove third node from last
        ll.print();*/

        //palindrome
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.CheckPalindrome());


    }

    public void add(Object data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public List duplicate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'duplicate'");
    }

    public List duplicateReversed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'duplicateReversed'");
    }

    public int findNthFromEnd(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findNthFromEnd'");
    }
}

