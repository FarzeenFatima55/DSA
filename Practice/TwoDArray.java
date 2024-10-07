public class TwoDArray {

        public static void main(String[] args) {
        int n = 3;
       
        int[][] array2D = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };
        int[] array1D = {10, 20, 30};
        // Calculate the sum of the left diagonal
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += array2D[i][i];
            }
            // Find the maximum element in the 1D array
            int maxElement = array1D[0];
            for (int i = 1; i < n; i++) {
            if (array1D[i] > maxElement) {
            maxElement = array1D[i];
        }
    }
    // Print the result
    System.out.println(diagonalSum + " " + maxElement);
    }
   }
