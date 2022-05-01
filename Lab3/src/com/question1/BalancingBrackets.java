package com.question1;

import java.util.Stack;

public class BalancingBrackets {
    Stack<Character> stack = new Stack<Character>();
    public boolean IsBalanced(String brackets) {
        for (int i=0; i<brackets.length(); i++) {
            if (brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{')
                stack.push(brackets.charAt(i));

            if (stack.isEmpty())
                return false;

            else {

                if (stack.peek()=='(' && brackets.charAt(i) == ')' ||
                        stack.peek()=='[' && brackets.charAt(i) == ']' ||
                        stack.peek()=='{' && brackets.charAt(i) == '}') {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}