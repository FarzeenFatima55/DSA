package Lab7;

public class FibonacciRec {
    public static int fiboRec(int n){
        if(n<=1)
        return n;
        return fiboRec(n-1) + fiboRec(n-2);
    }
    public static void printfiborec(int n ){
        System.out.print("fibonacci Recursive :");
        for(int i=0 ; i<n ; i++ ){
            System.out.print(fiboRec(i)+"");
        }
        System.out.println();
    }
     
    public static void main(String[] args) {
       
        printfiborec(5);
    }
}


