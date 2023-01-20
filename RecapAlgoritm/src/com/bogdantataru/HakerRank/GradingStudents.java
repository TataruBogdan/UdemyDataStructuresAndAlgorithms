package com.bogdantataru.HakerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(73, 67, 38, 33);

        System.out.println(gradingStudents(a));

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> newGrades = new ArrayList<>(grades.size());

        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            int nextMultiple = grade;
            while (nextMultiple % 5 != 0){
                nextMultiple++;
            }
            if (nextMultiple < 38) {
                newGrades.add(i, grade);
            } else if (nextMultiple - grade < 3) {
                newGrades.add(i,nextMultiple);
            } else {
                newGrades.add(i,grade);
            }
        }
        for (int i = 0; i < newGrades.size(); i++) {
            System.out.println(newGrades.get(i));
        }
        return newGrades;
    }
}
