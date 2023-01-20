package com.bogdantataru.BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // length of BitSet
        int M = scanner.nextInt(); // number of operations performed

        //construct our BtSets
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        while (M > 0) {
        scanner.nextLine();
        String operation = scanner.next();
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
            switch(operation) {
                case "AND" :
                    if (firstDigit == 1 && secondDigit == 2) {
                        B1.and(B2);
                        System.out.println(B1.cardinality() + " " + B2.cardinality() );
                    } else if (firstDigit == 2 && secondDigit == 1 ) {
                        B2.and(B1);
                        System.out.println(B1.cardinality() + " " + B2.cardinality() );
                    } else {
                        System.out.println("Please select between 1 and 2");
                    }
                    break;
                case "OR" :
                    if (firstDigit == 1 && secondDigit == 2) {
                        B1.or(B2);
                        System.out.println(B1.cardinality() + " " + B2.cardinality() );
                    } else if (firstDigit == 2 && secondDigit == 1) {
                        B2.or(B1);
                        System.out.println(B1.cardinality() + " " + B2.cardinality() );
                    } else {
                        System.out.println("Please select between 1 and 2");
                    }
                    break;
                case "XOR" :
                    if (firstDigit == 1 && secondDigit == 2) {
                        B1.xor(B2);
                        System.out.println(B1.cardinality() + " " + B2.cardinality() );
                    } else if (firstDigit == 2 && secondDigit == 1) {
                        B2.xor(B1);
                        System.out.println(B1.cardinality() + " " + B2.cardinality() );
                    } else {
                        System.out.println("Please select between 1 and 2");
                    }
                    break;
                case "FLIP" :
                    if (firstDigit == 1) {
                        B1.flip(secondDigit);
                    } else if(firstDigit == 2){
                        B2.flip(secondDigit);
                    }
                    System.out.println(B1.cardinality() + " " + B2.cardinality());
                    break;
                case "SET" :
                    if (firstDigit == 1) {
                        B1.set(secondDigit);
                    } else if(firstDigit == 2){
                        B2.set(secondDigit);
                    }
                    System.out.println(B1.cardinality() + " " + B2.cardinality());
                    break;
                default:
                    System.out.println("Please insert the correct data");
            }
            M--;
        }
    }

}
