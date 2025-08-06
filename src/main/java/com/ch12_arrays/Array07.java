package com.ch12_arrays;

/*
    배열 element의 값들의 점수 범위를 조사하여
    90 이상은 A
    80 이상은 B
    70 이상은 C
    60 이상은 D
    59 이하는 F
    각각 몇명씩 있는지 출력
 */
public class Array07 {
    static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                a++;
            } else if (scores[i] >= 80) {
                b++;
            } else if (scores[i] >= 70) {
                c++;
            } else if (scores[i] >= 60) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("E 학생 수 : " + f);
        System.out.println();

        // a~f까지 변수 필요 X
        // 배열로 하나로 묶는게 가능
        int[] grades = {0, 0, 0, 0, 0};
        // 이렇게 작성하면 한줄에 가능

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                grades[0]++;
            } else if (scores[i] >= 80) {
                grades[1]++;
            } else if (scores[i] >= 70) {
                grades[2]++;
            } else if (scores[i] >= 60) {
                grades[3]++;
            } else {
                grades[4]++;
            }
        }
        System.out.println("A 학생 수 : " + grades[0]);
        System.out.println("B 학생 수 : " + grades[1]);
        System.out.println("C 학생 수 : " + grades[2]);
        System.out.println("D 학생 수 : " + grades[3]);
        System.out.println("E 학생 수 : " + grades[4]);
    }
}
