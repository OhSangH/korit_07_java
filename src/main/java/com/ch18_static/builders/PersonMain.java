package com.ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person.Builder().age(38).name("김일").address("부산광역시").build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().age(20).name("김이").build();
        System.out.println(person3);
    }
}
