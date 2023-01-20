package com.bogdantataru.eulerProject;

public class SearchWord {

    public static void main(String[] args) {

        //System.out.println(searchWord("gigi has a lam", "mu"));
        System.out.println(containWord("gigi has a lam", "lam"));
    }


    public static boolean searchWord(String text, String word) {

        int counter = 0;
        boolean foundWord = false;

        int i = 0;
        int j = 0;
        while (i < text.length()) {
            int k = i;

            while (j < word.length() && k < text.length()) {
                char ch = word.charAt(j);
                char c = text.charAt(k);
                if (c != ch){
                    j = 0;
                    break;
                } else {
                    counter++;
                }
                k++;
                j++;
            }

            if (counter == word.length()){
                foundWord = true;
            }
            i++;
        }

        return foundWord;
    }

    public static boolean containWord(String text, String word) {

        int wordLength = word.length();
        for (int i = 0; i < text.length() - wordLength + 1; i++) {
            boolean match = true;
            for (int j = 0; j < word.length(); j++) {
                if (text.charAt(i + j) != word.charAt(j)){
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }

}
