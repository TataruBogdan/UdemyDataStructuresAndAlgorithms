package com.bogdantataru;

import java.util.HashMap;

public class ToolList {

    public static void main(String[] args) {
        String[] tools = {"ballendmill", "keywaycutt", "slotdrill", "facemill"};

        // System.out.println("Minimum moves: " + new ToolList().solution(tools, 1, "ballendmill"));
//        System.out.println("Minimum moves: " + new ToolList().solution2(tools, 1, "ballendmill"));
        System.out.println("Minimum moves: " + new ToolList().solution3(tools, 1, "ballendmill"));
        // System.out.println("Minimum moves: " + new ToolList().solution2(tools, 1, "viorel"));
        // System.out.println("Minimum moves: " + new ToolList().toolChanger(tools, 0, "facemill"));
    }

    public int solution(String[] tools, int startIndex, String target) {

        int minimMovesRight = 0;
        int minimMovesLeft = 0;

        int endIndex = startIndex;
        while (!target.equals(tools[endIndex])) {
            minimMovesRight += 1;
            endIndex++;
            if(endIndex == tools.length){
                endIndex = 0;
            }
        }

        endIndex = startIndex;
        while (!target.equals(tools[endIndex])){
            minimMovesLeft += 1;
            endIndex--;
            if (endIndex < 0){
                endIndex = tools.length-1;
            }
        }
        return Math.min(minimMovesLeft, minimMovesRight);
    }

    public int solution2(String[] tools, int startIndex, String target) {

        if(tools[startIndex].equals(target)){
            return 0;
        }

        int moves = 1;
        int currentIndex = correctIndex(startIndex + moves, tools.length);
        while (!target.equals(tools[currentIndex]) && currentIndex != startIndex) {
            moves += 1;
            currentIndex = correctIndex(startIndex + moves, tools.length);
        }
        if (currentIndex == startIndex){
            System.out.println("Cannot find target " + target);
            return -1;
        }
        System.out.println("movesRight =" + moves );

        moves = 1;
        currentIndex = correctIndex(startIndex - moves, tools.length);
        while (!target.equals(tools[currentIndex]) && currentIndex != startIndex) {
            moves += 1;
            currentIndex = correctIndex(startIndex - moves, tools.length);
        }

        System.out.println("movesLeft="+moves);

        return Math.min(moves, moves);
    }

    public int solution3(String[] tools, int startIndex, String target) {

        if(tools[startIndex].equals(target)){
            return 0;
        }

        int moves = 1; // in orice caz avem cel putin o miscare
        int rightCurrentIndex = correctIndex(startIndex + moves, tools.length); // verific daca miscarea nu depaseste lunimea array
        int leftCurrentIndex = correctIndex(startIndex - moves, tools.length);

        boolean targetByRight = target.equals(tools[rightCurrentIndex]);
        boolean targetByLeft = target.equals(tools[leftCurrentIndex]);
        boolean fullRotationRight = rightCurrentIndex == startIndex;
        boolean fullRotationLeft = leftCurrentIndex == startIndex;

        while (!(targetByRight || targetByLeft) && !fullRotationRight && !fullRotationLeft) {
            moves += 1;
            rightCurrentIndex = correctIndex(startIndex + moves, tools.length);
            leftCurrentIndex = correctIndex(startIndex - moves, tools.length);
        }
        if (rightCurrentIndex == startIndex || leftCurrentIndex == startIndex){
            System.out.println("Cannot find target " + target);
            return -1;
        }
        return moves;
    }

    // daca miscarea depaseste lungimea array atunci corecteaza index
    private int correctIndex(int index, int arrayLength) {
        if (index >= arrayLength || index <0) {
            return Math.abs(index % arrayLength);
        }
        return index;
    }



    // return minimum numbers of moves requires to reach the needed tool
    public int toolChanger(String[] tools, int startIndex, String target) {

        //create an HashMap
        HashMap<String, Integer> toolCharger = new HashMap<>();

        for (int i = 0; i < tools.length; i++) {
            toolCharger.put(tools[i], i );
        }
        Integer targetPos = toolCharger.get(target);
        int movesRight = 0;
        if (targetPos > startIndex) {
            movesRight = targetPos - startIndex;

        } else {
            movesRight = (tools.length - startIndex) + targetPos;
        }

        int movesLeft = 0;
        if (targetPos < startIndex) {
            movesLeft = startIndex - targetPos;
        } else {
            movesLeft = startIndex + tools.length - targetPos;
        }
        return Math.min(movesLeft, movesRight);
    }

}
