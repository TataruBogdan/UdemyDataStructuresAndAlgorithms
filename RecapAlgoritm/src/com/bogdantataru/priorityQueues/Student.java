package com.bogdantataru.priorityQueues;

public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        if (id > 1 && id <= Math.pow(10, 5)) {
            this.id = id;
        }
        this.name = name;

        if (cgpa > 0 && cgpa <= 4.00) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Please insert a valid CGPA value");
        }
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student student) {
        //test for null
        int comp = this.getName().compareTo(student.getName());
        if (student != null) {
            if (this.getCGPA() > student.getCGPA()) {
                return -1;
            }
            if (this.getCGPA() < student.getCGPA()) {
                return 1;
            }
            if (this.getCGPA() == student.getCGPA()) {
                if (comp == 0) {
                    if (this.getId() > student.getId()) {
                        return 1;
                    } else if (this.getId() < student.getId()) {
                        return -1;
                    }
                } else {
                    if (comp < 0) {
                        return 1;
                    } else if (comp > 0) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}
