package com.bogdantataru;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(new Fibonacci().fibonacci(7));
        System.out.println(new Fibonacci().fib(50));
//        System.out.println(new Fibonacci().fibonacci(50));
    }

    public int fibonacci(int n) {
        //1st and 2nd number of the sequence is 1
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //To avoid the duplicate work caused by the branching, we can wrap the method in a class that stores an instance variable, memo, that maps inputs to outputs. Then we simply
    //check memo to see if we can avoid computing the answer for any given input, and save the results of any calculations to memo.

    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Index was negative");
        }
        // keep the same logic
        //base case
        if (n <= 2) {
            return 1;
        }

        // see if we've already calculated this - immediately return the stored value
        if (memo.containsKey(n)){
            System.out.printf("grabbing memo[%d]\n", n);
            return memo.get(n);
        }

        System.out.printf("computing fib(%d)\n", n);
        int result = fib(n-1) + fib(n-2);
        // memoize // result is the value of the number
        // memo {3: 2}
        memo.put(n, result);

        return result;
    }
}
