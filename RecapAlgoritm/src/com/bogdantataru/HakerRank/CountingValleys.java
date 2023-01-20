package com.bogdantataru.HakerRank;

public class CountingValleys {

    public static void main(String[] args) {


        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {

        int altitude = 0;
        int numberValleys = 0;

        for(int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U') {
                altitude += 1;
            }else if (path.charAt(i) == 'D') {
                altitude -= 1;
            } else {
                return -1;
            }

            if(altitude == 0 && path.charAt(i) == 'U') {
                numberValleys += 1;
            }
        }

        return numberValleys;



    }
}
