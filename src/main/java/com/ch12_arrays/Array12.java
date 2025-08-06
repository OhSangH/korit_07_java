package com.ch12_arrays;
/*
    배열의 출력
    배열을 출력했을 경우 미가공시 주소값이 나왔었다.

    근데 element값을 조정하거나, 더하거나 같은 추가적인 가공을 하기 위해 for문을 사용했다.
    굳이 변형이 없고 배열 자체를 확인하고 싶을때 마다 반복문을 사용하거나 메서드를 제작하는
    일은 번거롭다.

    Arrays 클래스를 사용하고, '정적' 메서드인 .toString(배열명)을 사용하면 배열 전체를 출력 가능

    여기서 우리는 클래스명.메서드명()이라는 점에 주목할 필요가 있다.
    scanner.nextLine()과는 다르다.
    그리고 toString()이라는 메서드도 사용 예정

    여기서 중요한 점은 동일한 메서드라도 어떤 클래스에 종속되어있는가에 따라 다른 결과값을 지닌다.

 */

import com.ch08_methods.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
//        // 동일한 메서드지만 클래스에 따라 다른 로직일 수 있다.
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//        Random scanner = new Random(); // 이런식의 변수는 작성하지 말자
//
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//        System.out.println("숫자를 입력하세요 >>> ");
//        int num2 = sc.nextInt();
//        System.out.println(num2);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(numbers));
        Method01 method01 = new Method01();
        method01.call1();
        method01.call3();

        Integer[] numbers1 = {3, 6, 7, 1, 9, 2, 10, 5, 4, 8};
        System.out.println("정렬 전 배열 : " +  Arrays.toString(numbers1));

        // 오름 차순 정렬
        Arrays.sort(numbers1);
        System.out.println("정렬 후 배열 : " +  Arrays.toString(numbers1));
        // 내림 차순 정렬
        // 마찬가지로 원본 배열을 다 바꿉니다.
        Arrays.sort(numbers1, Comparator.reverseOrder());
        System.out.println("정렬 후 배열 : " +  Arrays.toString(numbers1));
        /*
            이상의 경우는 보면 sort() 메서드에 오름차순에서는 argument가 하나였는데,
            내림 차순의 경우 argument가 2개이다.
            이상의 과정이 overloading이 된걸 알 수 있다.
            Comparator.reverseOrder();가 사용되는데,
            Comparator.reverseOrder()의 결과값이 sort() 메서드의 메개변수로 사용됬다
            근데 Comparator.reverseOrder()를 사용 하려면 기본자료형 배열을 사용 할 수 없어서
            Integer[] 배열을 사용하였다.
            char -> String 처럼 int -> Integer 를 쓴다고 생각하면 된다.
            추후 수업 예정
         */
    }
}
