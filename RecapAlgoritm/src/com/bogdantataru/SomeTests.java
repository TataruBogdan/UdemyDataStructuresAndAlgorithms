package com.bogdantataru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomeTests {

    public static void main(String[] args) {


        int[][] arr = {
                {1, 2},
                {3, 4}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j] + " values :"+ Arrays.toString(arr[i]) + Arrays.toString(arr[j]));
            }
        }

        float n = 5.2f;
        // this will print it up to
        // 2 decimal places
        System.out.printf(
                "Formatted with"
                        + " precision: PI = %.5f\n", Math.PI);


        // automatically appends zero
        // to the rightmost part of decimal
        System.out.printf(
                "Formatted to "
                        + "specific width: n = %.4f\n", n);



//        class Customer {
//            private String name;
//            private ArrayList<Customer> customers;
//
//            public Customer (String name) {
//                this.name = name;
//                customers = new ArrayList<>();
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public ArrayList<Customer> getCustomers() {
//                return customers;
//
//            }
//
//        }

//        ArrayList<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("Gigi"));
//        customers.add(new Customer("Mimi"));

        System.out.println("***********************************");

        List<String> names = new ArrayList<>(10);
        names.add("Mumu");
        names.add("Kiki");
        names.add("Dudu");
        names.add("Mumu");
        for (int i = 0; i <= names.size(); i++) {
            System.out.print(names.subList(1, 4));
        }
        System.out.println("***************");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("M")).
                collect(Collectors.toList());
        System.out.println("Result: " + result);
    }



}
