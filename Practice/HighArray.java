import java.util.Arrays;

public class HighArray {
    private static final String[] HighArray = null;
    private long[] array;
    private int nElems;

    public HighArray(int size) {
        array = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        array[nElems++] = value;
    }

    public long removeMax() {
        if (nElems == 0) return -1;

        // Find the maximum value and its index
        long max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < nElems; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        // Remove the maximum value by shifting elements
        for (int i = maxIndex; i < nElems - 1; i++) {
            array[i] = array[i + 1];
        }

        nElems--; // Decrease the number of elements
        return max; // Return the removed maximum value
    }

    public static void main(String[] args) {
        HighArray arr = new HighArray(10);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);

        // Create a second array to hold the sorted elements
        long[] sortedArr = new long[arr.nElems];

        // Sort the original array and fill the sorted array
        for (int i = 0; i < sortedArr.length; i++) {
            sortedArr[i] = arr.removeMax();
        }

        // Display the sorted array
        System.out.print("Sorted array: ");
        for (long value : sortedArr) {
            System.out.print(value + " ");
        }

      
       // System.out.println("Maximum value removed: " + arr.removeMax());
        
    }
}
