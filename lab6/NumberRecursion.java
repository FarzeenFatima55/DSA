package lab6;

import java.util.Scanner;

public class NumberRecursion {
    
    public static void printasc(int n ){
        if(n==0){
            return;
        }
        printasc(n-1);
        System.out.println(n + "");
        
    }
    public static void printdes(int n ){
        if(n==0){
            return;
        }
        System.out.println(n + "");
        printasc(n-1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input n");
        int N = sc.nextInt();
        
        System.out.println("Ascending order :");
        printasc(N);
        System.out.println("Descending order");
        printdes(N);
    }
}


