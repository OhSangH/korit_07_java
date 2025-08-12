package com.ch18_static.singleton.products;


public class ProductViewMain {
    public static void main(String[] args) {
        ProductView productView1 = ProductView.getInstance();
        ProductView productView2 = ProductView.getInstance();
        ProductView productView3 = ProductView.getInstance();
        ProductView productView4 = ProductView.getInstance();
        ProductView productView5 = ProductView.getInstance();

        // 싱글톤 패턴을 적용한 프로그램이다.
        // 생성자가 아닌 getInstance()를 활용하여 객체를 불러왔으며
        // 이로인해 객체는 단 한번만 생성 된다.


    }
}
