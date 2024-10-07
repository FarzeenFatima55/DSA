import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Sort {
    /*public static void main(String[] args) {
        int [] arr = {3,1,5,9,0,4};
        int i , j ;
        for( i = 0 ; i < arr.length ; i++ ){
            for( j = i+1 ; j <arr.length ; j++){
                int temp=0;
                if(arr[j]<arr[i]){
                    temp = arr[i];
                     arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }
            System.out.println(arr[i]);
        }
    }
}
public static void main(String[] args) {
    // Java program to sort a subarray using Arrays.sort()
    int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 }; // Custom input
   
    // Sort subarray from index 1 to 4, i.e., only sort subarray {7, 6,
    //keep other elements as it is.
    Arrays.sort(arr, 1, 5);
    // Printing sorted array
    System.out.printf("Modified arr[] : %s",
    Arrays.toString(arr));
    }
    }*/
    //practice 3
    public static void sortArrayDescending(int[] arr) {
        // Convert int[] to Integer[] to use Collections.reverseOrder()
        Integer[] arrDescending = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        // Sort in descending order
        Arrays.sort(arrDescending, Collections.reverseOrder());
        
        // Convert Integer[] back to int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrDescending[i];
        }
    }
    public static void main(String[] args) {
        int [] data = new int[10];
        Random rd = new Random();
       
        for (int i = 0 ; i < data.length ; i++){
         data[i] = rd.nextInt(100);
        }
       

        int [] orig = Arrays.copyOf(data, data.length);
        
        System.out.println("arrays equal before sort: "+ Arrays.equals(data, orig));
        Arrays.sort(data);
       System.out.println("arrays equal after sort: " + Arrays.equals(data,
       orig));

        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));
       
        sortArrayDescending(data);
        System.out.println("Desc order ="+ Arrays.toString(data));
        
 }
    }


    

   
