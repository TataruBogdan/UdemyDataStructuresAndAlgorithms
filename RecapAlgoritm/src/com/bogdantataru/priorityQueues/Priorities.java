package com.bogdantataru.priorityQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    // process all the given events and return all the students yet to be served in the priority order.
    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        for (String event : events) {
            String[] array = event.split(" "); // here are 4 strings
            String e = array[0];
            if (e.equals("ENTER")) {
                String name = array[1];
                double cgpa = Double.parseDouble(array[2]);
                int id = Integer.parseInt(array[3]);
                // if first word is ENTER
                pq.add(new Student(id, name, cgpa));
            }
            // if the first word is SERVED
            else if (e.equals("SERVED")) {
                // if there are no students in the pq -> empty
                if (pq.size() == 0) {
                    System.out.println("EMPTY");
                } else {
                    Student poll = pq.poll();
                    System.out.println(poll.toString());
                }
            }

        }

        return new ArrayList<>(pq);
    }

}

