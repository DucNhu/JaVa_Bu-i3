package com.JVBai3;

import java.io.FileNotFoundException;
import java.util.Formatter;
import  java.io.File;
public class jv_6_textFileFortmatterWithThrows {
    public static void main(String[] args)
            throws FileNotFoundException {
        Formatter out = new Formatter(new File ("C:\\Users\\Pc\\IdeaProjects\\lession01_JaVa\\src\\com\\JVBai3\\out.txt"));
        int num1 = 1234;
        double num2 = 55.66;
        String name = "Paul";
        out.format("Hi %s, %n", name);
        out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
        out.close();
        System.out.println("Done");
    }
}
