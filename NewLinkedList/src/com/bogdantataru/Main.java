package com.bogdantataru;

public class Main {

    public static void main(String[] args) {



        Employee janeJones = new Employee("Jane", "Jones",  123);
        Employee johnDoe = new Employee("John", "Doe",  4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike",  "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());


        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        System.out.println("***************************");
        list.removeFromFront();
        System.out.println(list.getSize());
        System.out.println("*****************************");
        list.printList();
        System.out.println(list.getSize());



    }
}
