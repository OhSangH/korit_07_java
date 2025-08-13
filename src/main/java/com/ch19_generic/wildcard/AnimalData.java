package com.ch19_generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AnimalData<T> {
    private T animal;
    /*
        현재 AnimalData 필드인 animal 에 Animal 클래스의 상속을 받은
        Tiger / Human 객체를 필드에 대입 할 예정
        근데 T에는 어떤 클래스도 들어갈 수 있기 때문에 현재 상황에서는 Car 클래스의 객체도 animal
        들어갈 수 있다.

        이번에는 특정 클래스라면 (즉 Animal 클래스의 상속을 바은 서브클래스라면)
        해당 클래스에 맞는 객체 정보를 출력하도록 할겁니다.
     */
    public void showData(){
        ((Animal) animal).move(); // 앞부분의 Animal은 형변환으로 업캐스팅을 하였다.
        // 업캐스팅을 하여서 Tiger / Human 클래스의 재정의한 move()메서드가 나올예정이다.
        if(animal.getClass() == Human.class){
            ((Human)animal).read();     // 현재 필드에 들어간 animal 객체의 클래스 확인
        }else if(animal.getClass() == Tiger.class){
            ((Tiger)animal).hunt();
        }


    }
}
