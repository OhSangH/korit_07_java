package com.ch15_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1;

        int a = 1;
        System.out.println(a);
        animal1.makeSound(); // 결과값 : Dog의 메서드 결과값과 동일하다 즉, 재정의 된 메스드가 호출
//        animal1.fetch() // 컴파일 에러 발생
        Animal animal2 = new Dog(); // 이게 A a = new B() 호출 방식
        animal2.makeSound();
//        animal2.fetch() // 위와 동일하게 불가능
        /*
         클래스A 객체명 = new 클래스B(); 통해 개체를 생성했을 경우
         1. Override가 적용된 메서드가 호출된다.
         2. 클래스B(자식클래스)의 고유 메서드는 호출 불가능하다.

         그럼 어차피 재정의딘 method버전으로 호출 할꺼면
         클래스A 객체명 = new 클래스B(); 로 생성하면 편하지 않나?

        */
        Animal animal3 = new Animal();
        animal3.makeSound();

        // 연산자 instanceof 사용 사례
        boolean result = animal1 instanceof Animal;
        System.out.println(result);
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);

        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);
        boolean result4 = dog1 instanceof Dog;
        System.out.println(result4);

        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);

        System.out.println("↑ 업캐스팅 파트 - 객체명.메서드명(); 했을때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("↓ 다운 캐스팅 파트");
        /*
            다운캐스팅은 '명시적'으로 이루어져야 합니다.
            방법
            (클래스명)객체면; -> (int)2.3; 과같은 형식으로 형변화의 객체버전이라고 생각하면 된다.
            그래서 기본자료형의 형변환에서 벗어나서 참조 자료형까지 고려해야 한다.
         */
        Dog dog2 = (Dog) animal2;
        dog2.makeSound();
        dog2.fetch();
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용ㅎ라여 Animal클래스의
        // 인스턴스인 animal2를 다운캐스팅 했다.
        // 그 결과 원래도 되던 재정의 버전의 메서드는 변함잉벗고
        // Dog클래스의 고유 메서드인 fetch();도 호출이 가능하다
        // 이것 또한 B b = new B(); 사용하면 되지 않나라는 의문이 생긴다.

//        Dog dog3 = (Dog) animal3; // downcasting을 하는 과전에서 오류가 발생했다.
//        dog3.makeSound(); // 그러니깐 메서드는 호출도 못해본 상황이다.
        /*
            63번 라인에서 오류가 발생
            즉 애초에 animal3를 생성 할 때 Animal클래스의 생성자를 호출해서 만들었기 때문에
            ( A a = new A();)
            하위 클래스의 인스턴스로 다운캐스팅하는것이 불가능하다.

            이상을 해결하기 위해서는
         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야 합니다.(그리고 상송 관계여야 한다.)
        // 그렇다면 현재 코드라인 상에서 빨간줄 뜨지도 않으니깐 잘못 다운 캐스팅 이루어지는지에 대한
        // 확인이 불가능한 상황인데, 이를 해결하기 위한것이 instanceof 이다.

        System.out.println("animal4 의 검증 파트");
        if (animal4 instanceof Dog) {
            Dog dog4 = (Dog) animal4;

            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("animal3는 다운 캐스팅 안되는거 알았으니까 검증 후에 다운캐스팅 시도해야겠다");
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }

    }
}
