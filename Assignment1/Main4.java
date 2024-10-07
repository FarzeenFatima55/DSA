public class Main4 {
    public static void main(String[] args) {
                
        LinkedList list = new LinkedList();
        list.addNode(10);
        list.addNode(1);
        list.addNode(0);
        list.addNode(20);
        list.addNode(30);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        System.out.println("Original Linked List");
        list.printList();
        System.out.println();

        System.out.println("Task 1 : Sorted Linked List");
        list.sort();
        list.printList();
        System.out.println();

        System.out.println("Task 2 : find nth node from last");
        list.printList(); 
        int n = 2;
        int nthNode = list.findNthFromEnd(n);
        System.out.println("The " + n + "th node from the end is: " + nthNode); 
        System.err.println();
        
        System.out.println("Task 3 : Reversed linked list");
        list.Reverse();
        list.printList();
        System.out.println();

        System.out.println("Task 4 : Remove duplicates");
        list.removeDuplicates();
        list.printList();
        System.out.println();

}
}

