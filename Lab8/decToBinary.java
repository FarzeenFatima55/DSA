package Lab8;

public class decToBinary {
    public static String decBin(int num){
    if(num==0){
        return "";
    }
    if(num==1){
        return "1";
    }

    return decBin(num/2)+(num%2);

    }
    public static void main(String[] args) {
        int num = 13;
        String bin =  decBin(num);
       System.out.println(bin);
    }
}
