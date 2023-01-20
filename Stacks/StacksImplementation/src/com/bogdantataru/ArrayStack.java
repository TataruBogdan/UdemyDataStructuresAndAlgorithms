package com.bogdantataru;

import java.util.EmptyStackException;

public class ArrayStack {

    //We're going to need a field for the array that's going to be used to back the stack,
    // and also we're going to need to track the index of the top position on the stack

    private Employee[] stack; // backing array
    private int top; // track the top of the stack

    //we're gonna let the caller tell us how large they want the stack to be
    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    // the time complexity is O(n) - because we may have to resize the array.
    //first thing we need to check is whether the stack is full, top will always be the index where we would push the next element,
    public void push(Employee employee){
        // The top will always be the index where we would push the next element,
        if (top == stack.length){
            // need to resize the backing array -  double the length
            Employee[] newArray = new Employee[2 * stack.length];
            // copy all of the elements that currently exist in the stack into this new array
            System.arraycopy(stack,0, newArray,0, stack.length);
            //assign a new array to the stack field
            stack = newArray;
        }
        // O(1)
        // push on the top the employee
        stack[top++] = employee;
    }

    // O(n)
    public Employee pop() {
        //check if the stack is empty
        if (isEmpty()){
            throw new EmptyStackException();
        }

        // top always contains the index of the next available position in the array and so there is nothing at top, there is nothing stored at top.
        // The top item on the stack is actually stored at top minus one, and so what we want to do is decrement top, and use the result as the index into stack.
        Employee employee = stack[--top];
        // set that position to null, because we have popped the employee at position top and so we now want to null that out,
        stack[top] = null;
        return employee;
    }

    // peek at a stack we access the top item but we do not pop it, and so we get the top item on the stack but that item remains on the stack.
    public Employee peek(){

        if (isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee = stack[top-1]; // [top--] changes the top value
        return employee;

    }

    public int size(){
        return top;
    }

    public void printStack(){
        for (int i = top -1; i >= 0; i-- ){
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        //top always holds the next available position in the stack
        return top == 0;
    }

}
