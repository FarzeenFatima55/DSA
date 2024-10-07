package lab6;
import java.util.Arrays;


public class Sum {
    

    public static boolean binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true; // Target found
            }

            if (arr[mid] > target) {
                right = mid - 1;
            } else { 
                left = mid + 1;
            }
        }
        return false; 
    }

    public static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr); // Sort the array first

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; 
            if (binarySearch(arr, i + 1, arr.length - 1, complement)) {
                return true; 
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6, 2};
        int target = 10;
        boolean result = twoSum(arr, target);

        System.out.println(result ? "Yes" : "No"); // Output: Yes
    }
}
