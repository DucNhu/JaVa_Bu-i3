package com.JVBai3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class jv_6_TextFileScannerWithThrows {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner in = new Scanner(new File
                ("in.txt"));
        int anInt = in.nextInt();
        double aDouble = in.nextDouble();
        String str = in.next();
        String line = in.nextLine();
    }
}
