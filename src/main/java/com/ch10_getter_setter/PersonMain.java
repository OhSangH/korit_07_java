package com.ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        // person1 김일/-10
        // person2 김이/201
        // person3 김삼/20
        // person4 김사/54

        Person person1 = new Person();
        Person person2 = new Person("김이");
        Person person3 = new Person(201);
        Person person4 = new Person("김사", 54);

        person1.age = -10;
        person1.name = "김일";

        person2.age = 201;

        person3.name = "김삼";

        System.out.println(person1.age);
        System.out.println(person3.age);

        System.out.println(person1.name);
        person1.name = "디카프리오";
        System.out.println(person1.name);

        person4.setAge(789);  //결과값 : 불가능한 나이입니다.
        System.out.println(person4.age); //결과값 : 54
        person4.age = 789;
        System.out.println(person4.age); //결과값 : 789

        System.out.println(person1.name.length());
        // .  . 이 여러개 나오는 방식을 chaining 이라고 합니다.
        // 근데 이렇게 chaining 을 쓰기 싫어하는 분들은 중관과정에 변수를 선언하는 분도 있다.
        String person1SName = person1.getName();
        System.out.println(person1SName.length());

        person1.setName("노마드코더");
        person1.setName("이일");

    }
}
