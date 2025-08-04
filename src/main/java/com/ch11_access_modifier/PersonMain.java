package com.ch11_access_modifier;
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();

//        person1.name = "김일"; //접근 제어자가 private 이기 때문에 수정 불가능
        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());

    }
}
