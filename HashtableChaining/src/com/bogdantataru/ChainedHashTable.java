package com.bogdantataru;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable(){
        hashtable = new LinkedList[10]; // create an array with 10 elements and whose element have inside a Linked List
        // initialise each array position with an empty linked list
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);

        hashtable[hashedKey].add(new StoredEmployee(key, employee));

    }

    public Employee get(String key){

        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        StoredEmployee employee = null;
        while (iterator.hasNext()){
            employee = iterator.next();
            if (employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;

    }

    public Employee remove (String key){
        int hashedKey = hashKey(key);

        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()){
            employee = iterator.next();
            index++; // obtain the index of the element -> delete element at index
            if (employee.key.equals(key)){
                break;
            }
        }

        if (employee == null && !employee.key.equals(key)){
            return null;
        }else {
            hashtable[hashedKey].remove(index); // <- delete element at index obtained
            return employee.employee;
        }


    }

    private int hashKey(String key) {
        //return key.length() % hashtable.length;

        // use the strings hash code method
        // because the hash code method for string can actually produce negative numbers
        // key.hashCode and we're gonna mod that by hashtable.length.
        // In a hashing function, you're always gonna be modding it by the size of the array
        // because you have to make sure that the values you're returning are valid array indices.
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()){
                System.out.println("Position " + i + " is empty");
            }
            else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }

        }
    }
}
