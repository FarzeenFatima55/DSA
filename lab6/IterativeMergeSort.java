package lab6;

public class IterativeMergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        // Create temporary arrays for holding the subarrays
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        // Copy data to the temporary arrays
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        // Merging the two subarrays
        int i = 0, j = 0, k = left;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArr, if any
        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArr, if any
        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void iterativeMergeSort(int[] arr) {
        int n = arr.length;

        // Iteratively merge subarrays in bottom-up manner
        for (int currSize = 1; currSize <= n - 1; currSize = 2 * currSize) {
            for (int left = 0; left < n - 1; left += 2 * currSize) {
                // Calculate mid and right bounds of the subarray
                int mid = left + currSize - 1;
                int right = left + 2 * currSize - 1;

                // Handle the case where right goes out of bounds
                if (mid >= n) {
                    mid = n - 1;  // Adjust mid to be within bounds
                }
                if (right >= n) {
                    right = n - 1;  // Adjust right to be within bounds
                }

                // Merge the subarrays
                merge(arr, left, mid, right);
            }
        }
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 9, 0, 7, 2, 8};
        iterativeMergeSort(arr);
        PrintArray(arr);
    }
}


    