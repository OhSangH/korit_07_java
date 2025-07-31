package com.ch08_methods;

import java.util.Scanner;

@SuppressWarnings("StringConcatenationInLoop")
public class Method02 {
    /*
        별 찍기를 메서드화 시키기.
        call4() 유형으로 작성
    */

    public static String getStar(int row, int choice) {
        String result = "";
        switch (choice) {
            case 1:
                result = leftIncrease(row);
                break;
            case 2:
                result = rightIncrease(row);
                break;
            case 3:
                result = leftDecrease(row);
                break;
            case 4:
                result = rightDecrease(row);
                break;
            default:
                break;
        }

        return result;
    }

    public static String leftIncrease(int row) {
        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String rightIncrease(int row) {
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

    public static String leftDecrease(int row) {
        String result = "";
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row - i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String rightDecrease(int row) {
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
        Scanner sc = new Scanner(System.in);
        int rowIfStars, choice;
        String starResult;

        System.out.print("몇 줄 짜리 별을 생성할까요? >>>> ");
        rowIfStars = sc.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별.");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별.");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별.");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별.");
        System.out.print("선택하세요. >>>> ");
        choice = sc.nextInt();

        starResult = getStar(rowIfStars, choice);
        System.out.print(starResult);

    }
}
