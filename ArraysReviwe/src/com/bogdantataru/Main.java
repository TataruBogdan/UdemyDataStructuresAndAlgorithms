package com.bogdantataru;

/*
 how we determine time complexity ? --> "Time Complexity is most commonly estimated by counting the number of elementary steps performed by any algorithm to finish execution" .
secondly,  in Big O notation, we consider the worst case scenario to determine time complexity of an algorithm.

Now, consider the problem that you mentioned in title, in 'worst case' how many traversal will you have to perform before you could delete the element ?  --> Its N traversals.
(assumptions -
1. Length of the array is N.
2. You don't know the index of the element to be deleted, but the value. )

Lets say time required for each traversal is k unit and that for deleting the element is c unit (i.e. constant)
thus, time complexity = k*n + c => k*n => O(n). Thus O(n) or linear complexity.

[ we do not consider the constants (k & c in above case) while calculating time complexity.]

Point to remember -- all the time complexities are  approximations, it doesn't reflects the exact time required.
 */


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Arrays are not a dynamic data structure, By not being dynamic, I mean that once you've created an array instance, you cannot change it size.
        int[] intArray = new int[7];
        System.out.println(intArray.length);
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        //intArray[7] = 13;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index: " + i + " and the value is : " + intArray[i]);
        }

        // O(n) - loop for n times
        int index = -1;
        for(int i=0; i < intArray.length; i++){
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);

        List<Integer> newArray =  arrayTransf(intArray);
        printArray(newArray);

        System.out.println("position of the value is at index: " + retieveArrayElem( intArray, -15));
    }

    public static List<Integer> arrayTransf (int[] array) {
        List<Integer> arrayTmp = new ArrayList<Integer>();
        if (array.length <= 0 ) {
            System.out.println("Please insert an valid array");
        } else {
            for (int i = 0; i < array.length; i++) {
                arrayTmp.add(array[i]);
            }
        }
        return arrayTmp;
    }

    public static void printArray (List<Integer> array) {
        for (int i = 0; i< array.size() - 1; i++) {
            System.out.println(i + " value of  element in array " + array.get(i) + " element" );
        }
    }

    public static int retieveArrayElem (int[] array, int elemValue) {
        int elemRetriverd = 0;
        for (int i = 0; i < array.length; i++) {
            if (elemValue == array[i]) {
                elemRetriverd = i;
            }
        }
        return elemRetriverd;
    }


}


