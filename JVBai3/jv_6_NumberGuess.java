package com.JVBai3;

import java.util.Scanner;

public class jv_6_NumberGuess{
    public static void main(String[] args) {
        int secretNumber;
        int numberIn;
        int trialNumber = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);
        secretNumber=(int)(Math.random() * 100);
        while (!done) {
            ++trialNumber;
            System.out.println("Enter ur guess (between 0 and 99): ");
            numberIn = in.nextInt();
            if (numberIn == secretNumber) {
                System.out.println("Conguatulation");
                done = true;
            }
            else if( numberIn < secretNumber) {
                System.out.println("Try higher");
            }
            else {
                System.out.println("try lower");
            }
        }
        System.out.println("You got in " + trialNumber + " trials");
        in.close();
    }
}
