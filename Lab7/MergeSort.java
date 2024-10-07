package Lab7;

public class MergeSort {
    // nlogn
    public static void conquer(int[] arr , int strt , int mid , int end){
        int merged[] = new int[end-strt+1];

        int idx1 = strt;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= end){
        if(arr[idx1] <= arr[idx2]){
            merged[x++]=arr[idx1++];
   
        }
        else {
            merged[x++]=arr[idx2++];
        }
        }
        while(idx1 <= mid){
        merged[x++]=arr[idx1++];
        }

        while(idx2<=end){
            merged[x++]=arr[idx2++];
            }

            for(int i = 0  , j = strt ; i < merged.length ; i++ , j++){
               arr[j] = merged[i];
            }
    }
    public static void divide(int[] arr , int strt , int end){

    if(strt>=end){
        return;
    }
    //O(logn)
     int mid = strt + (end - strt)/2;
     divide(arr, strt, mid);
     divide(arr,  mid+1 , end);
     conquer(arr, strt, mid, end);
    }

    public static void PrintArray(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = { 6 , 1 , 9 , 0 ,7 , 2 , 8};
        int n = arr.length;
        divide(arr, 0, n-1);
        PrintArray(arr);
}
}
