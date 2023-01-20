package com.bogdantataru.HakerRank;

public class NumberLineJumps {

    public static void main(String[] args) {

        System.out.println(kangaroo(0,3, 4, 2));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {


        int firstK = 0;
        int secondK = 0;
        int i = 0;
        while(i<10000) {
            x1=x1+v1;
            x2=x2+v2;
            if(x1==x2){
                return "YES";
            }
            i++;
        }
        return "NO";

    }

}
