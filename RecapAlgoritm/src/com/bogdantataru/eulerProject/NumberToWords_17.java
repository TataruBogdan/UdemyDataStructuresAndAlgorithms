package com.bogdantataru.eulerProject;
/*
The numbers 1 to 5 written out in words are One, Two, Three, Four, Five
First character of each word will be capital letter for example:
Given a number, you have to write it in words.
Input Format
The first line contains an integer T, i.e., number of test cases.
Next T lines will contain an integer N.
 */

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToWords_17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int a = 0; a < t; a++) {

            Map<Integer, String> numbersWithCharacters = new HashMap<>(100);
            numbersWithCharacters.put(0, "Zero");
            numbersWithCharacters.put(1, "One");
            numbersWithCharacters.put(2, "Two");
            numbersWithCharacters.put(3, "Three");
            numbersWithCharacters.put(4, "Four");
            numbersWithCharacters.put(5, "Five");
            numbersWithCharacters.put(6, "Six");
            numbersWithCharacters.put(7, "Seven");
            numbersWithCharacters.put(8, "Eight");
            numbersWithCharacters.put(9, "Nine");
            numbersWithCharacters.put(10, "Ten");
            numbersWithCharacters.put(11, "Eleven");
            numbersWithCharacters.put(12, "Twelve");
            numbersWithCharacters.put(13, "Thirteen");
            numbersWithCharacters.put(14, "Fourteen");
            numbersWithCharacters.put(15, "Fifteen");
            numbersWithCharacters.put(16, "Sixteen");
            numbersWithCharacters.put(17, "Seventeen");
            numbersWithCharacters.put(18, "Eighteen");
            numbersWithCharacters.put(19, "Nineteen");
            numbersWithCharacters.put(20, "Twenty");
            numbersWithCharacters.put(30, "Thirty");
            numbersWithCharacters.put(40, "Forty");
            numbersWithCharacters.put(50, "Fifty");
            numbersWithCharacters.put(60, "Sixty");
            numbersWithCharacters.put(70, "Seventy");
            numbersWithCharacters.put(80, "Eighty");
            numbersWithCharacters.put(90, "Ninety");
            numbersWithCharacters.put(100, "Hundred");
            numbersWithCharacters.put(1000, "Thousand");
            numbersWithCharacters.put(1000000, "Million");
            numbersWithCharacters.put(1000000000, "Billion");

            // number to be written in words
            BigInteger N = scanner.nextBigInteger();
            BigInteger sum = new BigInteger("0");
            sum = sum.add(N);

            char[] chars = sum.toString().toCharArray();
            int charAt = 1;
            int mult = 1;
                String[] strings = new String[chars.length];
            // if U = 0 avem 3 cifre adica mii, U = 2 avem 2 cifre adica zeci, U = 1 avem o cifra adica unitati

            // TODO - for each group of ciphers - millions, thousands, simple
            int lengthOfChars = chars.length;
            for (int i = lengthOfChars - 1; i >= 0; i--) {
                int j = i; // need to insert into strings the text at correct position
                charAt = (chars[i] - 48);
                if (numbersWithCharacters.containsKey(charAt)) {
                    if (mult == 1000) {
                        strings[j] = numbersWithCharacters.get(mult);
                    }
                    if (mult == 1000000){
                        strings[j] = numbersWithCharacters.get(mult);
                    }
                    if (mult == 1000000000){
                        strings[j] = numbersWithCharacters.get(mult);
                    }
                    if ((lengthOfChars - i) % 3 == 1) {
                        if (charAt == 0) {
                            mult *= 10;
                            continue;
                        } else if (strings[j] != null) {
                            strings[j] = numbersWithCharacters.get(charAt) + " " + strings[j];
                        } else {
                            strings[j] = numbersWithCharacters.get(charAt);
                        }
                    } else if ((chars.length - i) % 3 == 2) {
                        if (charAt == 0) {
                            mult *= 10;
                            continue;
                        } else if (charAt == 1) {
                            strings[j+1] = numbersWithCharacters.get((charAt * mult) + (chars[i + 1] - 48));
                        } else if (strings[j+1] != null){
                            strings[j] = numbersWithCharacters.get(charAt * 10);
                        } else {
                            strings[j+1] = numbersWithCharacters.get(charAt * mult) + "" + numbersWithCharacters.get(chars[i + 1] - 48);
                        }
                    } else {
                        if (charAt == 0) {
                            mult *= 10;
                            continue;
                        }else if(strings[j] != null){
                            strings[j] = numbersWithCharacters.get(charAt * mult) + " " + numbersWithCharacters.get(chars[i + 1] - 48);
                        }else {
                            strings[j] = numbersWithCharacters.get(charAt) + " " + numbersWithCharacters.get(100);
                        }
                    }
                    mult *= 10;

                }
            }
            for (String word : strings) {
                if (word != null) {
                    System.out.print(word + " ");
                }
            }
        }
    }
}
