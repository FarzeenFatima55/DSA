package Lab8;

import java.util.Scanner;

public class Palindrome {
    public static boolean ispalindrome(String text){
        if(text.charAt(0)!=text.charAt(text.length()-1)){
            return false;
        }
        
        if(text.length()<=1){
            return true;
        }
        if(text.charAt(0)==text.charAt(text.length()-1)){
            return ispalindrome(text.substring(1, text.length()-1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any text :");
        String text = scan.nextLine();
        boolean result = ispalindrome(text);
        System.out.println("Text :" + text + " Is palindrome  ? " + result);
    }
}
