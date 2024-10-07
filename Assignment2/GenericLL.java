
package Assignment2;

public class GenericLL<T> {

    private Node<T> head;

    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;  
        } else {
            Node<T> current = head;
            while (current.next != null) {  
                current = current.next;
            }
            current.next = newNode;  
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " "); 
            current = current.next;
        }
        System.out.println();  
    }

    public static void main(String[] args) {
       
        GenericLL<Integer> intList = new GenericLL<>();
        System.out.print("INTEGERS LIST : ");
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.display();  

        System.out.print("STRING LIST : ");
        GenericLL<String> stringList = new GenericLL<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.display(); 

        System.out.print("CUSTOM OBJECTS LIST : ");
        GenericLL<Person> personList = new GenericLL<>();
        personList.add(new Person("Aiman", 19));
        personList.add(new Person("Farzeen", 19));
        personList.add(new Person("Haneen", 19));
        personList.display();  
}
}
