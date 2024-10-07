public class ArraysCC {
    //arrays pass by refernce
    public static void update (int marks[]){
        for(int i =0 ; i< marks.length ; i++){
          marks[i] = marks[i] +1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i =0 ; i< numbers.length ; i++){
          if(numbers[i] == key){
            return i;
          }
          
          }
          return -1;
    }

    public static int getlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;

        for(int i =0 ; i<arr.length ;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest value is: "+ smallest);
        return largest;
    }
    public static int binarySearch(int binSear[], int key){
        int start= 0 , end = binSear.length-1;

        while(start<=end){
            int mid = (start+end)/2;

        if(binSear[mid]==key){
            return mid;
        }
        if(binSear[mid]<key){
           start = mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;
    }
    public static void Reverse(int arr[]){
        int first =0;
        int last = arr.length-1;

        while(first<last){
            //swap
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) 
    {
        //1
        System.out.println("Update the given marks");
        int [] marks = {97,98,45};
        System.out.println("length of array :" + marks.length);
        update(marks);
        for(int i =0 ; i< marks.length ; i++){
           System.out.println(marks[i]+"");;
          }
          System.out.println();

          //2
          System.out.println("To find key element");
          int[] numbers ={1,7,4,5,0,6,10};
          int key = 10;

          int index = linearSearch(numbers, key);
          if(index==-1){
            System.out.println("not found");
          } else {
            System.out.println("key is at index :" + index);
          }
          //3
          System.out.println("find largest number");
          int [] arr  = {1,2,3,4,5};
          System.out.println("largest number is: "+getlargest(arr));
          //4
          int [] binSear = {2,4,6,8,10,12,14};
          int Key=10;
          System.out.println("index for key is: " + binarySearch(binSear, Key));
          //5
          Reverse(arr);
          for(int i=0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
          }
          System.out.println();   
    }
}
