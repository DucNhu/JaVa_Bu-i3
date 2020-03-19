package com.JVBai3;

import java.util.Scanner;

public class jv_7_printSquarepattern {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ssize: ");
        size = in.nextInt();
        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                System.out.print("* ");
            }
            System.out.println("");
            in.close();
        }
    }
}
