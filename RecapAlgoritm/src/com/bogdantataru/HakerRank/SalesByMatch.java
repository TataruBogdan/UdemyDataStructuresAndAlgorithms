package com.bogdantataru.HakerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static void main(String[] args) {

        System.out.println(sockMerchantMy(9, Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));

    }

    public static int sockMerchantMy(int n, List<Integer> ar) {


        Map<Integer, Integer> sockCount = new HashMap<>();

        for(Integer sock : ar) {

            if(sockCount.containsKey(sock)) {
                int freq = sockCount.get(sock);
                freq++;
                sockCount.put(sock, freq);
            } else {
                sockCount.put(sock, 1);
            }
        }

        int numberPairs = 0;
        for(Integer value : sockCount.values()){
            numberPairs += value / 2;
        }

        return numberPairs;

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(Integer ele : ar){
            if(hMap.containsKey(ele)){
                int freq = hMap.get(ele);
                freq++;
                hMap.put(ele, freq);
                if(freq % 2 ==0)
                    count++;
            }else{
                hMap.put(ele, 1);
            }
        }
        return count;
    }
}
