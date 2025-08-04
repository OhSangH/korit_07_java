package com.ch10_getter_setter.univ_student;

import java.util.Scanner;

/*
    1. 클래스 설계
        name/grade(1,2,3)/ score(double)로 필드
    2. 생성자
        1) 기본
        2) 이름
        3) 학년
        4) 이름, 학년
        5) 이름, 학년, 점수
    3. Setter / Getter 메서드 정의
        각각의 필드에 대한 getter/setter정의
        1) grade 범위 (1~4)
        2) score 범위 (0.0~4.5)
        범위 벗어나면 불가능한 입력 출력.
    4. 객체 생성
        student1 -> 기본 김일 / 1 / 3.3
        student2 -> 기본 김이 / 3 / -30 - > 실패하고 4.0 입력
        student3 -> 기본 김삼 / 5 -> 실패하고 2 / 2.7
        student4 -> 기본 김사 / 4 / 3.8
        student4 -> 기본 김오 / 2 / 1.0
    5. 콘솔에 표현
        이름 : name
        학년 : grade + "학년"
        점수 : score + "점"
 */
public class UnivStudent {
    String name;
    int grade = 1;
    double score;

    public UnivStudent() {
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public UnivStudent(int grade, String name, double score) {
        this.grade = grade;
        this.name = name;
        this.score = score;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade <1 || grade > 4) {
            this.showInfo();
            System.out.println("불가능한 학년입니다.");
            resetGrade();
            return;
        }
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score <0.0 || score > 4.5) {
            this.showInfo();
            System.out.println("불가능한 점수입니다.");
            resetScore();
            return;
        }
        this.score = score;

    }

    private void resetScore() {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 다시 입력해주세여 >>> ");
        setScore(sc.nextDouble());
    }

    private void resetGrade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학년을 다시 입력해 주세여 >>> ");
        setGrade(sc.nextInt());
    }

    public void showInfo(){
        System.out.println("\n이름 : " + this.name);
        System.out.println("학년 : " + this.grade + "학년");
        System.out.println("점수 : " + this.score + "점");
    }
}
