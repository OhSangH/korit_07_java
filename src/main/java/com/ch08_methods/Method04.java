package com.ch08_methods;

import java.util.Scanner;

public class Method04 {
    public static void getStar() {
        String result = "잘못된 번호입니다.";
        int rows = getRow();
        int option = getOption();
        switch (option) {
            case 1:
                System.out.println(leftIncrease(rows));
                break;
            case 2:
                System.out.println(rightIncrease(rows));
                break;
            case 3:
                System.out.println(leftDecrease(rows));
                break;
            case 4:
                System.out.println(rightDecrease(rows));
                break;
            default:
                System.out.println(result);
                break;
        }
    }

    private static int getRow() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 줄 짜리 별을 생성할까요? >>>> ");
        int rows = sc.nextInt();
        return rows;
    }

    private static int getOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 왼쪽으로 치우친 증가하는 별.");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별.");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별.");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별.");
        System.out.print("선택하세요. >>>> ");
        int option = sc.nextInt();
        return option;
    }

    private static String leftIncrease(int row) {
        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    private static String rightIncrease(int row) {
        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                result += " ";
            }
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    private static String leftDecrease(int row) {
        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    private static String rightDecrease(int row) {
        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                result += " ";
            }
            for (int j = 0; j < row - i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        getStar();
    }
}
