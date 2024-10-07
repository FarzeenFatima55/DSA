import java.util.Arrays;

public class ODDandEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 2, 2, 7, 8, 9};

        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
        System.out.println("Original Array:" + Arrays.toString(arr));
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}
