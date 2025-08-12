package com.ch18_static;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String name;
    @Getter
    private static int count = 0;
    // 롬복 사용하지 않는 static 메서드도 정의

    private static String title = "제품입니다.";

    public static String getTitle(){
        return title;
    }

    private int instanceCount = 0;
    public Product(){
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        instanceCount++;
        count++;
    }

}