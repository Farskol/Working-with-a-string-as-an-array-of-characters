package com.company;

import java.util.Scanner;

public class Main {
public static StringBuffer getString(){
    Scanner console = new Scanner(System.in);
    StringBuffer string = new StringBuffer(console.next());
    return string;
}
    public static int getInt(){
        int i = 0;
        boolean flag = true;
        while (flag) {
            Scanner console = new Scanner(System.in);
            if (console.hasNextInt()) {
                i = console.nextInt();
                if (i >= 0) {
                    flag = false;
                }
            } else {
                System.out.println("Error! This number is not natural");
            }
        }
        return i;
    }
    public static StringBuffer [] transformationInSnake_case( StringBuffer massiveOfStrings[]){
        for (int i = 0; i < massiveOfStrings.length; i++){
            for (int j = 0; j < massiveOfStrings[i].length(); j++){
                if (Character.isUpperCase(massiveOfStrings[i].charAt(j))){
                    massiveOfStrings[i].setCharAt(j, Character.toLowerCase(massiveOfStrings[i].charAt(j)));
                    massiveOfStrings[i].insert(j, '_');
                }
            }
        }
        return massiveOfStrings;
    }
    public static void main(String[] args) {
	// ох я так устал, сейчас на работе и было очень одиноко, а нужно ещё какие-то программы писать
       int n = getInt();
        StringBuffer massiveOfStrings [] = new StringBuffer[n];
        for (int i = 0; i < n; i++){
            massiveOfStrings[i] = getString();
        }
        massiveOfStrings = transformationInSnake_case(massiveOfStrings);
        for (int i = 0; i < massiveOfStrings.length; i++){
            System.out.print(massiveOfStrings[i]+", ");
        }
    }
}
