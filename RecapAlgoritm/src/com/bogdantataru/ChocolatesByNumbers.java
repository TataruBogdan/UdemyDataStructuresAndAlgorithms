package com.bogdantataru;

public class ChocolatesByNumbers {

    public static void main(String[] args) {

//        System.out.println(new ChocolatesByNumbers().solution(10, 4));

        System.out.println(new ChocolatesByNumbers().solutionSchool(10, 4));
        System.out.println(new ChocolatesByNumbers().solutionSchool(9, 3));
        System.out.println(new ChocolatesByNumbers().solutionSchool(10, 11));
    }

    //return number of chocolates eaten
                    // N - number of chocolates - 0 - N-1
                                // M - manner to eat the next chocolate is M steps
    public int solution (int N, int M) {

        //create an array of chocolates to be eaten of size N
        int[] chocolates = new int[N];
        //populate chocolates with chocolate
        for (int i = 0; i < chocolates.length; i++) {
            chocolates[i] = i;
        }
        // start eating chocolate nr 0 and leave a wrapper
        // then omit the next M-1 chocolate or WRAPPER and EAT the following one
        // create marker if chocolate is eaten place a wrapper
        int ateChocolate = -1;
        // a var to keep track of our position in array
        int[] wrappers = new int[chocolates.length];
        // 0 chocolate was eaten start with next position
        wrappers[0] = ateChocolate;
        int count = 1; //number of chocolates eaten
        for (int i = 0; i < wrappers.length ; i++) {
            //if found an ate chocolate return how many are been ate
            //i must keep paste with i
            if (chocolates[i] == ateChocolate) {
                break;
            }
            // if ete chocolate x or reach the end of the array
            // next chocolate to be eten is at X+M

            wrappers[(i + (M)) % chocolates.length] = ateChocolate;
            i = ((i + M) % chocolates.length) - 1;
            count++;

        }
        return count;

    }

    private int findGcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return findGcd(b, a % b);
    }

    public int solutionSchool(int N, int M) {
        return N / findGcd(N, M);
    }

}
