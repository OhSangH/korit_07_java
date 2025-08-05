package com.ch12_arrays;

import java.util.Scanner;
/*
    1. humans 배열에 이름 등록
        몇 명의 학생... >>> 5
        1 번 학생의 이름을 등록하세요 >>> 김일
        2 번 학생의 이름을 등록하세요 >>> 김이
        3 번 학생의 이름을 등록하세요 >>> 김삼
        4 번 학생의 이름을 등록하세요 >>> 김사
        5 번 학생의 이름을 등록하세요 >>> 김오
    2. score 배열의 점수를 입력
        1 번 학생의 점수을 입력하세요 >>> 4.5
        2 번 학생의 점수을 입력하세요 >>> 4.4
        3 번 학생의 점수을 입력하세요 >>> 4.3
        4 번 학생의 점수을 입력하세요 >>> 4.2
        5 번 학생의 점수을 입력하세요 >>> 4.1

 */
public class Array02 {
    public static void main(String[] args) {
        // 몇명의 학생을 등록하사겠습니까? >>> 5
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int human = sc.nextInt();
        sc.nextLine();
        String[] humans = new String[human];
        double[] scores = new double[human];
        double sum = 0.0;

        for (int i = 0; i < humans.length; i++) {
            System.out.print((i + 1) + "번의 학생의 이름을 등록하세요 >>> ");
            humans[i] = sc.nextLine();
        }
        System.out.println();
        for (int i = 0; i < scores.length; i++) {
            System.out.print(humans[i] + " 학생의 점수를 입력하세요 >>> ");
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        System.out.println();
        System.out.println("학생들의 점수 총합은 " + sum + "점 입니다.");

        for (int i = 0; i < scores.length; i++) {
            if(i == 1 || i == 3){
                System.out.println(humans[i] + "의 점수는 " + scores[i] + "점입니다.");
            }
        }
    }
}
