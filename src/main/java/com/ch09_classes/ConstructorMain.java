package com.ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        //기본 생성자를 통한 객체 생성
        Constructor constructor1 = new Constructor();
        // int 매개변수 생성자를 통한 객체 생성
        Constructor constructor2 = new Constructor(1);
        // 여기서 num: 1에 해당하는 것이 argument 입니다.
        // 그리고 new Constructor(1); 부분에서 Constructor에 `ctrl` + `enter` 키를 누르면
        // 매개변수 생성자로 넘어가게 된다.
        // constructor2 객체 생성에 들어가게된 argument인 1이라는 int data는 매개변수 생성자를
        // 통해 int number = 1; 초기화 되고 이 값이 필드변수인 num 값에 초기화가 된다.
        // constructor2.num 값이 1로 나오게 된다.


        Constructor constructor3 = new Constructor("오상현");
        System.out.println(constructor3.name);

    }
}
