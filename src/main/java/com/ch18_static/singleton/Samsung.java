package com.ch18_static.singleton;

import lombok.Getter;

/*
    방금 작성한 ProductView와 인터넷에서 레퍼런스를 참조하여 Samsung 클래의 싱글톤 패턴 작성
 */
public class Samsung {
    private static Samsung instance;

    // 일반 필드 선언
    @Getter
    private String company;
    private int serialNumber;


    private Samsung() {
        this.company = getClass().getSimpleName();
        serialNumber = 20250000;                        //객체 생성자에 필드값을 초기화
    }


    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;            // 싱글톤으로 작성했으니 어차피 객체는 하나다
        // Main 단계에서 다수의 객체 예시 createSerialNumber()를 호출하더라도 전혀 serialNumber는 중복되지 않는다.
        // 그러면 정적 변수로 선엉ㄴ하고 다수의 삼성 객체를 만들어도 serialNumber가 안겹친다.
    }

}
