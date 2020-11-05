package com.company;

import java.util.Scanner;

public class Main {
public static String newString(String str){
    char arrayOsStr [] = new char [str.length()];
    for (int i = 0; i < arrayOsStr.length; i++){
        arrayOsStr [i] = str.charAt(i);
    }
    int k = 0;
    for (int i = arrayOsStr.length-1; i > 0; i--){
        if (arrayOsStr[i] == ' '){
            k++;
        }
        else{
            break;
        }
    }
    int n = 0;
    for (int i = 0; i < arrayOsStr.length-1-k-n; i++){
        if (arrayOsStr[i] == ' '){
            boolean flag = true;
            while (flag) {
                if (arrayOsStr[i+1] == ' '){
                    for (int j = i+1; j < arrayOsStr.length-1-k-n; j++){
                        arrayOsStr[j] = arrayOsStr[j+1];
                    }
                    n++;
                    }
                else {
                    flag = false;
                }
            }
        }
    }
    String newStr = "";
    for (int i = 0 ; i < arrayOsStr.length-k-n; i++){
        newStr += arrayOsStr[i];
    }
    return newStr;
}
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.print(newString(str));
    }
}
