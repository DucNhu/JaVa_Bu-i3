package com.JVBai3;

import java.util.Scanner;

public class jv_6_ScannerNextLineTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string (with space): ");
        String str = in.nextLine();
        System.out.printf("%s%n", str);
        in.close();
    }
}
