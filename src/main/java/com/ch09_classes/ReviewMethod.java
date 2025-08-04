package com.ch09_classes;

import java.util.Scanner;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
    수업중에는 call1() ~ call4()로 유형 나눔
*/
public class ReviewMethod {
    public void writeSchedule(String date, String content){
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    //1.writeSchedule을 오버로딩을 하여 매개변수1의 자료형을 int로 바꾸고,
    //writeSchedule(20250804,"클래스/getter/setter 예습"); 호출하시오
    public void writeSchedule(int date, String content){
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    //2. call2() 유형으로 작성
    /*
        dividedBySeven 메서드 정의
        특정 int 정수를 받아, 7의 배수인지 확인하는 메서드
        예)
        임의의 숫자를 입력하세요 >>> 77
        77은 7의 배수입니다.
        임의의 숫자를 입력하세요 >>> 100
        100은 7의 배수가아닙니다.
     */
    public void dividedBySeven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int num = sc.nextInt();
        dividedBySeven(num);
    }

    public void dividedBySeven(int num){
        String answer;
        answer =  (num % 7 == 0) ? num + "은 7의 배수입니다." : num + "은 7의 배수가 아닙니다.";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        ReviewMethod reviewMethod = new ReviewMethod();
        reviewMethod.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
        reviewMethod.writeSchedule(20250805,"클래스/getter/setter 예습\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        reviewMethod.dividedBySeven(sc.nextInt());

        reviewMethod.dividedBySeven();

    }
}
