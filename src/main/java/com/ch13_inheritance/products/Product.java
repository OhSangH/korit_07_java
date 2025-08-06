package com.ch13_inheritance.products;

/*
    super
        1. super(); -> 얘는 부모 생성자를 호출 한다는 의미
        2. super.메서드명(); -> 얘는 부모클래스의 메서드를 호출 한다는 의미


    부모-자식의 상속 관계가 성립되어 있을 때,
    부모 클래스에 기본 생성자 없이 매개변수 생성자만 있다면
    자식 클래스에서 완벽한 기본 생성자를 만드는 것이 불가능합니다.

    자식 클래스의 객체 생성 시 필수적으로 '부모 클래스의 생성자를 호출'하기 때문입니다.

    // 어떤 객체를 생성한다고 가정할 때
    A a = new B(); // 이런식으로 클래스와 생성자가 다르기 때문이다.
    위와 같은 형태의 문제는 정보처리 기사의 단골 문제

 */
public class Product extends Item {
    // 자식 고유의 필드 정의
    private int price;
    private int stock;

    // 부모 생성자의 AllArgsConstructor 제작
    public Product(String category, String name) {
        super(category, name);
    }

    // alt + ins 했을때 생성자에 모든 매개변수를 설정 했을 때 부모꺼도 자동 생성
    public Product( String name, String category, int price, int stock) {
        super(category, name);
        this.price = price;
        this.stock = stock;
    }


    // 자식 고유의 field에 대한 getter/setter 정의
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    // 고유 메서드
    public void showInfo(){
        System.out.println("이름 -> " + super.getName());
        System.out.println("카테고리 -> " + super.getCategory());
        System.out.println("가격 -> " + this.price);
        System.out.println("재고 -> " + this.stock);
    }
}
