package com.ch06_condition;

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //변수 / 상수의 선언 및 초기화
        int point = 0;
        //상수
        final int VIP_POINT = 100;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        System.out.print("회원 포인트를 입력하세요 >>>>>");
        point = sc.nextInt();

        //sout이 너무 많다.
        if(point >= 80){
            System.out.println("회원등급 : VIP");
        }else if(point >= 60){
            System.out.println("회원등급 : GOLD");
        }else if(point >= 40){
            System.out.println("회원등급 : SILVER");
        }else if(point >= 20){
            System.out.println("회원등급 : BRONZE");
        }

        //기능은 동일하지만 개발자 친화적(유지보수가 용이한 형태)으로 재작성 할 예정
        //이와 같은 개발자 친화적으로 재작성하는 과정을 리팩터링이라고 한다.
        String userGrade = "";
        if (point >= 80) {
            userGrade = "VIP";
        } else if (point >= 60) {
            userGrade = "GOLD";
        } else if (point >= 40) {
            userGrade = "SILVER";
        } else if (point >= 20) {
            userGrade = "BRONZE";
        }
        System.out.println("회원등급 : " + userGrade);

        //2. 요구등급에 대한 포인트 규정이 변경되었을때 일일히 수정해야하는걸 변경하기 위해
        String userGrade2 = "";
        if(point >= VIP_POINT){
            userGrade2 = "VIP";
        }else if(point >= GOLD_POINT){
            userGrade2 = "GOLD";
        }else if(point >= SILVER_POINT){
            userGrade2 = "SILVER";
        }else if(point >= BRONZE_POINT){
            userGrade2 = "BRONZE";
        }
        System.out.println("회원등급 : " + userGrade2);


    }
}
