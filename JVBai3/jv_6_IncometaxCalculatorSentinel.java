package com.JVBai3;

import java.util.Scanner;

public class jv_6_IncometaxCalculatorSentinel {
    public static void main(String[] args) {

        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        final int SENTINEL = -1;
        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        taxableIncome = in.nextInt();
        while (taxableIncome != SENTINEL) {
            if (taxableIncome > 60000) {
                taxPayable = 20000 * TAX_RATE_ABOVE_20K
                        + 20000 * TAX_RATE_ABOVE_40K
                        + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
            }
            else if (taxableIncome > 40000) {
                taxPayable = 20000 * TAX_RATE_ABOVE_20K
                        + (TAX_RATE_ABOVE_20K - 40000) * TAX_RATE_ABOVE_40K;
            }
            else {
                taxPayable = 0;
            }
            System.out.printf("the income tax payable is: $%.2f%n", taxPayable);
            System.out.println("Enter the taxable income: $");
            taxableIncome = in.nextInt();

        }
        System.out.println("Bye");
        in.close();

    }
}