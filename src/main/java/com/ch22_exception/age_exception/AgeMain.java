package com.ch22_exception.age_exception;

import java.util.Scanner;

public class AgeMain {
    // 예외 클래스 별개로 정의
    // 메서드를 호출 했을 때 예외를 처리해야 하기 때문에
    // 여기에 추가적으로 메서드 정의
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 200) {
            throw new InvalidAgeException("맞지 않는 나이입니다.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >>> ");
        try {
            int age = sc.nextInt();
            checkAge(age);
            System.out.println("입력된 나이는 : " + age);     // 비정상 입력값을 넣게 될 경우 미 출력
        } catch (InvalidAgeException e) {
            System.out.println("나이 입력 오류 : " + e.getMessage());
        } finally {
            System.out.println("프로그램이 종료됩니다.");
        }
        // 예외가 발생하게 되면 try문의 예외 발생 뒷 코드는 실행되지 않고 바로
        // catch문으로 실행되게 되며 finally문은 예외가 발생하든 발생하지 않았든 무조건 실행되는것을
        // 알 수 있다.
    }
}
