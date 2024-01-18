package org.example.stack;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String test = "{[]}+()(";
        char[] values = test.toCharArray();
        boolean val = true;
        Stack<Character> testStack = new Stack<>();
        for (char value : values) {
            if (value == '{' || value == '[' || value == '<' || value == '(') {
                testStack.push(value);
            }
            if (value == '}' || value == ']' || value == '>' || value == ')') {
                char poppedValue;
                if(!testStack.isEmpty()){
                    poppedValue = testStack.pop();
                }else {
                    val = false;
                    break;
                }
                if((value == '}' && poppedValue != '{') ||
                        ( value == ']' && poppedValue != '[') ||
                        (value == '>' && poppedValue != '<') ||
                        (value == ')' && poppedValue != '(')){
                    val = false;
                    break;
                }
            }
        }
        System.out.println(testStack);
        System.out.println(testStack.isEmpty() && val);
    }
}
