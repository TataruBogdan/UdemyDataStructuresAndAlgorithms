package com.bogdantataru;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

}

class SortStudent implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int comp = student1.getFname().compareTo(student2.getFname());
        if (student1.getCgpa() > student2.getCgpa()){
            return -1;
        } else if(student1.getCgpa() < student2.getCgpa()) {
            return 1;
        } else {
            //  If two student have the same CGPA, then arrange them according to their first name in alphabetical order
            if ((comp < 0)) {
                return -1;
            } else if (comp > 0) {
                return 1;
            } else if (student1.getId() < student2.getId()) {
                return -1;
            } else if (student1.getId() > student2.getId()) {
                return 1;
            }
            // there are the same student
            return 0;
        }
    }
}


//Complete the code
class SolutionStudent {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new SortStudent());
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
