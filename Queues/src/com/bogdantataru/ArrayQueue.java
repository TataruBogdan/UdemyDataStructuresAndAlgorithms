package com.bogdantataru;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;


    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //we have to check if our queue is full -- if back =1 the queue = 1 ...
        if (back == queue.length){
            // we have to increase the capacity of our array
            Employee[] newArray = new Employee[ 2 * queue.length];
            // Copy the existing elements into the new queue
            System.arraycopy(queue,0, newArray, 0, queue.length);
            queue = newArray;
        }
        // Assign the new element to back
        queue[back] = employee;
        // increment back - because back indicate the next available position
        back++;
    }

    public Employee remove() {

        //if there are no elements into the queue ?
        if (size() == 0){
            //if you try to remove something from the empty queue we're gonna throw an exception.
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++; //increment front
        //optimization if we removed the only item in the queue
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;

    }

    public Employee peek() {

        //if there are no elements into the queue ?
        if (size() == 0){
            //if you try to remove something from the empty queue we're gonna throw an exception.
            throw new NoSuchElementException();
        }

        //return the element from the front of the queue
        return queue[front];
    }


    public int size() {
        return back - front;
    }

    public void printQueue (){
        //back points to the next available position
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }


}
