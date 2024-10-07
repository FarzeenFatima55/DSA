package lab5;

import java.util.Stack;

public class InfixToPostfix {
    // Function to return precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    // Function to convert infix to postfix expression
    static String infixToPostfix(String exp) {
        // Initialize an empty stack and an output string
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        // Traverse the expression
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the scanned character is an operand, add it to the output
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // If the scanned character is an operator
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        // Pop all the operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*C+D";
        System.out.println("Postfix expression: " + infixToPostfix(exp));
    }
}
