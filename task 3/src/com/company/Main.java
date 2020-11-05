package com.company;

import java.util.Scanner;

public class Main {
public static int howMuchNumbers( String str){
    int j = 0;
    for (int i = 0; i < str.length(); i++){
        if (Character.isDigit(str.charAt(i))){
            j++;
        }
    }
    return j;
}
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.print(howMuchNumbers(str));
    }
}
