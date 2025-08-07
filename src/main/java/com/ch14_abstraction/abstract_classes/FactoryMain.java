package com.ch14_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [" + model + "] 을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전 제품 공장을 관리합니다.");
            }
        }; // ;를 꼭 명시해야하는데 이 전체 코드라인이 메서드를 정의하는 것이 아니라 객체를 생성한 것이다.

        factory1.setName("가전 제품 공장");
        factory1.showInfo();
        /*
           위 개념은 익명 클래스로,
           Java1.1 -> 근데 현재는 추후 학습할 람다식(Lambda Expression)으로 대체되는 경우가 많다.

           재사용하지 않고 한 번만, 즉 이 경우에는 FactoryMain 에서만 쓰고 치울 예정이면 사용하기 좋다.

           수업에서는 보통 클래스를 한번만 정의하고 그걸로 객체 한 두개 만들고 치워 익명클래스 사용이
           많을 수 있다.
         */

        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");

        phoneFactory1.produce("아이폰 17 에어");
        phoneFactory1.manage();
        phoneFactory1.showInfo();
        System.out.println();


        TabletFactory tabletFactory1 = new TabletFactory("애플 태블릿 공장");
        tabletFactory1.setName("구글 태블릿 공장");
        tabletFactory1.produce("구글 태블릿 10인치 1세대");
        tabletFactory1.manage();
        tabletFactory1.upgrade("구글 태블릿 10인치 2세대");
        System.out.println();


        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + "컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다");
            }
        };

        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();
    }
}
