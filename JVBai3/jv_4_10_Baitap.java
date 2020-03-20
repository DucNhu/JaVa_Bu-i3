package com.company;

public class jv_4_10_Baitap {
    public static void main(String[] args) {
        int year = 1500;
        int moth = 3;
        int day = 23;
        System.out.println((year < 1582 || (year == 1582 && moth < 10) ||
                (year == 1582 && moth == 10 && day < 15)));
    }
}
