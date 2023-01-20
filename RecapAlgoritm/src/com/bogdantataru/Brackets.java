package com.bogdantataru;

import java.util.Stack;

public class Brackets {

    // We need to write a piece of code that accepts a string and returns whether that string is valid or not.
    // The string that our code will accept will be composed of a specific alphabet.
    // The string can only contain one of six different types of characters. It can contain either the open or the close round brackets (),
    // the curly brackets {} or the square brackets[]. Those are the only six characters that can be contained in
    // Alphabet (), {}, []
    // our solution needs to determine whether the input string is a properly nested string or not.
    // [()()] - valid
    // [[)()] - non valid
    // ][ - non valid
    /*
    We need to write a function or a method called solution excepting one parameter called a.
    And a is our input string. Our code should determine whether the string is valid or not and return 1 if the string is correctly nested
    or 0 if it's not.
     */
    public static void main(String[] args) {

        System.out.println(solution("c[e(d{f}v)]"));

    }

    public static int solution (String inputString) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == '[' || inputString.charAt(i) == '{' || inputString.charAt(i) == '(') {
                stack.push(inputString.charAt(i));
            } else if (inputString.charAt(i) == ']') {
                if (stack.empty() || stack.pop() != '[') return 0;
            } else if (inputString.charAt(i) == '}') {
                if (stack.empty() || stack.pop() != '{') return 0;
            } else if (inputString.charAt(i) == ')') {
                if (stack.empty() || stack.pop() != '(') return 0;
            }
        }
        if (stack.empty()){
            return 1;
        }
        return 0;
    }
}
