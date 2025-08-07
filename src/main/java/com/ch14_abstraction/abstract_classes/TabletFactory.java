package com.ch14_abstraction.abstract_classes;
/*
    1. Factory클래스를 상속받을 것
    2. upgrade(String model) 메서드 생성
        "~~로 업그레이드 합니다."
        출력
    3. Main.java 이돋
        tabletFactory1 객체 생성 ("애플 태블릿 공장")
    4. 이름을 구글 테블릿 공장으로 수정
        "현재 공장은 ~~공장으로 변경되었습니다."
    5. produce() 호출
    6. manage() 호출
    8. upgrade("구글 태블릿 10인치 2세대") 호출
    9. Factory 클래스의 인스턴스인 factory2 객체 생성
        - produce() 메서드
            model + "컴퓨터를 생산합니다."
        - manage()
            "컴퓨터 공장을 관리합니다"
        name "삼성 컴퓨터 공장" set
        factory2.showInfo()
 */

public class TabletFactory extends Factory {

    public TabletFactory(String name) {
        super(name);
    }


    @Override
    public void setName(String name) {
        System.out.println("현재 공장은 " + name + "으로 변경되었습니다.");
        super.setName(name);
    }



    @Override
    public void produce(String model) {
        System.out.println("[ " + model + " ] 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 관리합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
