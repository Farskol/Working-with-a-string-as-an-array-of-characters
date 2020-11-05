package com.company;

import java.util.Scanner;

public class Main {
    public static String getString(){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        return str;
    }
    public static void main(String[] args) {
        String str = getString();
        System.out.print(str.replaceAll("word", "letter"));
    }
}
