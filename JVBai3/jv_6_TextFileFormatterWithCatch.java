package com.JVBai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
public class jv_6_TextFileFormatterWithCatch {
    public static void main(String[] args) {
        try {
            Formatter out = new Formatter(new File("C:\\Users\\Pc\\IdeaProjects\\lession01_JaVa\\src\\com\\JVBai3\\out.txt"));
            int num1 = 1234;
            double num2 = 55.66;
            String name = "Pauline";
            out.format("Hi %s, %n", name);
            out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
            out.close();
            System.out.println("Done");
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
