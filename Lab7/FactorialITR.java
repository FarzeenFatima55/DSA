package Lab7;

public class FactorialITR {
    public static long factitr(int n){
        long result = 1;
        for(int i = 1 ; i<=n ; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factitr(5));
    }
}
