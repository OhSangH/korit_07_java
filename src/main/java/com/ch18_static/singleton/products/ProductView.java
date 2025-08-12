package com.ch18_static.singleton.products;

public class ProductView {
    // 전역 변수 선언
    // 모든 싱글톤 패턴을 만들 때 정적 변수 이름이 instance입니다. -> 시험에서 힌트
    private static ProductView instance; // ProductView 클래스의 정적 field

    // private로 생성자를 선언 -> 객체가 하나만 생성되어야 하기 때문에 생성자가 private이다.
    private ProductView() {
        int counter = 1;
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
    }

    // static 메서드로 정의 -> 대부분의 경우 getInstance()
    public static ProductView getInstance() {
        if (instance == null) {                 // 현재 인스턴스가 없는 경우만 실행
            instance = new ProductView();       // ProductView라는 객체를 생성
        }
        return instance;                        // 객체를 반환
    }
}
