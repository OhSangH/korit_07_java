package com.ch14_abstraction.abstract_classes;

public abstract class Factory {
    private String name;

    public Factory() {
    }

    public Factory(String name) {
        this.name = name;
    }

    public abstract void produce(String model);
    public abstract void manage();
    /*
        팝업 뜨는 것을 확인 했을 때 메서드 본문(method body)에 해당하는 부분이 저희가 타이핑 했던
        구현부를 의미한다는 것을 알수 있다.

        abstract 접근 지정자와 리턴 타입 사이에 명시 되면
        클래스에서도 동일하게 abstract 키워드가 적용돼야 한다.

     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void showInfo(){
        System.out.println("공장의 정보를 출력합니다 \n공장 이름: "+name);
    }
}
