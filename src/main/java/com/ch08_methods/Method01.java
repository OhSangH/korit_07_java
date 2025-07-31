package com.ch08_methods;

import java.util.Scanner;

public class Method01 {
    // [argument / 결과값]
    // 1. [ x | x ]
    public static void call1(){
        System.out.println("[ x | x ]");

    }

    // 2. [ o | x ]
    public static void call2(String example){
        System.out.println("[ o | x ]");
        System.out.println("영어인사 : " + example);
    }

    // 3. [ x | o ]
    public static String call3(){
        String example = "안녕하세요";
        System.out.println("[ x | o ]");

        return example;
    }

    // 4. [ o | o ]
    public static double call4(double score){
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점짜리입니다.");
        return score * 3;
    }

    /*
        return이 있는 이유는 기본적으로 데이터의 조작을 위해서입니다. 그리고 특정 메서드의 결과값이
        다름 메서드의 argument로 사용 될 수도 있습니다.

        함수형 프로그래밍(Functional Programing) :
            메서드 1의 return 값이 메서드2의 argument가 되고, 메서드 2의 return 값이
            메서드 3의 argument가 되는 방식으로,
            첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩방식

     */
    // ex)
    public static String introduce(String name, int age){
        return "제 이름은" + name + "이고, 나이는 " + age + " 살입니다. \n내년에는 " + (age + 1) + "살이 됩니다.";
    }




    public static void main(String[] args) {
        call1();
        call2("hello");
        call3();

        // return값을 출려하기 위해서
        System.out.println(call3());
        String name = "김일";

        System.out.println(name + " 학생의 학점은 " + call4(4.5) + "입니다.");

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요. >>> ");
        String myName = sc.nextLine();
        System.out.print("나이를 입력하세요. >>> ");
        int myAge = sc.nextInt();       // nextLine();은 메서드 -> 메서드의 결과값을 myName에저장

        System.out.println(introduce(myName, myAge)); // 그리고 그 myName / myAge라는 결과값을 이용하여 introduce() 라는 메서드에 argument로 활용

    }
}
