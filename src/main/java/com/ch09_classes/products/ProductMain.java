package com.ch09_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product(9876564);
        Product product3 = new Product("USB-C 케이블");
        Product product4 = new Product("GFlip6", 951753);

        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        product2.productName = "다이소 충전기";

        product3.productNum = 951753;

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();

    }
}
