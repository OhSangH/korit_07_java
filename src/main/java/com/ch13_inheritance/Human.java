package com.ch13_inheritance;

/*
    Animal 클래스를 상속 받고
    생성자 및 getter/setter를 사용하여
    Animal 클래스의 move() 메서드를 오버라이딩 하여
    "사람이 두 발로 걷습니다."만 출력하도록 '재정의' 합니다.

    Main
    human1 객체 생성(기본생성자)
    setter를 이용하여 이름과 나이 입력
    getter를 활요하여
    안녕하세요 제 이름은 '이름'이고 '나이'는 몇살입니다. <<< 출력
    Human 클래스의 고유 메서드 read("자바의 기초")를 정의 하여 call2유형
    콘솔에 다음과 같이 출력

    '이름'이 '자바의 기초' 읽는 중입니다.

    실행 예
    사람의 객체가 생성 되었ㅅ븐디ㅏ.
    사람이 두 발로 걷습니다.
    안녕하세요 제 이름은 '이름'이고 '나이'는 몇살입니다.
    내년에는 '나이 +1'살이 됩니다.
    '이름'이 '자바의 기초' 읽는 중입니다.


 */
public class Human extends Animal {
    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }


    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void introduce() {
        System.out.println("안녕하세요 제 이름은 " + getAnimalName() + "이고 나이는 " + getAnimalAge() + "살입니다.");
        System.out.println("내년에는 " + (getAnimalAge() + 1) + "살이 됩니다.");
    }

    public void read(String bookName) {
        System.out.println(getAnimalName() + "이 " + bookName + "을(를) 읽는 중입니다.");
    }
}
