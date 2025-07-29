package com.ch03_operator;

public class Operator01 {
    public static void main(String[] args) {
        int i = 10;

        // '='에 대해 학습
        i = i + 1;

        int a = 5;
        int b = 2;
        double result = (double) a / b; //(double)은 강제 '형변환' 개념
        double result2 =  a / b; // 형 변환 없이

        System.out.println(a/b); // 2
        System.out.println(result); // 2.5
        System.out.println(result2); // 2.0
        // 코딩할 때 자료형을 명확히 해줘야 값 손실이 안일어난다.
        // 복합 대입 연산자
        int num1 = 10;
        num1 += 1;
        System.out.println(num1);
        num1 -= 3;
        System.out.println(num1);
        num1 *= 4;
        System.out.println(num1);
        num1 /= 2;
        System.out.println(num1);

        System.out.println("=".repeat(20));

        int j = 10;
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        System.out.println(j--);
        System.out.println(j);
        System.out.println(--j);
        System.out.println(j);

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다");
        System.out.println("내년에는 " + (age + 1) + "살입니다");

    }
}
