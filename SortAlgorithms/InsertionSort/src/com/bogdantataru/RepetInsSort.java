package com.bogdantataru;

public class RepetInsSort {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        insSort(intArray);

        for (int i = 0; i < intArray.length-1; i++) {
            System.out.println(intArray[i]);
        }
    }


    /* sort an deck of card
    consider first card as sorted card
    compare the next car with the sorted card and position the unsorted card in front of back of sorted card
     */
    public static int[] insSort (int[] array) {

        // o each iteration pick a card from the unsorted deck card
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){

            // save the value of the card - because it's an in place algorithm
            int newElement = array[firstUnsortedIndex];

            // for each card i need to compare it's value with the value of the card from the sorted partition
            // and introduce it in the SORTED PARTITION
            int i;
            // array-1 - element from sorted partition
            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--){
                array[i] = array[i-1];
            }
            array[i] = newElement;

        }
        return array;

    }

}
