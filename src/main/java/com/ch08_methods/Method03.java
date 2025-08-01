package com.ch08_methods;

import java.util.Scanner;


public class Method03 {
    /*
        Method02에서 별찍기 메서드를 main에서 Scanner를 받아서 해야하나?
        그냥 메서드 실행할 때 물어보면 안되나?
        그래서 main에 getStar()만 오도록 수정해 보자
     */
    public static String getStar() {
        String result = "잘못된 번호입니다.";
        int row = getRow();
        int option = getOption();
        if (option == 1) {
            for (int i = 0; i < row + 1; i++) {
                for (int j = 0; j < i; j++) {
                    //여기서 기존처럼 sout 사용을 하게 되면 출력을 고정되어 데이터의 가공이 불가능해진다.
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row - i; j++) {
                    result += " ";
                }
                for (int j = 0; j <= i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 3) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 4) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <= i; j++) {
                    result += " ";
                }
                for (int j = 0; j < row - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능이 없습니다.";
        }
        return result;
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


    public static void main(String[] args) {
        System.out.println(getStar());
    }
}
