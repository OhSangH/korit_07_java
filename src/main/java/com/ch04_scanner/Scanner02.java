package com.ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Str :");
        String str1 = sc.nextLine();
        String str2 = "123";
        System.out.println("" +str1 + " == " + str2 + " 결과 :" +( str1 == str2));
        System.out.println(str1 + ".equals(" + str2 + ") 결과 :" + str1.equals(str2));
    }
}
