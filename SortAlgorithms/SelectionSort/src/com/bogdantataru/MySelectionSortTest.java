package com.bogdantataru;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class MySelectionSortTest {

    private static MySelectionSort mySelectionSort;

    @BeforeAll
    public static void setup() {
        mySelectionSort = new MySelectionSort();
        System.out.println("Running a test ....");
    }

    @Test
    void sortArray() {

//        MySelectionSort mySelectionSort = new MySelectionSort();

        int[] expectedResult = new int[] { -22, -15, 1, 7, 20, 35, 55};
        int[] actual = { 20, 35, -15, 7, 55, 1, -22};

        assertArrayEquals(expectedResult, mySelectionSort.sortArray(actual));

    }

    @Test
    void sortArray_null(){
//        MySelectionSort mySelectionSort = new MySelectionSort();

        int[] expectedResult = new int[] {};
        int[] actual = { };

        assertArrayEquals(expectedResult, mySelectionSort.sortArray(actual));
    }

    @Test
    void sortArrayAlreadySorted(){
//        MySelectionSort mySelectionSort = new MySelectionSort();

        int[] expectedResult = new int[] {-22, -15, 1, 7, 20, 35, 55};
        int[] actual = { -22, -15, 1, 7, 20, 35, 55};

        assertArrayEquals(expectedResult, mySelectionSort.sortArray(actual));
    }


    @Test
    void swap() {
        int[] expectedResult = new int[] {-22, -15};
        int[] actual = { -15, -22};

        assertArrayEquals(expectedResult, mySelectionSort.sortArray(actual));
    }

    @Test
    void swapNoElements() {
        int[] expectedResult = new int[] {};
        int[] actual = {};

        assertArrayEquals(expectedResult, mySelectionSort.sortArray(actual));
    }


    @Test()
    void swapNotEqual() throws Exception{

        int[] expectedResult = new int[] {-15, -22};
        int[] actual = {-15, -22};

        //assertArrayEquals(expectedResult, mySelectionSort.sortArray(actual));

        assertFalse(Arrays.equals(mySelectionSort.sortArray(expectedResult), actual));

    }



}