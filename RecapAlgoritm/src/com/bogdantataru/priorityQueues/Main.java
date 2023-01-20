package com.bogdantataru.priorityQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int eventsNumber = scanner.nextInt();
        scanner.nextLine();

        Priorities priorities = new Priorities();

        List<String> studentList = new ArrayList<>();
        while (eventsNumber > 0) {
            String events = scanner.nextLine();
            studentList.add(events);
            eventsNumber--;
        }
        List<Student> students = priorities.getStudents(studentList);
        for (Student student: students) {
            System.out.println(student.getName());
        }
        scanner.close();
    }
}
