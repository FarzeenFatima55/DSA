package lab2;
public class Main {
    
    public static void main(String[] args) {
       
        LinkedList3 list = new LinkedList3();

        list.add("Banana");
        list.add("Apple");
        list.add(null);

        System.out.println("Original List: " + list);
        System.out.println("Size: " + list.size());
        list.add(2, "Date");
        System.out.println("After adding Date at index 2: " + list);
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);
        LinkedList3 duplicateList = (LinkedList3) list.duplicate();
        System.out.println("Duplicated List: " + duplicateList);
        LinkedList3 duplicateReversedList = (LinkedList3) list.duplicateReversed();
        System.out.println("Duplicated Reversed List: " + duplicateReversedList);
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}


