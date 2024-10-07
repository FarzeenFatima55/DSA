package lab5;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String exp) {
        Stack<Character> temp = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char current = exp.charAt(i);


            if (current == '(' || current == '{' || current == '[') {
                temp.push(current);
            }
           
            else if (current == ')' || current == '}' || current == ']') {
                if (temp.isEmpty()) {
                    return false;
                }
                char top = temp.pop();
                if (!isMatchingPair(top, current)) {
                    return false;
                }
            }
        }

        return temp.isEmpty(); 
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        
        String exp = "({[a+b]+c}-1) ";
        if (isBalanced(exp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }
}
