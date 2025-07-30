package com.ch06_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        /*
        Condition05 문제에서 100초과 0미만일경우 grade를 X로 표시
         */
        Scanner sc = new Scanner(System.in);
        String grade;
        System.out.print("점수를 입력하세요 >>>");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            grade = "X";
            System.out.println("불가능한 점수입니다.");
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");

    }
}
