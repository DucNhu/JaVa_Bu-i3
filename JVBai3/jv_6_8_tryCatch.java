package com.JVBai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class jv_6_8_tryCatch {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        try {
            Scanner in = new Scanner(new File("C:\\Users\\Pc\\IdeaProjects\\lession01_JaVa\\src\\com\\JVBai3\\in.txt"));
            num1 = in.nextInt();
            num2 = in.nextDouble();
            name = in.next();
            System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1 + num2);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
