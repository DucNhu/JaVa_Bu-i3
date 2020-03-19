package com.JVBai3;

import java.io.Console;
import java.util.Arrays;

public class jv_6_ConsolePasswordTest {
    static String login;
    static char[] password;

    public static void main(String[] args) {
        Console con = System.console();
        if (con == null) {
            System.out.println("Consoloe Object is not available.");
            System.exit(1);
        }
        login = con.readLine("Enter ur login Name:");
        password = con.readPassword("Enter ur password: ");
        if(checkPassword(login, password)){
            Arrays.fill(password, ' ');
        }

    }
    static boolean checkPassword(String login, char[] password){
        return true;
    }
}
