package com.ch09_classes.student;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");

    }

    public Student2(int studentCode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다");
        this.studentCode = studentCode;
    }

    public Student2(String name) {
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다");
    }

    public Student2(double score) {
        this.score = score;
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다");
    }

    public Student2(String name, double score) {
        this.name = name;
        this.score = score;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다");
    }

    public Student2(String name, double score, int studentCode) {
        this.name = name;
        this.score = score;
        this.studentCode = studentCode;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다");
    }
}
