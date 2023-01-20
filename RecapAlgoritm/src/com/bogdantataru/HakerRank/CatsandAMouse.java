package com.bogdantataru.HakerRank;

public class CatsandAMouse {

    public static void main(String[] args) {

    }

    /* Two cats and a mouse are at various positions on a line. You will be given their starting positions.
    Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel
    at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given  queries in the form of q and  representing the respective positions for cats A and B and for mouse .
Complete the function  to return the appropriate answer to each query, which will be printed on a new line.

If cat  catches the mouse first, print Cat A.
If cat  catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.*/
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        int dist1 = Math.abs(x - z);
        int dist2 = Math.abs(y - z);

        if (dist1 < dist2) {
            return "Cat A";
        } else if (dist2 < dist1) {
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }
}
