package com.ch13_inheritance.products;

public class ProductMain {
    public static void main(String[] args) {
        Item item1 = new Item("일반 카테고리", "일반상품");
        /*
         getter 이용해서 출력
         이 상품은 일반 상품입니다.
         이 상품은 일반 카테고리입니다.
         */
        System.out.println("이 상품은 " + item1.getName() + "입니다");
        System.out.println("이 상품은 " + item1.getCategory() + "입니다");
        /*
            Product 객체 생성
            이름 -> 전자제품
            카테고리 -> 가전제품
            가격 -> 100000
            재고 -> 10
            setter 를 이용해서 가전제품을 '백색 가전' 바꾸고
            getter를 활용
            해당 제품은 백색 가전 제품입니다. 출력
         */

        Product product1 = new Product("전자제품", "가전 제품", 100000, 10);
        product1.showInfo();
        product1.setCategory("백색가전");
        System.out.println("이 상품은 " + product1.getCategory() + "입니다");



    }
}
