package com.ch09_classes.student;

/*
    1. Student 클래스 필드
        1) int studentCode
        2) String name
        3) double Score

    2. 기본 생성자를 정의하고, 객체를 생성했을 때,
        "기본 생성자로 객체를 생성했습니다." 라고 출력되도록 코드작성.
    3. int StudentCode를 매개변수로 하는 매개변수 생성자를 정의,
        "int 매개변수 생성자로 객체를 생성했습니다." 라고 출력도도록 코드 작성.
    4. String name 매개변수
        "String 매개변수~" 코드 작성
    5. studentCode, name 매개변수 생성자
        "int, String 매개변수 ~" 코드 작성
    6. studentCode, name, score 매개변수 생성자
        "int,String,double~" 코드 작성

    7. 객체 속성
        1) Student1 2025001 / 김일 / 4.5 - 1
        1) Student2 2025002 / 김이 / 100 - 2
        1) Student3 2025003 / 김삼 / 95.8 - 3
        1) Student4 2025004 / 김사 / 4.0 - 4
        1) Student5 2025005 / 김오 / 80.7 - 5

    8. 학생의 정보가 출력될 수 있도록 하는 showInfo() 메서드 call1()타입 정의

    9. 실행 예
        기본 생성자로 객체가 생성되었습니다.
        int 매개변수 생성자로 객체를 생성했습니다.
        String 매개변수 생성자로 객체를 생성했습니다.
        int, String 매개변수 생성자로 객체를 생성했습니다.
        int, String, double 매개변수 생성자로 객체를 생성했습니다.

        김일 학생의 정보입니다.
        학번 : 2025001
        이름 : 김일
        점수 : 4.5

        김이 학생의 정보입니다.
        ...
 */
public class Student {
    int studentCode;
    String name;
    double Score;

    Student() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    Student(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다");
        this.studentCode = studentCode;
    }

    Student(int studentCode, String name) {
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다");
        this.studentCode = studentCode;
        this.name = name;
    }

    Student(int studentCode, String name, double Score) {
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다");
        this.studentCode = studentCode;
        this.name = name;
        this.Score = Score;
    }

    void showInfo() {
        System.out.println();
        System.out.println(this.name + "학생의 정보입니다.");
        System.out.println("학번 :" + this.studentCode);
        System.out.println("이름 :" + this.name);
        System.out.println("점수 :" + this.Score);
    }
}
