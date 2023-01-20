package academy.learnprogramming.challenge2;

/*
When we call the method with the entire array, we're gonna have seven items, so we're gonna check whether we have more than one item
and we do, and so what we're gonna say is let's first sort the first six items and so, by the time we return from this method,
the first six items in the array have been sorted and we wanna just sort now the seventh item, the very last item.
do a regular insertionSort but instead of a loop, we're just doing one iteration and that'll be for the element that's at numItems minus one.
So, for the entire array, that would be input six which is minus 22 and then we're gonna say for i equals six, i is greater than zero
and input i minus one is greater than newElement, so we're looking for the insertion point here, i--, as long as the element is greater than newElement,
we're gonna keep looking for the insertion point because we wanna find the first element that's less than or equal to the one we wanna insert
because when we find that element, we'll know we found the insertion point and so, as we're looking for this element,
of course we're shifting elements up because we have to make room for the insertion and when we drop out of this loop,
i will be the insertion point of the newElement.
So, instead of using a loop to increase the sorted partition from left to right, we're using recursion to increase the sorted partition from left to right.
 */

public class Main {

    public static void main(String[] args) {
                            // f1   f2 ...             intArray.length
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
                 // i= 0  i-1  i1,  i2, i3, i4, i5, i6

        recursiveInsertionSort(intArray, intArray.length);


//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
//             firstUnsortedIndex++) {
//            int newElement = intArray[firstUnsortedIndex];
//
//            int i = 0;
//
//            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
//                intArray[i] = intArray[i - 1];
//            }
//            intArray[i] = newElement;
//        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // introduc un array cu doua elemente si daca primul element > al doilea elemnet returneaza
    public static void recursiveInsertionSort(int[]input, int numItems) {
        // when we have one item our array is sorted - braking condition
        // because when we have one item, by definition, that one item is sorted
        if (numItems < 2) {
            System.out.println( " Result of call when numItems = " + numItems);

            return;
        }
        //do an insertionSort with the same input array but with one less items.
        // So, when we're called with two items or more, before we sort the items we're called with, we're gonna sort numItems minus one.
        // So, if we're called in the beginning to sort seven items, we'll say we'll first sort the first six items and then after we've sorted the first six items, we'll sort that final item
        recursiveInsertionSort(input, numItems -1 );
        // instead of a firstUnsortedIndex, we're gonna use numItems minus one.
        int newElement = input[numItems -1];

        int i;

        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input [i] = input[i - 1];
        }

        input[i] = newElement;

        System.out.println("Result of call when numItems = " + numItems );
        for ( i= 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");

    }
}
