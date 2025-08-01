package com.ch09_classes;

public class Constructor {
    int num;
    String name;

    // 기본 생성자 정의 -> 원래 기본적으로 만들어진다.
    //그리고 매개변수의 유무만 있고, return이 없어서 call1(),call2()유형에 해당한다.
    Constructor() {
        System.out.println("NoArgsConstructor(기본 생성자)");
    }

    // 매개변수 생성자 기본적으로 생성되는 생성자가 아니어서 따로 정의 해야함
    // 매개변수 생성자가 1개 라도 생기는 경우 기본생성자 사라짐
    // 기본 생성자, 매개변수 생성자를 둘 다 사용하고 싶을 경우  기본생성자도 따로 '명시적으로 정의' 해줘야한다.
    Constructor(String title) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = title;
    }

    Constructor(int number) {
        this.num = number;
    }

    Constructor(String title, int number) {
        this.name = title;
        this.num = number;
    }

    Constructor(int number, String title) {
        this.num = number;
        this.name = title;
    }
}
