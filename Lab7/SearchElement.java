package Lab7;
import java.util.Scanner;

public class SearchElement {

    public static boolean iterativeSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;  
            }
        }
        return false;  
    }

    public static boolean recursiveSearch(int[] arr, int key, int index) {
        if (index >= arr.length) {
            return false; 
        }
        if (arr[index] == key) {
            return true;  
        }
        return recursiveSearch(arr, key, index + 1);  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 8, 12, 7, 5, 10, 3};
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        boolean iterativeResult = iterativeSearch(arr, key);
        System.out.println("Iterative search result: " + (iterativeResult ? 1 : 0));

        boolean recursiveResult = recursiveSearch(arr, key, 0);
        System.out.println("Recursive search result: " + (recursiveResult ? 1 : 0));

        scanner.close();
    }
}
