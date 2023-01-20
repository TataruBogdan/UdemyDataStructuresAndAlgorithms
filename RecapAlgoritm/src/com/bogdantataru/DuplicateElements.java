package com.bogdantataru;

public class DuplicateElements {

    public static void main(String args[]) {

        String[] myStringArray = { "Alice", "Bob", "Tim", "John", "Tim",
                "Denice" };

        for (int i = 0; i < myStringArray.length; i++) {
            String toCompare = myStringArray[i];
            for (int j = i + 1; j < myStringArray.length; j++) {
                if (toCompare.equals(myStringArray[j])) {
                    System.out.println("Duplicate Name " + toCompare);
                }
            }
        }
    }
}
