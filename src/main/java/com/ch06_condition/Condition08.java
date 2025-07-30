package com.ch06_condition;

import java.util.Scanner;

public class Condition08 {
    /*
    과제 :
    윤년 계산기 작성
    윤년 (leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당 할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님.
    3. 그런데 100으로 나누어 떨어지기는 하는데 400으로도 나누어 떨어지면 윤년에 해당함.

    ex)
    2020은 4로 나누어 떨어지기 때문에 윤년
    1900은 100으로 나누어 떨어지기 때문에 윤년이 아님
    2000은 100으로 나누어 떨어지나 400으로 나누어 떨어지기때문에 윤년
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하시오. >>>> ");
        int year = sc.nextInt();
        boolean leapYearCheck = false;

        if(year % 4 == 0 && !(year % 100 == 0)  || year % 400 == 0) {
            leapYearCheck = true;
        }

        if(leapYearCheck){
            System.out.println(year + "년도는 윤년입니다.");
        }else  {
            System.out.println(year + "년도는 윤년이 아닙니다.");
        }


    }
}
