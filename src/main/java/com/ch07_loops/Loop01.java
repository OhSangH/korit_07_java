package com.ch07_loops;

public class Loop01 {
    public static void main(String[] args) {
        //1~100까지 출력하는 예시
//        int i = 1;
//        while (i < 101){
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 0;
//        while (j < 100){
//            System.out.println(++j);
//        }

        // 1~100 까지 더하는 공식
        int num1 = 0;
        int sum = 0;
        while (num1 < 100) {
            sum += ++num1;
        }
        System.out.println("1 ~ 100까지의 합 : " + sum);

//        int sum = (100 * 101)/2;   //굳이 반복문을 쓸 필요가 없다.
//        System.out.println(sum);

        /*
            사실 1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는 것 자체가
            오히려 비 효율적이라는 사실을 이상의 라인에서 알 수 있다.

            하지만 while 자체가 Java 문법이고, if문과 동일하게 중첩 사용이 가능하다.
            또한, while문 내부에 if문이 들어가는 응용도 가능하다

            예를 들어, 공차가 2인 등차수열의 합을 구하는 세요 같은 문제는
            공식이 기억도 안난다.
         */

        int num2 = 0;
        int sum2 = 0;
        while (num2 < 100) {
            num2 += 2;
            sum2 += num2;
        }
        System.out.println(sum2);

        int k = 0;
        while (k < 100) {
            System.out.print(++k + " ");
        }

    }
}
