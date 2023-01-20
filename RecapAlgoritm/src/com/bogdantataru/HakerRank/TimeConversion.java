package com.bogdantataru.HakerRank;

public class TimeConversion {


    public static void main(String[] args) {


        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:01:00PM"));

    }

    public static String timeConversion(String s) {


        String hours = s.substring(0,2);
        String min = s.substring(3, 5);
        String sec = s.substring(6, 8);

        String format = s.substring(8);

        int hour = Integer.parseInt(hours);
        if (format.equals("PM")) {
            if (hour == 12) {
                return hour + ":" + min + ":" + sec;
            } else {
                return (hour + 12) + ":" + min + ":" + sec;
            }

        } else if (format.equals("AM")) {
            return hour + ":" + min + ":" + sec;
        } else {
            return "Invalid hour";
        }

    }
}
