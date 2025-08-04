package com.ch10_getter_setter;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        if (title.length() > 4) {
            System.out.println("변경할 수 없습니다.");
//            resetName();
            return;
        }
        System.out.println("변경 전 이름 : " + this.name);
        this.name = title;
        System.out.println("변경 후 이름 : " + this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int birth) {
        if (birth < 0 || birth > 200) {
            System.out.println("불가능한 나이입니다.");
//            resetAge();
            return;
        }
        System.out.println("변경 전 나이 : " + birth);
        this.age = birth;
        System.out.println("변경 후 나이 : " + birth);
    }

    void resetAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력해주세요. >>> ");
        setAge(sc.nextInt());
    }

    void resetName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요. >>> ");
        setName(sc.nextLine());
    }
}
