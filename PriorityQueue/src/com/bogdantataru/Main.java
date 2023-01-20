package com.bogdantataru;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

//        System.out.println(pq.peek());
//        System.out.println(pq.remove()); // returns the item it removed
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
        System.out.println(pq.remove(54)); // is removed yes/no - true/false


        Object[] ints = pq.toArray();
        for (Object num: ints){
            System.out.print(num + ", ");
        }


//        System.out.println(pq.peek());
//        pq.add(-1);
//       System.out.println(pq.peek());

    }
}
