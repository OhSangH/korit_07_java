package com.ch06_condition;

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        int num1 = 10;

        if (num1 > 0) {
            System.out.println("num1은 양수 입니다.");
        }

        if (num1 > 15) {
            System.out.println("num1은 15 초과입니다.");
        }

        //Scanner import
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>>");
        int num2 = sc.nextInt(); // 숫자의 값이 정해지지 않은 상태

        if (num2 > 0) {
            System.out.println("num2은 양수 입니다.");
        }
        System.out.println("프로그램 종료");

    }
}
