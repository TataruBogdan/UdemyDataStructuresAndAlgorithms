package com.bogdantataru;

import java.util.Stack;

public class Fish {

    public static void main(String[] args) {

//        System.out.println(solution(new int[]{4, 8, 2, 6, 7}, new int[] {0, 1, 1, 0, 0}));
//        System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[] {0, 1, 0, 0, 0}));
        System.out.println(solution(new int[]{2, 6, 4, 3, 1, 5}, new int[] {0, 1, 0, 1, 0, 0}));
    }
                              //weight  //direction
    public static int solution(int[] A, int[] B) {

        // for each fish with direction right if encounter a fish that have direction left
        // we need to compare the weight of the fish
        // if left fish is bigger than the right fish -> left fish survives ; right don't -1
        // if ...
        // the bigger value eats the smaller value
        Stack<Integer> stack = new Stack<>();
        int survivor = 0;
        for (int i = 0; i< A.length; i++) {
            int weight = A[i]; // give the fish weight
            // if the directions is 1 - right
            if (B[i] == 1 ) {
                // store the weights on this stack otherwise it means that our fish is going upstream.
                stack.push(weight);
            } else {
                // try to compare it with whatever we have on our stack. - there is a fish in the stack ? no -1 | yes pop
                int weightDown = stack.isEmpty() ? -1 : stack.pop();
                // while our stack is not empty and the weight of the fish in stack is smaller than weight of current fish
                while (weightDown != -1 && weightDown < weight)
                    // current fish eats the fish in stack
                    weightDown = stack.isEmpty() ? -1 : stack.pop();
                 if (weightDown == -1)
                     survivor +=1;
                else stack.push(weightDown);

            }
        }
        // Once we have processed every single item in our list what we have to do is count the number of items
        // that we have in our stack and add this to our survivor count.
        return survivor + stack.size();
    }
}
