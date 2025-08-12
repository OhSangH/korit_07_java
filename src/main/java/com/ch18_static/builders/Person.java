package com.ch18_static.builders;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    // 생성자를 정의하는 방법은 많은데, Lombok을 도입할 수 도 있지만 그 경우에도
    // 몇 번째 argument에 무슨 필드가 들어가는지 전혀몰라 골치가 아파진다.

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    /*
        PersonMain에서 생성자를 호출을 통해서 객체를 생ㅅㅇ하는 것을 막았습니다.
        그리고 매개변수 부분을 보면 Builder builder 라고 작성되어 있고, 메서드 본문에는
        builder.name으로 되어있는것을 봤을 때 builder 객체의 필드로 name/ age/ address가 있는
        것을 알 수 있다.
        중요한 것은 Person의 필드와 Builder가 같아야 한다.
     */

    public static class Builder {
        private String name;
        private int age;
        private String address;

        /*
            이하의 코드는 method를 정의한느 영역
            대부분의 경우 method는 행위를 나타내기 때문에 동사로 시작한다고 설명 했지만,
            Builder 패텅의 경우 대입될 필드의 이름과 동일한 메서드 명을 짓습니다.
            보통 필드는 명사로 지으니 명사를 쓴다.
         */

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 그래서 이 위쪽코드까지는 field 명과 동일한 메서드들을 정의했다.
        // 그 효과는 메서드 명과 동일한 field에 값이 대입된 Builder 객체가 리턴된다.

        public Person build(){
            return new Person(this); // 이 this는 Builder 클래스의 인스턴스에 해당합니다.
        }
    }


}
