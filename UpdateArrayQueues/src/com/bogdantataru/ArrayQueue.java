package com.bogdantataru;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;


    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        //we have to check if our queue is full -- if back =5 the queue.length = 5 -> the capacity of the queue will grow
        //if our queue have empty element at front -> change back to size
        if (size() == queue.length - 1){
            int numItems = size();
            // we have to increase the capacity of our array
            Employee[] newArray = new Employee[ 2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue,0 ,newArray,queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        // 0   jane
        // 1   john
        // 2 -     - back
        // 3 - mike - front
        // 4 - bill

        // 0 mike
        // 1 bill
        // 2 jane
        // 3 john
        // 4 - back



        // Assign the new element to back
        //0 - Jane
        queue[back] = employee;
        // increment back - because back indicate the next available position
        if (back < queue.length - 1) {
            back++;
        }
        else {
            back = 0;
        }
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
        else if (front == queue.length){
            front = 0;
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


    //test whether the queue was wrapped
    public int size() {
        if (front <= back){
            return back - front;
        } else {
            return back - front + queue.length;
        }

    }


    public void printQueue (){
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }


}
