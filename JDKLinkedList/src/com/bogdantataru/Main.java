package com.bogdantataru;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        Employee janeJones = new Employee("Jane", "Jones",  123);
        Employee johnDoe = new Employee("John", "Doe",  4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike",  "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78 );

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print("iter " + iter.next());
            System.out.print(" <=>");
        }
        System.out.print("null");
        System.out.println("");
        System.out.println("******************************** ");

        for(Employee employee: list) {
            System.out.println("For " + employee);
        }

        System.out.println("******************************** ");
        list.add(billEnd);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print("iter " + iter.next());
            System.out.print(" <=>");
        }

        System.out.println("");
        System.out.println("******************************** ");
        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print("iter " + iter.next());
            System.out.print(" <=>");
        }

        System.out.println("");
        System.out.println("******************************** ");
        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()){
            System.out.print("iter " + iter.next());
            System.out.print(" <=>");
        }
    }
}
