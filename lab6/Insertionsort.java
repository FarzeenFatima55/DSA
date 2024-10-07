package lab6;

public class Insertionsort {
    public static void insertionsort(int[]arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int key = arr [i];
            int j = i -1 ;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1; //  first iterantion 0-1 = -1
            }
            arr[j+1]=key; //arr[-1+1]=0
        }
    }
    public static void PrintArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = { 3 , 5 , 9 , 0 ,7 };
        System.out.println("ORIGINAL ARRAY : ");
        PrintArray(arr);

        insertionsort(arr);
        System.out.println("AFTER INSERTION SORT :");
        PrintArray(arr);
    }
    
}
