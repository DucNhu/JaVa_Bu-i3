package com.JVBai3;

public class jv_5_3 {
    public static void main(String[] args) {

        char inChar = 'x';
        switch (inChar) {
            case 'a': case 'b': case 'c':
                System.out.print(2); break;
            case 'd': case 'e': case 'f':
                System.out.print(3); break;
            case 'g': case 'h': case 'i':
                System.out.print(4); break;
            case 'j': case 'k': case 'l':
                System.out.print(5); break;

            default:
                System.out.println("Invalid Input");
        }
        }
}
