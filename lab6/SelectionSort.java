package lab6;

public class SelectionSort {
    public static void selectionSort(int [] arr){
        int n = arr.length ;
        for(int i = 0 ; i< n-1 ; i++){
            int min = i;
        
        for(int j = i+1 ; j < n ; j++){
            if(arr[j]< arr[min]){
                min=j;
            }
        }
        // swapping after comparison
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
        }
    }

public static void PrintArray(int [] arr){
    for(int i = 0 ; i < arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    int [] arr = { 6 , 1 , 9 , 0 ,7 };
    System.out.println("ORIGINAL ARRAY : ");
    PrintArray(arr);

    selectionSort(arr);
    System.out.println("AFTER SELECTION SORT :");
    PrintArray(arr);
}

}

