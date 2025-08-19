package com.org.example;

class Order{
    private int orderId;
    private String productName;
    private String comsumerName;
    private int price;
    private int stock;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.productName = builder.productName;
        this.comsumerName = builder.comsumerName;
        this.price = builder.price;
        this.stock = builder.stock;
    }

    public static class Builder{
        private int orderId;
        private String productName;
        private String comsumerName;
        private int price;
        private int stock;

        public Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }
        public Builder comsumerName(String comsumerName) {
            this.comsumerName = comsumerName;
            return this;
        }
        public Builder price(int price) {
            this.price = price;
            return this;
        }
        public Builder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }

    public void showOrderInfo(){
        System.out.println("주문번호 : "+orderId);
        System.out.println("상품명 : "+productName);
        System.out.println("주문자 : "+comsumerName);
        System.out.println("가격 : "+price);
        System.out.println("재고 : "+stock);
    }
}


public class Main {
    public static void main(String[] args) {
        Order order1 = new Order.Builder()
                .orderId(100)
                .productName("Samsung GalaxyBook2 Pro")
                .comsumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();

        order1.showOrderInfo();
    }
}
