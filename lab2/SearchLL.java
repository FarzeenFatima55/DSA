package lab2;

import java.util.Scanner;

public class SearchLL {
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next=null;
    }
}
public static Node head;
public static int size ;

public  void add(int data){
    
    Node newNode = new Node(data);
    size++;

    if(head==null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
}

    public static int Search(int key){
        Node temp = head;
        int i =0;
        
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Element found at index : " + i);;
            }
            temp = temp.next ; 
            i++;
        }
        return -1;
        }
    
public void print (){
    if(head==null){
        System.out.println("Empty list");
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + "->");
        temp=temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    SearchLL ll = new SearchLL();
    Scanner sc = new Scanner(System.in);
    ll.add(1);//idx 4
    ll.add(3);//idx 3
    ll.add(5);//idx 2
    ll.add(7);//idx 1
    ll.add(9);//idx 0

    System.out.println("Linked List");
    ll.print();
    System.out.println("Length of linked list :" + size);
    System.out.println("input element to search");
    int key = sc.nextInt();
    ll.Search(key);

}
        
    }



