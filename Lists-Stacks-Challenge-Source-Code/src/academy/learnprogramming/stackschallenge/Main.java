package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));

        System.out.println("***********************************");
        // should return true
        System.out.println(checkForPalindromeMy("abccba"));
        // should return true
        System.out.println(checkForPalindromeMy("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindromeMy("I did, did I?"));
        // should return false
        System.out.println(checkForPalindromeMy("hello"));
        // should return true
        System.out.println(checkForPalindromeMy("Don't nod"));
    }

    public static boolean checkForPalindrome(String string){

        LinkedList<Character> stack = new LinkedList<Character>();

        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(stringNoPunctuation.toString());
    }


    public static boolean checkForPalindromeMy(String string) {

        // first done
        String newString = string.toLowerCase().replaceAll("[^a-zA-Z]", "");
        //transform the string into a string array

        Stack<Character> charStackLeft = new Stack<Character>();

        char[] newChar = newString.toCharArray();
        for (char c: newChar) {
            charStackLeft.push(c);
        }
//        System.out.print("Char left : " + charStackLeft);

        Stack<Character> charStackRight = new Stack<Character>();

        for (int i = newChar.length-1; i >= 0; i--){
            charStackRight.push(newChar[i]);

        }
//        System.out.println("Char right: " + charStackRight);

        if (charStackLeft.pop() == charStackRight.pop()){
            return true;
        }

        return false;
    }


}
