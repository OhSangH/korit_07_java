package com.ch06_condition;

import java.util.Scanner;

public class Condition07 {
    /*
        중첩 if문 (Nested - if)
            if문 내에 if문이 중첩적으로 사용 될 수 있다
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade;
        System.out.print("점수를 입력하세요 >>>");
        int score = sc.nextInt();
        if (score <= 100 && score >= 0) {
            if (score >= 90) {
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
        } else {
            grade = "X";
            System.out.println("불가능한 점수입니다.");
        }

        System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");

    }
}
