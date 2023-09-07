package org.example;

import java.util.Stack;

public class WrokingWithTheStack {
    public static void main(String[] args) {
        // stack = LIFO DATA structure. Last in First out
        //         stores data into a sort of vertical tower
        //         push() to add to the top
        //         pop() to remove from the top

        // uses of stack?
        // 1. undo/redo  features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<>();
        System.out.println(stack.empty());
        stack.push("bro");
        stack.push("code");
        stack.push("you tube");

        String socialMedia = stack.pop();
        System.out.println(socialMedia);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("bro"));


    }
}
