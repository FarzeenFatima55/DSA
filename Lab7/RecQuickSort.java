package Lab7;

import java.util.Arrays;

public class RecQuickSort {
    public static void QuickSort(int arr[] , int low , int high){

        if(low<high){
            int pvtindex = partition(arr,low,high);
            QuickSort(arr,low,pvtindex-1);//left side of pivot
            QuickSort(arr,pvtindex+1,high);//right side of pivot
        }
    }
    public static int partition(int arr[], int low , int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j<high ; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }

    //swap pivot element with the element at i+1
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;

    return i+1;//partition index
    }
    public static void main(String[] args) {
        int [] arr = {46,23,5,2,83,36};
        int n = arr.length;
        QuickSort(arr,0,n-1);
        System.out.println("Sorted array :" + Arrays.toString(arr));
    }

}
