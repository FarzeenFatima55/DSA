package Lab7;

public class FactorialREC {
    public static long factRec(int n){
        if(n==0 || n==1){
         return 1;
        }
        return n*factRec(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factRec(5));
    }
}
