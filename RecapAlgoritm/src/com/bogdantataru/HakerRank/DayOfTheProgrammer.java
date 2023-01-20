package com.bogdantataru.HakerRank;

import java.util.HashMap;
import java.util.Map;

public class DayOfTheProgrammer {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {

        Map<Integer, Integer> map = new HashMap<>();
        boolean leapYear = false;
        String day = "";
        String month = "";

        if(year < 1918) {
            if (year % 4 == 0){
                leapYear = true;
            }
        } else {
            if (year % 400 == 0) {
                leapYear = true;
            } else if ((year % 4 == 0) && (year % 100 != 0)){
                leapYear = true;
            }
        }

        if(leapYear) {
            day = "09";
            month = "09";
        } else {
            day = "08";
            month = "09";
        }

        return day + "." + month + "." + year;

    }
}
