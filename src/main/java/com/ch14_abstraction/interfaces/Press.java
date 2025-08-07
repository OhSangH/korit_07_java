package com.ch14_abstraction.interfaces;

public interface Press {
     String NAME = "button";
     /*
        interface이기 때문에 변수 앞에 접근 지정자를 명시하지 않고,
        final 키워드도 적지 않지만

        public final이 생략 되어 있다
        그래서 final 키워드를 붙이면 안내가 나온다.
      */

//    String age; // 상수만 가능한데 값이 초기화가 되어 있지 않아 오류발생
//    public Press(){} // 생성자도 불가능
//    void popOut() {  // 추상 메서드가 아닌 일반 메서드이기에 불가능
//        System.out.println("추상 메서드");
//    }

    // 가능한 예시
    void onPressed();

    // 이미 생성된 Up interface에 onUp() 이라는 추상 메서드를 정의
    // Down interface를 생성하고 onDown()이라는 추상 메서드 저의
}
