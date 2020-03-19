package com.JVBai3;

public class jv_8_labeled_break {
    public static void main(String[] args) {
        int[][] testArray = {
                {1, 2, 3, 4},
                {4, 3, 1, 4},
                {9, 2, 3, 4}
        };
        int magicNumber = 2;
        boolean found = false;
        mainLoop:
        for (int i = 0; i < testArray.length; ++i) {
            for(int j = 0;j<testArray[i].length;++j) {
                if(testArray[i][j] == magicNumber) {
                    System.out.println(magicNumber);
                    found = true;
                    break mainLoop;
                }
            }
            System.out.println("Magic number " + (found ? "found" : "Not found"));
        }
    }
}
