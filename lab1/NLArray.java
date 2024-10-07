public class NLArray {

    public void extractBoundaries(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length; 

        System.out.print("First row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        System.out.print("Last row: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[rows - 1][j] + " ");
        }
        System.out.println();

        System.out.print("First column: ");
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();

        System.out.print("Last column: ");
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }
        System.out.println();
    }

    public void cropCenterPart(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Center part:");
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NLArray nl = new NLArray();
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        nl.extractBoundaries(arr);
        nl.cropCenterPart(arr);
    }
}




