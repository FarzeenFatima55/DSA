import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayOperations {

    // Function to create an array with random values
    public static int[] createArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100) + 1;  // Random values between 1 and 100
        }
        Arrays.sort(arr);  // Sort the array for binary search
        return arr;
    }

    // Function to display the array
    public static void displayArray(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
    }

    // Function to insert an element into the array
    public static int[] insertElement(int[] arr, int element) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = element;
        Arrays.sort(newArr);  // Sorting after insertion to maintain order
        return newArr;
    }

    public static int[] removeTheElement(int[] arr, int index)
 {
 // If the array is empty or the index is not in array range
 // return the original array
 if (arr == null || index < 0
 || index >= arr.length) {
 return arr;
 }
 int i=0;
 //start form the index till end of array
 for (i = index; i< arr.length-1; i++)
 arr[i]=arr[i+1];
 // for last index
 arr[i]=0;
 // return the resultant array
 return arr;
 }

    // Function to perform binary search on the array
    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        // If we reach here, then element was not present
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step a) Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step b) Create the array with random values
        int[] array = createArray(size);

        // Step c) Display the array
        displayArray(array);

        // Step d) Insert, delete, and binary search operations

        // Insert element
        System.out.print("Enter an element to insert: ");
        int elementToInsert = scanner.nextInt();
        array = insertElement(array, elementToInsert);
        displayArray(array);

        // Delete element by searching for its index using binary search
        System.out.print("Enter an element to delete: ");
        int elementToDelete = scanner.nextInt();
        int indexToDelete = binarySearch(array, elementToDelete);
        if (indexToDelete != -1) {
            array = removeTheElement(array, indexToDelete);
            System.out.println("Element deleted successfully.");
        } else {
            System.out.println("Element not found.");
        }
        displayArray(array);

        // Binary search element
        System.out.print("Enter an element to search: ");
        int elementToSearch = scanner.nextInt();
        int index = binarySearch(array, elementToSearch);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
