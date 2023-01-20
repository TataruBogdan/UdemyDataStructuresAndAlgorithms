package com.bogdantataru;

public class Main {

    public static void main(String[] args) {


        // implementing the stack using an array v Do we need random access for a stack? no because we are only ever gonna be working with the top item on the stack.
        // Stacks say that you can only ever work with the top item, because it's last in, first out.

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane","jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith",22));
        stack.push(new Employee("Mike","Wilson", 2345 ));
        stack.push(new Employee("Bill", "Smith", 78));

        stack.printStack();
        System.out.println("*************************************************");
        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        // implementation based on the LinkedStack

        System.out.println("*************************************************");

        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(new Employee("Jane","jones", 123));
        linkedStack.push(new Employee("John", "Doe", 4567));
        linkedStack.push(new Employee("Mary", "Smith",22));
        linkedStack.push(new Employee("Mike","Wilson", 2345 ));
        linkedStack.push(new Employee("Bill", "End", 78));

        linkedStack.printStack();
        System.out.println("LinkedStack Peek(): " + linkedStack.peek());
        System.out.println("LinkedStack Pooped" +linkedStack.pop());
        System.out.println("LinkedStack Peek(): " + linkedStack.peek());



    }
}
