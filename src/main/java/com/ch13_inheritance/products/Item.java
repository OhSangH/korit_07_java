package com.ch13_inheritance.products;
/*
    부모 Item
    자식 product
    실행 productMain

    Item 클래스
    1. private String name/ private String category
    2. AllArgsConstructor
    3. Getter/Setter
    4. product 상속

    Product
    1.
 */
public class Item {
    private String name;
    private String category;


    public Item(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
