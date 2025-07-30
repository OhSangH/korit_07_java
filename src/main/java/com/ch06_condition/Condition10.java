package com.ch06_condition;

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int max;
//        max = (a > b) ? a : b;
//        System.out.println(max);

        //만약 삼항 연산자를 사용하지 않으면
//        if (a > b) {
//            max = a;
//        }else {
//            max = b;
//        }
//        System.out.println(max);

        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>>");
        int year = sc.nextInt();
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        String result = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";
//
//        System.out.println(year + "년은 " + result);
        String result2;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // 음수 연도를 걸러내기 위한 방법 #1
        if (year < 0) {
            result2 = "불가능한 연도 입력입니다.";
        } else {
            result2 = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";
        }

        System.out.println(year + "년은 " + result2);
        // 음수 연도를 걸러내기 위한 방법 #2
        String result3 = year < 0 ? "불가능한 연도 입력입니다."
                : (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
                ? "윤년입니다."
                : "윤년이 아닙니다.";

        System.out.println(year + "년은 " + result3);


    }
}
