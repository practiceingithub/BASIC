package collectionframework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
    System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.add(2,25);
        stack.push(50);
        System.out.println(stack.empty());
        System.out.println(stack.search(40));
        System.out.println(stack);

    }
}
