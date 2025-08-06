package com.ch13_inheritance;

public class Tiger extends Animal{ // 자식 클래스 extends 부모클래스

    // 고유 메서드 #1
    public void hunt() {
        System.out.println( this.getAnimalName() + "이(가) 사냥을 합니다.");
    }

    // 고유 메서드 #2 오버로딩 적용
    public void hunt(String prey){
        System.out.println(this.getAnimalName() + "이(가) " + prey + "을(를) 사냥합니다.");
    }

    // 재정의됨 methods : 부모 메서드의 결과값과 다르게 작성한다면 전부 재정의에 해당함.
    @Override //얘가 붙어 있으면 해당 메서드는 상속 받은 것
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName() ;
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
        System.out.println("호랑이가 4발로 걷습니다.");
    }
}
