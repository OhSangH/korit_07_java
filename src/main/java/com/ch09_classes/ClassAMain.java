package com.ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        // 객체 생성
        ClassA classA1 = new ClassA();
//        Scanner sc = new Scanner(System.in);

        // 호출도 했었다
//        sc.nextLine();
        //ClassA에 선언된 변수들에 값을 대입
        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.2;

        System.out.println(classA1.name + "학생의 학번은 " + classA1.num
                        + "번 이고, 점수는 " +  classA1.score + "점 입니다." );

        classA1.callName();
    }
}
