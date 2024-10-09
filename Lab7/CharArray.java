package Lab7;

public class CharArray {

    public static void printForward(char[] arr, int index) {
        if (index == arr.length) {
            return; 
        }
        System.out.print(arr[index] + " "); 
        printForward(arr, index + 1);  
    }

    public static void printReverse(char[] arr, int index) {
        if (index < 0) {
            return;  
        }
        System.out.print(arr[index] + " ");  
        printReverse(arr, index - 1); 
    }

    public static void main(String[] args) {

        char[] arr = {'F', 'A', 'R', 'Z', 'E','E','N'};
        
        System.out.print("Forward: ");
        printForward(arr, 0);  
        System.out.println();

        System.out.print("Reverse: ");
        printReverse(arr, arr.length - 1); 
        System.out.println();
    }
}
