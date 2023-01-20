package com.bogdantataru;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable(){

        //set the capacity inside the constructor
        hashtable = new StoredEmployee[10];

    }

    // hashtables - dealing with key-value pairs - add to a hashtable you have to provide the key and the value / retrieve - you have to provide the key same key you used to add the value.
    public void put(String key, Employee employee){

        // hash the keys - map the key they provided to an integer
        int hashedKey = hashKey(key); // give us the index

        // check if the position in the array is already occupied - linear probing
        if (occupied(hashedKey)) {
            // set a stop index, because we need to know when to stop looking.
            // we need to know when we have looked at the entire array.
            int stopIndex = hashedKey; // Because we've already checked that position
            // we're going to increment by one and if we keep going and loop around it means we checked the entire array.
            // this is the wrapping - setting up the first probe and if the position that we just checked is the last slot in the array, we want to loop the next position we're going to check his position zero,
            if (hashedKey == hashtable.length - 1){
                hashedKey = 0; // this is setting up the first probe
            }
            else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        // there's already an employee at that position in the array
        if (occupied(hashedKey) ){
            System.out.println("The array is full " + hashedKey);
        }
        else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    // retrieve the employee - constant time
    public Employee get(String key) {

        int hashedKey = findKey(key);
        if (hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;

    }

    // need a hashing function - use the employee last name as the key - String
    // using linear probing
    private int hashKey(String key){
        //          4       /      10   = 0.4   = return % 4
        return key.length() % hashtable.length;
    }


    public Employee remove(String key) {

        int hashedkey = hashKey(key);

        if (hashedkey == -1) {
            return null;
        }

        Employee employee = hashtable[hashedkey].employee;

        hashtable[hashedkey] = null;

        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key,oldHashTable[i].employee);
            }
        }
        return employee;

    }

    // String key - row key
    private int findKey(String key){

        int hashedkey = hashKey(key);
        //if the employee that is stored at hashedkey index is added with the key we are interested
        if(hashtable[hashedkey] != null && hashtable[hashedkey].key.equals(key)){
            return hashedkey;
        }

        int stopIndex = hashedkey; // Because we've already checked that position

        if (hashedkey == hashtable.length - 1) {
            hashedkey = 0; // this is setting up the first probe
        } else {
            hashedkey++;
        }
        while (hashedkey != stopIndex && hashtable[hashedkey] !=null && !hashtable[hashedkey].key.equals(key)) {
            hashedkey = (hashedkey + 1) % hashtable.length;
        }

        if (hashtable[hashedkey] != null && hashtable[hashedkey].key.equals(key)){
            return hashedkey;
        }
        return -1;

    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {

        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            }
            else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }
}
