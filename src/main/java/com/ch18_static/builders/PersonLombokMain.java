package com.ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("김일")
                .age(23)
                .address("부산광역시")
                .build();

        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();

        System.out.println(person2);
    }
}
