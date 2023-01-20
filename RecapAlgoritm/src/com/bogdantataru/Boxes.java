package com.bogdantataru;

/*
 you have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1'
 if it contains one ball. In one operation, you can move one ball from a box to an adjacent box.
 Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.
 For input boxes = "001011", the output is: [11,8,5,4,3,4].
 */

public class Boxes {

    public int[] minOperations(String boxes) {
        int n = boxes.length();

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        int count = boxes.charAt(0) - '0';
        for(int i = 1 ; i < n ; i++){
            left[i] = left[i - 1] + count;
            count += boxes.charAt(i) - '0';
            // System.out.println("i: "+i+" left[i]: "+left[i]+" left[i-1] : "+left[i-1]+" count: " + count);
        }

        count = boxes.charAt(n - 1) - '0';
        for(int i = n - 2 ; i >=0 ; i--){
            right[i] = right[i + 1] + count;
            count += boxes.charAt(i) - '0';
            // System.out.println("i: "+i+" right[i]: "+right[i]+" right[i+1] : "+right[i+1]+" count: " + count);
        }

        for(int i = 0 ; i < n ; i++) {
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
}
