package com.bogdantataru.HakerRank;

import java.util.*;

/*
* Given an array of bird sightings where every element represents a bird type id, determine the id
* of the most frequently sighted type. If more than 1 type has been spotted that maximum amount,
* return the smallest of their ids.
* There are two each of types 1 and 2 , and one sighting of type 3.
* Pick the lower of the two types seen twice: type 1.*/

public class MigratoryBirds {


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);

        System.out.println(migratoryBirds(integerList));
    }


    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * int: the lowest type id of the most frequently sighted birds
     * It is guaranteed that each type is 1, 2, 3, 4, or 5.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {

        // arr - type of birds / ids

        Map<Integer, Integer> birdsOccurrence = new HashMap<>(5);
        int countMinTypeOccurrence = 0;
        int occurrencyFreq = 0;

        for (Integer num: arr) {
            if (Objects.isNull(birdsOccurrence.get(num))) {
                birdsOccurrence.put(num, 0);
            }

            int value = birdsOccurrence.get(num);
            birdsOccurrence.remove(num);
            birdsOccurrence.put(num, ++value );
        }



        for (Map.Entry<Integer, Integer> entry : birdsOccurrence.entrySet())  {

            int freq = entry.getValue();
            int type = entry.getKey();

            if (freq > occurrencyFreq) {
                occurrencyFreq = freq;
                countMinTypeOccurrence = type;
            }
        }


        return countMinTypeOccurrence;

    }

}
