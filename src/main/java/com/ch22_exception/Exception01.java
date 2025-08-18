package com.ch22_exception;

import java.util.Scanner;

class Person{
    int age;
    String name;

    void showInfo(){
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
    }
}

public class Exception01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "김일";
        p1.age = 20;
//        p1.school = "코IT";
        p1.showInfo();




//        int a = 10;                     // 나누어지는 수
//        int b = 0;                      // 나누는 수
//        int result = a / b;
//        System.out.println(result);

        // 고전적인 방식의 예외처리방식
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (b == 0) {
//            System.out.println("나눌 수 없습니다.");
//        } else {
//            System.out.println("결과값은 : " + (a / b));
//        }
//        int a = 10;
//        int b = 0;
//        try {
//            int result = a / b;
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
//        } finally {
//            System.out.println("프로그램 정상 종료");
//        }

        // 배열 인덱스 예외 -> 복수 catch문 사용
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){                       // 예외 중에 가장 상위 예외 클래스에 해당함.
            throw new RuntimeException(e);
        }finally {
            System.out.println("프로그램 정상종료");
        }

        /*
            이상의 코드 라인에서 중요한 점은 catch문을 복수로 나옰 수있다는 점이다.
            조건문을 작성할 때 순서가 가장 중요하다고 하였다.
            catch문도 동일하다 예외의 순서를 중요하게 배치하여야한다.
         */
    }
}
