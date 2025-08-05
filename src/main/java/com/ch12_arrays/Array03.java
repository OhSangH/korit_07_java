package com.ch12_arrays;

import java.util.Scanner;

/*
    1. humans 배열에 이름 등록
        몇 명의 학생... >>> 5
        1 번 학생의 이름을 등록하세요 >>> 김일
        김일 학생의 점수을 입력하세요 >>> 4.5
        2 번 학생의 이름을 등록하세요 >>> 김이
        김이 학생의 점수을 입력하세요 >>> 4.4
        3 번 학생의 이름을 등록하세요 >>> 김삼
        김삼 학생의 점수을 입력하세요 >>> 4.3
        4 번 학생의 이름을 등록하세요 >>> 김사
        김사 학생의 점수을 입력하세요 >>> 4.2
        5 번 학생의 이름을 등록하세요 >>> 김오
        김오 학생의 점수을 입력하세요 >>> 4.1

        김일 김이 김삼 김사 김오
        4.5 4.4 4.3 4.2 4.1
        학생들의 점수 총합은 21.5점 입니다.
 */
public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int human = sc.nextInt();
        sc.nextLine();
        String[] names = new String[human];
        double[] scores = new double[human];
        double sum = 0.0;
        String str1 = "";
        String str2 = "";

        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번의 학생의 이름을 등록하세요 >>> ");
            names[i] = sc.nextLine();
            System.out.print(names[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = sc.nextDouble();
            sc.nextLine();
            sum += scores[i];
        }
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            str1 += names[i] + " ";
            str2 += scores[i] + " ";
        }
        System.out.println(str1);
        System.out.println(str2 + "\n");
        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");
    }
}
