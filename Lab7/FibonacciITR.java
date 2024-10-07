package Lab7;

public class FibonacciITR{

    public static void fiboitr(int n){
        int first =0;
        int second = 1;
        System.out.print("fibonacci series :" + first +"" + second + "");
        for(int i = 2 ; i<n ; i++){
            int next = first+second;
            System.out.print(next+"");
            first=second;
            second=next;
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        fiboitr(5);
       
    }
}
