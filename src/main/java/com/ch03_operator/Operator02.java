package com.ch03_operator;

public class Operator02 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("----- && 연산자------");
        boolean result1 = flag1 && flag1;
        System.out.println("T X T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T X F = " + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F X F = " + result3);

        System.out.println("----- || 연산자------");
        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);

        boolean result7 = (flag2 || flag1) && flag2;

        boolean result8 = 10 % 3 == 0;

        // 나머지 연산의 결과값의 자료형은 int이다.
    }
}
