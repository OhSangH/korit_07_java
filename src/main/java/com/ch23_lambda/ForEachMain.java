package com.ch23_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "딸기", "블루베리");

        System.out.println(fruits);

        //list의 element를 추출하기 위해 for / 향상된 for문을 사용해 왔다.
        for (String fruit : fruits) {
            System.out.println("과일명 : " + fruit);
        }

        // 람다식을 적용한 forEach
        fruits.forEach(fruit -> System.out.println("과일명 : " + fruit));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.print((number * 2) + " "));

        // 이전까지는 Collection에서 내부의 element를 가공한다면 for문을 사용했어야 했다.

        // 하지만 forEach() 메소드 '내'에 람다식을 사용하여 element를 가공하여 사용할 수 도 있다.
        // 코드를 이해하고 해석할 수 있다면 이러한 방식으로 코드를 작성할 수 있다는 것을 알 수 있다.
    }
}
