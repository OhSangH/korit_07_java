package com.ch13_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("나비");
        Animal animal3 = new Animal(1);
        Animal animal4 = new Animal(2, "바둑이");

        Tiger tiger = new Tiger();
        tiger.setAnimalName("푸바오");
        tiger.setAnimalAge(3);
        System.out.println("호랑이 이름 : " + tiger.getAnimalName());
        System.out.println("호랑이 나이 : " + tiger.getAnimalAge());

        tiger.hunt();
        tiger.hunt("물고기");
        tiger.move(); // 상속받은 클래스에서 재정의된 move
        animal1.move(); // 부보 method 원본 호출
        System.out.println();

        Human human1 = new Human();
        human1.setAnimalName("홍길동");
        human1.setAnimalAge(20);

        human1.move();
        human1.introduce();
        human1.read("자바의 기초");
    }
}
