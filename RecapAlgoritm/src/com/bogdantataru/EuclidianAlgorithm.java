package com.bogdantataru;

public class EuclidianAlgorithm {
    /*
                A       B          Reminder
               742     518   =1 ->   224
               518     224   =2 ->    70
               224      70   =3 ->    14
                70      14   =5 ->    0
 RETURN result= 19       0  <- if B == 0

    * */

    public static void main(String[] args) {

        System.out.println("Greatest common divisor = " + new EuclidianAlgorithm().gccm(39, 27));
    }
    //return the greatest common divisor between A and B
    // 1. divide B to A
    // 2. take B and put in place of A and Reminder in place of B
    // 3. repeat 2 until B = 0 then return A (A is our gcd of the two numbers) or call again function with (B, A % B)
    public int gccm (int A, int B) {
        // stopping condition ->  recursive function
        // if B == 0 return A else return the result of the recursive call
        // and we shift everything to the left
        if (B ==0){
            return A;
                               // Remainder of the dividing A to B
        } else return gccm( B, A % B);
    }
}
