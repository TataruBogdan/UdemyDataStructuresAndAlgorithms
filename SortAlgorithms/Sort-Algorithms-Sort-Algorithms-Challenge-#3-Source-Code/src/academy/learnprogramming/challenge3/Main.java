package academy.learnprogramming.challenge3;

public class Main {

    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort

        radixSort(stringsArray, 26, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {

        for (int i = width -1 ; i >= 0; i--) {

            radixSimpleSort(input, i, radix);
        }

    }


    // make assumption about the data
    public static void radixSimpleSort(String[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value: input) {
            countArray[getIndex(position, value)]++;
        }

       //Adjusting the counting sort
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i-1];
        }

        //stable counting sort
        String[] temp = new String[numItems];
        for (int tempIndex = numItems -1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }


        // copy back from the temporary array into the input array
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    //sorting by the letter that has the least weight
    public static int getIndex(int position, String word){

        return word.charAt(position) - 'a';

        /*int[] values = new int[word.length()];
        char[] ch = new char[word.length()];
        for (int i = 0; i < word.length() ; i++) {
            ch[i] = word.charAt(i);
            values[i] = word.charAt(i) - 97;
        }


//        int value = 0 ;
//        int offset = 1;
//        for (int i = values.length -1; i >=0; i--)  {
//            value += values[i] * offset;
//            offset *= 10;
//        }

        int value = 0;
        for (int i = values.length-1; i > 0; i--){
            value = values[i];
        }

        return value / (int) Math.pow(radix, position) % radix;*/

    }

}
