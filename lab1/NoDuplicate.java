
public class NoDuplicate {

    public static void noDup (int[][]array2D , int[]array1D){
        int index = 0;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                int element = array2D[i][j];
                boolean isDuplicate = false; 

                for (int k = 0; k < index; k++) {
                    if (array1D[k] == element) {
                        isDuplicate = true;
                        break;
                    }
                }
            
            
                if (!isDuplicate) {
                    array1D[index++] = element;
                }
            }
        }
    }
        
    public static void main(String[] args) {
        int [][] array2D = {{1,2,3,4,5},{6,7,8,9,10},{2,3,11,17,0},{1,4,15,16,17}};
        int[] array1D = new int[20];
        noDup(array2D, array1D);
        for (int num : array1D) {
           if (num != 0) { 
               System.out.print(num + " ");
           }
        }
    }
}
