package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.List;

public class DesignerPDFViewer {

    public static void main(String[] args) {


        System.out.println(designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc"));
    }


    public static int designerPdfViewer(List<Integer> h, String word) {

        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            char a = 'a';
            int index = (int)c - (int)a;
            int height = h.get(index);

            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        return (int) maxHeight * word.length();
    }
}
