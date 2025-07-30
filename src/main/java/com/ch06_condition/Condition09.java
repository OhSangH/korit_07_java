package com.ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하시오. >>>> ");
        int year = sc.nextInt();

        boolean leapYear = year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0;

        if(leapYear){
            System.out.println(year + "년도는 윤년입니다.");
        }else  {
            System.out.println(year + "년도는 윤년이 아닙니다.");
        }
    }
}
