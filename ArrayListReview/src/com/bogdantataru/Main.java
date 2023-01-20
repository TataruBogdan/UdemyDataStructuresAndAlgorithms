package com.bogdantataru;

/*
So because an array list is backed by an array, it has the same problems and advantages that arrays have.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();


        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary","Smith" , 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));
        System.out.println("**************************");
        System.out.println(employeeList.get(1)); // access the employee, is done in constant time. because is supported by an Array

        System.out.println("List is empty ? " + employeeList.isEmpty());
        System.out.println("****************************");
        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee));

        // get the number of items in the list, not the capacity (the capacity is the total number of items this list can currently hold.)
        System.out.println(employeeList.size());

        // values are gonna have to be shifted up.
        // worst case for this would actually be O(n) of n because the worst case would be :
        // you'd want to put him right at the beginning of the array and then all the other elements have to be shifted.
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("********************************");

        /*
        if we want the array, let's say we have a list and we're saying okay, well give us that backing array.
        Give us the array that's holding the employees, we can get that by calling the to array method.
        But we're not going to get an employee array. We'll get an object array.
         */
        Object[] employeeArray = employeeList.toArray();
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("Employee array " + employeeArray[i]);
        }
        System.out.println("********************************");
        // Now if we want an employee array, we can get it but then we have to tell the compiler that that's what we want.
        // because the size method will return how many employees we actually added.
        Employee[] employeeArrayOfTypeEmployee = employeeList.toArray(new Employee[employeeList.size()]);// we pass an array of the type we want.
        for (Employee employee: employeeArrayOfTypeEmployee) {
            System.out.println(employee);
        }

        // we have to pass the object we're looking for. Now we don't have that instance because we didn't save Mary anywhere
        // - we pass the instance again - create anonymous object
        // we get false.The reason you get false is because we haven't implemented the equals method in the employee class.
        // because there's no equals method, what this method is doing is actually checking to see if they're the exact same instance
        // because that's what the default equals method does - method from way back in object - they're not the exact same instance.
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        // now we have an equals method - Because now the equals method in the employee class is actually looking at the values in the fields.

        System.out.println("************************************");
        // now we can make use of the indexOf() method.
        // this will look up an employee in the list and tell us what index that employee is occupying..
        System.out.println("Index is : " + employeeList.indexOf(new Employee("John", "Doe", 4567)));

        // Now the contains and index of methods are only as good as the search algorithm being used to search the array.
        // when we're looking something up in the list, the method that we're using has to search the list. And the way it's searching the list
        // will determine whether the index of and contains method are fast or slow.

        System.out.println("************************************");
        //  remove items from the list
        employeeList.remove(2); // faster than providing an instance because we're providing the index.
        employeeList.forEach(employee -> System.out.println(employee));
        // remove can be expensive because elements after the one we removed have to be shifted down one position.
    }
}
