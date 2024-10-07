package Lab4;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();;
    static Queue<Integer> q2  = new LinkedList<>();;

    public static boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    // Push an element onto the stack
    public void push(int data) {
       if(!q1.isEmpty()) {
            q1.add(data);
        }
        q2.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top =-1;

        //case 1
        if (!q1.isEmpty()) {
            while(!q1.isEmpty()){
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }
        //case 2
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }

            }
            return top;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top =-1;

        if (!q1.isEmpty()) {
            while(!q1.isEmpty()){
                top=q1.remove();
                q2.add(top);
            }
        }
            else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }

            }
            return top;
    }

    

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

       while(!stack.isEmpty()){
        System.out.println(stack.peek());
        stack.pop();
       }
    }
}

